package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo_Stream_ListToStream {
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

        System.out.println("-------------------Stream lista_usuarios (Usuario ---> String)-------------------");
        Stream<String> stream_nombres = lista_usuarios.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ").concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {    /*Filtrando usando 'flatMap'*/
                    if (nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(u -> System.out.println("peak ---> " + u));
        System.out.println("stream_nombres.count() ---> " + stream_nombres.count());
    }
}
