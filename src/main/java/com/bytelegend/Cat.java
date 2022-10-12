package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        System.out.println((new Cat()).toString());
        System.out.println((new Cat("White")).toString());
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }

    public Cat(){
        this("");
    }

    public Cat(String s){
        name = s;
    }
}
