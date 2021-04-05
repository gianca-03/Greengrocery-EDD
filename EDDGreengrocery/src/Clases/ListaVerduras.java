package Clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import Ventanas.VentanaVerduras;
import Ventanas.InventarioVerduras;
import java.io.EOFException;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author <GRC>
 */
public class ListaVerduras implements Serializable {

    public NodoVerduras cabeza;

    public NodoVerduras getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoVerduras cabeza) {
        this.cabeza = cabeza;
    }

    public void insertar(Verduras p) {
        if (cabeza == null) {
            cabeza = new NodoVerduras(p);
        } else if (p.getCodigo() < cabeza.getDato().getCodigo()) {
            NodoVerduras aux = new NodoVerduras(p);
            aux.setSiguiente(cabeza);
            cabeza = aux;
        } else if (cabeza.getSiguiente() == null) {
            cabeza.setSiguiente(new NodoVerduras(p));
        } else {
            NodoVerduras aux = cabeza;
            while (aux.getSiguiente() != null && aux.getDato().getCodigo() < p.getCodigo()) {
                aux = aux.getSiguiente();
            }
            NodoVerduras temp = new NodoVerduras(p);
            temp.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(temp);
        }
    }

    public void tablaVerduras() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        String descripcion, peso, fecha, codigo;
        ListaVerduras lv = new ListaVerduras();
       
        lv.insertar(new Verduras("Platano", 265, "2021", 123));
        lv.insertar(new Verduras("Mango", 265, "2021", 123));
        lv.insertar(new Verduras("papa", 265, "2021", 123));

        NodoVerduras aux = cabeza;

        while (aux != null) {
            
            System.out.println("Pruba aux"+ aux.getDato().descripcion);
           // descripcion = aux.getDato().getDescripcion();
          // descripcion = "platano";

            peso = String.valueOf(aux.getDato().getPeso());
            fecha = aux.getDato().getFecha();
            codigo = String.valueOf(aux.getDato().getCodigo());

            String[] fila = {"platano", peso, fecha, codigo};

            modeloTabla.addRow(fila);
            aux = aux.getSiguiente();
        }

    }

    public void get() {
        NodoVerduras aux = cabeza;
        String s = "Lista: \n";
        while (aux != null) {
            System.out.println(aux.getDato().getDescripcion());
            aux = aux.getSiguiente();
        }

    }

    /* public void leerVerduras1() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        NodoVerduras temp = cabeza;
        Verduras nuevo;
        String descripcion, peso, fecha, codigo;

        try {
            FileInputStream archivo = new FileInputStream("verduras.edd");
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while (temp != null) {
                nuevo = (Verduras) lectura.readObject();
                descripcion = nuevo.getDescripcion();
                peso = String.valueOf(nuevo.getPeso());
                fecha = String.valueOf(nuevo.getFecha());
                codigo = String.valueOf(nuevo.getCodigo());

                String[] fila = {descripcion, peso, fecha, codigo};

                modeloTabla.addRow(fila);
                temp = temp.getSiguiente();
            }

        } catch (EOFException ex) {
            return;
        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error " + ex);
        }

    }*/

 /*  public void leerVerduras() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        Verduras nuevo;
        String descripcion, peso, fecha, codigo;

        try {
            FileInputStream archivo = new FileInputStream("verduras.edd");
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while (true) {
                nuevo = (Verduras) lectura.readObject();
                descripcion = nuevo.getDescripcion();
                peso = String.valueOf(nuevo.getPeso());
                fecha = String.valueOf(nuevo.getFecha());
                codigo = String.valueOf(nuevo.getCodigo());

                String[] fila = {descripcion,peso,fecha,codigo};

                modeloTabla.addRow(fila);
            }

        } catch (EOFException ex) {
            return;
        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error " + ex);
        }

    }*/
    @Override
    public String toString() {
        NodoVerduras aux = cabeza;
        String s = "Lista: \n";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getSiguiente();
        }
        return s;
    }

}
