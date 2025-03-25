package com.demo.demoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Main {

    @Autowired
    @Qualifier("secondClass")
    ClassInterFace classInterFace;

    public void build(){
        classInterFace.buildClass();
    }

}
