package Ventanas;

import Clases.Verduras;
import Clases.ListaVerduras;
import Clases.NodoVerduras;
import Clases.NodoVerduras;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class InventarioVerduras extends javax.swing.JDialog {

    
    public InventarioVerduras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        cargarModeloTabla();

    }

    private void cargarModeloTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
       
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Peso (KG)");
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("codigo)");
        
       JScrollPane scroll = new JScrollPane(tablaVerduras);
       scroll.setBounds(20, 20, 300, 200);

    }

    /* public void tablaVerduras1() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        String descripcion, peso, fecha, codigo;
        ListaVerduras lv = new ListaVerduras();

        lv.insertar(new Verduras("Platano", 265, "2021", 123));
        lv.insertar(new Verduras("Mango", 265, "2021", 123));
        lv.insertar(new Verduras("papa", 265, "2021", 123));

        NodoVerduras aux = cabeza;

        while (aux != null) {

            System.out.println("Pruba aux" + aux.getDato().getDescripcion());
            // descripcion = aux.getDato().getDescripcion();
            // descripcion = "platano";

            peso = String.valueOf(aux.getDato().getPeso());
            fecha = aux.getDato().getFecha();
            codigo = String.valueOf(aux.getDato().getCodigo());

            String[] fila = {"platano", peso, fecha, codigo};

            modeloTabla.addRow(fila);
            aux = aux.getSiguiente();
        }

    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVerduras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaVerduras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVerduras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InventarioVerduras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioVerduras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioVerduras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioVerduras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InventarioVerduras dialog = new InventarioVerduras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVerduras;
    // End of variables declaration//GEN-END:variables
}
