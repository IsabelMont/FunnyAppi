package com.example.funnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class lista_recetas extends AppCompatActivity {

    private String posicion;
    private ArrayList<String> arrayRecetas;
    private ListView listarecetas;
    private ArrayList<Receta> arrayItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_recetas);

        final ListView listarecetas;
        final ArrayAdapter<String> adaptador;

        listarecetas = (ListView) findViewById(R.id.lista_recetas);

        arrayRecetas = getNombreItem(GetArrayItems());
        arrayItem = GetArrayItems();

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayRecetas);

        listarecetas.setAdapter(adaptador);

        listarecetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(lista_recetas.this, DetalleJuego.class);

                intent.putExtra("Objetoatransferir", arrayItem.get(position));
                startActivity(intent);


            }
        });
    }

    public ArrayList<Receta> GetArrayItems() {
        ArrayList<Receta> listItems = new ArrayList<>();
        listItems.add(new Receta("Tortilla de patata", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));
        listItems.add(new Receta("Pastel de Chocolate", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));
        listItems.add(new Receta("Pastel de Carne", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));
        listItems.add(new Receta("Cheescacke", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));
        listItems.add(new Receta("Crepes", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));
        listItems.add(new Receta("Gofre", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));
        listItems.add(new Receta("Hamburguesas BBQ", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));
        listItems.add(new Receta("Macedonia", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));
        listItems.add(new Receta("Galletas", "8 Huevos\n 15 patatas\n", "Se pelan las patatas\n" +
                "Se baten los huevos se mete todo en la sarten y Listo"));


        return listItems;
    }

    private ArrayList<String> getNombreItem(ArrayList<Receta> e) {
        ArrayList<String> listaNombres = new ArrayList<>();
        for (int i = 0; i < e.size(); i++) {
            listaNombres.add(e.get(i).titulo);


        }
        return listaNombres;
    }
}
