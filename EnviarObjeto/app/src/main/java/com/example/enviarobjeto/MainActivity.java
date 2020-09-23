package com.example.enviarobjeto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editTextNombre;
    EditText editTextEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        editTextEdad=findViewById(R.id.txtEdad);
        editTextNombre=findViewById(R.id.txtNombre);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                Datos datos=new Datos(editTextNombre.getText().toString(),editTextEdad.getText().toString());
                intent.putExtra("datito",datos);
                startActivity(intent);
            }
        });
    }
}