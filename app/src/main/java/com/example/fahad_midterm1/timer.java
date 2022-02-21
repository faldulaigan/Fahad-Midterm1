package com.example.fahad_midterm1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class timer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
finish();
startActivity(new Intent(timer.this,  MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule (task, 9000);
    }
    TextView backgroundimage = (TextView) findViewById(R.id.backgroundimage);
}
