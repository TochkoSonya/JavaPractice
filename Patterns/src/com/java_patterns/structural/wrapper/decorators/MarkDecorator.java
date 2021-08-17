package com.java_patterns.structural.wrapper.decorators;

import com.java_patterns.structural.wrapper.LetterInterface;

public class MarkDecorator extends LetterDecorator {
    public String mark;
    public MarkDecorator(LetterInterface letter) {
        super(letter);
    }

    @Override
    public void sendMessage() {
        addMark();
        System.out.println("Letter with mark");
    }

    private void addMark() {
        mark="Beautiful mark";
        System.out.println("add mark");
    }
}
