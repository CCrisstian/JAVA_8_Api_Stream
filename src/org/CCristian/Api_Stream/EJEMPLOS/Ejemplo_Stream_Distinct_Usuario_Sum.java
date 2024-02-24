package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejemplo_Stream_Distinct_Usuario_Sum {
    public static void main(String[] args) {

        System.out.println("\n=============================Trabando con 'sum'=============================");

        IntStream largo_nombres = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .peek(System.out::println)
                .mapToInt(u -> ((u.getNombre().length())+(u.getApellido().length())))
                .peek(u -> System.out.println("Cant_Chart_Nom + Cant_Chart_Ap = " + u + "\n"));
                /*u.getNombre().length())+(u.getApellido().length() --> para evitar sumar el espacio entre ambos*/

//        largo_nombres.forEach(System.out::println); /*Operador FINAL*/

//        System.out.println("Cantidad de caracteres en el Stream 'largo_nombres' ---> " + largo_nombres.sum());    /*Operador FINAL*/

        IntSummaryStatistics statistics = largo_nombres.summaryStatistics();
        System.out.println("Cantidad de caracteres en el Stream 'largo_nombres' ---> "  + statistics.getSum());
        System.out.println("MAX (Nom + Ap) ---> " + statistics.getMax());
        System.out.println("MIN (Nom + Ap) ---> " + statistics.getMin());
        System.out.println("Promedio (Nom + Ap) ---> " + statistics.getAverage());

    }
}
