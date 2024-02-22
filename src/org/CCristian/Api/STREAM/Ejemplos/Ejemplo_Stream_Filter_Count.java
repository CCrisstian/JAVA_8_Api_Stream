package org.CCristian.Api.STREAM.Ejemplos;

import org.CCristian.Api.STREAM.Ejemplos.MODELS.Usuario;

import java.util.stream.Stream;

public class Ejemplo_Stream_Filter_Count {
    public static void main(String[] args) {

        long cantidad_usuarios = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .count();  /*Cuenta la cantidad de elementos del Stream y retorna un 'long'*/
                /*'count' es un operador TERMINAL*/

        System.out.println("\ncantidad_usuarios = Stream.of( _ _ _ ).count() ---> " + cantidad_usuarios);
    }
}
