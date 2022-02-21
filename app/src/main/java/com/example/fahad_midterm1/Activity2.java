package com.example.fahad_midterm1;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    Button button1_2 = (Button) findViewById(R.id.button1_2);
    Button button2_2 = (Button) findViewById(R.id.button2_2);
    ImageView imageview2 = (ImageView) findViewById(R.id.imageView2);

    button1_2.setOnClickListener(new OnClickListener(){

        private void onClick(){
            Intent intent = new Intent(Activity2.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    });
    button2_2.setOnClickListener(new OnClickListener(){

        private void onClick(){
            Intent intent = new Intent(Activity2.this, Activity3.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    });
}
