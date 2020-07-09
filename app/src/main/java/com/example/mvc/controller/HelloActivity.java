package com.example.mvc.controller;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mvc.R;
import com.example.mvc.model.HelloModel;

public class HelloActivity extends AppCompatActivity {

    private TextView label;
    private HelloModel model = new HelloModel();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        label = (TextView) findViewById(R.id.hello_label);
        label.setText(model.pickRandomLabel());

        setContentView(R.layout.activity_main);
    }
}