package com.java_patterns.structural.wrapper.decorators;

import com.java_patterns.structural.wrapper.LetterInterface;

public class ParcelDecorator extends LetterDecorator {
    public String parcel;
    public ParcelDecorator(LetterInterface letter) {
        super(letter);
    }

    @Override
    public void sendMessage() {
        addParcel();
        System.out.println("letter with parcel");
    }

    private void addParcel() {
        parcel="Parcel (phone)";
        System.out.println("add parcel");
    }
}
