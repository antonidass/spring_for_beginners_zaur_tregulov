package com.akrik.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Pet pet;
//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private int age;
//
//    @Autowired
//    public Person(@Qualifier("cat") Pet pet, @Value("Seregea") String name, @Value("33") int age) {
//        System.out.println("IN PERSON");
//        this.pet = pet;
//        this.name = name;
//        this.age = age;
//    }


    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("IN PERSON CONSTRUCT");
    }

    public Pet getPet() {
        System.out.println("Persong construct");
        return pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person() {}

    public void callPet() {
        System.out.println("hello i am " + name + " and i am " + age + "and my pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("IN SET");
        this.pet = pet;
    }
}
