package com.example.funnyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class pantalla_ListaJuegos extends AppCompatActivity {
    private String[] juegos = {"juego1","juego2","Juego 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla__lista_juegos);

        ListView lista;
        ArrayAdapter<String> adaptador;

        lista = (ListView)findViewById(R.id.listView);

        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, juegos);

        lista.setAdapter(adaptador);
    }



}
