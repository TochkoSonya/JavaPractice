package com.java_patterns;

import com.java_patterns.generating.abstract_factory.DeviceFactory;
import com.java_patterns.generating.abstract_factory.specific_factory.AsusFactory;
import com.java_patterns.generating.builder.Table;
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

        //builder
        Table table = new Table
                .Builder("Simple table", 4)
                .build();

        Table table2 = new Table
                .Builder("Color table", 3)
                .withColor("green")
                .build();

        Table table3 = new Table
                .Builder("Cool table", 3)
                .withColor("orange")
                .withMaterial("glass")
                .build();

        System.out.println(table3.toString());

    }
}
