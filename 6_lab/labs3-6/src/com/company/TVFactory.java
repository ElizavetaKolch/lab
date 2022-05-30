package com.company;

import com.company.TVBox;
import com.company.FactoryInterface;
import com.company.DNS;

public class TVFactory implements FactoryInterface {

    public DNS createInstance() {
        return new TVBox();
    }


}
