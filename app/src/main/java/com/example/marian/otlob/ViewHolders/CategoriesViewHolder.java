package com.example.marian.otlob.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marian.otlob.Interfaces.OnItemClickListner;
import com.example.marian.otlob.R;

/**
 * Created by Marian on 2/23/2018.
 */

/*elview holder bn3mlo 34an nhandel kol item bmo7twayatha mn items elRV
* w bn3rf feh elvariabls bta3t kol item (Name,Image)
* w bextend RVViewHolder 34an yhandelha ze ma 2olna
* w yimplement elOnClickListner 34an a3rf a3ml action click 3la kol item
* w de beb2alha layout 5asa beha elly hea rasmt elitem elwa7da*/

public class CategoriesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public ImageView categoryImg;
    public TextView categoryName;

    private OnItemClickListner onItemClickListner;

    public CategoriesViewHolder(View itemView) {
        super(itemView);
        categoryName = itemView.findViewById(R.id.category_name);
        categoryImg = itemView.findViewById(R.id.category_img);

        //ba2olo n elitemview d bthandel elclicklistener
        itemView.setOnClickListener(this);

    }

    //ha3ml fun set llinterface elly 3rafto fo2
    public void setOnItemClickListner(OnItemClickListner onItemClickListner)
    {

        this.onItemClickListner = onItemClickListner;
    }

    @Override
    public void onClick(View v)
    {
        onItemClickListner.onClick(v,getAdapterPosition(),false);

    }
}
