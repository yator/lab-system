package com.example.labsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AvailableResourcesLecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_resources_lec);
    }

    public void lecCheckComputers(View view) {

        startActivity(new Intent(AvailableResourcesLecActivity.this, ComputersActivity.class));
    }

    public void checkProjectors(View view) {
    }

    public void checkLcd(View view) {
    }

    public void checkLabs(View view) {
    }
}
