package org.doronco.tp2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String email ;
    TextView t1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        email = intent.getStringExtra("email");
    }

    @Override
    protected void onStart() {
        super.onStart();
        t1 = findViewById(R.id.t1);
        t1.setText(email);
    }
}