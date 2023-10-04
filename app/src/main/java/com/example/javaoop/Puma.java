package com.example.javaoop;

import android.util.Log;

public class Puma extends Cat {
    String name;
     private int age;

    public Puma() {
        this.name = "Puma";
        this.age = 1;
    }
    public void talk() {
        Log.i("talk()", "R-r-r! I'm a cool cat! My name is " + name +
                ", and I'm " + age + " years old.");
    }
}
