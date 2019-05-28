package com.example.funnyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleJuego extends AppCompatActivity {

    public Juego e;
    public TextView t, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_juego);
        e = (Juego) getIntent().getSerializableExtra("Objetoatransferir");
        i = (TextView) findViewById(R.id.text_instrucciones);
        t = (TextView) findViewById(R.id.text_titulo);
        t.setText(e.getNombre());
        i.setText(e.getInstrucciones());


    }
}
