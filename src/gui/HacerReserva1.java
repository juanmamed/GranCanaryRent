/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.GranCarnaryRent;
import model.Oficina;
import model.Reserva;
import model.Usuario;

/**
 *
 * @author diego
 */
public class HacerReserva1 extends javax.swing.JFrame {
    private GranCarnaryRent granCarnaryRent;
    private Usuario user;
    /**
     * Creates new form HacerReserva1
     */
    public HacerReserva1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public HacerReserva1(GranCarnaryRent granCarnaryRent, Usuario user) {
        this.granCarnaryRent = granCarnaryRent;
        this.user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        
        Date currentDay = new java.util.Date(System.currentTimeMillis());
        fechaRecogida.setDate(new java.util.Date(currentDay.getTime() + (1000 * 60 * 60 * 24)));
        fechaEntrega.setDate(new java.util.Date(currentDay.getTime() + (2000 * 60 * 60 * 24)));

        DefaultComboBoxModel list = new DefaultComboBoxModel();
        ArrayList<Oficina> oficinas = granCarnaryRent.getOficinas();
        for(int i=0; i<oficinas.size();i++){
            list.addElement(oficinas.get(i).getDireccion());
        }
        jList1.setModel(list);
        jList2.setModel(list);
        jList1.setSelectedIndex(0);
        jList2.setSelectedIndex(0);
        
        fechaRecogida.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                fechaEntrega.setMinSelectableDate(new java.util.Date(fechaRecogida.getDate().getTime() + (1000 * 60 * 60 * 24)));
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

        fechaRecogida = new com.toedter.calendar.JDateChooser();
        fechaEntrega = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        infoRecogida = new javax.swing.JButton();
        infoEntrega = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fechaRecogida.setDateFormatString("dd/MM/yyyy");
        fechaRecogida.setMinSelectableDate(new java.util.Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24)));
        fechaRecogida.setNextFocusableComponent(fechaRecogida);

        fechaEntrega.setDateFormatString("dd/MM/yyyy");
        fechaEntrega.setMinSelectableDate(new java.util.Date(System.currentTimeMillis() + (2000 * 60 * 60 * 24)));

        jLabel1.setText("Fecha recogida:");

        jLabel2.setText("Fecha entrega:");

        jLabel3.setText("Oficina recogida:");

        jLabel4.setText("Oficina entrega:");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel5.setText("ALQUILA TU COCHE");

        infoRecogida.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        infoRecogida.setText("info");
        infoRecogida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoRecogidaActionPerformed(evt);
            }
        });

        infoEntrega.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        infoEntrega.setText("info");
        infoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoEntregaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jButton1.setText("Ver coches");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jButton2.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaRecogida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(65, 65, 65)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane1))
                            .addComponent(jLabel4)
                            .addComponent(infoEntrega)
                            .addComponent(infoRecogida))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaRecogida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoRecogida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoRecogidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoRecogidaActionPerformed
        ArrayList<Oficina> oficinas = granCarnaryRent.getOficinas();
        for(int i=0; i<oficinas.size();i++){
            if (jList1.getSelectedValue().equals(oficinas.get(i).getDireccion())){
                JOptionPane.showMessageDialog(null, 
                oficinas.get(i).getNumContacto(), 
                "Télefono de contacto",
                JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_infoRecogidaActionPerformed

    private void infoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoEntregaActionPerformed
        ArrayList<Oficina> oficinas = granCarnaryRent.getOficinas();
        for(int i=0; i<oficinas.size();i++){
            if (jList2.getSelectedValue().equals(oficinas.get(i).getDireccion())){
                JOptionPane.showMessageDialog(null, 
                oficinas.get(i).getNumContacto(), 
                "Télefono de contacto",
                JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_infoEntregaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (fechaEntrega.getDate().before(fechaRecogida.getDate())){
            JOptionPane.showMessageDialog(null, 
                "Fecha de entrega del vehículo no válida", 
                "Seleccione nueva fecha de entrega",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            ArrayList<Oficina> oficinas = granCarnaryRent.getOficinas();
            Oficina oficinaEntrega = null;
            Oficina oficinaRecogida = null;
            for(int i=0; i<oficinas.size();i++){
                if (jList1.getSelectedValue().equals(oficinas.get(i).getDireccion())){
                    oficinaRecogida = oficinas.get(i);
                }
                if (jList2.getSelectedValue().equals(oficinas.get(i).getDireccion())){
                    oficinaEntrega = oficinas.get(i);
                }
            }
            Reserva reserva = new Reserva(oficinaRecogida, oficinaEntrega, fechaRecogida.getDate(), fechaEntrega.getDate());
            HacerReserva2 abrir = new HacerReserva2(this.granCarnaryRent, this.user, reserva);
            abrir.setVisible(true);

            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPrincipal abrir = new MenuPrincipal(this.granCarnaryRent, this.user);
        abrir.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HacerReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerReserva1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaEntrega;
    private com.toedter.calendar.JDateChooser fechaRecogida;
    private javax.swing.JButton infoEntrega;
    private javax.swing.JButton infoRecogida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
