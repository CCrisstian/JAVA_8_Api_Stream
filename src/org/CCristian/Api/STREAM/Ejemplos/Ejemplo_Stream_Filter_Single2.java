package org.CCristian.Api.STREAM.Ejemplos;

import org.CCristian.Api.STREAM.Ejemplos.MODELS.Usuario;

import java.util.stream.Stream;

public class Ejemplo_Stream_Filter_Single2 {
    public static void main(String[] args) {

        Usuario usuario = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek( u -> System.out.println("peak u --> " + u))  /*Inspeccionar hasta que se cumpla la condición del 'filter'*/
                .filter(u -> u.getId().equals(6))  /*Filtrado por Id*/
                /*Solo sea signan aquellos valores que cumplen con la condición del 'filter'*/
                .findFirst().orElseGet(() -> new Usuario("John", "Doe"));
                /*findFirst().get() ---> Se asigna el primero de los valores que cumplieron con la condición del 'filter'*/
                /*En caso de que ningún elemento cumpla con la condición del 'filter' se usa 'orElseGet' para no retornar vacío*/

        System.out.println("\n" + usuario);

    }
}
