package com.example.funnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button but_Airelibre;
    public Button but_encasa;
    public Button but_juegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_encasa = (Button) findViewById(R.id.but_encasa);
        but_Airelibre = (Button) findViewById(R.id.but_Airelibre);
        but_juegos = (Button) findViewById(R.id.but_juegos);

        but_juegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PrimeraPantallaJuegos.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}
