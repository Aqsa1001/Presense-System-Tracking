package com.razi.gallery;

public class onlineUser {
    private String email,status;

    public onlineUser()
    {

    }
    public onlineUser(String email, String status)
    {
        this.email=email;
        this.status=status;
    }
    public String getEmail()
    {

        return email;
    }
    public String getStatus(){
        return status;
    }
}
