package org.CCristian.Api.STREAM.Ejemplos;

import java.util.stream.Stream;

public class Ejemplo_Stream_Distinct {
    public static void main(String[] args) {

        System.out.println("\n=============================Trabando con 'Distinct'=============================");

        Stream<String> nombres = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman","Paco Gutierrez","Paco Gutierrez","Paco Gutierrez")
                .distinct();    /*Elimina elementos repetidos*/

        nombres.forEach(System.out::println);


    }
}
