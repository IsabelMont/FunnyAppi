package com.example.funnyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListadoJuegosAireLibre extends AppCompatActivity {

    private String posicion;
    private ArrayList<String> arrayjuego;
    private ListView lista;
    private ArrayList<Juego> arrayItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosalairelibre);

        final ListView lista;
        final ArrayAdapter<String> adaptador;

        lista = (ListView) findViewById(R.id.listView2);

        arrayjuego = getNombreItem(GetArrayItems());
        arrayItem = GetArrayItems();

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayjuego);

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(ListadoJuegosAireLibre.this, DetalleJuego.class);

                intent.putExtra("Objetoatransferir", arrayItem.get(position));
                startActivity(intent);


            }
        });
    }

    public ArrayList<Juego> GetArrayItems() {
        ArrayList<Juego> listItems = new ArrayList<>();
        listItems.add(new Juego("Subir un monte", "Subir un monte y sentirse realizado, ¡Ánimo!"));
        listItems.add(new Juego("Tomar una copa", "Relajarse en buena compañía junto con tu bebida favorita"));
        listItems.add(new Juego("Dar un paseo","Da una vuelta conociento tu ciudad, ¡además puedes llevar tu animal de compañía!"));
        listItems.add(new Juego("Jugar a futbol","Coge el balón de futbol y echar un partido. ¡A jugar!"));
        listItems.add(new Juego("Jugar al escondite","Ir a un parque y ¡a ver quien se esconde mejor!"));
        listItems.add(new Juego("Mirar las estrellas","Ya es de noche, ir a un lugar tranquilo y ¡vereís que maravilla de cielo!"));

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
