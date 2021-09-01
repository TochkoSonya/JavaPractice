package com.java_patterns.behavioral.strategy;

public class RussianItalianTranslater implements TranslateStrategy{
    @Override
    public void translate() {
        System.out.println("From Russian to Italian translate");
    }
    @Override
    public void saveTranslation() {
        System.out.println("Save Italian translation");
    }
}
