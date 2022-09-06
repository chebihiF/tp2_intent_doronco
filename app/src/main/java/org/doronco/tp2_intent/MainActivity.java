package org.doronco.tp2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callIntent(View view) {
        Uri number = Uri.parse("tel:02729202");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

    public void mapIntent(View view) {
        Uri number = Uri.parse("geo:41.418162, 2.046210?z=14");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, number);
        Intent chooser = Intent.createChooser(mapIntent,"test");
        startActivity(chooser);
    }

    public void mailIntent(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"f.chebihi@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "test mailing");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "test sending mail to chebihi");
        //emailIntent.putExtra(Intent.EXTRA_STREAM,Uri.parse("content://path/to/attachment"));
        startActivity(emailIntent);
    }

    public void goToActivity2(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("email","f.chebihi@gmail.com");
        startActivity(intent);

    }
}