package com.example.funnyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MenuAlAireLibre extends AppCompatActivity {

    public Button but_BuscarCerca;
    public Button but_Aleatorio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_al_aire_libre);
        but_BuscarCerca = (Button) findViewById(R.id.but_BuscarCerca);
        but_Aleatorio = (Button) findViewById(R.id.but_Aleatorio);

    }
}
