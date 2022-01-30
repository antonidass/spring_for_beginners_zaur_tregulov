package com.akrik.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Person person = context.getBean("person", Person.class);

        Pet cat = context.getBean("catBean", Cat.class);

        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

    }
}
