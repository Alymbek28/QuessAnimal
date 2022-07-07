package com.example.quessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.quessanimal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    boolean isCat, isDog, isHorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initClickers();
    }

    private void initClickers() {
        binding.catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.cat);
                isCat = true;
                isDog = false;
                isHorse = false;
            }
        });
        binding.dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.dog);
                isDog = true;
                isCat = false;
                isHorse = false;
            }
        });
        binding.horseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.horse);
                isHorse = true;
                isCat = false;
                isDog = false;

            }
        });
        binding.thatCatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCat){
                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.thatDogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDog){
                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.thatHorseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isHorse){
                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDog) {
                    Intent intentdog = new Intent(MainActivity.this,SecondActivity.class);
                    intentdog.putExtra("Key", "Собака");
                    startActivity(intentdog);
                }

                if (isCat) {
                    Intent intentcat = new Intent(MainActivity.this,SecondActivity.class);
                    intentcat.putExtra("Key", "Кошка");
                    startActivity(intentcat);
                }

                if (isHorse) {
                    Intent intenthorse = new Intent(MainActivity.this,SecondActivity.class);
                    intenthorse.putExtra("Key", "Лошадь");
                    startActivity(intenthorse);
                }

            }
        });
    }
}