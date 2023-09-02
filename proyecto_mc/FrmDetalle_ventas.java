
package com.mycompany.proyecto_mc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmDetalle_ventas extends javax.swing.JFrame {
    public FrmDetalle_ventas() {
        initComponents();
        setLocationRelativeTo(null);
        info.setVisible(false);
        cons.setVisible(false);

        try {
            this.consultar();
            this.consultarventa();
            this.consultarproductos();
        } catch (SQLException ex) {
            Logger.getLogger(FrmDetalle_ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ID_venta = new javax.swing.JTextField();
        ID_producto = new javax.swing.JTextField();
        idconsulta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        info = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        ID_detalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Precio_unitario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        comboventa = new javax.swing.JComboBox<>();
        comboproducto = new javax.swing.JComboBox<>();
        cons = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblconsulta = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        comboconsulta = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Agregar nuevo detalle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_detalle", "ID_venta", "ID_producto", "Cantidad ", "Precio unitario"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 560, 180));

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 74, 32));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Detalles Disponibles");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        info.setTitle("Agregar");
        info.setVisible(true);
        info.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID_detalle");
        info.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        info.getContentPane().add(ID_detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 114, -1));

        jLabel2.setText("ID_venta");
        info.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setText("ID_producto");
        info.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Cantidad");
        info.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });
        info.getContentPane().add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 114, -1));

        jLabel5.setText("Precio_unitario");
        info.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        info.getContentPane().add(Precio_unitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 114, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Enviar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        info.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        info.getContentPane().add(comboventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        info.getContentPane().add(comboproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 350, 280));

        cons.setTitle("Consultas individuales");
        cons.setVisible(true);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblconsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_detalle", "ID_venta", "ID_producto", "Cantidad", "Precio unitario"
            }
        ));
        jScrollPane1.setViewportView(tblconsulta);

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setText("Cerrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consLayout = new javax.swing.GroupLayout(cons.getContentPane());
        cons.getContentPane().setLayout(consLayout);
        consLayout.setHorizontalGroup(
            consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consLayout.createSequentialGroup()
                        .addComponent(comboconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16))))
        );
        consLayout.setVerticalGroup(
            consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(comboconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 490, 220));

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Consulta individual");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        info.setVisible(true);
        this.nuevo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        info.setVisible(false);
        // Validar que los campos no estén vacíos
        if (Cantidad.getText().isEmpty() || Precio_unitario.getText().isEmpty()) {
            // Mostrar mensaje de error
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que la Cantidad sea un número entero
        try {
            int cantidad = Integer.parseInt(Cantidad.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La Cantidad debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el Precio_unitario sea un número decimal
        try {
            double precio = Double.parseDouble(Precio_unitario.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El Precio_unitario debe ser un número decimal", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Resto del código para enviar los datos
        this.enviar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.eliminarProducto();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.consultatbl();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_TablaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        FrmVentas clien = new FrmVentas();
        clien.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cons.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cons.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void consultatbl() {
        String det = idconsulta.getText();//1| ta
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
        String sql = "select * from Detalles_Venta WHERE ID_detalle = " + comboconsulta.getSelectedItem();//5| ta+to
        try {
            conet = con1.getConnection();//6| ta
            st = conet.createStatement();//7| ta
            rs = st.executeQuery(sql);//8| ta
            Object[] cliente = new Object[5];//9| ta
            modelo = (DefaultTableModel) tblconsulta.getModel();//10| ta

            while (rs.next()) {//11| ntc
                cliente[0] = rs.getInt(1);//12| nta
                cliente[1] = rs.getString(2);//13| nta
                cliente[2] = rs.getString(3);//14| nta
                cliente[3] = rs.getString(4);//15| nta
                cliente[4] = rs.getString(5);//16| nta
                modelo.addRow(cliente);
            }
            tblconsulta.setModel(modelo);
        } catch (Exception e) {
            /*
                 Tiempo del metodo
            Tiempo mejor esperado
            T= ta+ta+ta+ta+ta+to+ta+ta+ta+ta+ta+tc+ta+ta+ta+ta+ta
            T= 15ta + to + tc
            
            Tiempo peor esperado
            T= ta+ta+ta+ta+ta+to+ta+ta+ta+ta+ta+ntc+nta+nta+nta+nta+nta
            T= 10ta + to + ntc + 5nta
            T= 10ta + to + n(tc + 5ta)
            
            Tiempo promedio
            T=(Tm+Tp)/2
            T=[]/2
            T=[]/2
             */
        }
    }

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            Detalles_VentaBeans cb = new Detalles_VentaBeans();//1| ta

            ID_detalle.setText("" + cb.incremento_Detalle());//2| to
            ID_venta.setText("" + cb.incremento_Detalle());//3| to
            ID_producto.setText("" + cb.incremento_Detalle());//4| to

            Cantidad.setText("");

            Precio_unitario.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//5| to
        }
        //TIEMPO DEL METODO
        //T= ta+to+to+to+to
        //T= ta + 4to

    }

    private void enviar() {
        try {
            Detalles_VentaBeans cb = new Detalles_VentaBeans();//1| ta

            cb.setID_detalle(Integer.parseInt(ID_detalle.getText()));
            cb.setID_venta(Integer.parseInt(ID_venta.getText()));
            cb.setID_producto(Integer.parseInt(ID_producto.getText()));
            cb.setCantidad(Integer.parseInt(Cantidad.getText()));
            cb.setPrecio_unitario(Float.parseFloat(Precio_unitario.getText()));

            cb.insertar_detalleventa();
            this.mostrar(Tabla, "Select * from Detalles_Venta");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardada exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//2| to
        }
        //Tiempo del metodo = ta + to
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            Detalles_VentaBeans cb = new Detalles_VentaBeans();//1| ta
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();//2| ta
            JT.setModel(modelo);
            rs = cb.consultaTabla(sql);//3| ta
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();//4| ta
            int cantcolumnas = rsMd.getColumnCount();//5| ta
            JOptionPane.showMessageDialog(null, cantcolumnas);

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
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//1| to
            //TIEMPO TOTAL DEL METODO
            /*Tiempo mejor esperado (al ser 1 o menos el numero de datos a mostrar
        T= ta+ta+ta+ta+ta+ta+to+tc++ta+ta+to+tc+ta+to+ta+tc+ta+ta+to+ta+ta
        T=14ta + 4to + 3tc
        
        Tiempo peor esperado (al haber una cantidad considerable de datos)
        T= ta+ta+ta+ta+ta+n(ta+to+tc)+n(tc)+n(ta)+n(ta+to)+n(ta+to)+ta+n(tc)+n(ta)+n(ta+to)+n(ta)+ta
        T= 7ta + nta + nto + ntc + nta + ntc + nta + nto+ nta + nto + ntc + nta + nta + nto + nta
        T= 7ta + 7nta + 4nto + 3ntc
        T= 7ta + n(7ta + 4to + 3tc)
        
        Tiempo promedio del metodo
        T = (Tm + TP) /2
        T = [14ta + 4to + 3tc + 7ta + n(7ta + 4to + 3tc)]/2
        T = [21ta + 4to + 3tc + n(7ta + 4to + 3tc)]/2
             */
        }
    }

    private void MouseClick() {
        int fila = Tabla.getSelectedRow();//1| ta
        ID_detalle.setText(Tabla.getModel().getValueAt(fila, 0).toString());
        ID_venta.setText(Tabla.getModel().getValueAt(fila, 1).toString());
        ID_producto.setText(Tabla.getModel().getValueAt(fila, 2).toString());
        Cantidad.setText(Tabla.getModel().getValueAt(fila, 3).toString());
        Precio_unitario.setText(Tabla.getModel().getValueAt(fila, 4).toString());
        //T= ta

    }

    private void eliminarProducto() {
        try {
            Detalles_VentaBeans cb = new Detalles_VentaBeans();//1| ta
            cb.setID_detalle(Integer.parseInt(ID_detalle.getText()));
            cb.eliminarDetalle();
            this.mostrar(Tabla, "SELECT * FROM Detalles_Venta");
            JOptionPane.showMessageDialog(null, "El detalle ha sido eliminado exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());//2| to
        }
        //Tiempo del metodo
        //T= ta + to
    }

    void consultar() throws SQLException {

        Detalles_VentaBeans con1 = new Detalles_VentaBeans();//1| ta
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();//2| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Detalles_Venta";//3| ta
        try {
            conet = con1.getConnection();//4| ta
            st = conet.createStatement();//5| ta
            rs = st.executeQuery(sql);//6| ta
            while (rs.next()) {//7| ntc
                comboconsulta.addItem(Integer.toString(rs.getInt(sql)));
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            //Tiempo del metodo
            //T= ta+ta+ta+ta+ta+ta+ntc
            //T= 6ta + ntc

        }
    }

    void consultarproductos() throws SQLException {

        CategoriasBeans con1 = new CategoriasBeans();//1| ta
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();//2| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Productos";//3| ta
        try {
            conet = con1.getConnection();//4| ta
            st = conet.createStatement();//5| ta
            rs = st.executeQuery(sql);//6| ta
            Object[] cliente = new Object[6];//7| ta
            while (rs.next()) {//8| ntc
                comboproducto.addItem(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {

            //Tiempo del metodo
            //T = ta+ta+ta+ta+ta+ta+ta+ntc
            //T = 7ta + ntc
        }
    }

    void consultarventa() throws SQLException {

        CategoriasBeans con1 = new CategoriasBeans();//1| ta
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();//2| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Ventas";//3| ta
        try {
            conet = con1.getConnection();//4| ta
            st = conet.createStatement();//5| ta
            rs = st.executeQuery(sql);//6| ta
            Object[] cliente = new Object[6];//7| ta
            while (rs.next()) {//8| ntc
                comboventa.addItem(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {
            //Tiempo del metodo
            //T = ta+ta+ta+ta+ta+ta+ta+ntc
            //T = 7ta + ntc

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField ID_detalle;
    private javax.swing.JTextField ID_producto;
    private javax.swing.JTextField ID_venta;
    private javax.swing.JTextField Precio_unitario;
    private javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> comboconsulta;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.JComboBox<String> comboventa;
    private javax.swing.JInternalFrame cons;
    private javax.swing.JTextField idconsulta;
    private javax.swing.JInternalFrame info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblconsulta;
    // End of variables declaration//GEN-END:variables
}
