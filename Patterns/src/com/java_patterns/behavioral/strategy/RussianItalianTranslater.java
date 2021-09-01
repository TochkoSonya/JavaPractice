package com.java_patterns.behavioral.strategy;

public class RussianItalianTranslater implements TranslateStrategy{
    @Override
    public void translate(String text) {
        System.out.println("From Russian to Italian translate: " + text);

    }
    @Override
    public void saveTranslation() {
        System.out.println("Save Italian translation");
    }
}
