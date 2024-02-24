package org.CCristian.Api_Stream.EJEMPLOS;

import java.util.stream.Stream;

public class Ejemplo_Stream_Reduce {
    public static void main(String[] args) {

        System.out.println("\n=============================Trabando con 'Reduce'=============================");

        System.out.println("/----------Antes de 'distinct' y 'reduce'----------/");
        Stream<String> nombres = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman","Paco Gutierrez","Paco Gutierrez","Paco Gutierrez")
                .peek(System.out::println)
                .distinct();    /*Elimina elementos repetidos*/

        String reduce_nombres = nombres.reduce("reduce_nombres: ", (a,b) -> a+", "+b);
        /*reduce(valor inicial, (a,b) → operación lambda)*/
        /*reduce devuelve un único elemento*/
        System.out.println("/----------Después de 'distinct' y 'reduce'----------/");
        System.out.println(reduce_nombres);


    }
}
