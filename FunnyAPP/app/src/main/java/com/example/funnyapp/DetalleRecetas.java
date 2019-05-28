package com.example.funnyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleRecetas extends AppCompatActivity {
    public Receta e;
    public TextView t, i,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_recetas);
        e = (Receta) getIntent().getSerializableExtra("Objetoatransferir");
        i = (TextView) findViewById(R.id.text_instrucciones);
        t = (TextView) findViewById(R.id.text_titulo);
        t.setText(e.getTitulo());
        i.setText(e.getIngredientes());
        p.setText(e.getIngredientes());
    }
}
