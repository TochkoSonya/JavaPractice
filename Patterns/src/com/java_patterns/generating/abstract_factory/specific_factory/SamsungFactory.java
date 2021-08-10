package com.java_patterns.generating.abstract_factory.specific_factory;

import com.java_patterns.generating.abstract_factory.DeviceFactory;
import com.java_patterns.generating.abstract_factory.Notebook;
import com.java_patterns.generating.abstract_factory.Watch;
import com.java_patterns.generating.abstract_factory.Phone;
import com.java_patterns.generating.abstract_factory.samsung_devices.SamsungNotebook;
import com.java_patterns.generating.abstract_factory.samsung_devices.SamsungPhone;
import com.java_patterns.generating.abstract_factory.samsung_devices.SamsungWatch;

public class SamsungFactory implements DeviceFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Notebook createNotebook() {
        return new SamsungNotebook();
    }

    @Override
    public Watch createWatch() {
        return new SamsungWatch();
    }
}
