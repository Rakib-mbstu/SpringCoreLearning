package com.springcore;

public class Lion implements Animals{

    private String name_to_call;
    Lion(String name_to_call)
    {
        this.name_to_call = name_to_call;
    }
    @Override
    public void setName(String name_to_call) {
        this.name_to_call = name_to_call;
    }
    @Override
    public void name_of_animal() {
        System.out.println("Lion king...." + name_to_call);
    }

    @Override
    public void eats() {
        System.out.println("Eats meat only....");
    }

    @Override
    public void walks() {
        System.out.println("Walks on four legs....");
    }
    protected String  name()
    {
        return name_to_call;
    }
}
