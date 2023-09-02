
package com.mycompany.proyecto_mc;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FrmUsuarios_login extends javax.swing.JFrame {

    FrmUsuariosRegistro us = new FrmUsuariosRegistro();
    INICIO_APP ini = new INICIO_APP();
    int abc;

    public FrmUsuarios_login() {
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
        cancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ID_usuario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Inicio de sesión Vendedores:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 350, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("ID de usuario:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Contraseña:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        password.setText("jPasswordField1");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 300, 40));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton2.setText("Registrar Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        ID_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(ID_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 300, 40));

        jButton3.setText("Ingresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_usuarioActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        // TODO add your handling code here:
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked
//public int abc = 0;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        us.setVisible(true);
        abc = 1;//1| ta
        this.setVisible(false);
        //T = ta

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        FrmCliente cl = new FrmCliente();//1| ta
        UsuariosBeans cb = new UsuariosBeans();//2| ta
        String pass = new String(password.getPassword());//3| ta
        String idUsuario = ID_usuario.getText();//4| ta

        if (idUsuario.isEmpty() || pass.isEmpty()) {//5| tc
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        } else if (!idUsuario.matches("\\d+")) {//6| tc
            JOptionPane.showMessageDialog(null, "El ID de usuario solo puede contener números");
        } else {
            cb.setID_usuario(Integer.parseInt(idUsuario));

            String hashedPass = hashPassword(pass); // Cifra la contraseña con un hash//7| ta
            if (hashedPass != null) {//8| tc
                cb.setPassword(hashedPass);

                try {
                    if (cb.consultar() == true) {//9| tc
                        cl.setVisible(true);
                        // Acceso permitido, los datos coinciden en la base de datos
                        // Realiza aquí las acciones necesarias después de iniciar sesión correctamente
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
            //TIEMPO TOTAL DEL METODO
            //T= ta+ta+ta+ta+tc+tc+ta+tc+tc
            //T= 5ta+4tc
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    private String hashPassword(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");//1| ta
            byte[] hashedBytes = messageDigest.digest(password.getBytes());//2| ta
            StringBuilder stringBuilder = new StringBuilder();//3| ta

            for (byte b : hashedBytes) {//4| tc
                stringBuilder.append(String.format("%02x", b));
            }

            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
        //TIEMPO TOTAL DEL METODO= 3ta + tc
    }

    private void enviar() {
        try {

            UsuariosBeans cb = new UsuariosBeans();//1| ta
            cb.setID_usuario(Integer.parseInt(ID_usuario.getText()));

            String plainPassword = password.getText();//2| ta
            String hashedPassword = hashPassword(plainPassword);//3| ta

            cb.setPassword(hashedPassword);
            cb.insertar_Usuario();
            JOptionPane.showMessageDialog(null, "Usuario creado con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());//5| to
            //Tiempo total del metodo
            //T= ta + ta + ta + to
            //T= 3ta + to
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_usuario;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
