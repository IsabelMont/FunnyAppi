package com.example.funnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lista_EnCasa extends AppCompatActivity {
    public Button but_recetas;
    public Button but_juegos;
    public Button but_quever;
    public Button but_Inicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__en_casa);
        but_recetas = (Button) findViewById(R.id.but_recetas);
        but_juegos = (Button) findViewById(R.id.but_juegos);
        but_quever = (Button) findViewById(R.id.but_quever);
        but_Inicio = (Button) findViewById(R.id.but_Inicio);
        but_juegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PrimeraPantallaJuegos.class);
                startActivityForResult(intent, 0);
            }
        });
        but_Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        but_quever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), peliculas.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
