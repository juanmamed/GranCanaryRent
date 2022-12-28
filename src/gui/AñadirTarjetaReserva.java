/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.GranCarnaryRent;
import model.Reserva;
import model.Usuario;

/**
 *
 * @author Juanma
 */
public class AñadirTarjetaReserva extends javax.swing.JFrame {
    private GranCarnaryRent granCarnaryRent;
    private Usuario user;
    private Reserva reserva;
    /**
     * Creates new form PantallaAñadirTarjeta
     */
    public AñadirTarjetaReserva() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public AñadirTarjetaReserva(GranCarnaryRent granCarnaryRent, Usuario usuario, Reserva reserva) {
        initComponents();
        this.granCarnaryRent = granCarnaryRent;
        this.user = usuario;
        this.reserva = reserva;
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

        CancelarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NombrePropietario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Numero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cvc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FechaValidez = new javax.swing.JTextField();
        AñadirButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Propietario:");

        jLabel3.setText("Rellene los siguientes datos:");

        jLabel2.setText("Número:");

        jLabel4.setText("Cvc:");

        jLabel5.setText("Fecha de validez:");

        AñadirButton.setText("Añadir Tarjeta");
        AñadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(AñadirButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombrePropietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cvc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaValidez, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelarButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FechaValidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarButton)
                    .addComponent(AñadirButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        // TODO add your handling code here:
        PantallaVerTarjetas pantalla_tarjetas = new PantallaVerTarjetas(this.granCarnaryRent, this.user);
        pantalla_tarjetas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void AñadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirButtonActionPerformed
        // TODO add your handling code here:
        String nombre = this.NombrePropietario.getText();
        String numero = this.Numero.getText().replaceAll("\\s+","");
        String cvc = this.Cvc.getText();
        String fecha_validez = this.FechaValidez.getText();
        
        String pattern_nombre = "^([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\']+[\\s])+([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])+[\\s]?([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])?$";
        String pattern_numero = "^[0-9]{15,16}|(([0-9]{4}\\s){3}[0-9]{3,4})$";
        String pattern_cvc = "^[0-9]{3,4}$"; 
        String pattern_fecha = "^[0-9]{2}[/]{1}[0-9]{2}$";
        
        if (Pattern.matches(pattern_nombre, nombre) == false){
            JOptionPane.showMessageDialog(null, 
            "El nombre del propietario debe estar compuesto por su nombre y apellidos",
            "Nombre de propietario no válido", 
            JOptionPane.INFORMATION_MESSAGE);
            this.NombrePropietario.setText("");
        } else if (Pattern.matches(pattern_numero, numero) == false){
            JOptionPane.showMessageDialog(null, 
            "El número de la tarjeta debe estar compuesto por 15 o 16 dígitos",
            "Número de tarjeta no válido", 
            JOptionPane.INFORMATION_MESSAGE);
            this.Numero.setText("");
        } else if (Pattern.matches(pattern_cvc, cvc) == false){
            JOptionPane.showMessageDialog(null, 
            "El cvc debe estar compuesto por 3 o 4 dígitos",
            "Número de tarjeta no válido", 
            JOptionPane.INFORMATION_MESSAGE);
            this.Cvc.setText("");
        } else if (Pattern.matches(pattern_fecha, fecha_validez) == false){
            JOptionPane.showMessageDialog(null, 
            "La fecha de validez debe seguir el siguiente formato: mm/yy",
            "Número de tarjeta no válido", 
            JOptionPane.INFORMATION_MESSAGE);
            this.FechaValidez.setText("");
        } else{
            
            int codigo = Integer.parseInt(cvc);
            if(user.addCreditCard(nombre, codigo, numero, fecha_validez)){
                JOptionPane.showMessageDialog(null, 
                "La tarjeta de crédito ha sido añadida exitósamente",
                "Tarjeta añadida correctamente", 
                JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, 
                "Usted ya tiene un total de 3 tarjetas de crédito. Si quiere añadir una nueva debe eliminar una",
                "No se ha podido añadir la tarjeta", 
                JOptionPane.INFORMATION_MESSAGE);
            }
            PagarReserva abrir = new PagarReserva(this.granCarnaryRent,this.user, this.reserva);
            abrir.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_AñadirButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirTarjetaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirTarjetaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirTarjetaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirTarjetaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirTarjetaReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AñadirButton;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JTextField Cvc;
    private javax.swing.JTextField FechaValidez;
    private javax.swing.JTextField NombrePropietario;
    private javax.swing.JTextField Numero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
