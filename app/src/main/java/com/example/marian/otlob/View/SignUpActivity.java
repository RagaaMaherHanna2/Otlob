package com.example.marian.otlob.View;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.marian.otlob.Model.User;
import com.example.marian.otlob.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import info.hoang8f.widget.FButton;

public class SignUpActivity extends AppCompatActivity
{
    @BindView(R.id.et_upName)
    MaterialEditText EtName;
    @BindView(R.id.et_upPhone)
    MaterialEditText EtPhone;
    @BindView(R.id.et_upPass)
    MaterialEditText EtPass;
    @BindView(R.id.sign_up_upBtn)
    FButton SignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);

        //de kida ze b3ml object m elFirebaseDatabase (ba5od mnha instance)
        FirebaseDatabase UsersDatabase = FirebaseDatabase.getInstance();
        //harsm gdwal feh elvalues bta3t eluser
        final DatabaseReference tableUser = UsersDatabase.getReference("User");

        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final ProgressDialog dialog = new ProgressDialog(SignUpActivity.this);
                dialog.setMessage("Please wait ....");
                dialog.show();

                tableUser.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot)
                    {
                        if(dataSnapshot.child(EtPhone.getText().toString()).exists())
                        {
                            dialog.dismiss();
                            Toast.makeText(SignUpActivity.this, "this phone is already registered before", Toast.LENGTH_SHORT).show();
                        }

                        else
                        {
                            dialog.dismiss();
                            //ha3rf user gded w ad5l 3leh elvalues elly daaltly
                            User user =new User(EtName.getText().toString(),EtPass.getText().toString());
                            /*ha3ml gdwal lluser elgded b elprimKey bta3o elly hwa elphone
                            w ad5l feh ba2y elvalues b object eluser elly maleto fo2*/
                            tableUser.child(EtPhone.getText().toString()).setValue(user);
                            Toast.makeText(SignUpActivity.this, "Sign Up successfully", Toast.LENGTH_SHORT).show();
                            finish();

                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        });
    }
}
