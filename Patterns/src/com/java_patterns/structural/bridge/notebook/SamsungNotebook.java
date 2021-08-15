package com.java_patterns.structural.bridge.notebook;

import com.java_patterns.structural.bridge.cpu.CPU;
import com.java_patterns.structural.bridge.notebook.Notebook;

public class SamsungNotebook extends Notebook {
    public SamsungNotebook(CPU cpu) {
        super(cpu);
    }

    @Override
    public void create() {
        System.out.println("Create Samsung Notebook");
        cpu.addCPU();
    }
}
