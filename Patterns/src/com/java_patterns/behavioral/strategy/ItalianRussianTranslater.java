package com.java_patterns.behavioral.strategy;

public class ItalianRussianTranslater implements TranslateStrategy {
    @Override
    public void translate(String text) {
        System.out.println("From Italian to Russian translate: " + text);
    }
    @Override
    public void saveTranslation() {
        System.out.println("Save Russian translation");
    }
}
