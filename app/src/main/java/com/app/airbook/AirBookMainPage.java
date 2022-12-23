package com.app.airbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.app.airbookfeatures.PackageBridge;

public class AirBookMainPage extends AppCompatActivity {
    private Button redirectBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_page);
        redirectBtn = findViewById(R.id.redirectBtn);
        redirectBtn.setOnClickListener(v -> {
            PackageBridge packageBridge = new PackageBridge(this);
            packageBridge.renderMainPage();
           /* Intent myIntent = new Intent(AirBookMainPage.this, LibraryMain.class);
            //myIntent.putExtra("key", value); //Optional parameters
            AirBookMainPage.this.startActivity(myIntent);*/
        });
    }
}