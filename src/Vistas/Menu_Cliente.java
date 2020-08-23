
package Vistas;

/**
 *
 * @author Sebastián
 */
public class Menu_Cliente extends javax.swing.JFrame {

    public Menu_Cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Crear_servicio = new javax.swing.JButton();
        Cons_est_servicio = new javax.swing.JButton();
        Cons_det_servicio = new javax.swing.JButton();
        Volver_inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("En desarrollo");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Que desea hacer?");

        Crear_servicio.setText("Crear servicio");
        Crear_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_servicioActionPerformed(evt);
            }
        });

        Cons_est_servicio.setText("Consultar estado de un servicio");
        Cons_est_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cons_est_servicioActionPerformed(evt);
            }
        });

        Cons_det_servicio.setText("Consultar detalles de un servicio");
        Cons_det_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cons_det_servicioActionPerformed(evt);
            }
        });

        Volver_inicio.setText("Volver a incio");
        Volver_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_inicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(Volver_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(Crear_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cons_est_servicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cons_det_servicio))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Crear_servicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cons_est_servicio)
                    .addComponent(Cons_det_servicio))
                .addGap(18, 18, 18)
                .addComponent(Volver_inicio)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Crear_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_servicioActionPerformed
        
        this.setVisible(false);
        new Crear_servicio().setVisible(true);
        
    }//GEN-LAST:event_Crear_servicioActionPerformed

    private void Cons_est_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cons_est_servicioActionPerformed
        
        this.setVisible(false);
        new Consultar_estado().setVisible(true);
        
    }//GEN-LAST:event_Cons_est_servicioActionPerformed

    private void Cons_det_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cons_det_servicioActionPerformed
        
        this.setVisible(false);
        new Consultar_servicio().setVisible(true);
        
    }//GEN-LAST:event_Cons_det_servicioActionPerformed

    private void Volver_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_inicioActionPerformed
        
        this.setVisible(false);
        new Inicio().setVisible(true);
        
    }//GEN-LAST:event_Volver_inicioActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu_Cliente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cons_det_servicio;
    private javax.swing.JButton Cons_est_servicio;
    private javax.swing.JButton Crear_servicio;
    private javax.swing.JButton Volver_inicio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
