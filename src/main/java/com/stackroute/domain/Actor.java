package com.stackroute.domain;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

//@Component("actor")
public class Actor {
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void test(){
        System.out.println("I am in Actor.");
    }
}
