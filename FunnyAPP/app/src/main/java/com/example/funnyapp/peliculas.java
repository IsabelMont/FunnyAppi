package com.example.funnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
public class peliculas extends AppCompatActivity {
    private ArrayList<Pelicula> arrayPeliculasItem;
    private ArrayList<String> arrayPeliculasString;
    private ListView listapeliculas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas);

        final ArrayAdapter<String> adaptador;
        final ListView listapeliculas;

        listapeliculas = (ListView) findViewById(R.id.list_peliculas);
        arrayPeliculasString = getNombreItem(GetArrayItems());
        arrayPeliculasItem = GetArrayItems();

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayPeliculasString);

        listapeliculas.setAdapter(adaptador);

        }


    public ArrayList<Pelicula> GetArrayItems() {
        ArrayList<Pelicula> listItems = new ArrayList<>();
        listItems.add(new Pelicula("American History X", "9.5"));
        listItems.add(new Pelicula("Titanic", "9.7"));
        listItems.add(new Pelicula("A ciegas","7.3"));
        listItems.add(new Pelicula("Contratiempo","8.0"));
        listItems.add(new Pelicula("Efecto Mariposa","8.7"));
        listItems.add(new Pelicula("Algo pasa con mery","6.1"));
        listItems.add(new Pelicula("Divergente","7.9"));
        listItems.add(new Pelicula("El detective pokemon","7.0"));
        listItems.add(new Pelicula("El lobo de Wall Street","6.1"));

        return listItems;
    }

    private ArrayList<String> getNombreItem(ArrayList<Pelicula> e) {
        ArrayList<String> listaNombres = new ArrayList<>();
        for (int i = 0; i < e.size(); i++) {
            listaNombres.add(e.get(i).titulo);


        }
        return listaNombres;
}
}
