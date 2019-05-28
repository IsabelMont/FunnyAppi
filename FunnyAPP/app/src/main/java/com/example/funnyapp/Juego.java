package com.example.funnyapp;

public class Juego {

    public Juego(String nombre) {
        this.nombre = nombre;
    }

    public String nombre;
    public String instrucciones;


    public Juego(String nombre, String instrucciones) {
        this.nombre = nombre;
        this.instrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", instrucciones='" + instrucciones + '\'' +
                '}';
    }

}
