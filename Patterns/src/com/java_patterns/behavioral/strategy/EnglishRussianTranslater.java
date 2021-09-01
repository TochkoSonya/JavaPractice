package com.java_patterns.behavioral.strategy;

public class EnglishRussianTranslater implements TranslateStrategy{
    @Override
    public void translate() {
        System.out.println("From English to Russian translate");
    }
    @Override
    public void saveTranslation() {
        System.out.println("Save Russian translation");
    }
}
