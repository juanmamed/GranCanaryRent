/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.GranCarnaryRent;
import model.Reserva;
import model.Servicio;
import model.Usuario;

/**
 *
 * @author diego
 */
public class HacerReserva4 extends javax.swing.JFrame {

    private GranCarnaryRent granCarnaryRent;
    private Usuario user;
    private Reserva reserva;
    private int numDias;
    private ArrayList<Servicio> servicios;
    private double rollbackPrecio;
    private double currentPrecio;

    /**
     * Creates new form HacerReserva4
     */
    public HacerReserva4() {
        initComponents();
    }

    public HacerReserva4(GranCarnaryRent granCarnaryRent, Usuario user, Reserva reserva, int numDias, double precio) {
        this.granCarnaryRent = granCarnaryRent;
        this.user = user;
        this.reserva = reserva;
        this.numDias = numDias;
        this.rollbackPrecio = precio - (reserva.getSeguroSeleccionado().getPrecio() * numDias);
        this.currentPrecio = precio;
        this.servicios = this.granCarnaryRent.getServicios();
        initComponents();
        this.setLocationRelativeTo(null);
        
        jCheckBox1.setText(servicios.get(0).getNombreServicio());
        jCheckBox2.setText(servicios.get(1).getNombreServicio());
        jCheckBox3.setText(servicios.get(2).getNombreServicio());
        jCheckBox4.setText(servicios.get(3).getNombreServicio());
        jCheckBox5.setText(servicios.get(4).getNombreServicio());
        jCheckBox6.setText(servicios.get(5).getNombreServicio());
        
        String result = String.format("+ %.2f €", servicios.get(0).getPrecio() * numDias);
        precioLabel1.setText(result);
        result = String.format("+ %.2f €", servicios.get(1).getPrecio() * numDias);
        precioLabel2.setText(result);
        result = String.format("+ %.2f €", servicios.get(2).getPrecio() * numDias);
        precioLabel3.setText(result);
        result = String.format("+ %.2f €", servicios.get(3).getPrecio() * numDias);
        precioLabel4.setText(result);
        result = String.format("+ %.2f €", servicios.get(4).getPrecio() * numDias);
        precioLabel5.setText(result);
        result = String.format("+ %.2f €", servicios.get(5).getPrecio() * numDias);
        precioLabel6.setText(result);
        
        result = String.format("Subtotal: %.2f €", currentPrecio);
        subtotalLabel.setText(result);
        
        jCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBox1.isSelected()){
                    currentPrecio += (servicios.get(0).getPrecio() * numDias); 
                } else {
                    currentPrecio -= (servicios.get(0).getPrecio() * numDias);
                }
                String result = String.format("Subtotal: %.2f €", currentPrecio);
                subtotalLabel.setText(result);
            }
        });
        
        jCheckBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBox2.isSelected()){
                    currentPrecio += (servicios.get(1).getPrecio() * numDias); 
                } else {
                    currentPrecio -= (servicios.get(1).getPrecio() * numDias);
                }
                String result = String.format("Subtotal: %.2f €", currentPrecio);
                subtotalLabel.setText(result);
            }
        });
        
        jCheckBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBox3.isSelected()){
                    currentPrecio += (servicios.get(2).getPrecio() * numDias); 
                } else {
                    currentPrecio -= (servicios.get(2).getPrecio() * numDias);
                }
                String result = String.format("Subtotal: %.2f €", currentPrecio);
                subtotalLabel.setText(result);
            }
        });
        
        jCheckBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBox4.isSelected()){
                    currentPrecio += (servicios.get(3).getPrecio() * numDias); 
                } else {
                    currentPrecio -= (servicios.get(3).getPrecio() * numDias);
                }
                String result = String.format("Subtotal: %.2f €", currentPrecio);
                subtotalLabel.setText(result);
            }
        });
        
        jCheckBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBox5.isSelected()){
                    currentPrecio += (servicios.get(4).getPrecio() * numDias); 
                } else {
                    currentPrecio -= (servicios.get(4).getPrecio() * numDias);
                }
                String result = String.format("Subtotal: %.2f €", currentPrecio);
                subtotalLabel.setText(result);
            }
        });
        
        jCheckBox6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBox6.isSelected()){
                    currentPrecio += (servicios.get(5).getPrecio() * numDias); 
                } else {
                    currentPrecio -= (servicios.get(5).getPrecio() * numDias);
                }
                String result = String.format("Subtotal: %.2f €", currentPrecio);
                subtotalLabel.setText(result);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        subtotalLabel = new javax.swing.JLabel();
        volverButton = new javax.swing.JButton();
        continuarButton = new javax.swing.JButton();
        precioLabel1 = new javax.swing.JLabel();
        precioLabel2 = new javax.swing.JLabel();
        precioLabel3 = new javax.swing.JLabel();
        precioLabel4 = new javax.swing.JLabel();
        precioLabel5 = new javax.swing.JLabel();
        precioLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 22)); // NOI18N
        jLabel5.setText("SERVICIOS EXTRA");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jCheckBox2.setText("jCheckBox2");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jCheckBox3.setText("jCheckBox3");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setText("info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jCheckBox4.setText("jCheckBox4");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton4.setText("info");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jCheckBox5.setText("jCheckBox5");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton5.setText("info");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jCheckBox6.setText("jCheckBox6");

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton6.setText("info");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        subtotalLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        subtotalLabel.setText("jLabel1");

        volverButton.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        continuarButton.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        continuarButton.setText("Continuar");
        continuarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarButtonActionPerformed(evt);
            }
        });

        precioLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        precioLabel1.setForeground(new java.awt.Color(102, 102, 102));
        precioLabel1.setText("jLabel1");

        precioLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        precioLabel2.setForeground(new java.awt.Color(102, 102, 102));
        precioLabel2.setText("jLabel1");

        precioLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        precioLabel3.setForeground(new java.awt.Color(102, 102, 102));
        precioLabel3.setText("jLabel1");

        precioLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        precioLabel4.setForeground(new java.awt.Color(102, 102, 102));
        precioLabel4.setText("jLabel1");

        precioLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        precioLabel5.setForeground(new java.awt.Color(102, 102, 102));
        precioLabel5.setText("jLabel1");

        precioLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        precioLabel6.setForeground(new java.awt.Color(102, 102, 102));
        precioLabel6.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volverButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continuarButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel5)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioLabel1)
                            .addComponent(precioLabel2)
                            .addComponent(precioLabel3)
                            .addComponent(precioLabel4)
                            .addComponent(precioLabel5)
                            .addComponent(precioLabel6))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(subtotalLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(precioLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(precioLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(precioLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(precioLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(precioLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(precioLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subtotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continuarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        HacerReserva3 abrir = new HacerReserva3(this.granCarnaryRent, this.user, this.reserva, this.numDias, this.rollbackPrecio);
        abrir.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_volverButtonActionPerformed

    private void continuarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarButtonActionPerformed
        HacerReserva4 abrir = new HacerReserva4(this.granCarnaryRent, this.user, this.reserva, this.numDias, this.currentPrecio);
        abrir.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_continuarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, 
                servicios.get(0).getDescripcion(), 
                servicios.get(0).getNombreServicio(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, 
                servicios.get(1).getDescripcion(), 
                servicios.get(1).getNombreServicio(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, 
                servicios.get(2).getDescripcion(), 
                servicios.get(2).getNombreServicio(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(null, 
                servicios.get(3).getDescripcion(), 
                servicios.get(3).getNombreServicio(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(null, 
                servicios.get(4).getDescripcion(), 
                servicios.get(4).getNombreServicio(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null, 
                servicios.get(5).getDescripcion(), 
                servicios.get(5).getNombreServicio(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(HacerReserva4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerReserva4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerReserva4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerReserva4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerReserva4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel precioLabel1;
    private javax.swing.JLabel precioLabel2;
    private javax.swing.JLabel precioLabel3;
    private javax.swing.JLabel precioLabel4;
    private javax.swing.JLabel precioLabel5;
    private javax.swing.JLabel precioLabel6;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
