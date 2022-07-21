package com.alopez.poointerfaces.imprenta.modelo;

abstract public class Hoja {

    protected String contenido; //Texto contenido en la hoja

    public Hoja(String contenido) { //Constructor para contenido
        this.contenido = contenido;
    }

    abstract public String imprimir(); //Metodo abstracto, cualquier hoja se puede imprimir


}