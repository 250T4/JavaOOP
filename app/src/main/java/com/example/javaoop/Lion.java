package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat {
    public void talk() {
        Log.i("talk()", "R-r-r! I'm lion. My name is " + name +
            ", I'm breed " + breed + " and " + color + " coloration " + age + " years old.");
    }
}
