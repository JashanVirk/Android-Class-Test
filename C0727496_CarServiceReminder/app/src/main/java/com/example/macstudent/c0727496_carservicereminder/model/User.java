package com.example.macstudent.c0727496_carservicereminder.model;

public class User {
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int UserId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
