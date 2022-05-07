package com.bytelegend;

public class Cat {
    public String name;
    public Cat(String... name) {
        self.name = name[0];
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
