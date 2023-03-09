package org.example;

import org.example.models.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Eugene");
        person.setAge((short) 19);
        System.out.println(person);
    }
}