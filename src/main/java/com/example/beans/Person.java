package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    When we have more than one bean and want to mention the bean we want to autowire to then we use the qualifier

 */

@Component
public class Person {
    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Qualifier("vehicle2") Vehicle vehicle){
        System.out.println("Person bean is created by Spring");
        this.vehicle = vehicle;
    }

}
