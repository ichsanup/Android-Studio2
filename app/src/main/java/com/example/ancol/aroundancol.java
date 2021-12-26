package com.example.ancol;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class aroundancol extends AppCompatActivity {
    ImageButton hotel;
    ImageButton restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aroundancol);


        hotel = findViewById(R.id.hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aroundancol.this,lokasihotel.class);
                startActivity(intent);
            }
        });

        restaurant = findViewById(R.id.restaurant);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aroundancol.this,restaurant.class);
                startActivity(intent);
            }
        });

    }
}