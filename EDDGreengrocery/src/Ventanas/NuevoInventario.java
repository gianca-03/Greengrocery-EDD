
package Ventanas;

/**
 *
 * @author <GRC>
 */
public class NuevoInventario extends javax.swing.JFrame {

    
    public NuevoInventario() {
        initComponents();
         setLocationRelativeTo(null);
        setResizable(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVerduras = new javax.swing.JButton();
        botonFrutas = new javax.swing.JButton();
        botonCarnes = new javax.swing.JButton();
        nuevoBebidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVerduras.setText("Verduras");
        botonVerduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerdurasActionPerformed(evt);
            }
        });

        botonFrutas.setText("Frutas");
        botonFrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFrutasActionPerformed(evt);
            }
        });

        botonCarnes.setText("Carnes");

        nuevoBebidas.setText("Bebidas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVerduras)
                    .addComponent(botonCarnes)
                    .addComponent(botonFrutas)
                    .addComponent(nuevoBebidas))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(botonVerduras)
                .addGap(81, 81, 81)
                .addComponent(botonFrutas)
                .addGap(69, 69, 69)
                .addComponent(botonCarnes)
                .addGap(56, 56, 56)
                .addComponent(nuevoBebidas)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerdurasActionPerformed
       VentanaVerduras verduras = new VentanaVerduras();
       this.setVisible(false);
       verduras.setVisible(true);
       
    }//GEN-LAST:event_botonVerdurasActionPerformed

    private void botonFrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFrutasActionPerformed
       VentanaFrutas vf = new VentanaFrutas();
       vf.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonFrutasActionPerformed

   
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
            java.util.logging.Logger.getLogger(NuevoInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCarnes;
    private javax.swing.JButton botonFrutas;
    private javax.swing.JButton botonVerduras;
    private javax.swing.JButton nuevoBebidas;
    // End of variables declaration//GEN-END:variables
}
