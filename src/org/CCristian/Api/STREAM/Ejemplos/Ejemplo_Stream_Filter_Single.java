package org.CCristian.Api.STREAM.Ejemplos;

import org.CCristian.Api.STREAM.Ejemplos.MODELS.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class Ejemplo_Stream_Filter_Single {
    public static void main(String[] args) {

        System.out.println("\n=============================Trabando con 'filter' y 'findFirst'=============================");

        Stream<Usuario> nombres = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) /*Asignado Nombre y Apellido*/
                .filter(u -> u.getNombre().equals("Pepe"))  /*filtrado por nombre = "Pepe"*/
                /*Solo quedan aquellos que cumplen con la condición del 'filter'*/
                .peek(u -> System.out.println("peek ---> " + u.getNombre()));   /*Inspección*/
                /*Muestra solo aquellos que cumplen con la condición del 'filter'*/

        Optional<Usuario> usuario = nombres.findFirst();   /*.findFirst() --> devuelve el primer elemento del stream*/
        System.out.println(usuario);
        System.out.println(usuario.get());


        System.out.println("\n=============================Trabando con API Optional=============================");
        Stream<Usuario> nombres_2 = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(u -> System.out.println("peek ---> " + u.getNombre()));

        Optional<Usuario> usuario_2 = nombres_2.findFirst();     /*Se retorna el usuario asignado por el '.findFirst'*/

        StringBuilder sb = new StringBuilder("usuario_2.orElse ---> ");
        sb.append(usuario_2.orElse(new Usuario("John", "Doe")));
        /*Usando una expresión lambda usuario.orElseGet(() -> new Usuario("John", "Doe"))*/
        /*.orElse() retorna un usuario (en este caso) en el caso de que no se haya cumplido la condición del 'filter' y el Stream este vacío*/
        /*La variable usuario_2 sigue estando vacía*/
        System.out.println(sb);

        /*System.out.println(usuario_2.orElseThrow());*/
        /*Si el valor no esta presente lanza 'NoSuchElementException'*/

        if (usuario_2.isPresent()){ /*Usando '.isPresent()' para determinar si contiene un valor*/
            System.out.println(".isPresent() --> " + usuario_2.get());
        }else {
            System.out.println(".isPresent() --> usuario_2 NO tiene contenido");
        }

    }
}
