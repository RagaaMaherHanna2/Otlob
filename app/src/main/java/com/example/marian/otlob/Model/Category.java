package com.example.marian.otlob.Model;

/**
 * Created by Marian on 2/23/2018.
 */
//elmodel llcategory elwa7da
public class Category
{
    private String Name;
    private String Image;

    public Category() {
    }

    public Category(String name, String image) {
        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}

