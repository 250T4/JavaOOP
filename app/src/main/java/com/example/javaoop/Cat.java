package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal {
    protected int age;
    protected String name;
    protected String breed;
    protected String color;

    public Cat() {
        this.name = "John Doe";
        this.age = -1;
    }

    public Cat(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void talk() {
        Log.i("talk()", "Meow! I'm cat. My name is " + name +
                ", I'm breed " + breed + " and " + color + " coloration " + age + " years old.");
    }
}
