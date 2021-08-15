package com.java_patterns.structural.bridge.notebook;

import com.java_patterns.structural.bridge.cpu.CPU;

public abstract class Notebook {
    protected CPU cpu;

    public Notebook(CPU cpu) {
        this.cpu=cpu;
    }

    public abstract void create();
}
