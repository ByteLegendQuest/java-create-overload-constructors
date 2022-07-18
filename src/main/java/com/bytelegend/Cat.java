package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        System.out.println(new Cat(""));
        System.out.println(new Cat("White"));
    }

    Cat() {
        this("");
    }

    Cat(String name) {
        this.name = new String(name);
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
