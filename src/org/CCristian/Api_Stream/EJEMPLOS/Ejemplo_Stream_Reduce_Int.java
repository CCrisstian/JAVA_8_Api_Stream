package org.CCristian.Api_Stream.EJEMPLOS;

import java.util.stream.Stream;

public class Ejemplo_Stream_Reduce_Int {
    public static void main(String[] args) {

        System.out.println("\n=============================Trabando con 'Reduce'=============================");

        System.out.println("/----------Antes de 'reduce'----------/");
        Stream<Integer> enteros = Stream
                .of(5, 10, 15, 20)
                .peek(System.out::println);

        Integer reduce_enteros = enteros.reduce(0, Integer::sum);   /*(a,b) -> a + b)*/
        System.out.println("/----------Después de 'reduce'----------/");
        System.out.println("reduce_enteros = " + reduce_enteros);

    }
}
