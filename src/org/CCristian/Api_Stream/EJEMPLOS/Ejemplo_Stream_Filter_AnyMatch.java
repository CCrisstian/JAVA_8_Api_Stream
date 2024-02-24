package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.stream.Stream;

public class Ejemplo_Stream_Filter_AnyMatch {
    public static void main(String[] args) {

        boolean existe_usuario = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek( u -> System.out.println("peak u --> " + u))  /*Inspeccionar hasta que se cumpla la condición del 'anyMatch'*/
                .anyMatch(u -> u.getId().equals(2));  /*busca un elemento que cumpla con la condición de Id y retorna un 'boolean'*/
                /*Solo sea signan aquellos valores que cumplen con la condición del 'anyMatch'*/
                /*'anyMatch' es un operador TERMINAL*/

        System.out.println("\nanyMatch(u -> u.getId().equals(2)) ---> " + String.valueOf(existe_usuario).toUpperCase());
        /*NO ES NECESARIO 'String.valueOf(existe_usuario).toUpperCase())'*/
        /*Es solo para que sea mas claro de leer*/

    }
}
