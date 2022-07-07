package com.example.quessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.quessanimal.databinding.ActivityMainBinding;
import com.example.quessanimal.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getValue();
    }

    private void getValue() {
        String someValue;
        Intent intent = getIntent();
        someValue = intent.getStringExtra("Key");
        binding.resultTv.setText(someValue);
    }
}