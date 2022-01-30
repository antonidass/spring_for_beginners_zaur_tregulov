package com.akrik.springcourse;

import org.springframework.stereotype.Component;

public class Dog implements Pet {
    Dog() {
        System.out.println("Dog construct");
    }
    @Override
    public void say() {
        System.out.println("bark bark bark!");
    }
}
