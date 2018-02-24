package com.example.marian.otlob.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marian.otlob.Interfaces.OnItemClickListner;
import com.example.marian.otlob.R;

/**
 * Created by Marian on 2/24/2018.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    //nfs mwal elcategory belzabt

    public TextView foodName;
    public ImageView foodImg;
    private OnItemClickListner onItemClickListner;

    //ha3ml fun set llinterface elly 3rafto fo2
    public void setOnItemClickListner(OnItemClickListner onItemClickListner)
    {

        this.onItemClickListner = onItemClickListner;
    }

    public FoodViewHolder(View itemView)
    {
        super(itemView);
        foodName = itemView.findViewById(R.id.food_name);
        foodImg = itemView.findViewById(R.id.food_img);

        //ba2olo n elitemview d bthandel elclicklistener
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        onItemClickListner.onClick(v,getAdapterPosition(),false);


    }
}
