package com.java_patterns.structural.wrapper.decorators;

import com.java_patterns.structural.wrapper.LetterInterface;

public class LetterDecorator implements LetterInterface {
    private LetterInterface letter;

    public LetterDecorator(LetterInterface letter) {
        this.letter=letter;
    }

    public void sendMessage() {
        System.out.println("Letter decorator send message");
    }
}
