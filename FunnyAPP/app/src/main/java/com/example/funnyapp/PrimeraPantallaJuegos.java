package com.example.funnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimeraPantallaJuegos extends AppCompatActivity {

    public Button but_JuegoAzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla_juegos);
        but_JuegoAzar = (Button) findViewById(R.id.but_JuegoAzar);

        but_JuegoAzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), pantalla_ListaJuegos.class);
                startActivityForResult(intent, 0);
            }
        }); }
}
