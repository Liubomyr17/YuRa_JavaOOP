package com.lizdepskyi.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Lion();
        cat.talk();

        Puma printable = new Puma();
        printable.print();
        printable.move();

        Movable.someMethod();

        Puma puma = new Puma();
        Log.i("speedOfMoving", "" + puma.speedOfMoving);
        Log.i("speedOfMoving", "" + printable.speedOfMoving);
        Log.i("speedOfMoving", "" + Movable.speedOfMoving);

    }

    void printAnyObject(Printable printable) {

    }
}