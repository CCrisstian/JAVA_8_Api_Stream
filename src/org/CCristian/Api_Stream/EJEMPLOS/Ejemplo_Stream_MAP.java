package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.List;
import java.util.stream.Stream;

public class Ejemplo_Stream_MAP {
    public static void main(String[] args) {

        System.out.println("=====================================Stream con operador '.map()' y  '.peak()'===========================================");
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase)   /*Transformación*/
                .peek(System.out::println)  /*Inspección*/
                .map(String::toLowerCase);  /*Transformación*/

//        nombres.forEach(System.out::println);    /*Operación FINAL*/

        System.out.println("=====================================Convertir 'Stream' en un 'List'===========================================");
        List<String> lista_nombres = nombres.toList(); /*nombres.collect(Collectors.toList());*/
        lista_nombres.forEach(System.out::println);

        System.out.println("=====================================Convertir 'Stream' en una clase 'Usuario'===========================================");
        Stream<Usuario> nombres_2 = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                /*nombre.split(" ") -> dividir en String en elementos separador por un espacio en blanco " "*/
                /*nombre.split(" ").[indice]*/
                .peek(u -> System.out.println("peek:    Nombre ---> " + u.getNombre()))  /*Inspección previa al cambio*/
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista_nombres_Usuario = nombres_2.toList();   /*nombres_2.collect(Collectors.toList());*/
        lista_nombres_Usuario.forEach(System.out::println);
    }
}
