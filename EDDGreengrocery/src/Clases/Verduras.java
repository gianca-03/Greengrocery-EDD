/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.io.Serializable;

/**
 * 
 * @author <GRC>
 */
public class Verduras implements Serializable {
    
    //private static final long serialVersionUID = 1L;
            
    String descripcion;
    double peso;
    String fecha;
    int codigo;

    public Verduras() {
    }

    public Verduras(String descripcion, double peso, String fecha, int codigo) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.fecha = fecha;
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Verduras{" + "descripcion=" + descripcion + ", peso=" + peso + ", fecha=" + fecha + ", codigo=" + codigo + '}';
    }
    
    

    
}
