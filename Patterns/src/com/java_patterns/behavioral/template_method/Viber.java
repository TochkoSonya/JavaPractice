package com.java_patterns.behavioral.template_method;

public class Viber extends Messenger {
    public Viber(String userName, String password) {
        this.userName=userName;
        this.password=password;
    }

    @Override
    public void logIn() {
        System.out.println("User: " +
                userName + " with password: " +
                password + " logged in successfully in the Viber");
    }

    @Override
    public void logOut() {
        System.out.println("User: " +
                userName + " with password: " +
                password + " logged out successfully in the Viber");
    }
}
