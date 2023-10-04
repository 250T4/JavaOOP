package com.example.javaoop;

import android.util.Log;

//Inner class
//Static inner class
//Local class
//Anonymous class

public class Cat extends Animal {
    private int age;
    String name;
    final static  int number0fLegs =  4;
    static int count = 0;
    String helloText;
    CatMood catMood;

    private class CatMood {
        int level0fMood;

        CatMood() {
            if(Cat.this.age < 2){
                level0fMood = 100;
            } else if(Cat.this.age >= 2 && Cat.this.age < 7) {
                level0fMood = 50;
            } else if(Cat.this.age >= 7){
                level0fMood = 20;
            }
        }
    }


    public Cat() {
        count++;
        this.name = "John Doe";
        this.age = -1;

        catMood = new CatMood();

        switch (catMood.level0fMood) {
            case 100:
                helloText = "Meow! I'm happpy cat:) My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! I'm cat. My name is " + name +
                        ",and I'm " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! I'm old and sick cat:( My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
        }
    }

    public Cat(int age, String name) {
        count++;
        this.age = age;
        this.name = name;

        catMood = new CatMood();

        switch (catMood.level0fMood) {
            case 100:
                helloText = "Meow! I'm happpy cat:) My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! I'm cat. My name is " + name +
                        ",and I'm " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! I'm old and sick cat:( My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
        }
    }

    public void talk() {
        Log.i("talk()", helloText);
    }



    public static String whatCatsLike () {
        return " I like playing, jumping";
    }

}
