package com.example.knightlifeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.TimeZone;

public class GetStartedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
    }

    public void onButtonClick(View view) {
        if(view.getId() == R.id.get_started) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
