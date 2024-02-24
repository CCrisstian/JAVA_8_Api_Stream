package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.stream.Stream;

public class Ejemplo_Stream_Filter_FlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                /*map devuelve un objeto*/
                .flatMap(u -> {     /*Filtrar usando 'flatMap'*/
                /*flatMap devuelve un Stream del objeto*/
                    if (u.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(u -> System.out.println("peek ---> " + u));

        nombres.forEach(System.out::println);
    }
}
