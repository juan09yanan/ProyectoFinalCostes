
package com.mycompany.proyecto_mc;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCliente_Login extends javax.swing.JFrame {
INICIO_APP ini = new INICIO_APP();

    public FrmCliente_Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ID_usuario = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Inicio de sesión Clientes:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 300, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("ID de usuario:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Contraseña:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        password.setText("jPasswordField1");
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 300, 40));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        jButton2.setText("Registrar Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        ID_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(ID_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 300, 40));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_usuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Catalogo cl = new Catalogo(); //1| ta
        UsuariosBeans cb = new UsuariosBeans(); //2| ta
        String pass = new String(password.getPassword()); //3| ta
        String idUsuario = ID_usuario.getText(); //4| ta

        if (idUsuario.isEmpty() || pass.isEmpty()) { //5| tc
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        } else if (!idUsuario.matches("\\d+")) {//6| tc
            JOptionPane.showMessageDialog(null, "El ID de usuario solo puede contener números");
        } else {
            cb.setID_usuario(Integer.parseInt(idUsuario));

            String hashedPass = hashPassword(pass); //7| ta
            if (hashedPass != null) { //8| tc
                cb.setPassword(hashedPass);

                try {
                    if (cb.consultar()==true) {//9| tc
                        cl.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Los datos de acceso son incorrectos");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al consultar la base de datos");
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al cifrar la contraseña");
            }
        }
        /*
        Calculo del tiempo 
        T= ta + ta + ta + ta + tc + tc + ta + tc + tc
        T= 5ta + 4tc
        */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmUsuariosRegistro us = new FrmUsuariosRegistro();//1| ta
       // us.UsoRe(0);
        us.setVisible(true);
        this.setVisible(false);
        //T= ta
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
ini.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    private String hashPassword(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");//1| ta
            byte[] hashedBytes = messageDigest.digest(password.getBytes());//2| ta
            StringBuilder stringBuilder = new StringBuilder();//3| ta

            for (byte b : hashedBytes) { //4| tc
                stringBuilder.append(String.format("%02x", b));
            }

            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            //T= 3ta + tc
        }

        return null;
    }
     private void enviar() {
        try {

            UsuariosBeans cb = new UsuariosBeans();//1| ta
            cb.setID_usuario(Integer.parseInt(ID_usuario.getText()));

            String plainPassword = password.getText();//2| ta
            String hashedPassword = hashPassword(plainPassword);
            cb.setPassword(hashedPassword);
            cb.insertar_Usuario();

            JOptionPane.showMessageDialog(null, "Usuario creado con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
        //T= 2ta
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_usuario;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
