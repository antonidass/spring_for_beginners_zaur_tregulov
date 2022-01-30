package com.akrik.springcourse;

import org.springframework.stereotype.Component;

public class Cat implements Pet {
    Cat() {
        System.out.println("Cat construct");
    }
    @Override
    public void say() {
        System.out.println("meow mewo!");
    }
}
