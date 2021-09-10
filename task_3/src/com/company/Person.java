package com.company;

public class Person {
    private String name;
    private byte age;

    Person(String name, Byte age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        while(age < 0)
            System.out.println("Invalid age number where age is less than 0");
        this.age = age;
    }

}
