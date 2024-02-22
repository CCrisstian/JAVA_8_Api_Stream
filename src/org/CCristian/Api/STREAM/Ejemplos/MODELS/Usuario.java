package org.CCristian.Api.STREAM.Ejemplos.MODELS;

public class Usuario {

/*-----------------ATRIBUTOS-----------------*/
    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimo_Id;
/*-----------------ATRIBUTOS-----------------*/

/*-----------------GETTER-SETTER-----------------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
/*-----------------GETTER-SETTER-----------------*/

/*-----------------CONSTRUCTOR-----------------*/
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimo_Id;
    }
/*-----------------CONSTRUCTOR-----------------*/

/*-----------------MÉTODO-----------------*/
    @Override
    public String toString() {
        return "Clase: "+getClass().getSimpleName()+"\t|\t"+
                "Nombre: " + nombre +"\t|\t"
                + "Apellido: " + apellido +"\t|\t"
                +"Id: " + id;
    }
/*-----------------MÉTODO-----------------*/

}
