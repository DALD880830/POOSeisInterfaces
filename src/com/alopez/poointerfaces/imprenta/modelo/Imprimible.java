package com.alopez.poointerfaces.imprenta.modelo;

public interface Imprimible { //Gereramos una interfaz, por ello es que es interface

    String imprimir(); //No tiene cuerpo, un metodo de la interfaz debe siempre ser publico para que pueda ser
    //utilizado por las clases

/*
    //Podemos colocar un metodo por default y dentro de las clase Libro no habrá necesidad de
    //sobreescribir el metodo, aunque en las otras clases, la sobreescritura del metodo es obligatoria porque
    //viene de la clase abstracta Hoja
    default String imprimir(){
        return "Imprimiendo un valor por defecto";
    }
    Una interfaz puede tener atributos pero solo final static porque no es un objeto
*/
}