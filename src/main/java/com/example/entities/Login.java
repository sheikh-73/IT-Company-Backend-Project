package com.example.entities;


public class Login
{
    private String email;
    private String password;
    public Login(String email, String password)
    {
        this.email = email;
        this.password = password;
    }
    public Login() {}

    public String getEmail()
    {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
