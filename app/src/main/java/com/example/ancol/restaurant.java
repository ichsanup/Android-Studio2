package com.example.ancol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class restaurant extends AppCompatActivity {
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/maps/place/Talaga+Sampireun+-+Ancol/@-6.1243188,106.827887,15z/data=!4m9!1m2!2m1!1srestaurant+sekitar+dufan!3m5!1s0x2e6a1e1a428ddd71:0x28e53acc85b19d10!8m2!3d-6.1264777!4d106.8334993!15sChhyZXN0YXVyYW50IHNla2l0YXIgZHVmYW5aGiIYcmVzdGF1cmFudCBzZWtpdGFyIGR1ZmFukgEVaW5kb25lc2lhbl9yZXN0YXVyYW50");
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/maps/place/Yoshinoya/@-6.1247721,106.8328,16z/data=!4m9!1m2!2m1!1srestaurant+sekitar+dufan!3m5!1s0x2e6a1f1ce5a6b057:0xce5f7cf4efa80234!8m2!3d-6.1235892!4d106.8324126!15sChhyZXN0YXVyYW50IHNla2l0YXIgZHVmYW5aGiIYcmVzdGF1cmFudCBzZWtpdGFyIGR1ZmFukgESY2hpY2tlbl9yZXN0YXVyYW50");
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/maps/place/MCD+Dunia+Fantasi/@-6.1247721,106.8328,16z/data=!4m9!1m2!2m1!1srestaurant+sekitar+dufan!3m5!1s0x2e6a1e108cc15b25:0xcfcf5a037ed64ca5!8m2!3d-6.1239084!4d106.8330571!15sChhyZXN0YXVyYW50IHNla2l0YXIgZHVmYW5aGiIYcmVzdGF1cmFudCBzZWtpdGFyIGR1ZmFukgEUZmFzdF9mb29kX3Jlc3RhdXJhbnQ");
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/maps/place/Super+Bento/@-6.1247721,106.8328,16z/data=!4m9!1m2!2m1!1srestaurant+sekitar+dufan!3m5!1s0x2e6a1e3d2c3fbd01:0x89556a795b120af!8m2!3d-6.1236095!4d106.8319109!15sChhyZXN0YXVyYW50IHNla2l0YXIgZHVmYW5aGiIYcmVzdGF1cmFudCBzZWtpdGFyIGR1ZmFukgETamFwYW5lc2VfcmVzdGF1cmFudA");
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/maps/place/A%26W+Restoran+-+Ancol+(Pantai+Indah)/@-6.1297371,106.8204791,15z/data=!4m9!1m2!2m1!1saw+dekat+dufan!3m5!1s0x2e6a1e11254bf5e1:0x679a54ca7a7269ac!8m2!3d-6.1219001!4d106.8347301!15sCg5hdyBkZWthdCBkdWZhbloQIg5hdyBkZWthdCBkdWZhbpIBFGZhc3RfZm9vZF9yZXN0YXVyYW50mgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVU52ZVU5cWNuWjNSUkFC");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}