//Clase editada por Juan Jimenez
package com.mycompany.proyecto_mc;

import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmUsuariosRegistro extends javax.swing.JFrame {

    INICIO_APP ini = new INICIO_APP();
    FrmCliente_Login rego = new FrmCliente_Login();

    public FrmUsuariosRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        password.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                password.setText("");
            }
        });
        password2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                password2.setText("");
            }
        });
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
        ID_usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Creación de Usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Cree un ID de usuario:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Cree una contraseña:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        password.setText("jPasswordField1");
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 300, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        ID_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(ID_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 300, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Confirmar contraseña:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        password2.setText("jPasswordField2");
        jPanel2.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 300, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Nombre:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 300, -1));

        cancelar.setBackground(new java.awt.Color(255, 255, 0));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_usuarioActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UsuariosBeans cb = new UsuariosBeans();//1| ta
        String pass = new String(password.getPassword());///2| ta
        String passCon = new String(password2.getPassword());//3| ta
        String idUsuario = ID_usuario.getText();//4| ta
        String nombreUsuario = nombre.getText();//5| ta
       
        if (idUsuario.isEmpty() || pass.isEmpty() || nombreUsuario.isEmpty()) {//6| tc
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        } else if (!pass.equals(passCon)) {//7| tc
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        } else if (!idUsuario.matches("\\d+")) {//8| tc
            JOptionPane.showMessageDialog(null, "El ID de usuario solo puede contener números");
            
        } else if (!nombreUsuario.matches("[a-zA-Z]+")) {//9| tc
            JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras");
        } else {
            cb.setID_usuario(Integer.parseInt(idUsuario));
            cb.setPassword(pass);
            cb.setNombre(nombreUsuario);
            
            this.enviar();
            this.setVisible(false);
            INICIO_APP ss = new INICIO_APP();//10 ta
            ss.setVisible(true);
            //-----------------------------------------------------------------
            //TIEMPO TOTAL DEL METODO
            //T= ta + ta + ta + ta + ta + tc + tc + tc + tc + ta
            //T= 6ta + 4tc
            //-----------------------------------------------------------------
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed
    public int UsoRe(int num) {
        return num;
    }

    /**
     * @param args the command line arguments
     */
    
    private void enviar() {
        try {
            
            UsuariosBeans cb = new UsuariosBeans();//1| ta
            cb.setID_usuario(Integer.parseInt(ID_usuario.getText()));
            
            String plainPassword = password.getText();//2| ta
            String hashedPassword = hashPassword(plainPassword);//3| ta
            
            cb.setPassword(hashedPassword);
            
            cb.setNombre(nombre.getText());
            
            cb.insertar_Usuario();
            
            JOptionPane.showMessageDialog(null, "Usuario creado con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());//4| to
        }
        //TIEMPO TOTAL
        //T= ta+ta+ta+to
        //T= 3ta+to
    }
    
    private String hashPassword(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");//1| ta
            byte[] hashedBytes = messageDigest.digest(password.getBytes());//2| ta
            StringBuilder stringBuilder = new StringBuilder();//3| ta
            
            for (byte b : hashedBytes) {//4 tc
                stringBuilder.append(String.format("%02x", b));
            }
            
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        //TIEMPO TOTAL DEL METODO
        //T= ta+ta+ta+tc
        //T= 3ta+tc
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_usuario;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    // End of variables declaration//GEN-END:variables
}
