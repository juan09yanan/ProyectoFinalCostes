//salvatierra barzola edison esteven

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

public class FrmProductos extends javax.swing.JFrame {

    FrmCategoria ct = new FrmCategoria();
    public FrmProductos() {
        initComponents();
        setLocationRelativeTo(null);
        ID_categoria.setVisible(false);
        info.setVisible(false);
        cons.setVisible(false);
        try {
            this.consultar();
            this.consultarcombo();
            this.consultarproductos();
        } catch (SQLException ex) {
            Logger.getLogger(FrmProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ID_categoria = new javax.swing.JTextField();
        fondo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        info = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        ID_producto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combito = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Descripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Stock = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cons = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblconsulta = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(0, 102, 204));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "ID Categoria", "Nombre", "Descripcion", "Precio", "Stock disponible"
            }
        ));
        jScrollPane3.setViewportView(Tabla);

        fondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 640, 110));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Nuevo Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        fondo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        fondo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, -1, 32));

        jLabel8.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Productos Disponibles en Stock");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        info.setVisible(true);

        jLabel1.setText("ID Producto");

        ID_producto.setEditable(false);

        jLabel2.setText("ID Categoria ");

        combito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combitoActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Añadir nueva Categoria");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Precio");

        jLabel6.setText("Stock disponible");

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Enviar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info.getContentPane());
        info.getContentPane().setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ID_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(infoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton3)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(24, 24, 24))
        );

        fondo.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 410, 350));

        cons.setTitle("Consultas");
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
                "ID Producto", "ID Categoria", "Nombre", "Descripcion", "Precio", "Stock disponible"
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

        combo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout consLayout = new javax.swing.GroupLayout(cons.getContentPane());
        cons.getContentPane().setLayout(consLayout);
        consLayout.setHorizontalGroup(
            consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consLayout.createSequentialGroup()
                .addGroup(consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(consLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(consLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton7)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        consLayout.setVerticalGroup(
            consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        fondo.add(cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 620, 250));

        jButton8.setBackground(new java.awt.Color(255, 255, 0));
        jButton8.setText("Consulta individual");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        fondo.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));
        fondo.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.consultatbl();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        info.setVisible(true);
        this.nuevo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        info.setVisible(false);
        if (Descripcion.getText().isEmpty() || Nombre.getText().isEmpty()//1| n(tc)
                || Precio.getText().isEmpty() || Stock.getText().isEmpty()) {
            // Mostrar mensaje de error
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el Precio sea un número entero o decimal
        try {
            double precio = Double.parseDouble(Precio.getText());//2| ta
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El Precio debe ser un número entero o decimal", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el Stock sea un número entero
        try {
            int stock = Integer.parseInt(Stock.getText());//3| ta
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El Stock debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.enviar();
        //TIEMPO TOTAL DEL METODO= ntc + 2ta
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.eliminarProducto();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        FrmCliente clien = new FrmCliente();
        clien.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        ct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void combitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combitoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        cons.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cons.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void consultatbl() {
        String product = ID_producto.getText();//1| ta
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
        String sql = "select * from Productos WHERE ID_producto = " + combo.getSelectedItem();//5| ta + to
        try {
            conet = con1.getConnection();//6| ta
            st = conet.createStatement();//7| ta
            rs = st.executeQuery(sql);//8| ta
            Object[] cliente = new Object[6];//9| ta
            modelo = (DefaultTableModel) tblconsulta.getModel();//10| ta

            while (rs.next()) {//11| n(tc)
                cliente[0] = rs.getInt(1);//12| n(ta)
                cliente[1] = rs.getString(2);//13| n(ta)
                cliente[2] = rs.getString(3);//14| n(ta)
                cliente[3] = rs.getString(4);//15| n(ta)
                cliente[4] = rs.getString(5);//16| n(ta)
                cliente[5] = rs.getString(6);//17| n(ta)
                modelo.addRow(cliente);
            }
            tblconsulta.setModel(modelo);
        } catch (Exception e) {
            /*TIEMPO TOTAL DEL METODO
            Tiempo mejor esperado
            T= ta + ta + ta + ta + ta + to + ta + ta + ta + ta + ta + tc + ta + ta + ta + ta + ta + ta
            T= 16ta + to + tc
            
            Tiempo peor esperado
            T= ta + ta + ta + ta + ta + to + ta + ta + ta + ta + ta + ntc + nta + nta + nta + nta + nta + nta
            T= 10ta + to + 6nta + ntc
            T= 10ta + to + n(6ta+tc)
            
            Tiempo promedio
            T= (Tm + Tp)/2
            T= [16ta + to + tc + 10ta + to + n(6ta+tc)]/2
            T= [26ta + 2to + tc + n(6ta+tc)]/2
            */
        }
    }

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            ProductosBeans cb = new ProductosBeans();//1| ta
            ClientesBeans cb1 = new ClientesBeans();//2| ta
            ID_producto.setText("" + cb.incremento_Producto());//3| to
            ID_categoria.setText("" + cb.incremento_Producto());//4| to
            Nombre.setText("");
            Descripcion.setText("");
            Precio.setText("");
            Stock.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());
        }
        //TIEMPO DEL METODO
        //T= 2ta + 2to
        //T= 2(ta+to)
    }

    private void enviar() {
        try {
            ProductosBeans cb = new ProductosBeans();//1| ta
            ClientesBeans cb1 = new ClientesBeans();//2| ta
            cb.setID_producto(Integer.parseInt(ID_producto.getText()));
            cb.setID_categoria(Integer.parseInt(ID_categoria.getText()));
            cb.setNombre(Nombre.getText());
            cb.setDescripcion(Descripcion.getText());
            cb.setPrecio(Float.parseFloat(Precio.getText()));
            cb.setStock_disponible(Integer.parseInt(Stock.getText()));
            cb.insertar_producto();
            this.mostrar(Tabla, "Select * from Productos");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardada exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//3| to
        }
        //TIEMPO DEL METODO
        //T= 2ta+to
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            ProductosBeans cb = new ProductosBeans();//1| ta
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();//2| ta
            JT.setModel(modelo);
            rs = cb.consultaTabla(sql);//3| ta
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();//4| ta
            int cantcolumnas = rsMd.getColumnCount();//5| ta
            JOptionPane.showMessageDialog(null, cantcolumnas);
            for (int i = 1; i <= cantcolumnas; i++) {//6| n(ta+to+tc)
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {//7| ntc
                Object[] columna = new Object[cantcolumnas];//8| nta
                for (int i = 0; i < cantcolumnas; i++) {//9| n(ta+to+tc)
                    columna[i] = rs.getObject(i + 1);//10| n(ta+to)
                }
                modelo.addRow(columna);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//11| to
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
    }

    private void MouseClick() {
        int fila = Tabla.getSelectedRow();//1| ta
        ID_producto.setText(Tabla.getModel().getValueAt(fila, 0).toString());
        ID_categoria.setText(Tabla.getModel().getValueAt(fila, 1).toString());
        Nombre.setText(Tabla.getModel().getValueAt(fila, 2).toString());
        Descripcion.setText(Tabla.getModel().getValueAt(fila, 3).toString());
        Precio.setText(Tabla.getModel().getValueAt(fila, 4).toString());
        Stock.setText(Tabla.getModel().getValueAt(fila, 5).toString());
        //T = ta
    }

    private void eliminarProducto() {
        try {
            ProductosBeans cb = new ProductosBeans();//1| ta
            cb.setID_producto(Integer.parseInt(ID_producto.getText()));
            cb.eliminarProducto();
            this.mostrar(Tabla, "SELECT * FROM Productos");
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());//2| to
        }
        //T= ta+to
    }

    void consultar() throws SQLException {

        ProductosBeans con1 = new ProductosBeans();//1| ta
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
            modelo = (DefaultTableModel) Tabla.getModel();//8| ta

            while (rs.next()) {//9| n(tc)
                cliente[0] = rs.getInt(1);//10| n(ta)
                cliente[1] = rs.getString(2);//11| n(ta)
                cliente[2] = rs.getString(3);//12| n(ta)
                cliente[3] = rs.getString(4);//13| n(ta)
                cliente[4] = rs.getString(5);//14| n(ta)
                cliente[5] = rs.getString(6);//15| n(ta)
                modelo.addRow(cliente);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            //TIEMPO TOTAL DEL METODO
            //T= ta + ta + ta + ta + ta + ta + ta + ta + ntc + nta + nta + nta + nta + nta + nta
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
        String sql = "select * from Categorias";//3| ta
        try {
            conet = con1.getConnection();//4| ta
            st = conet.createStatement();//5| ta
            rs = st.executeQuery(sql);//6| ta
            while (rs.next()) {//7| ntc
                combito.addItem(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {
//TIEMPO TOTAL DEL METODO
//T= ta + ta + ta + ta + ta + ta + ntc
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
                combo.addItem(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {
//TIEMPO TOTAL DEL METODO
//T= ta + ta + ta + ta + ta + ta + ta + ntc
//T= 7ta + ntc
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descripcion;
    private javax.swing.JTextField ID_categoria;
    private javax.swing.JTextField ID_producto;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Stock;
    private javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> combito;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JInternalFrame cons;
    private javax.swing.JPanel fondo;
    private javax.swing.JInternalFrame info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tblconsulta;
    // End of variables declaration//GEN-END:variables
}
