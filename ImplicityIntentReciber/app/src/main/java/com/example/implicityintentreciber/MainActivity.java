package com.example.implicityintentreciber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        Uri uri=intent.getData();
        if(uri!=null){
            Log.d("MiAlgo",uri.toString());
            String uri_string="URL: "+uri.toString();
            TextView textView=findViewById(R.id.text);
            textView.setText(uri_string);
        }else{
            Intent intent1 = getIntent();
            String txt = intent1.getStringExtra(Intent.EXTRA_TEXT);
            if(txt != null){
                textView1 = findViewById(R.id.text);
                textView1.setText(txt);
            }
        }
    }
}