
package com.mycompany.proyecto_mc;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Catalogo extends javax.swing.JFrame {


    public Catalogo() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            
            consultar();
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_carrito = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Mostrar Productos en Stock :");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla_carrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID producto", "ID categoria", "Nombre", "Descripcion", "Precio", "Stock Disponible"
            }
        ));
        jScrollPane2.setViewportView(tabla_carrito);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("PRODUCTOS SELECCIONADOS:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID producto", "ID categoria", "Nombre", "Descripcion", "Precio", "Unidades disponibles"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 812, 280));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 962, 10));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("SMART SHOP  cuenta con un surtido Stock de productos de los cuales puede elegir...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, -1));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Para adquirir algun producto de nuestra tienda, muestre el codigo del producto y ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 50));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("el asistente vendedor le atendera con gusto y lo registrara en nuestro sistema.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mostrar(Tabla, "Select * from Productos");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        INICIO_APP ap = new INICIO_APP();
        ap.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            
            for (int i = 1; i <= cantcolumnas; i++) { //6| n (ta + to)
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) { //7| n(tc)
                Object[] columna = new Object[cantcolumnas]; //8| n(ta)
                for (int i = 0; i < cantcolumnas; i++) {//9| n(ta + to)
                    columna[i] = rs.getObject(i + 1);//10| n(ta+ to)
                }
                modelo.addRow(columna);
            }
            JT.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int filaSeleccionada = JT.getSelectedRow();//11| ta
                    if (filaSeleccionada != -1) {//12| n(tc)
                        Object[] datosFila = new Object[cantcolumnas];//13| n(ta)
                        for (int i = 0; i < cantcolumnas; i++) {//14| n(ta+to+tc)
                            datosFila[i] = JT.getValueAt(filaSeleccionada, i);//15| n(ta)
                        }

                        // Agregar la fila a la tabla_carrito
                        DefaultTableModel modeloCarrito = (DefaultTableModel) tabla_carrito.getModel();//16| ta
                        modeloCarrito.addRow(datosFila);
                    }
                }
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ..." + e.toString());
        }
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
    
     void consultar() throws SQLException {

        ClientesBeans con1 = new ClientesBeans();//1| ta
        Connection conet;
        DefaultTableModel modelo = new DefaultTableModel();//2| ta
        Statement st;
        ResultSet rs;
        int idc;
        String sql = "select * from Productos";//3| ta
        try {
            conet = con1.getConnection();//4| ta
            st = conet.createStatement();//5| ta
            rs = st.executeQuery(sql);//6|ta
            Object[] cliente = new Object[6];//7| ta
            modelo = (DefaultTableModel) Tabla.getModel();//8| ta
            while (rs.next()) {//9| n(tc)
                cliente[0] = rs.getInt(1); //10| n(ta)
                cliente[1] = rs.getString(2);//11| n(ta)
                cliente[2] = rs.getString(3);//12| n(ta)
                cliente[3] = rs.getString(4);//13| n(ta)
                cliente[4] = rs.getString(5);//14| n(ta)
                cliente[5] = rs.getString(6);//15| n(ta)
                modelo.addRow(cliente);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            //Tiempo total del metodo
            //T= ta + ta + ta + ta + ta + ta + ta + ta + ntc + nta + nta + nta + nta + nta + nta 
            //T= 8ta + ntc + 6nta
            //T= 8ta + n(tc + 6ta)
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_carrito;
    // End of variables declaration//GEN-END:variables
}
