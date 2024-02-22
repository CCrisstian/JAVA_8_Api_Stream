package org.CCristian.Api.STREAM.Ejemplos;

import org.CCristian.Api.STREAM.Ejemplos.MODELS.Usuario;

import java.util.stream.Stream;

public class Ejemplo_Stream_FilterSINGLE2 {
    public static void main(String[] args) {

        Usuario usuario = Stream
                .of("Pato Gonzalez", "Paco Gutierrez", "Pepa Guzman", "Pepe Mena", "Pepe Garcia", "Pepe Cristaldo", "PEPE Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(5))  /*Filtrado por Id*/
                /*Solo sea signan aquellos valores que cumplen con la condición del 'filter'*/
                .findFirst().get();
                /*findFirst().get() ---> Se asigna el primero de los valores que cumplieron con la condición del 'filter'*/

        System.out.println(usuario);

    }
}
