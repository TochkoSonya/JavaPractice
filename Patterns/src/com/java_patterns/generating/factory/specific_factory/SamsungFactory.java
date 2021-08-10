package com.java_patterns.generating.factory.specific_factory;

import com.java_patterns.generating.factory.Factory;
import com.java_patterns.generating.factory.Notebook;
import com.java_patterns.generating.factory.devices.SamsungNotebook;

public class SamsungFactory implements Factory {
    @Override
    public Notebook createNotebook() {
        return new SamsungNotebook();
    }
}
