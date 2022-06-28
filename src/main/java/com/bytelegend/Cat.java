package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        System.out.println(new Cat(""));
        System.out.println(new Cat("White"));
    }

    public Cat(String Name){
        name = Name;
    }

    public Cat(){
        this("");
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
