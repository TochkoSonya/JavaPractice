package com.java_patterns.structural.bridge.notebook;

import com.java_patterns.structural.bridge.cpu.CPU;
import com.java_patterns.structural.bridge.notebook.Notebook;

public class AsusNotebook extends Notebook {
    public AsusNotebook(CPU cpu) {
        super(cpu);
    }

    @Override
    public void create() {
        System.out.println("Create Asus Notebook");
        cpu.addCPU();
    }
}
