package com.example.ancol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alamat extends AppCompatActivity {

    Button alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamat);

        alamat = findViewById(R.id.alamat);
        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/maps/place/Dunia+Fantasi/@-6.1253124,106.831349,17z/data=!3m1!4b1!4m5!3m4!1s0x2e6a1e1a80420c57:0x275b93253d2232e3!8m2!3d-6.1253124!4d106.8335377");
                //Intent intent = new Intent(alamat.this,located.class);
                //startActivity(intent);
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}