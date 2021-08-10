package com.java_patterns.generating.abstract_factory.specific_factory;

import com.java_patterns.generating.abstract_factory.DeviceFactory;
import com.java_patterns.generating.abstract_factory.Notebook;
import com.java_patterns.generating.abstract_factory.Watch;
import com.java_patterns.generating.abstract_factory.asus_devices.AsusNotebook;
import com.java_patterns.generating.abstract_factory.asus_devices.AsusPhone;
import com.java_patterns.generating.abstract_factory.asus_devices.AsusWatch;
import com.java_patterns.generating.abstract_factory.Phone;

public class AsusFactory implements DeviceFactory {
    @Override
    public Phone createPhone() {
        return new AsusPhone();
    }

    @Override
    public Notebook createNotebook() {
        return new AsusNotebook();
    }

    @Override
    public Watch createWatch() {
        return new AsusWatch();
    }
}
