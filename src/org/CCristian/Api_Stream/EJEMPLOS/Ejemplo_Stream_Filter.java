package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.List;
import java.util.stream.Stream;

public class Ejemplo_Stream_Filter {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) /*Asignado Nombre y Apellido*/
                .filter(u -> u.getNombre().equals("Pepe"))  /*filtrado por nombre = "Pepe"*/
                .peek(u -> System.out.println("peek ---> " + u.getNombre()));   /*Inspección*/

        List<Usuario> lista_Usuario = nombres.toList();   /*nombres_2.collect(Collectors.toList());*/
        lista_Usuario.forEach(System.out::println);
    }
}
