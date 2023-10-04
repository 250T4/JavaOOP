package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal {
    int age;
    String name;
    final static  int number0fLegs =  4;


    public Cat() {
        this.name = "John Doe";
        this.age = -1;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void talk() {
        Log.i("talk()", "Meow! I'm cat. My name is " + name +
                ",and I'm "  + age + " years old.");
    }



    public static String whatCatsLike () {
        return " I like playing, jumping";
    }

}
