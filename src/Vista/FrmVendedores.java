/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Aplicacion.TiendaVideojuegosInicio.listaVendedores;
import Modelo.Excepepciones.CamposVacios;
import Modelo.Excepepciones.ErrorHorario;
import Modelo.Hora;
import Modelo.Horario;
import Modelo.Excepepciones.NumeroInvalido;
import Modelo.Vendedores;
import javax.swing.JOptionPane;

/**
 *
 * @author lenin
 */
public class FrmVendedores extends javax.swing.JFrame {

    /**
     * Creates new form FrmVendedores
     */
    public FrmVendedores() {
        initComponents();
    }
    public void limpiarTxt(){
        this.txtIdVendedores.setText("");
        this.txtNombre.setText("");
        this.txtTelefono.setText("");
        this.txtHoraEntrada.setText("");
        this.txtMinutoEntrada.setText("");
        this.txtHoraSalida.setText("");
        this.txtMinutoSalida.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtIdVendedores = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtHoraEntrada = new javax.swing.JTextField();
        txtMinutoEntrada = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        txtMinutoSalida = new javax.swing.JTextField();
        lbFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBar = new javax.swing.JMenu();
        menuItemNomina = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 100));
        setMinimumSize(new java.awt.Dimension(854, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(854, 720));
        getContentPane().setLayout(null);

        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(570, 580, 130, 70);

        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(150, 580, 150, 70);

        txtIdVendedores.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtIdVendedores.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtIdVendedores.setBorder(null);
        txtIdVendedores.setOpaque(false);
        getContentPane().add(txtIdVendedores);
        txtIdVendedores.setBounds(370, 150, 400, 40);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(370, 230, 400, 40);

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtTelefono.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(370, 300, 400, 40);

        txtHoraEntrada.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtHoraEntrada.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtHoraEntrada.setBorder(null);
        txtHoraEntrada.setOpaque(false);
        getContentPane().add(txtHoraEntrada);
        txtHoraEntrada.setBounds(380, 390, 80, 40);

        txtMinutoEntrada.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtMinutoEntrada.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtMinutoEntrada.setBorder(null);
        txtMinutoEntrada.setOpaque(false);
        getContentPane().add(txtMinutoEntrada);
        txtMinutoEntrada.setBounds(520, 390, 90, 40);

        txtHoraSalida.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtHoraSalida.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtHoraSalida.setBorder(null);
        txtHoraSalida.setOpaque(false);
        getContentPane().add(txtHoraSalida);
        txtHoraSalida.setBounds(380, 470, 80, 40);

        txtMinutoSalida.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        txtMinutoSalida.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtMinutoSalida.setBorder(null);
        txtMinutoSalida.setOpaque(false);
        getContentPane().add(txtMinutoSalida);
        txtMinutoSalida.setBounds(520, 470, 90, 40);

        lbFondo.setIcon(new javax.swing.ImageIcon("D:\\lenin\\Documents\\NetBeansProjects\\TiendaVideojuegos\\src\\Vista\\img\\FrmVendedores.png")); // NOI18N
        getContentPane().add(lbFondo);
        lbFondo.setBounds(0, 0, 850, 720);

        menuBar.setText("Consulta");

        menuItemNomina.setText("Nomina");
        menuItemNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNominaActionPerformed(evt);
            }
        });
        menuBar.add(menuItemNomina);

        jMenuBar1.add(menuBar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        new FrmInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try{
            String clavePersona = this.txtIdVendedores.getText();
            String nombre = this.txtNombre.getText();
            String numeroTelefono = this.txtTelefono.getText();
            int horasEntrada = Integer.parseInt(this.txtHoraEntrada.getText());
            int minutosEntrada = Integer.parseInt(this.txtMinutoEntrada.getText());
            int horasSalida = Integer.parseInt(this.txtHoraSalida.getText());
            int minutosSalida = Integer.parseInt(this.txtMinutoSalida.getText());
            if(horasEntrada<0||horasEntrada>23||horasSalida<0||horasSalida>23||minutosEntrada<0||minutosEntrada>59||minutosSalida<0||minutosSalida>59)
                throw new NumeroInvalido("Hora/Minuto ingresada no válida");
            if(this.txtIdVendedores.getText().isEmpty()||this.txtNombre.getText().isEmpty()||this.txtTelefono.getText().isEmpty()||this.txtHoraEntrada.getText().isEmpty()||
                    this.txtMinutoEntrada.getText().isEmpty()||this.txtHoraSalida.getText().isEmpty()||this.txtMinutoSalida.getText().isEmpty())
                throw new CamposVacios("Rellene todos los campos");
            if(horasSalida<horasEntrada)
                throw new ErrorHorario("La hora de salida no puede ser mayor a la de entrada");
            Hora horaEntrada = new Hora(horasEntrada, minutosEntrada);
            Hora horaSalida = new Hora(horasSalida, minutosSalida);
            Horario horario = new Horario(horaEntrada, horaSalida);
            /*if(horasEntrada>12)
                horasEntrada = horasEntrada - 12;
            if(horasSalida>12)
                horasSalida = horasSalida - 12;*/
            double horasTrabajo = 0;
            if(minutosEntrada>=minutosSalida){
                horasTrabajo = (double)((horasSalida-horasEntrada)*60+(minutosEntrada-minutosSalida))/60;
            }
            if(minutosEntrada<minutosSalida){
                horasTrabajo = (double)((horasSalida-horasEntrada)*60+(minutosSalida-minutosEntrada))/60;
            }
            listaVendedores.add(new Vendedores(clavePersona, nombre, numeroTelefono, horasTrabajo, horario));
            JOptionPane.showMessageDialog(rootPane, "El vendedor ha sido guardado");
            limpiarTxt();
        }catch(CamposVacios e1){
            JOptionPane.showMessageDialog(rootPane, e1.getMessage());
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un número");
        }
        catch(NumeroInvalido e3){
            JOptionPane.showMessageDialog(rootPane, e3.getMessage());
        }
        catch(ErrorHorario e4){
            JOptionPane.showMessageDialog(rootPane, e4.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void menuItemNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNominaActionPerformed
        // TODO add your handling code here:
        new FrmNomina().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemNominaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVendedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JMenu menuBar;
    private javax.swing.JMenuItem menuItemNomina;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtIdVendedores;
    private javax.swing.JTextField txtMinutoEntrada;
    private javax.swing.JTextField txtMinutoSalida;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
