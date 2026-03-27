package com.example.mobileappws.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 4865903039190150223L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public String getUserId() {
        return userId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public String getGetEmailVerificationToken() {
        return getEmailVerificationToken;
    }

    public void setGetEmailVerificationToken(String getEmailVerificationToken) {
        this.getEmailVerificationToken = getEmailVerificationToken;
    }

    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }

    public String getPassword() {
        return password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }

    private String encryptedPassword;
    private String emailVerificationToken;
    private String getEmailVerificationToken;
    private Boolean emailVerificationStatus;



}