package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human implements Animals{

    private String name_to_call;
    @Override
    public void setName(String name_to_call) {
        this.name_to_call = name_to_call;
    }

    @Override
    public void name_of_animal() {
        System.out.println("Humans of the earth...." + name_to_call);
    }

    @Override
    public void eats() {
        System.out.println("Human eats everything.....!");
    }

    @Override
    public void walks() {
        System.out.println("Walks on two legs.....");
    }
    protected String name()
    {
        return name_to_call;
    }
}
