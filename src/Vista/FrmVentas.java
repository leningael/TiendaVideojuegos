/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author lenin
 */
public class FrmVentas extends javax.swing.JFrame {

    /**
     * Creates new form FrmVentas
     */
    public FrmVentas() {
        initComponents();
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
        btnTerminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        txtIdVendedor = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtMinuto = new javax.swing.JTextField();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(451, 425));
        setPreferredSize(new java.awt.Dimension(451, 425));
        setResizable(false);
        getContentPane().setLayout(null);

        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(40, 330, 80, 40);

        btnTerminar.setBorder(null);
        btnTerminar.setBorderPainted(false);
        btnTerminar.setContentAreaFilled(false);
        getContentPane().add(btnTerminar);
        btnTerminar.setBounds(160, 330, 100, 40);

        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        getContentPane().add(btnSalir);
        btnSalir.setBounds(300, 330, 70, 40);

        txtIdCliente.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtIdCliente.setBorder(null);
        txtIdCliente.setOpaque(false);
        getContentPane().add(txtIdCliente);
        txtIdCliente.setBounds(160, 80, 230, 30);

        txtIdVendedor.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtIdVendedor.setBorder(null);
        txtIdVendedor.setOpaque(false);
        txtIdVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdVendedor);
        txtIdVendedor.setBounds(160, 120, 230, 30);

        txtIdProducto.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtIdProducto.setBorder(null);
        txtIdProducto.setOpaque(false);
        getContentPane().add(txtIdProducto);
        txtIdProducto.setBounds(160, 160, 230, 20);

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtCantidad.setBorder(null);
        txtCantidad.setOpaque(false);
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(160, 190, 120, 30);

        txtDia.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtDia.setBorder(null);
        txtDia.setOpaque(false);
        getContentPane().add(txtDia);
        txtDia.setBounds(160, 230, 50, 20);

        txtMes.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtMes.setBorder(null);
        txtMes.setOpaque(false);
        getContentPane().add(txtMes);
        txtMes.setBounds(230, 230, 50, 20);

        txtAnio.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtAnio.setBorder(null);
        txtAnio.setOpaque(false);
        getContentPane().add(txtAnio);
        txtAnio.setBounds(300, 230, 50, 20);

        txtHora.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtHora.setBorder(null);
        txtHora.setOpaque(false);
        getContentPane().add(txtHora);
        txtHora.setBounds(160, 270, 50, 30);

        txtMinuto.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtMinuto.setBorder(null);
        txtMinuto.setOpaque(false);
        getContentPane().add(txtMinuto);
        txtMinuto.setBounds(230, 270, 50, 30);

        lbFondo.setIcon(new javax.swing.ImageIcon("D:\\lenin\\Documents\\NetBeansProjects\\TiendaVideojuegos\\src\\Vista\\img\\FondoVentas.png")); // NOI18N
        getContentPane().add(lbFondo);
        lbFondo.setBounds(0, 0, 450, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVendedorActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdVendedor;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtMinuto;
    // End of variables declaration//GEN-END:variables
}