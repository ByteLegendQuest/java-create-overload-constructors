package com.bytelegend;

public class Cat {
    public String name;

    public Cat (String name){
        Cat c = new Cat();
        c.name=name;
        return c;
    }
    public static void main(String[] args) {
        System.out.println(new Cat(""));
        System.out.println(new Cat("White"));
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
