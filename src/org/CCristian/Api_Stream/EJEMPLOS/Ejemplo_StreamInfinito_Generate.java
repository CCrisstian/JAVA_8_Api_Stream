package org.CCristian.Api_Stream.EJEMPLOS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Ejemplo_StreamInfinito_Generate {
    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);

        System.out.println("------------------------Trabajando con 'Stream.generate' y 'AtomicInteger'------------------------");

        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);   /*Se da un delay solo por cuestiones visuales nada más*/
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return  "Hola mundo! - " + contador.incrementAndGet();  /*Contenido del 'Stream'*/
                            })
                .limit(7)  /*Cantidad de elementos*/
                .forEach(System.out::println);  /*Operación TERMINAL*/
    }
}
