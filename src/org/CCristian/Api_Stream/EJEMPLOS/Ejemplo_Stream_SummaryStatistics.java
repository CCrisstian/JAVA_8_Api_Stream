package org.CCristian.Api_Stream.EJEMPLOS;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Ejemplo_Stream_SummaryStatistics {
    public static void main(String[] args) {

        System.out.println("\n=============================Trabando con 'summaryStatistics'=============================");

        IntStream enteros = IntStream
                .range(5, 20)   /*Flujo de enteros en un rango de 5 a 20*/  /*Incluye 5 y No incluye 20*/
                /*.rangeClosed(5, 20)*/ /*Incluye 5 y incluye 20*/
                .peek(System.out::println);

        IntSummaryStatistics enteros_Statistics = enteros.summaryStatistics();
        System.out.println("/------------Operaciones con enteros_Statistics-----------------/");
        System.out.println("resultado MAX = " + enteros_Statistics.getMax());
        System.out.println("resultado MIN = " + enteros_Statistics.getMin());
        System.out.println("resultado SUM = " + enteros_Statistics.getSum());
        System.out.println("resultado PROMEDIO = " + enteros_Statistics.getAverage());
        System.out.println("resultado TOTAL_Elementos = " + enteros_Statistics.getCount());

    }
}
