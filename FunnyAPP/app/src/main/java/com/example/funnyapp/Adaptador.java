package com.example.funnyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends BaseAdapter {

    private Context context;
    private ArrayList<Juego> listItem;

    public Adaptador(Context context, ArrayList<Juego> listItem) {
        this.context = context;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        Juego juego = (Juego) getItem(position);
        LayoutInflater.from(context).inflate(R.layout.activity_pantalla__lista_juegos, null);
        ListView listView = (ListView) convertView.findViewById(R.id.listView);
        return convertView;
    }
}
