package com.java_patterns.structural.bridge.cpu;

import com.java_patterns.structural.bridge.cpu.CPU;

public class IntelCoreI7 implements CPU {
    @Override
    public void addCPU() {
        System.out.println("Add Intel Core i7");
    }
}
