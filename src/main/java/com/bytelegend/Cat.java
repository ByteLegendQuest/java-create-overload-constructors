package com.bytelegend;

public class Cat {
    public String name;

    public Cat() {
        this( "" );
    }

    public Cat( final String s ) {
        this.name = s;
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
