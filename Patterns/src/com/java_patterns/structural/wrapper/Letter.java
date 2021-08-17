package com.java_patterns.structural.wrapper;

public class Letter implements LetterInterface {
    public Letter() {}
    public void sendMessage() {
        System.out.println("just sent message");
    }
}
