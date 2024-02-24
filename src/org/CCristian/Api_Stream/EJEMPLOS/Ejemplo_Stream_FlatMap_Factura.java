package org.CCristian.Api_Stream.EJEMPLOS;

import org.CCristian.Api_Stream.MODELS.Factura;
import org.CCristian.Api_Stream.MODELS.Usuario;

import java.util.Arrays;
import java.util.List;

public class Ejemplo_Stream_FlatMap_Factura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John","Doe");
        Usuario u2 = new Usuario("Pepe","Pérez");

        u1.addFactura(new Factura("Compras Tecnologías"));
        u1.addFactura(new Factura("Compras Muebles"));

        u2.addFactura(new Factura("Bicicleta"));
        u2.addFactura(new Factura("NoteBook Gamer"));

        List<Usuario> list_usuarios = Arrays.asList(u1,u2);

        System.out.println("\n--------------list_usuarios--------------");
        list_usuarios.forEach(System.out::println);

        System.out.println("\n--------------Método 1 'for' anidado--------------");
        for (Usuario u: list_usuarios){
            for (Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }

        System.out.println("\n--------------Método 2 'forEach' anidado--------------");
        list_usuarios.forEach( u -> (u.getFacturas()).forEach(System.out::println));

        System.out.println("\n--------------Método 2 'flatMap'--------------");
        /*Usuario ---> Factura*/
        /*Usuario <--- Factura*/
        list_usuarios.stream()
                .map(Usuario::getFacturas)  /*.map(u -> u.getFacturas())*/
                /*Convierte la Lista de Usuarios en Stream del tipo List de Factura*/
                .flatMap(List::stream)      /*.flatMap(lf -> lf.stream())*/
                /*Convierte una Lista de Facturas en un Stream de Facturas*/
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ---> ").concat(f.getUsuario().toString())));
    }
}
