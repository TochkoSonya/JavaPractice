package com.java_patterns.generating.abstract_factory;

public interface DeviceFactory {
    Phone createPhone();
    Notebook createNotebook();
    Watch createWatch();
}
