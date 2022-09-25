package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        System.out.println(new Cat(""));
        System.out.println(new Cat("White"));
    }
    public String Cat(String name){
        return name;
    }
    public String Cat(){
        return new Cat("");
    }
    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
