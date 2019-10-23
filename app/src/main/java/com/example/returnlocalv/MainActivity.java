package com.example.returnlocalv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Var var = new Var();
        int a = var.m1(20);
        System.out.println("method return value is=" + a);
    }
}
