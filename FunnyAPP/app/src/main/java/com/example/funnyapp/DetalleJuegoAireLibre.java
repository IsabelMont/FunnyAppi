package com.example.funnyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetalleJuegoAireLibre extends AppCompatActivity {

    public Juego e;
    public TextView t, i;
    public Button botonBuscarLugar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_juego_aire_libre);
        e = (Juego) getIntent().getSerializableExtra("Objetoatransferir");
        i = (TextView) findViewById(R.id.text_instrucciones);
        t = (TextView) findViewById(R.id.text_titulo);
        botonBuscarLugar = (Button) findViewById(R.id.BotonBuscarLugar);
        t.setText(e.getNombre());
        i.setText(e.getInstrucciones());


        // Salto de ventana a la de UbicacionActual
        botonBuscarLugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), UbicacionActual.class);
                startActivityForResult(intent, 0);
            }
        });



    }

    public void onClick (View v)
    {
        Intent intent = new Intent(v.getContext(), UbicacionActual.class);
        startActivityForResult(intent, 0);
    }
}
