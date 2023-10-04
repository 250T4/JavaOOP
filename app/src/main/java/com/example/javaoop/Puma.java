package com.example.javaoop;

import android.util.Log;

public class Puma extends Cat {
    public void talk() {
        Log.i("talk()", "R-r-r! I'm puma. My name is " + name +
                ", I'm breed " + breed + " and " + color + " coloration " + age + " years old.");
    }
}
