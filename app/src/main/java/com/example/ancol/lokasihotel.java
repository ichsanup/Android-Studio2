package com.example.ancol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lokasihotel extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasihotel);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.agoda.com/id-id/grand-dafam-ancol-jakarta/hotel/jakarta-id.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1891439&numberOfBedrooms=&familyMode=false&adults=1&children=0&rooms=1&maxRooms=0&checkIn=2021-12-14&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=-1&showReviewSubmissionEntry=false&currencyCode=IDR&isFreeOccSearch=false&tag=b160d7c6-5fe6-12a5-fb84-22a1250e2397&isCityHaveAsq=false&tspTypes=4,16&los=1&searchrequestid=67462d53-e86d-4fad-ab39-af3df726cdce");
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.agoda.com/id-id/discovery-ancol/hotel/jakarta-id.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1891439&numberOfBedrooms=&familyMode=false&adults=1&children=0&rooms=1&maxRooms=0&checkIn=2021-12-14&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=-1&showReviewSubmissionEntry=false&currencyCode=IDR&isFreeOccSearch=false&tag=b160d7c6-5fe6-12a5-fb84-22a1250e2397&isCityHaveAsq=false&tspTypes=7,1,8&los=1&searchrequestid=67462d53-e86d-4fad-ab39-af3df726cdce");
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.agoda.com/id-id/bi-executive-hotel/hotel/jakarta-id.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1891439&numberOfBedrooms=&familyMode=false&adults=1&children=0&rooms=1&maxRooms=0&checkIn=2021-12-14&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=-1&showReviewSubmissionEntry=false&currencyCode=IDR&isFreeOccSearch=false&tag=b160d7c6-5fe6-12a5-fb84-22a1250e2397&isCityHaveAsq=false&tspTypes=1,16&los=1&searchrequestid=67462d53-e86d-4fad-ab39-af3df726cdce");
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.agoda.com/id-id/ancol-marina-residence_2/hotel/all/jakarta-id.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1891439&numberOfBedrooms=&familyMode=false&adults=1&children=0&rooms=1&maxRooms=0&checkIn=2021-12-14&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=-1&showReviewSubmissionEntry=false&currencyCode=IDR&isFreeOccSearch=false&tag=b160d7c6-5fe6-12a5-fb84-22a1250e2397&isCityHaveAsq=false&tspTypes=16&los=1&searchrequestid=67462d53-e86d-4fad-ab39-af3df726cdce");
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.booking.com/hotel/id/cordex-ancol.id.html?aid=356980&label=gog235jc-1DCAcoaEINamFrYXJ0YV9hbmNvbEgSWANoaIgBAZgBErgBF8gBD9gBA-gBAfgBAogCAagCA7gC9c2xjQbAAgHSAiQyMmJkMDYxNS1lNzE2LTQ4NTctYjExNi1jOTVjZmE1ZWUwYWLYAgTgAgE&sid=55b45eba8930dc165b446fca857e315c&dest_id=3597&dest_type=district&dist=0&group_adults=2&group_children=0&hapos=14&hpos=14&no_rooms=1&req_adults=2&req_children=0&room1=A%2CA&sb_price_type=total&sr_order=popularity&srepoch=1638688519&srpvid=6f6c3302fbdb0050&type=total&ucfs=1&activeTab=main");            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}