//Clase editada por Juan Jimenez
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FrmVentas extends javax.swing.JFrame {

    public FrmVentas() {
        initComponents();
        consulta.setVisible(false);
        ID_cliente.setVisible(false);
        this.modificar.setVisible(false);
        modificar.setVisible(false);
        setLocationRelativeTo(null);
        enviar.setVisible(false);
        info.setVisible(false);
        try {
            consultarcombo();
            consultar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        ID_cliente = new javax.swing.JTextField();
        idconsulta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        nuevo = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        info = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        ID_venta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combito = new javax.swing.JComboBox<>();
        Fecha_venta = new javax.swing.JTextField();
        Total_vendido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        consulta = new javax.swing.JInternalFrame();
        cerro = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblconsulta = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        non = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID venta", "ID cliente", "Fecha Venta", "Total vendido"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 500, 119));

        nuevo.setBackground(new java.awt.Color(255, 255, 0));
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 72, -1));

        enviar.setBackground(new java.awt.Color(255, 255, 0));
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        jPanel1.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 72, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 72, 33));

        modificar.setBackground(new java.awt.Color(255, 255, 0));
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, -1));

        info.setTitle("Añadir venta");
        info.setVisible(true);
        info.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Venta");
        info.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        ID_venta.setEditable(false);
        info.getContentPane().add(ID_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 113, -1));

        jLabel2.setText("ID Cliente");
        info.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        info.getContentPane().add(combito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));
        info.getContentPane().add(Fecha_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 113, -1));

        Total_vendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_vendidoActionPerformed(evt);
            }
        });
        info.getContentPane().add(Total_vendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 113, -1));

        jLabel3.setText("Fecha de Venta");
        info.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setText("Total vendido");
        info.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 310, 230));

        consulta.setTitle("Consulta individual");
        consulta.setVisible(true);

        cerro.setText("Cerrar");
        cerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerroActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
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
                "ID VENTA", "ID CLIENTE", "FECHA VENTA", "TOTAL VENDIDO"
            }
        ));
        jScrollPane1.setViewportView(tblconsulta);

        javax.swing.GroupLayout consultaLayout = new javax.swing.GroupLayout(consulta.getContentPane());
        consulta.getContentPane().setLayout(consultaLayout);
        consultaLayout.setHorizontalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                        .addComponent(cerro)
                        .addGap(191, 191, 191))))
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerro)
                .addGap(14, 14, 14))
        );

        jPanel1.add(consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 490, 230));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Consultar individualmente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        non.setBackground(new java.awt.Color(255, 255, 0));
        non.setText("Modificar");
        non.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonActionPerformed(evt);
            }
        });
        jPanel1.add(non, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        jLabel6.setText("Datos disponibles de Ventas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Historic", 2, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Ir a detalles de las Ventas");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Total_vendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_vendidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_vendidoActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        info.setVisible(true);
        enviar.setVisible(true);
        nuevo.setVisible(false);
        this.nuevo();
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        
        this.enviar();
        info.setVisible(false);
        enviar.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_enviarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.eliminarVenta();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.consultatbl();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        FrmCliente clien = new FrmCliente();
        clien.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        this.Modificar();
        modificar.setVisible(false);
        info.setVisible(false);
        non.setVisible(true);
        
    }//GEN-LAST:event_modificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        consulta.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerroActionPerformed
        consulta.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_cerroActionPerformed

    private void nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonActionPerformed
        info.setVisible(true);
        non.setVisible(false);
        modificar.setVisible(true);
    }//GEN-LAST:event_nonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrmDetalle_ventas dt = new FrmDetalle_ventas();
        dt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    void Modificar() {
        try {
            VentasBeans cb = new VentasBeans();//1| ta
            
            cb.setID_venta(Integer.parseInt(ID_venta.getText()));
            cb.setID_cliente(Integer.parseInt(ID_cliente.getText()));
            
            LocalDate fechaActual = LocalDate.now();//2| ta
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //3| ta

            String fechaTexto = fechaActual.format(formatter);//4| ta
            
            cb.setFecha_venta(Fecha_venta.getText());
            cb.setTotal_ventas(Integer.parseInt(Total_vendido.getText()));
            
            cb.modifica();
            this.mostrar(Tabla, "Select * from Ventas");
            JOptionPane.showMessageDialog(null, "La informacion se modifico");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//5| to
            //Tiempo total del metodo
            //T= ta+ta+ta+ta+to
            //T= 4ta + to
        }
        
    }
    
    private void consultatbl() {
        String vent = idconsulta.getText();//1| ta
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
        String sql = "select * from Ventas WHERE ID_venta = " + combo.getSelectedItem();//5| ta+to
        try {
            conet = con1.getConnection();//6| ta
            st = conet.createStatement();//7| ta
            rs = st.executeQuery(sql);//8| ta
            Object[] venttas = new Object[4];//9| ta
            modelo = (DefaultTableModel) tblconsulta.getModel();//10| ta  
            while (rs.next()) {//11| ntc
                venttas[0] = rs.getInt(1);//12| nta
                venttas[1] = rs.getString(2);//13| nta
                venttas[2] = rs.getString(3);//14| nta
                venttas[3] = rs.getString(4);//15| nta
                modelo.addRow(venttas);
            }
            tblconsulta.setModel(modelo);
        } catch (Exception e) {
            /*Tiempo total del metodo
            Tiempo mejor esperado
            T= ta+ta+ta+ta+ta+ta+ta+ta+ta+ta+tc+ta+ta+ta+ta+ta+ta
            T= 16ta+tc
            
            Tiempo peor esperado
            T= ta+ta+ta+ta+ta+ta+ta+ta+ta+ta+ntc+nta+nta+nta+nta+nta+nta
            T= 10ta+ ntc + 6nta
            T= 10ta + n(tc+6ta)
            
            Tiempo promedio
            T= (Tm+Tp)/2
            T= [16ta+tc+10ta + n(tc+6ta)]/2
            T=[26ta + tc + n(tc+6ta)]/2
            
            */
        }
    }

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            VentasBeans cb = new VentasBeans();//1| ta
            ID_venta.setText("" + cb.incremento_Venta());//2| to
            ID_cliente.setText("" + cb.incremento_Venta());//3| to
            
            LocalDate fechaActual = LocalDate.now();//4| to
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //5| ta

            String fechaTexto = fechaActual.format(formatter);//6| ta
            
            Fecha_venta.setText("" + fechaTexto);//7| to
            Total_vendido.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//8| to
        }
        /*Tiempo total del metodo
        T= ta+to+to+to+ta+ta+to+to
        T= 3ta + 5to
        
        */
        
    }
    
    private void enviar() {
        try {
            VentasBeans cb = new VentasBeans();//1| ta
            cb.setID_venta(Integer.parseInt(ID_venta.getText()));
            cb.setID_cliente(Integer.parseInt((String) combito.getSelectedItem()));
           
            LocalDate fechaActual = LocalDate.now();//2| ta
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //3| ta

            String fechaTexto = fechaActual.format(formatter);//4| ta
            
            cb.setFecha_venta(Fecha_venta.getText());
            cb.setTotal_ventas(Integer.parseInt(Total_vendido.getText()));
            
            cb.insertar_venta();
            this.mostrar(Tabla, "Select * from Ventas");
            
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardada exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//5| to
            /*
            Tiempo del metodo
            T= ta+ta+ta+ta+to
            T= 4ta + to
            */
        }
    }
    
    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            VentasBeans cb = new VentasBeans();//1| ta
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
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());//1| to
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
        ID_venta.setText(Tabla.getModel().getValueAt(fila, 0).toString());
        ID_cliente.setText(Tabla.getModel().getValueAt(fila, 1).toString());
        Fecha_venta.setText(Tabla.getModel().getValueAt(fila, 2).toString());
        Total_vendido.setText(Tabla.getModel().getValueAt(fila, 3).toString());
        //T= ta
        
    }
    
    private void eliminarVenta() {
        try {
            VentasBeans cb = new VentasBeans();//1| ta
            cb.setID_venta(Integer.parseInt(ID_venta.getText()));
            cb.eliminarVenta();
            this.mostrar(Tabla, "SELECT * FROM Ventas");
            JOptionPane.showMessageDialog(null, "La venta ha sido eliminada exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());//2| to
            //T= ta + to
        }
    }
    
    void consultar() throws SQLException {
        
        VentasBeans con1 = new VentasBeans();//1| ta
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
            Object[] cliente = new Object[4];//7| ta
            modelo = (DefaultTableModel) Tabla.getModel();//8| ta
            
            while (rs.next()) {//9| ntc
                cliente[0] = rs.getInt(1);//10| nta
                cliente[1] = rs.getString(2);//11| nta
                cliente[2] = rs.getString(3);//12| nta
                cliente[3] = rs.getString(4);//13| nta
                
                combo.addItem(Integer.toString(rs.getInt(1)));
                modelo.addRow(cliente);
            }
            
            Tabla.setModel(modelo);
        } catch (Exception e) {
            /*
            Tiempo total del metodo
            T= ta+ta+ta+ta+ta+ta+ta+ta+ntc+nta+nta+nta+nta
            T= 8ta + ntc + 4nta
            T= 8ta + n(tc+4ta)
            */
        }
    }
    
    public void fecha() {
        VentasBeans cb = new VentasBeans();//1| ta
        LocalDate fechaActual = LocalDate.now();//2| ta
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //3| ta

        String fechaTexto = fechaActual.format(formatter);//4| ta
        Fecha_venta.setText(fechaTexto);
        
        Total_vendido.setText("");
        //Tiempo del metodo
        //T = ta+ta+ta+ta
        //T = 4ta
    }
    
    void consultarcombo() throws SQLException {
        
        VentasBeans con1 = new VentasBeans();//1| ta
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
            Object[] cliente = new Object[1];//7| ta
            modelo = (DefaultTableModel) Tabla.getModel();//8| ta
            while (rs.next()) {//9| ntc
                combito.addItem(Integer.toString(rs.getInt(1)));
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            //Tiempo del metodo
            //T = ta+ta+ta+ta+ta+ta+ta+ta+ntc
            //T= 8ta + ntc
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fecha_venta;
    private javax.swing.JTextField ID_cliente;
    private javax.swing.JTextField ID_venta;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Total_vendido;
    private javax.swing.JButton cerro;
    private javax.swing.JComboBox<String> combito;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JInternalFrame consulta;
    private javax.swing.JButton enviar;
    private javax.swing.JTextField idconsulta;
    private javax.swing.JInternalFrame info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificar;
    private javax.swing.JButton non;
    private javax.swing.JButton nuevo;
    private javax.swing.JTable tblconsulta;
    // End of variables declaration//GEN-END:variables
}
