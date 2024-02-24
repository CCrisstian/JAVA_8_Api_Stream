package org.CCristian.Api_Stream.MODELS;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {

/*-----------------ATRIBUTOS-----------------*/
    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimo_Id;
    private List<Factura> facturas;
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

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void addFactura(Factura factura) {
        this.facturas.add(factura);
        factura.setUsuario(this);
    }
/*-----------------GETTER-SETTER-----------------*/

/*-----------------CONSTRUCTOR-----------------*/
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimo_Id;
        this.facturas = new ArrayList<>();
    }
/*-----------------CONSTRUCTOR-----------------*/

/*-----------------MÉTODO-----------------*/
    @Override
    public String toString() {
        return "Clase: "+getClass().getSimpleName()+"\t|\t"+
                "Nombre: " + nombre +"\t|\t"
                + "Apellido: " + apellido +"\t|\t"
                +"Id: " + id +"\t|\t"
                +"Facturas: " + facturas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
/*-----------------MÉTODO-----------------*/

}
