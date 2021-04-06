/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class nodoArbol {
    public int codigo;
    public String nombre;
    public String producto;
    public String marca;
    public String fecha;
    public int cantidad;
    public nodoArbol hijoizq;
    public nodoArbol hijoder;
    
    public nodoArbol(){
    }
    

    public nodoArbol(int codigo, String nombre, String producto, String marca, String fecha, int cantidad) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.producto = producto;
        this.marca = marca;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.hijoizq = null;
        this.hijoder = null;
    }

    @Override
    public String toString() {
        return codigo +","+ nombre +","+ producto +","+ marca +","+ fecha +","+ cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public nodoArbol getHijoizq() {
        return hijoizq;
    }

    public void setHijoizq(nodoArbol hijoizq) {
        this.hijoizq = hijoizq;
    }

    public nodoArbol getHijoder() {
        return hijoder;
    }

    public void setHijoder(nodoArbol hijoder) {
        this.hijoder = hijoder;
    }

}
