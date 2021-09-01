package com.java_patterns.behavioral.strategy;

public class RussianEnglishTranslater implements TranslateStrategy{
   @Override
    public void translate(String text) {
        System.out.println("From Russian to English translate: " + text);
    }
    @Override
    public void saveTranslation() {
        System.out.println("Save English translation");
    }
}
