package com.example.implicityitemsend;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mWebsiteEditText;
    private EditText mLocationEditText;
    private EditText mShareTextEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebsiteEditText=findViewById(R.id.editTextURL);
        mLocationEditText=findViewById(R.id.editTextLocation);
        mShareTextEditText=findViewById(R.id.editTextShare);
    }

    public void openWebsite(View view){
        String url=mWebsiteEditText.getText().toString();
        Uri webPage= Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,webPage);

        if(intent.resolveActivity(getPackageManager())!=null)
            startActivity(intent);
    }

    public void openLocation(View view){
        String loc=mLocationEditText.getText().toString();
        Uri addressUri=Uri.parse("geo:0,0?q="+loc);
        Intent intent=new Intent(Intent.ACTION_VIEW,addressUri);

        if(intent.resolveActivity(getPackageManager())!=null)
            startActivity(intent);

    }

    public void ShareText(View view){
        /*String text=mShareTextEditText.getText().toString();
        String mimeType="text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Titulo")
                .setText(text)
                .startChooser();*/

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");

        Intent intent = Intent.createChooser(sendIntent, null);
        if(intent.resolveActivity(getPackageManager())!=null)
            startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Mi actividad","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Mi actividad","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Mi actividad","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Mi actividad","onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Mi actividad","onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}