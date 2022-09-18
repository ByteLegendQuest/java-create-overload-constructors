package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }
    public Cat() {
        this.name = "";
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
