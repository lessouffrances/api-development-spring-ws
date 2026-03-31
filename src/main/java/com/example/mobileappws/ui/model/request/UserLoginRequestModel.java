package com.example.mobileappws.ui.model.request;

// http://localhost:8080/login
// this api end point will handle login request, which is in the framework
public class UserLoginRequestModel {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
