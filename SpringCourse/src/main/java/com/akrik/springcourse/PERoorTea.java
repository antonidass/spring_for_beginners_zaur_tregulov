package com.akrik.springcourse;

import org.springframework.stereotype.Component;

public class PERoorTea implements Pet{
    PERoorTea() {
        System.out.println("in const");
    }


    @Override
    public void say() {
        System.out.println("CARRR!!!! CARR11!!!!");
    }
}
