package com.bytelegend;

public class Cat {
    public Cat() {
        Cat("");
    }

    public Cat(String name) {
        this.name = name;
    }

    public String name;

    public static void main(String[] args) {
        System.out.println(new Cat(""));
        System.out.println(new Cat("White"));
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
