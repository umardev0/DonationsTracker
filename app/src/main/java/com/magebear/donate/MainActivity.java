package com.magebear.donate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDonateClick(View v)
    {
        startActivity(new Intent(this, DonateMethod.class));
    }

    public void onNeedsClick(View v)
    {
        startActivity(new Intent(this, Needs.class));
    }

    public void onTrackClick(View v)
    {
        startActivity(new Intent(this, Tracking.class));
    }
}
