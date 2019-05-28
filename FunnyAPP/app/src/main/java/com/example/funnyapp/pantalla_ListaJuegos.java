package com.example.funnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class pantalla_ListaJuegos extends AppCompatActivity {


    // private  ArrayList<String> juegos = {"El Mentiroso","La brisca","La gallinita ciega", "Karaoke", "¿Quién soy?","Las peliculas","Bingo"};
    private String posicion;
    private ArrayList<String> arrayjuego;
    private ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla__lista_juegos);

        final ListView lista;
        final ArrayAdapter<String> adaptador;

        lista = (ListView) findViewById(R.id.listView);

        arrayjuego = getNombreItem(GetArrayItems());

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayjuego);

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
                Intent intent = new Intent(pantalla_ListaJuegos.this, DetalleJuego.class);
                intent.putExtra("Objetoatransferir", arrayjuego.get(position));
                startActivity(intent);


            }
        });
    }

    private ArrayList<Juego> GetArrayItems() {
        ArrayList<Juego> listItems = new ArrayList<>();
        listItems.add(new Juego("El Mentiroso", "Mentir"));
        listItems.add(new Juego("La brisca", "Cartas"));


        return listItems;
    }

    private ArrayList<String> getNombreItem(ArrayList<Juego> e) {
        ArrayList<String> listaNombres = new ArrayList<>();
        for (int i = 0; i < e.size(); i++) {
            listaNombres.add(e.get(i).nombre);


        }
        return listaNombres;
    }
}
