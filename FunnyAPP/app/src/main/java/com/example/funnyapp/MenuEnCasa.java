package com.example.funnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuEnCasa extends AppCompatActivity {
    public Button but_AlAzar;
    public Button but_listaencasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_en_casa);

        but_AlAzar = (Button) findViewById(R.id.but_AlAzar);
        but_listaencasa = (Button) findViewById(R.id.but_listaencasa);
        but_listaencasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), lista_EnCasa.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
