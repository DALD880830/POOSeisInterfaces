package com.alopez.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{ //Clase que implementa la interfaz Imprimible

    private List<Imprimible> paginas; //Libro contiene una lista de paginas que son del tipo generico Hoja
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) { //Constructor, en el que se inicializan los atributos
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina){ //Metodo creado para agregar páginas, por argumento se utiliza la interfaz Imprimible
        paginas.add(pagina); //Agregamos una pagina
        return this;
    }

    public String imprimir(){ //Metodo imprimir, libro no hereda de hoja, por lo que el metodo no se sobrescribe de alguna superclase
        StringBuilder sb = new StringBuilder("Título: "); //Generamos un String Builder para concatenar varias cosas
        sb.append(this.titulo).append("\n") //Con .append se concatena en String Builder
                .append("Autor: ").append(this.autor).append("\n") //Imprimimos titulo, autor, genero
                .append("Género: ").append(genero).append("\n");
        for(Imprimible pag: this.paginas){ //Para imprimir experiencias usamos un For Each el cual utiliza la interfaz Imprimible
            sb.append(pag.imprimir()).append("\n"); //Para cada pagina invocamos el metodo imprimir
        }
        return sb.toString();
    }


}