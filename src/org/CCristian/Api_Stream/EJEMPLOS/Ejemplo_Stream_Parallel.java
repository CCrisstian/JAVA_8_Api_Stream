package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Ejemplo_Stream_Parallel {
    public static void main(String[] args) {

        List<Usuario> lista_usuarios = new ArrayList<>();
        lista_usuarios.add(new Usuario("Andrés","Guzmán"));
        lista_usuarios.add(new Usuario("Luci","Martínez"));
        lista_usuarios.add(new Usuario("Pepe","Fernández"));
        lista_usuarios.add(new Usuario("Cata", "Pérez"));
        lista_usuarios.add(new Usuario("Lalo","Mena"));
        lista_usuarios.add(new Usuario("Exequiel","Doe"));
        lista_usuarios.add(new Usuario("Bruce","Lee"));
        lista_usuarios.add(new Usuario("Bruce","Willis"));
        System.out.println("-------------------List<Usuario> lista_usuarios-------------------");
        lista_usuarios.forEach(System.out::println);


        long t1 = System.currentTimeMillis();

        String resultado = lista_usuarios.stream()
                .parallel()
                .map(u -> u.getNombre().toUpperCase())
                .peek(u -> System.out.println("peak ---> " + u +"\t\tThread ---> "+ Thread.currentThread().getName())) /*Inspección*/
                .flatMap(nombre -> {    /*Filtrando usando 'flatMap'*/
                    try {
                        TimeUnit.SECONDS.sleep(1);  /*Solo por cuestiones visuales*/
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("bruce".toUpperCase())){    /*Solo se agregan aquellos que cumplen con esta condición*/
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();

        System.out.println("\n-------------------Trabajando con 'parallel'-------------------");
        System.out.println("Tiempo total(sin usar 'parallel'): "+ (7058/1000) + " segundos");
        System.out.println("Tiempo total(usando 'parallel'): " + (t2 - t1)/1000 + " segundos");
        System.out.println(resultado);

    }
}
