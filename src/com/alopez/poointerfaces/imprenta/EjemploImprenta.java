package com.alopez.poointerfaces.imprenta;

import com.alopez.poointerfaces.imprenta.modelo.*;

import static com.alopez.poointerfaces.imprenta.modelo.Genero.*; //Importamos para que sea como una constante propia de la clase

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Alejandro", "López"), "Informática", "Resumen laboral..."); //Creamos un objeto Curriculum
        cv.addExperiencia("Java"); //Adherimos experiencias al objeto creado cv
        cv.addExperiencia("SQL");
        cv.addExperiencia("GIT");

        Libro libro = new Libro(new Persona("Erich", "Gama"),
                "Patrón de diseños: Elementos Reusables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton")) //Al adherir una pagina, recibe un tipo Hoja, entonces se crea una instancia de Pagina
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Daniel", "Delgado"),
                new Persona("Daniel", "Alejandro"), "Curso de Java");

        imprimir(cv); //Invocamos el metodo imprimir de este main y le pasamos por argumento el objeto a imprimir
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible){ //Metodo de imprimir, esta en contrato con la clase abstracta Hoja
        System.out.println(imprimible.imprimir()); //Invoca el metodo imprimir de la clase abstracta
    }

    /* Si contamos en la interfaz con un metodo por default, podemos crear una clase anonima dentro del main
            imprimir(new Imprimible(){});
       Aunque tambien podemos crear una instancia de Imprimible
            Imprimible objImp = new Iprimible(){};
            imprimir(objImp); //y pasamos el ibjeto para imprimir
       De igual forma podemos sobreescribir el metodo de la Interfaz
    */
}