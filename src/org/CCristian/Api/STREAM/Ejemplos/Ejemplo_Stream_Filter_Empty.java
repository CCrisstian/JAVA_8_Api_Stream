package org.CCristian.Api.STREAM.Ejemplos;

import java.util.stream.Stream;

public class Ejemplo_Stream_Filter_Empty {
    public static void main(String[] args) {

        System.out.println("\n==========================================================");

        long cant_nombres = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "", "Pepe Mena", "", "Pepe Cristaldo", "PEPE Guzman")
                .filter(String::isEmpty)    /*Filtrar*/             /*Operador INTERMEDIO*/
                .peek(System.out::println)  /*Inspeccionar*/        /*Operador INTERMEDIO*/
                .count();                   /*Contar*/              /*Operador FINAL*/

        System.out.println("Cantidad de vacíos = " + cant_nombres);
    }
}
