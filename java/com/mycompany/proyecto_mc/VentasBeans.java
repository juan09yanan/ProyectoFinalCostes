/* Editada por Edison Jimenez */
package com.mycompany.proyecto_mc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class VentasBeans {

    private int ID_venta;
    private int ID_cliente;
    private String fecha_venta;
    private int total_ventas;
    accesobd bd;

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;// 1| ta
        // Total tiempo= ta
    }

    public VentasBeans() {
        bd = new accesobd("localhost", "root", "", "tecnologia"); // 1 | ta
        // Total tiempo = ta
        bd.conectarBD();
    }

    public int getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(int total_ventas) {
        this.total_ventas = total_ventas;// 1| ta
        // T = ta
    }

    public void setID_venta(int ID_venta) {
        this.ID_venta = ID_venta;// 1| ta
        // T = ta
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;// 1| ta
        // T = ta
    }

    private float Total_venta;

    public int getID_venta() {
        return ID_venta;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public int incremento_Venta() throws SQLException {
        int inc = 0; // 1| ta
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(ID_venta) as num FROM Ventas"); // 2| ta
        if (rs.next()) { // 3| n(tc)
            inc = rs.getInt(1) + 1; // n(ta + to)
        } else {
            inc = 1; // 4| ta
        }
        return inc;
        /*
         * Tiempo total
         * Tiempo mejor esperado
         * T= ta + ta + tc + ta+ to
         * T= 3ta + tc+ to
         * Tiempo peor esperado
         * T= ta + ta+ n (tc) + n (ta+to)
         * T= 2ta + ntc + nta+ nto
         * T= 2ta + n(tc+ta+to)
         * Tiempo promedio
         * T = (Tm + Tp)/2
         * T= [3ta + tc + to + 2ta + ntc + nta + nto] /2
         * T= [5ta + tc + to + n(ta + tc + to) ]/2
         */
    }

    public void insertar_venta() throws SQLException {

        String cadena = "insert into Ventas values ('" // 1| ta + to
                + incremento_Venta() + "','" + getID_cliente() + "','"
                + getFecha_venta() + "','" + getTotal_ventas() + "')";
        bd.actualizarBD(cadena);
        // TIEMPO TOTAL = ta + to
    }

    public void mostrardata(String e) throws SQLException {
        bd.actualizarBD(e);
    }

    public void eliminarVenta() throws SQLException {
        String cadena = "DELETE FROM Ventas WHERE ID_venta = " + getID_venta();// 1| ta + to
        bd.actualizarBD(cadena);
        // Tiempo Total= ta + to
    }

    public Connection getConnection() {
        return bd.getConnection();
    }

    public void Consultar_Cliente() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from Ventas"); // 1| ta
        while (rs.next()) { // 2| n(tc)
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");

            System.out.println(" ");
        }
        // Tiempo total= ta+ ntc
    }

    public ResultSet consultaTabla(String sql) throws SQLException {

        return bd.consultaBD(sql);
    }

    public void modifica() throws SQLException {

        String cadena = "UPDATE Ventas set ID_venta = '" + incremento_Venta() + "', '" // 1| ta + to
                + incremento_Venta() + "', '" + getFecha_venta() + "," + getTotal_ventas()
                + "' WHERE ID_venta = " + getID_venta();
        bd.actualizarBD(cadena);
        // TIEMPO TOTAL= ta + to
    }

}
