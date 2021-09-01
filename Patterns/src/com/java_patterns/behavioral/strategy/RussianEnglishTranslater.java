package com.java_patterns.behavioral.strategy;

public class RussianEnglishTranslater implements TranslateStrategy{
   @Override
    public void translate() {
        System.out.println("From Russian to English translate");
    }
    @Override
    public void saveTranslation() {
        System.out.println("Save English translation");
    }
}
