package com.example.tablegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double totalMoney;
    int buildTableButtonPosition;
    ImageView TableImageOne = findViewById(R.id.imageViewTableImageOne);
    ImageView TableImageTwo = findViewById(R.id.imageViewTableImageTwo);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
