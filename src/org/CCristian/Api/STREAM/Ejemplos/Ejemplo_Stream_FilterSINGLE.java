package org.CCristian.Api.STREAM.Ejemplos;

import org.CCristian.Api.STREAM.Ejemplos.MODELS.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class Ejemplo_Stream_FilterSINGLE {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) /*Asignado Nombre y Apellido*/
                .filter(u -> u.getNombre().equals("Pepe"))  /*filtrado por nombre = "Pepe"*/
                /*Solo quedan aquellos que cumplen con la condición del 'filter'*/
                .peek(u -> System.out.println("peek ---> " + u.getNombre()));   /*Inspección*/
                /*Muestra solo aquellos que cumplen con la condición del 'filter'*/

        Optional<Usuario> usuario = nombres.findFirst();   /*.findFirst() --> devuelve el primer elemento del stream*/
        System.out.println(usuario);;
        System.out.println(usuario.get());
    }
}
