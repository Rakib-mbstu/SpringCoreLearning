package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class InZoo {
    @Autowired
    @Qualifier("human2")
    private Human human;

    public void setAnimal(Human human) {
        this.human = human;
    }

    public void isPresent() {
        System.out.println("The " + human.name() + " animal is present in the zoo....");
    }
}
