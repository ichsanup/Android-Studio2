package com.example.ancol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.jetbrains.annotations.NotNull;

public class located extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_located);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.lokasi);
        mapFragment.getMapAsync(this);
    }

    @SuppressLint("MissingPermission")

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //menambahkan titik longtitude dan latitude
        LatLng DUFAN = new LatLng(-6.125035038312274, 106.83353769720617);
        //menambahkan marker dengan nama dufan
        mMap.addMarker(new MarkerOptions().position(DUFAN).title("DUFAN"));
        //memindahkan kamera ke lokasi yang telah ditentukan
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DUFAN));
        //enable compass
        mMap.getUiSettings().setCompassEnabled(true);
        //enable zoom in
        mMap.getUiSettings().setZoomControlsEnabled(true);

    }
}