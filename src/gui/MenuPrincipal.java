/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import model.GranCarnaryRent;
import model.Usuario;

/**
 *
 * @author diego
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private GranCarnaryRent granCarnaryRent;
    private Usuario user;
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public MenuPrincipal(GranCarnaryRent granCarnaryRent, Usuario usuario) {
        initComponents();
        this.userLabel.setText(usuario.getNombre());
        this.userSaldoLabel.setText(Float.toString(usuario.getSaldo()));
        this.granCarnaryRent = granCarnaryRent;
        this.user = usuario;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userSaldoLabel = new javax.swing.JLabel();
        hacerReservaButton = new javax.swing.JButton();
        verReservaButton = new javax.swing.JButton();
        verTarjetasButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel1.setText("GranCarnaryRent");

        userLabel.setText("User");

        userSaldoLabel.setText("User saldo");

        hacerReservaButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        hacerReservaButton.setText("Hacer reserva");
        hacerReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerReservaButtonActionPerformed(evt);
            }
        });

        verReservaButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        verReservaButton.setText("Ver reservas");
        verReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReservaButtonActionPerformed(evt);
            }
        });

        verTarjetasButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        verTarjetasButton.setText("Ver tarjetas");
        verTarjetasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTarjetasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userSaldoLabel)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hacerReservaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verReservaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verTarjetasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userSaldoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(hacerReservaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verReservaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verTarjetasButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hacerReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerReservaButtonActionPerformed
        PantallaIniciarSesion abrir = new PantallaIniciarSesion(granCarnaryRent);
        abrir.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_hacerReservaButtonActionPerformed

    private void verReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReservaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verReservaButtonActionPerformed

    private void verTarjetasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTarjetasButtonActionPerformed
        // TODO add your handling code here:
        PantallaVerTarjetas abrir = new PantallaVerTarjetas(this.granCarnaryRent, this.user);
        abrir.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_verTarjetasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hacerReservaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userSaldoLabel;
    private javax.swing.JButton verReservaButton;
    private javax.swing.JButton verTarjetasButton;
    // End of variables declaration//GEN-END:variables
}
