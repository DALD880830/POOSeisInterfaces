package com.alopez.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible{ //Clase hija que se extiende de la clase padre Hoja, implementa la interfaz Imprimible


    public Pagina(String contenido) {//Implementacion del constructor, que viene de la clase padre Hoja, ya que el
        // constructor de la clase padre no está vacio
        super(contenido);
    }

    @Override
    public String imprimir() { //Implementacion del metodo de la clase padre
        return this.contenido;
    }

}