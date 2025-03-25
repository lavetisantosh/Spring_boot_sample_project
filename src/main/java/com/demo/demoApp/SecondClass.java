package com.demo.demoApp;

import org.springframework.stereotype.Component;

@Component
public class SecondClass implements ClassInterFace{

    String name;

//    SecondClass(String name){
//        this.name = name;
//    }

    void fieldInjection(){
       System.out.println("field Injection Example");
    }

    void constructorInjection(){
        System.out.println("Constructor Injection Example");
    }

    void setterInjection(){
        System.out.println("Setter Injection Example");
    }

    @Override
    public void buildClass() {
        System.out.println("Autowired annotation using interface from Second class");
    }
}
