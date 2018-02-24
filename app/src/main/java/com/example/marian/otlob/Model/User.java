package com.example.marian.otlob.Model;

/**
 * Created by Marian on 2/19/2018.
 */

//da class elmodel bta3 eluser

public class User
{
    private String Name;
    private String Password;

    public User(String name, String password) {
        Name = name;
        Password = password;
    }

    public User() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
