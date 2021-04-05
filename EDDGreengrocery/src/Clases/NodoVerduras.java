
package Clases;

import java.io.Serializable;

/**
 * 
 * @author <GRC>
 */
public class NodoVerduras implements Serializable{
    
     private Verduras dato;
    private NodoVerduras siguiente;

    public NodoVerduras() {
    }

    public NodoVerduras(Verduras dato) {
        this.dato = dato;
       
    }

    public Verduras getDato() {
        return dato;
    }

    public void setDato(Verduras dato) {
        this.dato = dato;
    }

    public NodoVerduras getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoVerduras siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoVerduras{" + "dato=" + dato + '}';
    }
    
    
    
    
    

}
