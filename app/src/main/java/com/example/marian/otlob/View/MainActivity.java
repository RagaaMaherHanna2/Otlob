package com.example.marian.otlob.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.marian.otlob.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
{
    @BindView(R.id.sign_in_mainBtn)
    Button signInBtn;
    @BindView(R.id.sign_up_mainBtn)
    Button signUpBtn;
    @BindView(R.id.wlc_msg)
    TextView WlcMsg;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        signInBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent SignIn = new Intent(MainActivity.this,SignInActivity.class);
                startActivity(SignIn);


            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent SignUp = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(SignUp);


            }
        });

     }
}
