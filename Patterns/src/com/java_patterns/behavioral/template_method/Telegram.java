package com.java_patterns.behavioral.template_method;

public class Telegram extends Messenger {
    public Telegram(String userName, String password) {
        this.userName=userName;
        this.password=password;
    }

    @Override
    public void logIn() {
        System.out.println("User: " +
                userName + " with password: " +
                password + " logged in successfully in the Telegram");
    }

    @Override
    public void logOut() {
        System.out.println("User: " +
                userName + " with password: " + password + " logged out successfully in the Telegram");
    }
}
