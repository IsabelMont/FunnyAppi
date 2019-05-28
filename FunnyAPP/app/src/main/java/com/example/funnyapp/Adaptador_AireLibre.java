package com.example.funnyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Adaptador_AireLibre extends BaseAdapter {


    private Context contexto;
    private ArrayList<Juego> listItem;


    public Adaptador_AireLibre(Context contexto, ArrayList<Juego> listItem) {
        this.contexto = contexto;
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        Juego juego = (Juego) getItem(i);
        LayoutInflater.from(contexto).inflate(R.layout.activity_juegosalairelibre, null);
        ListView listView = (ListView) convertView.findViewById(R.id.listView2);
        return convertView;
    }

}
