package com.demo.demoApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FirstClass implements ClassInterFace{

    /// Constructor Injection
    /// For Constructor Injection Autowired is default
    //@Autowired
//    public FirstClass(SecondClass secondClass){
//        this.secondClass = secondClass;
//    }

    /// Field Injection
    //@Autowired
   // private  SecondClass secondClass;

    /// setter Injection
    /// For Field Injection and setter Injection [@Autowired] annotation is mandatory
//    @Autowired
//    public void setter(SecondClass secondClass){
//        this.secondClass = secondClass;
//    }


    void doSomething(){
        //secondClass.fieldInjection();
        //secondClass.constructorInjection();
        //secondClass.setterInjection();
        System.out.println("Tried using of dependency injection");


    }

    @Override
    public void buildClass() {
        System.out.println("Autowired annotation using interface from FirstCass");
    }
}
