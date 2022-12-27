/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.time.ZoneId;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.GranCarnaryRent;
import model.Oficina;
import model.Reserva;
import model.Usuario;
import model.Vehiculo;

/**
 *
 * @author diego
 */
public class HacerReserva2 extends javax.swing.JFrame {
    private GranCarnaryRent granCarnaryRent;
    private Usuario user;
    private Reserva reserva;
    private ArrayList<Vehiculo> vehiculos;
    private int numDias;
    /**
     * Creates new form HacerReserva2
     */
    public HacerReserva2() {
        initComponents();
    }

    public HacerReserva2(GranCarnaryRent granCarnaryRent, Usuario user, Reserva reserva) {
        initComponents();
        this.granCarnaryRent = granCarnaryRent;
        this.user = user;
        this.reserva = reserva;
        this.vehiculos = reserva.getOficinaRecogida().getVehiculosDisponibles();
        this.numDias = (int) DAYS.between(reserva.getFechaRecogida().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 
                reserva.getFechaEntrega().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        this.setLocationRelativeTo(null);
        
        DefaultComboBoxModel list = new DefaultComboBoxModel();
        for(int i=0; i<vehiculos.size();i++){
            list.addElement(vehiculos.get(i).getModelo());
        }
        jList1.setModel(list);
        jList1.setSelectedIndex(0);
        
        tipoVehiculoLabel.setText(vehiculos.get(0).getTipoVehiculo().toString());
        tipoCambioLabel.setText(vehiculos.get(0).getTipoCambio().toString());
        tipoMotorLabel.setText(vehiculos.get(0).getTipoMotor().toString());
        numAsientosLabel.setText(Integer.toString(vehiculos.get(0).getNumAsientos()));
        numPuertasLabel.setText(Integer.toString(vehiculos.get(0).getNumPuertas()));
        String result = String.format("%.2f €", vehiculos.get(0).getPrecio() * numDias);
        precioLabel.setText(result);
        
        jList1.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = jList1.getSelectedIndex();
                tipoVehiculoLabel.setText(vehiculos.get(i).getTipoVehiculo().toString());
                tipoCambioLabel.setText(vehiculos.get(i).getTipoCambio().toString());
                tipoMotorLabel.setText(vehiculos.get(i).getTipoMotor().toString());
                numAsientosLabel.setText(Integer.toString(vehiculos.get(i).getNumAsientos()));
                numPuertasLabel.setText(Integer.toString(vehiculos.get(i).getNumPuertas()));
                String result = String.format("%.2f €", vehiculos.get(i).getPrecio() * numDias);;
                precioLabel.setText(result);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        tipoVehiculoLabel = new javax.swing.JLabel();
        numAsientosLabel = new javax.swing.JLabel();
        numPuertasLabel = new javax.swing.JLabel();
        tipoCambioLabel = new javax.swing.JLabel();
        tipoMotorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel5.setText("COCHES DISPONIBLES");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        backButton.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        backButton.setText("Volver");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        continueButton.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        continueButton.setText("Continuar");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo:");

        jLabel2.setText("Num. asientos");

        jLabel3.setText("Num. puertas:");

        jLabel4.setText("Tipo cambio:");

        jLabel6.setText("Tipo motor:");

        precioLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        precioLabel.setText("90.32 euros/día");

        tipoVehiculoLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tipoVehiculoLabel.setText("Monovolumen");

        numAsientosLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        numAsientosLabel.setText("5");

        numPuertasLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        numPuertasLabel.setText("5");

        tipoCambioLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tipoCambioLabel.setText("Automático");

        tipoMotorLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tipoMotorLabel.setText("Eléctrico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(continueButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tipoMotorLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addComponent(tipoCambioLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numPuertasLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tipoVehiculoLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(precioLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numAsientosLabel)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tipoVehiculoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(numAsientosLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(numPuertasLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipoCambioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tipoMotorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precioLabel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        HacerReserva1 abrir = new HacerReserva1(this.granCarnaryRent, this.user);
        abrir.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        this.reserva.setVehiculoReservado(this.vehiculos.get(jList1.getSelectedIndex()));
        HacerReserva3 abrir = new HacerReserva3(this.granCarnaryRent, this.user, this.reserva, this.numDias, vehiculos.get(jList1.getSelectedIndex()).getPrecio() * numDias);
        abrir.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_continueButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HacerReserva2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerReserva2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerReserva2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerReserva2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerReserva2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numAsientosLabel;
    private javax.swing.JLabel numPuertasLabel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JLabel tipoCambioLabel;
    private javax.swing.JLabel tipoMotorLabel;
    private javax.swing.JLabel tipoVehiculoLabel;
    // End of variables declaration//GEN-END:variables
}
