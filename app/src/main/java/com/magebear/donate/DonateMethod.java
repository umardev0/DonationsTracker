package com.magebear.donate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DonateMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_method);
    }

    public void onBtnClick(View v)
    {
        startActivity(new Intent(this, DonateAmount.class));
    }
}
