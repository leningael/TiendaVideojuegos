/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Aplicacion.TiendaVideojuegosInicio;
import Modelo.Excepepciones.CamposVacios;
import Modelo.Clientes;
import Modelo.Excepepciones.NumeroInvalido;
import javax.swing.JOptionPane;

/**
 *
 * @author lenin
 */
public class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    public FrmCliente() {
        initComponents();
    }
    public void limpiarTxt(){
        this.txtIdCliente.setText("");
        this.txtNombre.setText("");
        this.txtTelefono.setText("");
        this.txtPuntos.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPuntos = new javax.swing.JTextField();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 100));
        setMinimumSize(new java.awt.Dimension(854, 720));
        setPreferredSize(new java.awt.Dimension(854, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(854, 720));
        getContentPane().setLayout(null);

        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(120, 550, 160, 70);

        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(620, 550, 140, 70);

        txtIdCliente.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtIdCliente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtIdCliente.setBorder(null);
        txtIdCliente.setOpaque(false);
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdCliente);
        txtIdCliente.setBounds(320, 160, 450, 40);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(320, 260, 450, 40);

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtTelefono.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(320, 350, 450, 50);

        txtPuntos.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtPuntos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPuntos.setBorder(null);
        txtPuntos.setOpaque(false);
        getContentPane().add(txtPuntos);
        txtPuntos.setBounds(320, 440, 450, 50);

        lbFondo.setIcon(new javax.swing.ImageIcon("D:\\lenin\\Documents\\NetBeansProjects\\TiendaVideojuegos\\src\\Vista\\img\\FrmClientes.png")); // NOI18N
        getContentPane().add(lbFondo);
        lbFondo.setBounds(0, 0, 850, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        new FrmInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try{
            String clavePersona = this.txtIdCliente.getText();
            String nombre = this.txtNombre.getText();
            String telefono = this.txtTelefono.getText();
            int puntos = Integer.parseInt(this.txtPuntos.getText());
            if(puntos < 0)
                throw new NumeroInvalido("No se pueden registar puntos negativos");
            if(this.txtIdCliente.getText().isEmpty()||this.txtNombre.getText().isEmpty()||this.txtTelefono.getText().isEmpty()||this.txtPuntos.getText().isEmpty())
                throw new CamposVacios("Rellene todos los campos");
            TiendaVideojuegosInicio.listaClientes.add(new Clientes(clavePersona, nombre, telefono, puntos));
            JOptionPane.showMessageDialog(rootPane, "El cliente ha sido registrado");
            limpiarTxt();
        }
        catch(CamposVacios e1){
            JOptionPane.showMessageDialog(rootPane, e1.getMessage());
        }
        catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un número");
        }
        catch(NumeroInvalido e3){
            JOptionPane.showMessageDialog(rootPane, e3.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuntos;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
