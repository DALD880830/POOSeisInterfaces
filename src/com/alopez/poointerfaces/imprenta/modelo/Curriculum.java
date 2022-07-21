package com.alopez.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{ //Clase hija que se extiende de la clase padre Hoja, implementa la interfaz Imprimible

    private Persona persona; //Curriculum cuenta con sus propios atributos, persona, carrera y experiencias, este último en un List
    private String carrera;
    private List<String> experiencias;

    public Curriculum(Persona persona, String carrera, String contenido) { //Implementacion del constructor, que viene de la clase padre Hoja, ya que el
        // constructor de la clase padre no está vacio
        super(contenido);
        this.persona = persona; //Inicializamos persona y carrera
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp){ //Metodo para agregar experiencias a la lista de experiencias
        experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() { //Implementacion del metodo de la clase padre
        StringBuilder sb = new StringBuilder("Nombre: ");   //Generamos un String Builder para concatenar varias cosas
        sb.append(persona).append("\n") //Con .append se concatena en String Builder
                .append("Resumen: ").append(this.contenido).append("\n") //Imprimimos persona, contenido, carrera
                .append("Profesión: ").append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for(String exp: this.experiencias){ //Para imprimir experiencias usamos un For Each
            sb.append("- ").append(exp).append("\n"); //Para cada experiencia imprimimos el guión y el salto de línea
        }
        return sb.toString();
    }
}