/* Editado por Edison Jimenez */
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

public class FrmCategoria extends javax.swing.JFrame {

    public FrmCategoria() {
        initComponents();
        setLocationRelativeTo(null);
        info.setVisible(false);
        idconsulta.setVisible(false);
        cons.setVisible(false);
        try {
            this.consultar();
            this.consultarcombo();
        } catch (SQLException ex) {
            Logger.getLogger(FrmCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        info = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        ID_categoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre_categoria = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        cons = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcategoria_consulta = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        combito = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        idconsulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevo.setBackground(new java.awt.Color(255, 255, 0));
        nuevo.setText("Nueva Categoria");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        eliminar.setBackground(new java.awt.Color(255, 255, 0));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null }
                },
                new String[] {
                        "ID", "Nombre Categoria"
                }));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 44, 344, 116));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, 33));

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Categorias existentes");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 22, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 790, 10));

        info.setTitle("Añadir");
        info.setVisible(true);

        jLabel1.setText("ID Categoria:");

        ID_categoria.setEditable(false);

        jLabel2.setText("Nombre Categoria:");

        enviar.setBackground(new java.awt.Color(255, 255, 0));
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info.getContentPane());
        info.getContentPane().setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
                infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoLayout.createSequentialGroup()
                                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(infoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(infoLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(infoLayout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(ID_categoria,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(infoLayout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Nombre_categoria,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 135,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(infoLayout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(enviar)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        infoLayout.setVerticalGroup(
                infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(ID_categoria, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(Nombre_categoria, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(enviar)
                                .addContainerGap(15, Short.MAX_VALUE)));

        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 200));

        cons.setTitle("Consultas");
        cons.setVisible(true);

        tblcategoria_consulta.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID", "Nombre Categoria"
                }));
        jScrollPane2.setViewportView(tblcategoria_consulta);

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Consultar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consLayout = new javax.swing.GroupLayout(cons.getContentPane());
        cons.getContentPane().setLayout(consLayout);
        consLayout.setHorizontalGroup(
                consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(combito, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(228, 228, 228))
                        .addGroup(consLayout.createSequentialGroup()
                                .addGroup(consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(consLayout.createSequentialGroup()
                                                .addGap(180, 180, 180)
                                                .addComponent(jButton3))
                                        .addGroup(consLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 23, Short.MAX_VALUE)));
        consLayout.setVerticalGroup(
                consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(combito, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(23, 23, 23)));

        jPanel1.add(cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 460, 270));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        idconsulta.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.add(idconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 46, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nuevoActionPerformed
        info.setVisible(true);
        this.nuevo();
    }// GEN-LAST:event_nuevoActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_enviarActionPerformed
        info.setVisible(false);
        if (Nombre_categoria.getText().isEmpty()) {// 1| tc
            JOptionPane.showMessageDialog(this, "El campo Nombre de categoría es requerido", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que solo contenga letras
        if (!Nombre_categoria.getText().matches("[a-zA-Z]+")) {// 2| tc
            JOptionPane.showMessageDialog(this, "El campo Nombre de categoría solo puede contener letras", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // T= 2tc
        this.enviar();

    }// GEN-LAST:event_enviarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        this.eliminarCategoria();
    }// GEN-LAST:event_eliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.consultatbl();
    }// GEN-LAST:event_jButton4ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:

        this.MouseClick();
    }// GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        FrmProductos clien = new FrmProductos();
        clien.setVisible(true);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        cons.setVisible(false);
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        cons.setVisible(true);
    }// GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void consultatbl() {
        String cat = idconsulta.getText();// 1| ta
        ClientesBeans con1 = null;// 2| ta
        try {
            con1 = new ClientesBeans();// 3| ta
        } catch (SQLException ex) {
            Logger.getLogger(FrmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();// 4| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Categorias WHERE ID_categoria = " + combito.getSelectedItem();// 5| ta + to
        try {
            conet = con1.getConnection();// 6| ta
            st = conet.createStatement();// 7| ta
            rs = st.executeQuery(sql);// 8| ta
            Object[] categoy = new Object[2];// 9| ta
            modelo = (DefaultTableModel) tblcategoria_consulta.getModel();// 10| ta
            while (rs.next()) {// 11| ntc
                categoy[0] = rs.getInt(1);// 12| nta
                categoy[1] = rs.getString(2);// 13| nta
                modelo.addRow(categoy);
            }
            tblcategoria_consulta.setModel(modelo);
        } catch (Exception e) {

        }
        /*
         * TIEMPO TOTAL DEL METODO
         * Tiempo mejor esperado
         * T= ta + ta + ta + ta + ta + to + ta + ta + ta + ta + ta + tc + ta + ta
         * T= 12ta + to + tc
         * 
         * Tiempo peor esperado
         * T= ta + ta + ta + ta + ta + to + ta + ta + ta + ta + ta + ntc + nta + nta
         * T= 10ta + to + ntc + 2nta
         * T= 10ta + to + n(2ta+tc)
         * 
         * 
         * Tiempo promedio
         * T= (Tm+Tp)/2
         * T= [12ta + to + tc + 10ta + to + n(2ta+tc)]/2
         * T= [22ta + 2to + tc + n(2ta+tc)]/2
         */
    }

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            CategoriasBeans cb = new CategoriasBeans();// 1| ta
            ID_categoria.setText("" + cb.incremento_categoria());// 2| to
            Nombre_categoria.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());
        }
        // Tiempo total del metodo= ta + to
    }

    private void enviar() {
        try {
            CategoriasBeans cb = new CategoriasBeans();// 1| ta
            cb.setID_categoria(Integer.parseInt(ID_categoria.getText()));
            cb.setNombre_categoria(Nombre_categoria.getText());
            cb.insertar_categoria();
            this.mostrar(tabla, "SELECT * FROM Categorias");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardada exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());// 2| to
        }
        // Tiempo total del metodo= ta + to
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            CategoriasBeans cb = new CategoriasBeans();// 1| ta
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();// 2| ta
            JT.setModel(modelo);
            rs = cb.consultaTabla(sql);// 3| ta
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();// 4| ta
            int cantcolumnas = rsMd.getColumnCount();// 5| ta
            JOptionPane.showMessageDialog(null, cantcolumnas);

            for (int i = 1; i <= cantcolumnas; i++) {// 6| n(ta+tc+to)
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {// 7| ntc
                Object[] columna = new Object[cantcolumnas];// 8| nta
                for (int i = 0; i < cantcolumnas; i++) {// 9| n(ta+tc+to)
                    columna[i] = rs.getObject(i + 1);// 10| n(ta+to)
                }
                modelo.addRow(columna);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());// 11| to
        }
        /*
         * TIEMPO TOTAL DEL METODO
         * Tiempo mejor esperado
         * T= ta+ta+ta+ta+ta+ta+tc+to+tc+ta+ta+tc+to+ta+to+to
         * T= 9ta+3tc+4to
         * 
         * Tiempo peor esperado
         * T= ta+ta+ta+ta+ta+n(ta+tc+to)+ntc+nta+n(ta+tc+to)+n(ta+to)+to
         * T= 5ta+to+nta+ntc+nto+ntc+nta+nta+ntc+nto+nta+nto
         * T= 5ta+to+4nta+3ntc+3nto
         * T= 5ta+to+n(4ta+3tc+3to)
         * 
         * Tiempo promedio
         * T=(Tm+Tp)/2
         * T=[9ta+3tc+4to+5ta+to+n(4ta+3tc+3to)]/2
         * T=[14ta+3tc+5to+n(4ta+3tc+3to)]/2
         */
    }

    private void MouseClick() {
        int fila = tabla.getSelectedRow();// 1| ta
        ID_categoria.setText(tabla.getModel().getValueAt(fila, 0).toString());
        Nombre_categoria.setText(tabla.getModel().getValueAt(fila, 1).toString());
        // T= ta
    }

    private void eliminarCategoria() {
        try {
            CategoriasBeans cb = new CategoriasBeans();// 1| ta
            cb.setID_categoria(Integer.parseInt(ID_categoria.getText()));
            cb.eliminar_Categoria();
            this.mostrar(tabla, "SELECT * FROM Categorias");
            JOptionPane.showMessageDialog(null, "La categoria  ha sido eliminado exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());// 2| to
        }
        // T= ta+to
    }

    void consultar() throws SQLException {

        CategoriasBeans con1 = new CategoriasBeans();// 1| ta
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();// 2| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Categorias";// 3| ta
        try {
            conet = con1.getConnection();// 4| ta
            st = conet.createStatement();// 5| ta
            rs = st.executeQuery(sql);// 6| ta
            Object[] cliente = new Object[2];// 7| ta
            modelo = (DefaultTableModel) tblcategoria_consulta.getModel();// 8| ta
            while (rs.next()) {// 9| ntc
                cliente[0] = rs.getInt(1);// 10| nta
                cliente[1] = rs.getString(2);// 1| nta
                modelo.addRow(cliente);
            }
            tblcategoria_consulta.setModel(modelo);
        } catch (Exception e) {
            // TIEMPO TOTAL DEL METODO
            // T= ta + ta + ta + ta + ta + ta + ta + ta + ntc + nta + nta
            // T= 7ta + ntc + 2nta
            // T= 7ta + n(tc + 2ta)

        }
    }

    void consultarcombo() throws SQLException {

        CategoriasBeans con1 = new CategoriasBeans();// 1| ta
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();// 2| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Categorias";// 3| ta
        try {
            conet = con1.getConnection();// 4| ta
            st = conet.createStatement();// 5| ta
            rs = st.executeQuery(sql);// 6| ta
            Object[] cliente = new Object[6];// 7| ta
            while (rs.next()) {/// 8| ntc
                combito.addItem(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {
            // TIEMPO TOTAL DEL METODO
            // T= ta+ta+ta+ta+ta+ta+ta+ntc
            // T= 7ta+ntc
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_categoria;
    private javax.swing.JTextField Nombre_categoria;
    private javax.swing.JComboBox<String> combito;
    private javax.swing.JInternalFrame cons;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton enviar;
    private javax.swing.JTextField idconsulta;
    private javax.swing.JInternalFrame info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nuevo;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tblcategoria_consulta;
    // End of variables declaration//GEN-END:variables
}
