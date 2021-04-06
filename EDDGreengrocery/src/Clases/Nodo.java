/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alvar
 */
public class Nodo {

    private String codigo;
    private String nombre;
    private String producto;
    private String marca;
    private String fecha;
    private String cantidad;
    private Nodo sig;
    private Nodo ant;

    public Nodo(String cod, String nom, String prod, String marc, String fec, String cant) {
        codigo = cod;
        nombre = nom;
        producto = prod;
        marca = marc;
        fecha = fec;
        cantidad = cant;
        sig = ant = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        return "codigo = " + codigo + ", nombre = " + nombre + ", producto = " + producto + ", marca = " + marca + ", fecha = " + fecha + ", cantidad = " + cantidad + ", sig = " + sig + ", ant = " + ant;
    }

}
