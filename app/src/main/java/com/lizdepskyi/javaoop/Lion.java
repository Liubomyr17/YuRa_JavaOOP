package com.lizdepskyi.javaoop;

import android.util.Log;

public class Lion extends Cat {

    public void talk() {
        Log.i("talk()", "R-r-r! I'm lion. My name is " + name +
                ", and I'm " + age + " years old." + Lion.whatCatsLike());
    }

    @Override
    public void draw() {
        Log.i("draw()", "Drw a lion");
    }

    public static String whatCatsLike() {
        return "I'm lioness";
    }

}
