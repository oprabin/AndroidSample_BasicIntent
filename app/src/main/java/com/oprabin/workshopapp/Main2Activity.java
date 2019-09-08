package com.oprabin.workshopapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtValueName, txtValueAddress, txtValuePhone, txtValueEmail;
    String name, address, email, phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            name = bundle.getString("name");
            address = bundle.getString("address");
            email = bundle.getString("email");
            phone = bundle.getString("phone");

        }


        txtValueName = (TextView) findViewById(R.id.valueName);
        txtValuePhone = (TextView) findViewById(R.id.valuePhone);
        txtValueAddress = (TextView) findViewById(R.id.valueAddress);
        txtValueEmail = (TextView) findViewById(R.id.valueEmail);

        txtValueName.setText("Name: " + name);
        txtValueAddress.setText("Address: " + address);
        txtValuePhone.setText("Email: " + email);
        txtValueEmail.setText("Phone: " + phone);


    }

}
