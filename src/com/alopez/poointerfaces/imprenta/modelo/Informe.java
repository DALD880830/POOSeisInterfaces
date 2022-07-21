package com.alopez.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{ //Clase hija que se extiende de la clase padre Hoja, implementa la interfaz Imprimible

    private Persona autor; //Informe cuenta con sus propios atributos, autor del informe y persona que revisa el informe
    private Persona revisor;

    public Informe(Persona autor, Persona revisor, String contenido) { //Implementacion del constructor, que viene de la clase padre Hoja, ya que el
        // constructor de la clase padre no está vacio //Inicializamos que autor y revisor se pasen por argumento
        super(contenido);
        this.autor = autor; //Inicializamos autor y revisor
        this.revisor = revisor;

    }

    @Override
    public String imprimir() { //Implementacion del metodo de la clase padre
        return "Informe escrito por: " + autor  //Imprimimos los datos del informe, autor, revisor y contenido
                + ", revisado por: " + revisor
                + "\n" + this.contenido;    //Contenido viene de la clase padre
    }

}