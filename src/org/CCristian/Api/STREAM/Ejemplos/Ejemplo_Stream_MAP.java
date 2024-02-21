package org.CCristian.Api.STREAM.Ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejemplo_Stream_MAP {
    public static void main(String[] args) {

        System.out.println("=====================================Stream con operador '.map()' y  '.peak()'===========================================");
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase)   /*Transformación*/
                .peek(System.out::println)  /*Inspección*/
                .map(String::toLowerCase);  /*Transformación*/

        nombres.forEach(System.out::println);    /*Operación FINAL*/

        System.out.println("=====================================Convertir flujo 'Stream' en un 'List'===========================================");
        List<String> lista_nombres = nombres.collect(Collectors.toList());
    }
}
