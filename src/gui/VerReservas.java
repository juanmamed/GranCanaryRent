/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.GranCarnaryRent;
import model.Reserva;
import model.Usuario;

/**
 *
 * @author Juanma
 */
public class VerReservas extends javax.swing.JFrame {
    private GranCarnaryRent granCarnaryRent;
    private Usuario user;
    /**
     * Creates new form VerReservas
     */
    public VerReservas() {
        initComponents();
    }
    
    public VerReservas(GranCarnaryRent granCarnaryRent, Usuario usuario) {
        initComponents();
        this.userLabel1.setText(usuario.getNombre());
        this.userSaldoLabel.setText(Float.toString(usuario.getSaldo()));
        this.granCarnaryRent = granCarnaryRent;
        this.user = usuario;
        this.setLocationRelativeTo(null);
        printReservas();
        ListaDeReservas.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = ListaDeReservas.getSelectedIndex();
                System.out.println(i);
                String[] reservas_totales = usuario.getReservasArr();
                String[] reservas_sin_pagar = user.getReservasSinPagarArr();
                String vacio = "";
                if ((TodasLasReservas.isSelected()) && (reservas_totales.length == 0)){
                    OficinaDeRecogida.setText(vacio);
                    OficinaDeEntrega.setText(vacio);
                    FechaDeRecogida.setText(vacio);
                    FechaDeEntrega.setText(vacio);
                    Vehículo.setText(vacio);
                    TipoDeSeguro.setText(vacio);
                    Servicios.setText(vacio);
                    Precio.setText(vacio);
                }
                if ((ReservasSinPagar.isSelected()) && (reservas_sin_pagar.length == 0)){
                    OficinaDeRecogida.setText(vacio);
                    OficinaDeEntrega.setText(vacio);
                    FechaDeRecogida.setText(vacio);
                    FechaDeEntrega.setText(vacio);
                    Vehículo.setText(vacio);
                    TipoDeSeguro.setText(vacio);
                    Servicios.setText(vacio);
                    Precio.setText(vacio);
                }
                if ((TodasLasReservas.isSelected()) && (reservas_totales.length > 0)){
                    if(i == -1){
                        i = 0;
                        ListaDeReservas.setSelectedIndex(0);
                    }
                    Reserva reserva = granCarnaryRent.getReserva(user.getNombre(), reservas_totales[i]);
                    OficinaDeRecogida.setText(reserva.getOficinaRecogida().getDireccion());
                    OficinaDeEntrega.setText(reserva.getOficinaEntrega().getDireccion());
                    FechaDeRecogida.setText(granCarnaryRent.DateToString(reserva.getFechaRecogida()));
                    FechaDeEntrega.setText(granCarnaryRent.DateToString(reserva.getFechaEntrega()));
                    Vehículo.setText(reserva.getVehiculoReservado().getModelo());
                    TipoDeSeguro.setText(reserva.getSeguroSeleccionado().getNombreSeguro());
                    Servicios.setText(reserva.toStringServicios());
                    String s=String.valueOf(reserva.getPrecio());  
                    Precio.setText(s);
                }
                if ((ReservasSinPagar.isSelected()) && (reservas_sin_pagar.length > 0)){
                    if(i == -1){
                        i = 0;
                        ListaDeReservas.setSelectedIndex(0);
                    }
                    Reserva reserva = granCarnaryRent.getReserva(user.getNombre(), reservas_sin_pagar[i]);
                    OficinaDeRecogida.setText(reserva.getOficinaRecogida().getDireccion());
                    OficinaDeEntrega.setText(reserva.getOficinaEntrega().getDireccion());
                    FechaDeRecogida.setText(granCarnaryRent.DateToString(reserva.getFechaRecogida()));
                    FechaDeEntrega.setText(granCarnaryRent.DateToString(reserva.getFechaEntrega()));
                    Vehículo.setText(reserva.getVehiculoReservado().getModelo());
                    TipoDeSeguro.setText(reserva.getSeguroSeleccionado().getNombreSeguro());
                    Servicios.setText(reserva.toStringServicios());
                    String s=String.valueOf(reserva.getPrecio());  
                    Precio.setText(s);
                }

            }
        });

    }
    
    public void printReservas(){
        String[] reservas_totales = this.user.getReservasArr();
        DefaultComboBoxModel list = new DefaultComboBoxModel();
        for(int i=0; i<reservas_totales.length;i++){
            list.addElement(reservas_totales[i]);
        }
        ListaDeReservas.setModel(list);
        if(reservas_totales.length>0){
            Reserva reserva = this.granCarnaryRent.getReserva(user.getNombre(), reservas_totales[0]);
            ListaDeReservas.setSelectedIndex(0);
            OficinaDeRecogida.setText(reserva.getOficinaRecogida().getDireccion());
            OficinaDeEntrega.setText(reserva.getOficinaEntrega().getDireccion());
            FechaDeRecogida.setText(this.granCarnaryRent.DateToString(reserva.getFechaRecogida()));
            FechaDeEntrega.setText(this.granCarnaryRent.DateToString(reserva.getFechaEntrega()));
            Vehículo.setText(reserva.getVehiculoReservado().getModelo());
            TipoDeSeguro.setText(reserva.getSeguroSeleccionado().getNombreSeguro());
            Servicios.setText(reserva.toStringServicios());
            String s=String.valueOf(reserva.getPrecio());  
            Precio.setText(s);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        userLabel1 = new javax.swing.JLabel();
        userSaldoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeReservas = new javax.swing.JList<>();
        TodasLasReservas = new javax.swing.JRadioButton();
        ReservasSinPagar = new javax.swing.JRadioButton();
        Pagar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        OficinaDeRecogida = new javax.swing.JLabel();
        OficinaDeEntrega = new javax.swing.JLabel();
        FechaDeRecogida = new javax.swing.JLabel();
        FechaDeEntrega = new javax.swing.JLabel();
        Vehículo = new javax.swing.JLabel();
        TipoDeSeguro = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Servicios = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userLabel1.setText("User");

        userSaldoLabel.setText("User saldo");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel2.setText("Reservas Realizadas");

        ListaDeReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(ListaDeReservas);

        buttonGroup1.add(TodasLasReservas);
        TodasLasReservas.setSelected(true);
        TodasLasReservas.setText("Todas las Reservas");
        TodasLasReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodasLasReservasActionPerformed(evt);
            }
        });

        buttonGroup1.add(ReservasSinPagar);
        ReservasSinPagar.setText("Reservas Sin Pagar");
        ReservasSinPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservasSinPagarActionPerformed(evt);
            }
        });

        Pagar.setText("Pagar");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Oficina de Recogida:");

        jLabel3.setText("Oficina de Entrega:");

        jLabel4.setText("Fecha de Recogida:");

        jLabel5.setText("Fecha de Entrega:");

        jLabel6.setText("Vehículo:");

        jLabel7.setText("Tipo de Seguro:");

        jLabel8.setText("Precio:");

        OficinaDeRecogida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OficinaDeRecogida.setText("Las Palmas (Triana)");

        OficinaDeEntrega.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OficinaDeEntrega.setText("Aeropuerto de Gran Canaria");

        FechaDeRecogida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FechaDeRecogida.setText("11/01/2023");

        FechaDeEntrega.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FechaDeEntrega.setText("12/01/2023");

        Vehículo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Vehículo.setText("Volkswagen Golf");

        TipoDeSeguro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TipoDeSeguro.setText("Seguro Estándar");

        jLabel9.setText("Servicios:");

        Servicios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Servicios.setText("Sin Servicios");

        Precio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Precio.setText("50.00 €");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userSaldoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Volver))
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TodasLasReservas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ReservasSinPagar)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaDeEntrega))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Vehículo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TipoDeSeguro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OficinaDeRecogida))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OficinaDeEntrega))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaDeRecogida))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Servicios))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Precio)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel1)
                    .addComponent(userSaldoLabel))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TodasLasReservas)
                    .addComponent(ReservasSinPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pagar)
                            .addComponent(Volver))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(OficinaDeRecogida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(OficinaDeEntrega))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(FechaDeRecogida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(FechaDeEntrega))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Vehículo))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TipoDeSeguro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Servicios))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Precio))
                        .addGap(0, 46, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TodasLasReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodasLasReservasActionPerformed
        // TODO add your handling code here:
        String[] reservas_totales = this.user.getReservasArr();
        DefaultComboBoxModel list = new DefaultComboBoxModel();
        for(int i=0; i<reservas_totales.length;i++){
            list.addElement(reservas_totales[i]);
        }
        ListaDeReservas.setModel(list);
        if(reservas_totales.length>0){
            Reserva reserva = this.granCarnaryRent.getReserva(user.getNombre(), reservas_totales[0]);
            ListaDeReservas.setSelectedIndex(0);
            OficinaDeRecogida.setText(reserva.getOficinaRecogida().getDireccion());
            OficinaDeEntrega.setText(reserva.getOficinaEntrega().getDireccion());
            FechaDeRecogida.setText(this.granCarnaryRent.DateToString(reserva.getFechaRecogida()));
            FechaDeEntrega.setText(this.granCarnaryRent.DateToString(reserva.getFechaEntrega()));
            Vehículo.setText(reserva.getVehiculoReservado().getModelo());
            TipoDeSeguro.setText(reserva.getSeguroSeleccionado().getNombreSeguro());
            Servicios.setText(reserva.toStringServicios());
            String s=String.valueOf(reserva.getPrecio());  
            Precio.setText(s);
        }
    }//GEN-LAST:event_TodasLasReservasActionPerformed

    private void ReservasSinPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservasSinPagarActionPerformed
        // TODO add your handling code here:
        String[] reservas_sin_pagar = this.user.getReservasSinPagarArr();
        DefaultComboBoxModel list = new DefaultComboBoxModel();
        for(int i=0; i<reservas_sin_pagar.length;i++){
            list.addElement(reservas_sin_pagar[i]);
        }
        ListaDeReservas.setModel(list);
        if(reservas_sin_pagar.length>0){
            Reserva reserva = this.granCarnaryRent.getReserva(user.getNombre(), reservas_sin_pagar[0]);
            ListaDeReservas.setSelectedIndex(0);
            System.out.println("HOLA");
            OficinaDeRecogida.setText(reserva.getOficinaRecogida().getDireccion());
            OficinaDeEntrega.setText(reserva.getOficinaEntrega().getDireccion());
            FechaDeRecogida.setText(this.granCarnaryRent.DateToString(reserva.getFechaRecogida()));
            FechaDeEntrega.setText(this.granCarnaryRent.DateToString(reserva.getFechaEntrega()));
            Vehículo.setText(reserva.getVehiculoReservado().getModelo());
            TipoDeSeguro.setText(reserva.getSeguroSeleccionado().getNombreSeguro());
            Servicios.setText(reserva.toStringServicios());
            String s=String.valueOf(reserva.getPrecio());  
            Precio.setText(s);
        }
    }//GEN-LAST:event_ReservasSinPagarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu = new MenuPrincipal(this.granCarnaryRent, this.user);
        menu.setVisible(true);
        String [] text = new String[0];
        ListaDeReservas.setListData(text);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(VerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaDeEntrega;
    private javax.swing.JLabel FechaDeRecogida;
    private javax.swing.JList<String> ListaDeReservas;
    private javax.swing.JLabel OficinaDeEntrega;
    private javax.swing.JLabel OficinaDeRecogida;
    private javax.swing.JButton Pagar;
    private javax.swing.JLabel Precio;
    private javax.swing.JRadioButton ReservasSinPagar;
    private javax.swing.JLabel Servicios;
    private javax.swing.JLabel TipoDeSeguro;
    private javax.swing.JRadioButton TodasLasReservas;
    private javax.swing.JLabel Vehículo;
    private javax.swing.JButton Volver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userSaldoLabel;
    // End of variables declaration//GEN-END:variables
}
