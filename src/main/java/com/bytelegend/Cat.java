package com.bytelegend;

public class Cat {
    public String name;
    public Cat(String... name) {
        if (name.length > 0) {
            self.name = name[0];
        } else self.name = "";
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
