package com.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
    private String name;
    private int age;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected void displayInfo() {
        System.out.println(name + '\n' + age + '\n' + address);
    }
}
