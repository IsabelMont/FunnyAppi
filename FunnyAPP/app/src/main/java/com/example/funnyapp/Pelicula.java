package com.example.funnyapp;

public class Pelicula {

    public String titulo;
    public String nota;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }


    public Pelicula(String titulo, String nota) {
        this.titulo = titulo;
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}
