package com.java_patterns.behavioral.strategy;

public interface TranslateStrategy {
    void translate(String text);
    void saveTranslation();
}
