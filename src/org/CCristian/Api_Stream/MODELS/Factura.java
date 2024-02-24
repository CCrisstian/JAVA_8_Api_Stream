package org.CCristian.Api_Stream.MODELS;

public class Factura {
/*-----------------ATRIBUTOS-----------------*/
    private String descripcion;
    private Usuario usuario;
/*-----------------ATRIBUTOS-----------------*/


/*-----------------GETTER-SETTER-----------------*/
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

/*-----------------GETTER-SETTER-----------------*/


/*-----------------CONSTRUCTOR-----------------*/
    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }
/*-----------------CONSTRUCTOR-----------------*/


/*-----------------MÉTODO-----------------*/
    @Override
    public String toString() {
        return descripcion;
    }
/*-----------------MÉTODO-----------------*/


}
