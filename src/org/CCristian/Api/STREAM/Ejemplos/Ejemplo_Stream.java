package org.CCristian.Api.STREAM.Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo_Stream {
    public static void main(String[] args) {

        System.out.println("=====================================Creando un Stream y asignando valores usando 'Stream.of( )'===========================================");
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        /*Stream<Tipo de los elementos contenidos>*/
        /*'Stream.of()' crea un Stream a partir de una secuencia de elementos y
        devuelve un Stream que contiene esos elementos.*/

        /*Operador Intermedio --> realiza transformaciones*/
        /*Operador Final --> realiza alguna acción con los datos que contiene el flujo*/

                /*'forEach()' - Operador Final*/
        nombres.forEach(System.out::println);   /*e -> System.out.println(e)*/


        System.out.println("=====================================Asignar un Arreglo como valor a un Stream usando 'Arrays.stream( )'===========================================");
        String[] arreglo = {"Pato", "Paco", "Pepa", "Pepe"};
        nombres = Arrays.stream(arreglo);   /*'Arrays.stream( )' convertir un Array en un Stream*/
        nombres.forEach(System.out::println);


        System.out.println("=====================================Asignar un valor a un Stream usando 'Stream.< >builder().add( )'===========================================");
        Stream<String> nombres_2 = Stream.<String>builder().add("Pato") /*Stream.<Tipo del contenido>builder().add(contenido)*/
                                                            .add("Paco")
                                                            .add("Pepa")
                                                            .add("Pepe").build();   /*Se usa '.build()' para finalizar*/
        nombres_2.forEach(System.out::println);

        System.out.println("=====================================Creando un Stream a partir de un tipo 'Collection' usando '.stream()'===========================================");
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");
        Stream<String> nombres_3 = lista.stream();  /*Usando '.stream()' se convierte un tipo 'Collection' en un Stream*/
        nombres_3.forEach(System.out::println);
        /*Otra forma seria*/
        lista.stream().forEach(System.out::println);    /*Convertir lista en un stream y usarlo sin tener que asignarlo antes a otra variable*/
    }
}
