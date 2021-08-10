package com.java_patterns;

import com.java_patterns.generating.abstract_factory.DeviceFactory;
import com.java_patterns.generating.abstract_factory.specific_factory.AsusFactory;
import com.java_patterns.generating.factory.Factory;
import com.java_patterns.generating.factory.specific_factory.SamsungFactory;

public class Main {

    public static void main(String[] args) {
       //factory
        Factory factory= new SamsungFactory();
        factory.createNotebook();

        //abstract factory
        DeviceFactory abstractFactory=new AsusFactory();
        abstractFactory.createPhone();
    }
}
