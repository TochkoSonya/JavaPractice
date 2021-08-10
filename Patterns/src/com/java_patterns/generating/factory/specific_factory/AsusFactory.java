package com.java_patterns.generating.factory.specific_factory;

import com.java_patterns.generating.factory.devices.AsusNotebook;
import com.java_patterns.generating.factory.Factory;
import com.java_patterns.generating.factory.Notebook;

public class AsusFactory implements Factory {
   @Override
    public Notebook createNotebook() {
        return new AsusNotebook();
    }
}
