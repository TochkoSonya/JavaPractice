package com.java_patterns;

import com.java_patterns.generating.abstract_factory.DeviceFactory;
import com.java_patterns.generating.abstract_factory.specific_factory.AsusFactory;
import com.java_patterns.generating.builder.Table;
import com.java_patterns.generating.factory.Factory;
import com.java_patterns.generating.factory.Notebook;
import com.java_patterns.generating.factory.specific_factory.SamsungFactory;
import com.java_patterns.generating.singleton.Singleton;
import com.java_patterns.structural.adapter.*;

import com.java_patterns.structural.bridge.cpu.CPU;
import com.java_patterns.structural.bridge.cpu.IntelCoreI5;
import com.java_patterns.structural.bridge.notebook.AsusNotebook;
import com.java_patterns.structural.facade.Facade;
import com.java_patterns.structural.proxy.CommonInterface;
import com.java_patterns.structural.proxy.DeviceProxy;
import com.java_patterns.structural.wrapper.Letter;
import com.java_patterns.structural.wrapper.LetterInterface;
import com.java_patterns.structural.wrapper.decorators.LetterDecorator;
import com.java_patterns.structural.wrapper.decorators.MarkDecorator;
import com.java_patterns.structural.wrapper.decorators.ParcelDecorator;

public class Main {

    public static void main(String[] args) {
//       //factory
//        Factory factory= new SamsungFactory();
//        factory.createNotebook();
//
//        //abstract factory
//        DeviceFactory abstractFactory=new AsusFactory();
//        abstractFactory.createPhone();
//
//        //builder
//        Table table = new Table
//                .Builder("Simple table", 4)
//                .build();
//
//        Table table2 = new Table
//                .Builder("Color table", 3)
//                .withColor("green")
//                .build();
//
//        Table table3 = new Table
//                .Builder("Cool table", 3)
//                .withColor("orange")
//                .withMaterial("glass")
//                .build();
//
//        System.out.println(table3.toString());
//
//        //Singleton
//        Singleton singleton=Singleton.getInstance();
//        System.out.println(singleton.toString());
//
//        //-----------------------------------------
//
//        //Adapter
//        BaseTrain train = new Train();
//        TransportManagement manageTrain= new TransportManagement(train);
//        manageTrain.transport();
//
//        Adapter airplaneAdapter= new Adapter(new Airplane());
//        TransportManagement manageAirplane = new TransportManagement(airplaneAdapter);
//        manageAirplane.transport();
//
//        //Bridge
////        CPU coreI5 = new IntelCoreI5();
////        Notebook asusNotebook=new AsusNotebook(coreI5);
////        asusNotebook.create();
//
//        //Proxy
//        CommonInterface device= new DeviceProxy();
//        device.deviceOn();
//        device.deviceOff();
//
//        //Wrapper
//        LetterInterface letter1= new Letter();
//        letter1 = new MarkDecorator(letter1);
//        letter1.sendMessage();
//
//        LetterInterface letter2 = new Letter();
//        letter2= new MarkDecorator(letter2);
//        letter2 = new ParcelDecorator(letter2);
//        letter2.sendMessage();

//        //facade
//        Facade facade = new Facade();
//        facade.computerOn();
//        facade.computerOff();


        //strategy
    }
}
