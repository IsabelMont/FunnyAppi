package com.example.funnyapp;

import java.io.Serializable;

public class Receta implements Serializable{
    // Atributos
    public String titulo;
    public String ingredientes;
    public String procedimiento;

    //Constructor
    public Receta(String titulo, String ingredientes, String procedimiento) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.procedimiento = procedimiento;
    }

    //Getter y setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }


}
