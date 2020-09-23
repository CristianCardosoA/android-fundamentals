package com.example.enviarobjeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1=findViewById(R.id.textView2);
        textView2=findViewById(R.id.textView3);

        Bundle datitos=getIntent().getExtras();
        Datos datos=datitos.getParcelable("datito");
        if (datos!=null){
            textView1.setText(datos.getNombre());
            textView2.setText(datos.getEdad());
        }
    }
}
