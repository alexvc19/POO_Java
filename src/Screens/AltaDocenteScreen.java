package Screens;

import Model.Conexion;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alejandrovelasco
 */
public class AltaDocenteScreen extends javax.swing.JPanel {

    /**
     * Creates new form AltaDocenteScreen
     */
    public AltaDocenteScreen() {
        initComponents();

        btnGuardar.setIcon(setIcon("/imagenes/salvar.png", btnGuardar));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        text1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        text2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        text3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        text4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        text5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        text6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        text7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        controls = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        head.setBackground(new java.awt.Color(153, 153, 255));
        head.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("Alta de docentes");
        head.add(jLabel1);

        add(head, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(204, 204, 255));
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.PAGE_AXIS));

        text1.setBackground(new java.awt.Color(204, 204, 255));
        text1.setMaximumSize(new java.awt.Dimension(32767, 40));
        text1.setMinimumSize(new java.awt.Dimension(32767, 30));
        text1.setPreferredSize(new java.awt.Dimension(300, 45));
        text1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel2.setText("Id Docente");
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 17));
        text1.add(jLabel2);

        txtID.setMinimumSize(new java.awt.Dimension(200, 23));
        txtID.setPreferredSize(new java.awt.Dimension(200, 25));
        text1.add(txtID);

        body.add(text1);

        text2.setBackground(new java.awt.Color(204, 204, 255));
        text2.setMaximumSize(new java.awt.Dimension(32767, 40));
        text2.setMinimumSize(new java.awt.Dimension(32767, 44));
        text2.setPreferredSize(new java.awt.Dimension(300, 43));
        text2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel3.setText("Nombre");
        jLabel3.setPreferredSize(new java.awt.Dimension(70, 17));
        text2.add(jLabel3);

        txtNombre.setMinimumSize(new java.awt.Dimension(200, 23));
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 25));
        text2.add(txtNombre);

        body.add(text2);

        text3.setBackground(new java.awt.Color(204, 204, 255));
        text3.setMaximumSize(new java.awt.Dimension(32767, 40));
        text3.setMinimumSize(new java.awt.Dimension(32767, 44));
        text3.setPreferredSize(new java.awt.Dimension(300, 43));
        text3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel4.setText("Apellidos");
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 17));
        text3.add(jLabel4);

        txtApellidos.setMinimumSize(new java.awt.Dimension(200, 23));
        txtApellidos.setPreferredSize(new java.awt.Dimension(200, 25));
        text3.add(txtApellidos);

        body.add(text3);

        text4.setBackground(new java.awt.Color(204, 204, 255));
        text4.setMaximumSize(new java.awt.Dimension(32767, 40));
        text4.setMinimumSize(new java.awt.Dimension(32767, 44));
        text4.setPreferredSize(new java.awt.Dimension(300, 43));
        text4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel5.setText("RFC");
        jLabel5.setPreferredSize(new java.awt.Dimension(70, 17));
        text4.add(jLabel5);

        txtRfc.setMinimumSize(new java.awt.Dimension(200, 23));
        txtRfc.setPreferredSize(new java.awt.Dimension(200, 25));
        text4.add(txtRfc);

        body.add(text4);

        text5.setBackground(new java.awt.Color(204, 204, 255));
        text5.setMaximumSize(new java.awt.Dimension(32767, 40));
        text5.setMinimumSize(new java.awt.Dimension(32767, 44));
        text5.setPreferredSize(new java.awt.Dimension(300, 43));
        text5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel6.setText("Direccion");
        jLabel6.setPreferredSize(new java.awt.Dimension(70, 17));
        text5.add(jLabel6);

        txtDireccion.setMinimumSize(new java.awt.Dimension(200, 23));
        txtDireccion.setPreferredSize(new java.awt.Dimension(200, 25));
        text5.add(txtDireccion);

        body.add(text5);

        text6.setBackground(new java.awt.Color(204, 204, 255));
        text6.setMaximumSize(new java.awt.Dimension(32767, 40));
        text6.setMinimumSize(new java.awt.Dimension(32767, 44));
        text6.setPreferredSize(new java.awt.Dimension(300, 43));
        text6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel7.setText("Estado civil");
        jLabel7.setPreferredSize(new java.awt.Dimension(70, 17));
        text6.add(jLabel7);

        txtEstadoCivil.setMinimumSize(new java.awt.Dimension(200, 23));
        txtEstadoCivil.setPreferredSize(new java.awt.Dimension(200, 25));
        text6.add(txtEstadoCivil);

        body.add(text6);

        text7.setBackground(new java.awt.Color(204, 204, 255));
        text7.setMaximumSize(new java.awt.Dimension(32767, 40));
        text7.setMinimumSize(new java.awt.Dimension(32767, 44));
        text7.setPreferredSize(new java.awt.Dimension(300, 43));
        text7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel8.setText("Telefono");
        jLabel8.setPreferredSize(new java.awt.Dimension(70, 17));
        text7.add(jLabel8);

        txtTelefono.setMinimumSize(new java.awt.Dimension(200, 23));
        txtTelefono.setPreferredSize(new java.awt.Dimension(200, 25));
        text7.add(txtTelefono);

        body.add(text7);

        controls.setBackground(new java.awt.Color(204, 204, 255));
        controls.setMaximumSize(new java.awt.Dimension(32767, 50));
        controls.setMinimumSize(new java.awt.Dimension(97, 50));
        controls.setPreferredSize(new java.awt.Dimension(97, 50));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        controls.setLayout(flowLayout1);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        controls.add(btnGuardar);

        body.add(controls);

        add(body, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            //DB conexion
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO docente VALUES(?,?,?,?,?,?,?);");

            if (txtID.getText().isEmpty()
                    || txtNombre.getText().isEmpty()
                    || txtApellidos.getText().isEmpty()
                    || txtRfc.getText().isEmpty()
                    || txtEstadoCivil.getText().isEmpty()
                    || txtDireccion.getText().isEmpty()
                    || txtTelefono.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Tienes valores invalidos o nulos",
                        "Hey!", JOptionPane.ERROR_MESSAGE);
            } else {

                ps.setString(1, txtID.getText());
                ps.setString(2, txtNombre.getText());
                ps.setString(3, txtApellidos.getText());
                ps.setString(4, txtRfc.getText());
                ps.setString(5, txtEstadoCivil.getText());
                ps.setString(6, txtDireccion.getText());
                ps.setString(7, txtTelefono.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro Exitoso",
                        "Hey!", JOptionPane.INFORMATION_MESSAGE);

                txtID.setText("");
                txtNombre.setText("");
                txtApellidos.setText("");
                txtRfc.setText("");
                txtEstadoCivil.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AltaDocenteScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    public Icon setIcon(String url, JButton menu){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        
        int ancho = 24;
        int alto = 24;
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        return icono;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel controls;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel text1;
    private javax.swing.JPanel text2;
    private javax.swing.JPanel text3;
    private javax.swing.JPanel text4;
    private javax.swing.JPanel text5;
    private javax.swing.JPanel text6;
    private javax.swing.JPanel text7;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
