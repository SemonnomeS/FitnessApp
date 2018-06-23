package com.example.zen.fitnessapp;

import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }
public void onSearch(View view)
{
    EditText address = (EditText)findViewById(R.id.address);
    String location = address.getText().toString();
    List<Address> addressList=null;
    if(location != null || !location.equals("")){
        Geocoder geocoder = new Geocoder(this);
        try {
            addressList = geocoder.getFromLocationName(location,1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Address address1 = addressList.get(0);
        LatLng latLng = new LatLng(address1.getLatitude(),address1.getLongitude());
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,14));
        mMap.addMarker(new MarkerOptions().position(latLng).title("Marker in "+address));

    }

}


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sarajevo = new LatLng(0,0);
        mMap.addMarker(new MarkerOptions().position(sarajevo).title(""));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sarajevo));
    }
}
