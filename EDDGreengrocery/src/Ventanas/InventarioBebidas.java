/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Clases.Nodo;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author alvar
 */
public class InventarioBebidas extends javax.swing.JFrame {

    public Nodo ini, fin;
    public Nodo pFound;
    int num = 0;
    
    public InventarioBebidas() {
        initComponents();
    }
    
    DefaultTableModel Modelo;
    String[] cabecera = {"N°", "Código producto", "Nombre Producto", "Serie producto", "Marca producto", "Fecha vencimiento", "Cantidad"};
    String[][] data = {};
    
    public void mensaje(String data) {
        StringTokenizer st = new StringTokenizer(data, ",");
        String cod = st.nextToken();
        String nom = st.nextToken();
        String prod = st.nextToken();
        String marc = st.nextToken();
        String fec = st.nextToken();
        String cant = st.nextToken();

        String datos = "********* Descripcion del prdoducto eliminado ********* \n"
                + "Codigo :" + cod + "\n"
                + "Nombre  :" + nom + "\n"
                + "Nombre del producto  :" + prod + "\n"
                + "Marca del producto  :" + marc + "\n"
                + "Fecha de vencimiento  :" + fec + "\n"
                + "Cantidad  :" + cant + "\n";

        JOptionPane.showMessageDialog(this, datos);
    }
    
    public void insertar(String cod, String nom, String prod, String marc, String fec, String cant) {
        Nodo nuevo = new Nodo(cod, nom, prod, marc, fec, cant);
        if (ini == null) {
            ini = nuevo;
        } else {
            fin.setSig(nuevo); // check this out. Might have some issues*********************************************************************
        }
        fin = nuevo;
        fin.setSig(null);
    }
    
    private String eliminar() {
        Nodo aux = ini;
        String cod = aux.getCodigo();
        String nom = aux.getNombre();
        String prod = aux.getProducto();
        String marc = aux.getMarca();
        String fec = aux.getFecha();
        String cant = aux.getCantidad();
        String eliminado = cod + "," + nom + "," + prod + "," + marc + "," + fec + "," + String.valueOf(cant);
        ini = ini.getSig();
        
        return eliminado;
    }

    public Nodo buscar(Nodo aux, String cod) {
        Nodo pos = aux;
        while (pos != null && !cod.equalsIgnoreCase(pos.getCodigo())) {
            pos = pos.getSig();
        }
        return pos;
    }
    
    public void Vaciar_tabla() {
        int filas = tabla_bebidas.getRowCount();
        for (int i = 0; i < filas; i++) {
            Modelo.removeRow(0);
        }
    }

    
    void Mostrar_datos() {
        String cod, nom, med, marc, fec, cant;
        Nodo aux = ini;
        Vaciar_tabla();
        num = 0;
        while (aux != null) {
            cod = aux.getCodigo();
            nom = aux.getNombre();
            med = aux.getProducto();
            marc = aux.getMarca();
            fec = aux.getFecha();
            cant = aux.getCantidad();
            num++;
            
            Object[] fila = {num, cod, nom, med, marc, fec, cant};
            Modelo.addRow(fila);
            aux = aux.getSig();
        }
    }
    
    public void habilitar() {
        btn_eliminar.setEnabled(true);
        btn_actualizar.setEnabled(true);
        btn_guardar.setEnabled(false);
    }

    public void Deshabilitar() {
        btn_eliminar.setEnabled(false);
        btn_actualizar.setEnabled(false);
        btn_guardar.setEnabled(true);
    }

    public void Vaciar() {
        txtcodigo.setText("");
        txtnombre.setText("");
        txtserie.setText("");
        txtmarca.setText("");
        txtfecha.setText("");
        txtcantidad.setText("");
        txtcodigo.setText("");
    }
    
    void imprime(Nodo aux) {
        if (aux != null) {
            try {
                OutputStream out = new FileOutputStream("producto.txt", true); // the file might not be found (no implemented yet)
                PrintStream insert = new PrintStream(out, true);
                insert.print("\r\n" + "-----------------------------------------------" + "\r\n"
                        + "********* Informacion del producto ********* " + "\r\n"
                        + "Código: " + aux.getCodigo() + "\r\n"
                        + "Nombre de paciente: " + aux.getNombre() + "\r\n"
                        + "Nombre de medicamento: " + aux.getProducto() + "\r\n"
                        + "Marca de medicamento: " + aux.getProducto() + "\r\n"
                        + "Fecha de vencimiento: " + aux.getProducto() + "\r\n\r\n"
                        + "Cantidad: " + aux.getCantidad() + "\r\n\r\n"
                        + "-----------------------------------------------" + "\r\n\r\n\r\n");
                out.close();
                insert.close();
                
            } catch (Exception e) {
                System.out.println("Exception: "+e.getMessage());
            }

            imprime(aux = aux.getSig());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtmarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtserie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_bebidas = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de vencimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad recetada ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo del producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 140, -1));

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Serie del producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel1.add(txtserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca medicamento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 30));

        tabla_bebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_bebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_bebidasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_bebidas);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1010, 113));

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 120, 40));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 120, 40));

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 120, 40));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 120, 40));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregado recientemente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1010, -1));

        jButton7.setBackground(new java.awt.Color(255, 51, 0));
        jButton7.setText("Logo");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 100, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        NuevoInventario main = new NuevoInventario();
        main.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_bebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_bebidasMouseClicked

    }//GEN-LAST:event_tabla_bebidasMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
       
        String cod = txtcodigo.getText();
        String nom = txtnombre.getText();
        String prod = txtserie.getText();
        String marc = txtmarca.getText();
        String fec = txtfecha.getText();
        String cant = txtcantidad.getText();
        
        insertar(cod, nom, prod, marc, fec, cant);
        JOptionPane.showMessageDialog(null, "Producto agregado con éxito!", "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
        Vaciar();
        Mostrar_datos();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
       
        pFound.setCodigo(txtcodigo.getText());
        pFound.setNombre(txtnombre.getText());
        pFound.setProducto(txtserie.getText());
        pFound.setMarca(txtmarca.getText());
        pFound.setFecha(txtfecha.getText());
        pFound.setCantidad(txtcantidad.getText());
        
        Vaciar();
        Deshabilitar();
        Mostrar_datos();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       
        if (ini == null) {
            JOptionPane.showMessageDialog(this, "La cola se encuentra vacía.");
            txtcodigo.requestFocus();
        
        } else {
            String dato = eliminar();
            mensaje(dato);
            Mostrar_datos();
            Vaciar();
            
            if (ini == null) {
                JOptionPane.showMessageDialog(this, "La cola se encuentra vacía.");
            }
            
            Deshabilitar();
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        
        String cod = txtcodigo.getText();
        
        if (cod.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Favor ingresar código de búsqueda.");
            
        } else {
            pFound = buscar(ini, cod);
            
            if (pFound != null) {
                txtnombre.setText(pFound.getNombre());
                txtserie.setText(pFound.getProducto());
                txtmarca.setText(pFound.getMarca());
                txtfecha.setText(pFound.getFecha());
                txtcantidad.setText(String.valueOf(pFound.getCantidad()));
            habilitar();
                
            } else {
                JOptionPane.showMessageDialog(this, "El código: " + cod + " no se encuentra en la lista.");
            }
        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InventarioBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioBebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla_bebidas;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtserie;
    // End of variables declaration//GEN-END:variables
}
