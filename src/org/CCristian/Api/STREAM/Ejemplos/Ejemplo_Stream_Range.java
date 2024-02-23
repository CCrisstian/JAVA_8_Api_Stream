package org.CCristian.Api.STREAM.Ejemplos;

import java.util.stream.IntStream;

public class Ejemplo_Stream_Range {
    public static void main(String[] args) {

        System.out.println("\n=============================Trabando con 'IntStream'=============================");

        System.out.println("/----------Antes de 'reduce'----------/");

        IntStream enteros = IntStream
                .range(5, 20)   /*Flujo de enteros en un rango de 5 a 20*/
                /*Incluye 5 y No incluye 20*/
                .peek(System.out::println);

//        int reduce_enteros = enteros.reduce(0, Integer::sum);   /*(a,b) -> a + b)*/
//        System.out.println("/----------Después de 'reduce'----------/");
//        System.out.println("reduce_enteros = " + reduce_enteros);

        int resultado = enteros.sum();
        System.out.println("resultado = " + resultado);



    }
}
