package com.mycompany.proyecto_mc;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrmCliente extends javax.swing.JFrame {

    FrmCategoria ct = new FrmCategoria();
    FrmProductos pr = new FrmProductos();
    FrmVentas vnt = new FrmVentas();
    FrmDetalle_ventas dtll = new FrmDetalle_ventas();

    public FrmCliente() {
        initComponents();
        combito.setVisible(false);
        setLocationRelativeTo(null);
        info.setVisible(false);
        info2.setVisible(false);
        bot.setVisible(false);
        cat.setVisible(false);
        ll.setVisible(false);
        idconsulta.setVisible(false);
        pro.setVisible(false);
        enviar.setVisible(false);
        Modificar.setVisible(false);
        try {
            this.consultar();
            this.consultarcombo();
        } catch (SQLException ex) {
            Logger.getLogger(FrmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cat = new javax.swing.JButton();
        idconsulta = new javax.swing.JTextField();
        pro = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        idcliente = new javax.swing.JTextField();
        fondo = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ll = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        info = new javax.swing.JInternalFrame();
        lblID_cliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo_electronico = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        info2 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblconsulta = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        cons = new javax.swing.JButton();
        botoo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        combito = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jButton8.setText("jButton8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cat.setText("Tabla Categoria");
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        pro.setText("Tabla Productos");
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });

        jButton6.setText("Tabla Detalle Ventas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        idcliente.setEditable(false);
        idcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idclienteActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(0, 102, 204));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevo.setBackground(new java.awt.Color(255, 255, 0));
        nuevo.setText("Nuevo cliente");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        fondo.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 366, 157, 39));

        enviar.setBackground(new java.awt.Color(255, 255, 0));
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        fondo.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 365, 76, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        fondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 365, 83, 40));

        bot.setBackground(new java.awt.Color(255, 255, 0));
        bot.setText("Consultar cliente");
        bot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botActionPerformed(evt);
            }
        });
        fondo.add(bot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 137, 40));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "DIRECCION", "TELEFONO", "E-MAIL"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1172, 110));

        ll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ll.setText("Ingrese el ID para consultar individualmente:");
        fondo.add(ll, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 147, 284, 31));

        jButton5.setText("Añadir una Venta");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(255, 0, 0)));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        fondo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 50));

        jButton7.setBackground(new java.awt.Color(153, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("SALIR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        fondo.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1023, 372, 95, 29));

        Modificar.setBackground(new java.awt.Color(255, 255, 0));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        fondo.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 365, -1, 45));

        info.setTitle("Nuevo cliente");
        info.setVisible(true);
        info.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID_cliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblID_cliente.setText("ID_CLIENTE");
        info.getContentPane().add(lblID_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 11, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setText("Nombre");
        info.getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, -1, -1));

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellido.setText("Apellido");
        info.getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDireccion.setText("Direccion");
        info.getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 126, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefono.setText("Telefono");
        info.getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 166, -1, -1));

        lblCorreo_electronico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCorreo_electronico.setText("E-mail");
        info.getContentPane().add(lblCorreo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        info.getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 46, 144, -1));
        info.getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 86, 150, -1));
        info.getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 126, 141, -1));
        info.getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 166, 144, -1));
        info.getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 206, 144, -1));

        fondo.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 270));

        info2.setTitle("Consulta individual");
        info2.setVisible(true);

        tblconsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Direccion", "Telefono", "E-Mail"
            }
        ));
        jScrollPane2.setViewportView(tblconsulta);

        jButton9.setBackground(new java.awt.Color(255, 255, 0));
        jButton9.setText("Cerrar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout info2Layout = new javax.swing.GroupLayout(info2.getContentPane());
        info2.getContentPane().setLayout(info2Layout);
        info2Layout.setHorizontalGroup(
            info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info2Layout.createSequentialGroup()
                .addGroup(info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(info2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jButton9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        info2Layout.setVerticalGroup(
            info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        fondo.add(info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 101, -1, 210));

        cons.setBackground(new java.awt.Color(255, 255, 0));
        cons.setText("Consultar individualmente");
        cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consActionPerformed(evt);
            }
        });
        fondo.add(cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        botoo.setBackground(new java.awt.Color(255, 255, 0));
        botoo.setText("Modificar");
        botoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botooActionPerformed(evt);
            }
        });
        fondo.add(botoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 365, 92, 40));

        jButton4.setText("Añadir productos al Stock");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        fondo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 180, 50));

        combito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combitoActionPerformed(evt);
            }
        });
        fondo.add(combito, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 180, 80, -1));

        jLabel1.setText("Clientes registrados");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idclienteActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        info.setVisible(true);
        this.nuevo();
        enviar.setVisible(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        info.setVisible(false);

        enviar.setVisible(false);
        // Validar que los campos no estén vacíos
        if (nombre.getText().isEmpty() || apellido.getText().isEmpty()//1| tc
                || direccion.getText().isEmpty() || telefono.getText().isEmpty()) {
            // Mostrar mensaje de error
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que nombre y apellido contengan solo letras
        if (!nombre.getText().matches("[a-zA-Z]+")) {//2| tc
            JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!apellido.getText().matches("[a-zA-Z]+")) {//3| tc
            JOptionPane.showMessageDialog(this, "El apellido solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el teléfono contenga solo números
        if (!telefono.getText().matches("\\d+")) {//4| tc
            JOptionPane.showMessageDialog(this, "El teléfono solo puede contener números", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validar el formato de correo electrónico
        String correoRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";//5| ta
        if (!Pattern.matches(correoRegex, correo.getText())) {//6| tc
            JOptionPane.showMessageDialog(this, "El correo electrónico no tiene un formato válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Resto del código para enviar los datos
        enviar();
        //TIEMPO TOTAL DEL METODO
        //T= tc + tc + tc + tc + ta + tc
        //T= ta + 6tc


    }//GEN-LAST:event_enviarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_TablaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.eliminarCliente();
        try {
            this.consultar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botActionPerformed
        this.consultatbl();

    }//GEN-LAST:event_botActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
        ct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_catActionPerformed

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        // TODO add your handling code here:
        pr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_proActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        vnt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dtll.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Modificar();
        try {
            this.consultar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        botoo.setVisible(true);
        Modificar.setVisible(false);
        info.setVisible(false);
    }//GEN-LAST:event_ModificarActionPerformed

    private void consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consActionPerformed
        combito.setVisible(true);
        info2.setVisible(true);
        cons.setVisible(false);
        bot.setVisible(true);
        ll.setVisible(true);
        idconsulta.setVisible(true);
    }//GEN-LAST:event_consActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        combito.setVisible(false);
        info2.setVisible(false);
        cons.setVisible(true);
        bot.setVisible(false);
        ll.setVisible(false);
        idconsulta.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void botooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botooActionPerformed
        // TODO add your handling code here:
        botoo.setVisible(false);
        Modificar.setVisible(true);
        info.setVisible(true);
    }//GEN-LAST:event_botooActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pr.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void combitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combitoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    void Modificar() {
        try {
            ClientesBeans cb = new ClientesBeans();//1| ta
            cb.setCorreo_electronico(correo.getText());
            cb.modifica(Integer.parseInt(idcliente.getText()), nombre.getText(), apellido.getText(), direccion.getText(), telefono.getText(), correo.getText());
            this.mostrar(Tabla, "Select * from Clientes");
            JOptionPane.showMessageDialog(null, "La informacion se modifico");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//2| to
        }
        //T= ta + to
    }

    private void consultatbl() {
        String cli = idconsulta.getText();//1| ta
        ClientesBeans con1 = null;//2| ta
        try {
            con1 = new ClientesBeans();//3| ta
        } catch (SQLException ex) {
            Logger.getLogger(FrmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();//4| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Clientes WHERE ID_cliente = " + combito.getSelectedItem();//5| ta + to
        try {
            conet = con1.getConnection();//6| ta
            st = conet.createStatement();//7| ta
            rs = st.executeQuery(sql);//8| ta
            Object[] cliente = new Object[6];//9| ta
            modelo = (DefaultTableModel) tblconsulta.getModel();//10| ta
            while (rs.next()) {//11| ntc
                cliente[0] = rs.getInt(1);//12| nta
                cliente[1] = rs.getString(2);//13| nta
                cliente[2] = rs.getString(3);//14| nta
                cliente[3] = rs.getString(4);//15| nta
                cliente[4] = rs.getString(5);//16| nta
                cliente[5] = rs.getString(6);//17| nta
                modelo.addRow(cliente);
            }
            tblconsulta.setModel(modelo);
        } catch (Exception e) {
/*TIEMPO TOTAL DEL METODO
            Tiempo mejor esperado
            T= ta+ta+ta+ta+ta+to+ta+ta+ta+ta+ta+tc+ta+ta+ta+ta+ta+ta
            T= 16ta+to+tc
            
            Tiempo peor esperado
            T= ta+ta+ta+ta+ta+to+ta+ta+ta+ta+ta+ntc+nta+nta+nta+nta+nta+nta
            T= 10ta+to+ntc+6nta
            T= 10ta+to+n(6ta+tc)
            
            Tiempo promedio
            T= (Tm+Tp)/2
            T= [16ta+to+tc+10ta+to+n(6ta+tc)]/2
            T= [26ta+2to+tc+n(6ta+tc)]/2
            */
        }
    }

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            ClientesBeans cb = new ClientesBeans();//1| ta
            idcliente.setText("" + cb.incremento_Cliente());//2| to
            nombre.setText("");
            apellido.setText("");
            direccion.setText("");
            telefono.setText("");
            correo.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//3| to
        }
//TIEMPO TOTAL DEL METODO= ta + 2to
    }

    private void enviar() {
        try {
            ClientesBeans cb = new ClientesBeans();//1| ta
            cb.setID_cliente(Integer.parseInt(idcliente.getText()));
            cb.setNombre(nombre.getText());
            cb.setApellido(apellido.getText());
            cb.setDireccion(direccion.getText());
            cb.setTelefono(telefono.getText());
            cb.setCorreo_electronico(correo.getText());
            cb.insertar_cliente();
            this.mostrar(Tabla, "Select * from Clientes");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardada exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//2| to
            //Tiempo total = ta+to
        }
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            ClientesBeans cb = new ClientesBeans();//1| ta
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();//2| ta
            JT.setModel(modelo);
            rs = cb.consultaTabla(sql);//3| ta
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();//4| ta
            int cantcolumnas = rsMd.getColumnCount();//5| ta
            for (int i = 1; i <= cantcolumnas; i++) {//6| n(ta+tc+to)
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {//7| ntc
                Object[] columna = new Object[cantcolumnas];//8| nta
                for (int i = 0; i < cantcolumnas; i++) {//9| n(ta+tc+to)
                    columna[i] = rs.getObject(i + 1);//10| n(ta+to)
                }
                modelo.addRow(columna);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//11| to
        }
        /*TIEMPO TOTAL DEL METODO
        Tiempo mejor esperado
        T= ta+ta+ta+ta+ta+ta+tc+to+tc+ta+ta+tc+to+ta+to+to
        T= 9ta+3tc+4to
        
        Tiempo peor esperado
        T= ta+ta+ta+ta+ta+n(ta+tc+to)+ntc+nta+n(ta+tc+to)+n(ta+to)+to
        T= 5ta+to+nta+ntc+nto+ntc+nta+nta+ntc+nto+nta+nto
        T= 5ta+to+4nta+3ntc+3nto
        T= 5ta+to+n(4ta+3tc+3to)
        
        Tiempo promedio
        T=(Tm+Tp)/2
        T=[9ta+3tc+4to+5ta+to+n(4ta+3tc+3to)]/2
        T=[14ta+3tc+5to+n(4ta+3tc+3to)]/2
        */
    }

    private void MouseClick() {
        int fila = Tabla.getSelectedRow();//1| ta
        idcliente.setText(Tabla.getModel().getValueAt(fila, 0).toString());
        nombre.setText(Tabla.getModel().getValueAt(fila, 1).toString());
        apellido.setText(Tabla.getModel().getValueAt(fila, 2).toString());
        direccion.setText(Tabla.getModel().getValueAt(fila, 3).toString());
        telefono.setText(Tabla.getModel().getValueAt(fila, 4).toString());
        correo.setText(Tabla.getModel().getValueAt(fila, 5).toString());
        //T= ta
    }

    private void eliminarCliente() {
        try {
            ClientesBeans cb = new ClientesBeans();//1| ta
            cb.setID_cliente(Integer.parseInt(idcliente.getText()));
            cb.eliminarCliente();
            this.mostrar(Tabla, "SELECT * FROM Clientes");
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());//2| to
            //T= ta + to
        }
    }

    void consultar() throws SQLException {

        ClientesBeans con1 = new ClientesBeans();//1| ta
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();//2| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Clientes";//3| ta
        try {
            conet = con1.getConnection();//4| ta
            st = conet.createStatement();//5| ta
            rs = st.executeQuery(sql);//6| ta
            Object[] cliente = new Object[6];//7| ta
            modelo = (DefaultTableModel) Tabla.getModel();//8| ta
            while (rs.next()) {//9| ntc
                cliente[0] = rs.getInt(1);//10| nta
                cliente[1] = rs.getString(2);//11| nta
                cliente[2] = rs.getString(3);//12| nta
                cliente[3] = rs.getString(4);//13| nta
                cliente[4] = rs.getString(5);//14| nta
                cliente[5] = rs.getString(6);//15| nta
                modelo.addRow(cliente);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            //Tiempo total del metodo
            //T= ta+ta+ta+ta+ta+ta+ta+ta+ntc+nta+nta+nta+nta+nta+nta
            //T= 8ta + ntc + 6nta
            //T= 8ta + n(tc+6ta)

        }
    }

    void consultarcombo() throws SQLException {

        CategoriasBeans con1 = new CategoriasBeans();//1| ta
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();//2| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Clientes";//3| ta
        try {
            conet = con1.getConnection();//4| ta
            st = conet.createStatement();//5| ta
            rs = st.executeQuery(sql);//6| ta
            Object[] cliente = new Object[6];//7| ta
            while (rs.next()) {//8| ntc
                combito.addItem(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {
//TIEMPO TOTAL DEL METODO
//T = ta+ta+ta+ta+ta+ta+ta+ntc
//T= 7ta+ntc
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton bot;
    private javax.swing.JButton botoo;
    private javax.swing.JButton cat;
    private javax.swing.JComboBox<String> combito;
    private javax.swing.JButton cons;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton enviar;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField idcliente;
    private javax.swing.JTextField idconsulta;
    private javax.swing.JInternalFrame info;
    private javax.swing.JInternalFrame info2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo_electronico;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblID_cliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel ll;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton pro;
    private javax.swing.JTable tblconsulta;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
