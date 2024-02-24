package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.stream.Stream;

public class Ejemplo_Stream_Distinct_Usuario {
    public static void main(String[] args) {

        System.out.println("\n=============================Trabando con 'filter' y 'findFirst'=============================");

        Stream<Usuario> nombres = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia","Pato Gonzalez", "Pato Gonzalez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();
        /*Usuario no tenía implementado el método 'equals' por lo que el método 'distinct' no era efectivo*/
        /*Usuario ahora tiene implementado el método 'equals', el método 'distinct' ahora resulta efectivo*/

        nombres.forEach(System.out::println);
    }
}
