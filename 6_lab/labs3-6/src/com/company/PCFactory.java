package com.company;

import com.company.Computer;
import com.company.FactoryInterface;
import com.company.DNS;

public class PCFactory implements FactoryInterface {




    public DNS createInstance() {
        return new Computer();
    }



}