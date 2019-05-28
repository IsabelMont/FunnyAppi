package com.example.funnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class pantalla_ListaJuegos extends AppCompatActivity {


    // private  ArrayList<String> juegos = {"El Mentiroso","La brisca","La gallinita ciega", "Karaoke", "¿Quién soy?","Las peliculas","Bingo"};
    private String posicion;
    private ArrayList<String> arrayjuego;
    private ListView lista;
    private ArrayList<Juego> arrayItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla__lista_juegos);

        final ListView lista;
        final ArrayAdapter<String> adaptador;

        lista = (ListView) findViewById(R.id.listView);

        arrayjuego = getNombreItem(GetArrayItems());
        arrayItem = GetArrayItems();

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayjuego);

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(pantalla_ListaJuegos.this, DetalleJuego.class);

                intent.putExtra("Objetoatransferir", arrayItem.get(position));
                startActivity(intent);


            }
        });
    }

    public ArrayList<Juego> GetArrayItems() {
        ArrayList<Juego> listItems = new ArrayList<>();
        listItems.add(new Juego("El Mentiroso", "INSTRUCCIONES\nSe reparten todas las cartas al inicio de la partida.\n" +
                "El jugador que comienza decide el número de cartas que quiere apostar sobre la mesa, así como su tipo,(pudiendo mentir o no).\n" +
                "Por ejemplo: Tira dos cartas y dice que son 2 \"Caballos\".\n" +
                "El siguiente jugador, puede realizar las siguientes acciones:\n" +
                "a) Destapar la apuesta del jugador anterior. En caso de que el jugador anterior estuviera mintiendo, se llevará las cartas apiladas en las diferentes jugadas y el siguiente jugador podrá iniciar un nuevo turno. \n" +
                "En caso contrario, el siguiente jugador se llevará las cartas que había en el centro y se saltará su turno por haberse equivocado.\n" +
                "b) Apostar más cartas sobre la apuesta en curso.\n" +
                "En caso de poseer 4 cartas iguales, el jugador puede descartarse de dichas cartas en cualquier momento y éstas serán retiradas de la partida. Sin embargo hay que estar atento, dado que un jugador puede decir que ha apostado cartas que se han retirado ya del juego.\n"));
        listItems.add(new Juego("La Gallinita Ciega", "INSTRUCCIONES\n" +
                "1. En primer lugar se debe elegir a quien llevará la venda, es decir, el que hará el papel de gallinita ciega y deberá encontrar al resto. Una vez elegido debe ponerse un pañuelo en los ojos, deforma que no pueda ver nada.\n" +
                "2. El resto de los niños se ponen en círculo alrededos de la gallinita ciega, cogidos de las manos. La \"gallinita\" debe dar tres vueltas sobre sí misma antes de empezar a buscar, para que no sepa dónde está.\n" +
                "3. La tarea de la gallinita consiste en atrapar a alguno de los jugadores,que pueden moverse pero sin soltarse de las manos. Cuando la gallinita tenga a un jugador, tiene que adivinar quien es mediante el tacto. Si acierta, se intercambian los papeles.\n" +
                "Para jugar a este juego, se puede comenzar recitando este verso popular infantil: Gallinita, gallinita ¿qué se te ha perdido en el pajar? Una aguja y un dedal... Da tres vueltas y la encontrarás."));
        listItems.add(new Juego("¿Quién soy?","Instrucciones\n" +
                "1. Varios participantes deberán situarse en círculo.\n" +
                "2. Cada uno de los participantes debe escribir en un papel el nombre de un personaje (real o de ficción).\n" +
                "3. Cuando todos tengan escrito el personaje deberán pegarlo en la frente del compañero que tengan situado a su derecha.\n" +
                "4. Entre todos deberán elegir a uno para que empiece a formular preguntas para intentar descubrir el personaje que tiene en la frente.\n" +
                "5. Las respuestas tienen que ser del tipo ‘Sí-No’, por ejemplo: ¿soy un personaje de dibujos animados? Si la respuesta es ‘Sí’ el jugador formulará otra pregunta y así hasta que falle, cediendo el turno al compañero de su derecha.\n" +
                "6. Según vayan adivinando el personaje, irán saliendo del juego.\n" +
                "7. El último participante en adivinar quién es su personaje será proclamado como ‘el burro’ del juego.\n" +
                "Consejos: Cuántos más participantes tenga el juego, mejor y más divertido."));
        listItems.add(new Juego("Las peliculas","Instrucciones\n" +
                "Se forman 2 equipos. Una persona que no participe del juego se encargará de decir la película que interpretará el niño que hará la mímica y además verificará que dicho pequeño no hable.\n" +
                "El niño se colocará frente a su equipo e intentará utilizar todas las expresiones físicas para que sus compañeros acierten con la película.\n" +
                "El equipo que logre adivinar más películas será el ganador."));
        listItems.add(new Juego("Veo, veo","Instrucciones\n" +
                "Cuantos más jugadores participen en el juego, mejor. ¡Así será más divertido!\n" +
                "Uno de los jugadores piensa en un objeto y dice en voz alta:\n" +
                "-\"Veo, veo\"\n" +
                "El resto de los jugadores responden:\n" +
                "- \"¿Qué ves?\"\n" +
                "El primer jugador les contesta:\n" +
                "-\"Una cosita...\"\n" +
                "Y añade a la frase una de las siguientes opciones:\n" +
                "-\"... de color ...\"- y señala uno de los colores que caracterizan al objeto (ej. verde, amarillo, rojo...).\n" +
                "-\"... que empieza por...\"- y pronuncia la letra inicial del objeto (la a, la d, la t...).\n" +
                "El resto de los participantes tiene que adivinar qué cosa es. Así, irán nombrando diferentes objetos mientras el primer jugador responde \"sí\", cuando aciertan y \"no\", cuando fallan.\n" +
                "¡El que gane será quién inicie nuevamente el juego!"));
        listItems.add(new Juego("¿Qué será, será?","Instrucciones\n" +
                "Para jugar a este juego es necesario coger una bolsa e introducir objetos que encuentres por casa: Una pelotita, un boli, un peluche… Entonces, has de vendar una los ojos de la otra persona que debe adivinar de qué objeto se trata."));
        listItems.add(new Juego("Quién rie último, rie mejor","Instrucciones\n" +
                "Dos personas deben sentarse una delante del otro y mirarse fijamente a los ojos sin reir. En el momento en el que uno de los dos se ríe, pierde el juego." +
                " Un juego sencillo, que no requiere nada más que las ganas de pasar un buen rato y que, además, es divertido."));
        listItems.add(new Juego("Vengo del supermercado","Instrucciones\n" +
                "Un juego que permite hacer uso de la memoria. Se trata de recrear una lista de la compra. El primero debe decir: “Vengo del supermercado y he comprado naranjas”. Luego cada jugador debe repetir los productos anteriormente comprados y añadir uno más. El que falla se elimina, " +
                "y el juego sigue hasta que solo quede un participante."));
        listItems.add(new Juego("Nudo con los pies","Instrucciones\n" +
                "Los participantes se sientan en una silla, con los pies descalzos.\n" +
                " Colocan un trozo de cuerda atada a los pies (la cuerda atada por los extremos a los tobillos).\n" +
                " Entonces, deben intentar hacer un nudo. El primero que lo logre gana."));



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
