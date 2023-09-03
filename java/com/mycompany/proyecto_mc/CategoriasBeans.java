/* Editado por Edison Jimenez */
package com.mycompany.proyecto_mc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriasBeans {
    private int ID_categoria;
    private String Nombre_categoria;
    accesobd bd;

    public CategoriasBeans() throws SQLException {
        bd = new accesobd("localhost", "root", "", "tecnologia");// 1| ta
        bd.conectarBD();
        // T = ta
    }

    public void setID_categoria(int ID_categoria) {
        this.ID_categoria = ID_categoria;// 1| ta
        // T = ta
    }

    public void setNombre_categoria(String Nombre_categoria) {
        this.Nombre_categoria = Nombre_categoria;// 1| ta
        // T = ta
    }

    public int getID_categoria() {
        return ID_categoria;
    }

    public String getNombre_categoria() {
        return Nombre_categoria;
    }

    public int incremento_categoria() throws SQLException {
        int inc = 0; // 1| ta
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(ID_categoria) as num FROM Categorias");// 2| ta
        if (rs.next()) {// 3| n(tc)
            inc = rs.getInt(1) + 1;// 4| n(ta + to )
        } else {
            inc = 1;// 5| ta
        }
        return inc;
        // Tiempo total del metodo
        // T= ta + ta + ntc + nta + nto + ta
        // T= 3ta + ntc + nta + nto
        // T= 3ta +n(ta+tc+to)
    }

    public void insertar_categoria() throws SQLException {

        String cadena = "insert into Categorias values ('" + incremento_categoria() // 1| ta + to
                + "','" + getNombre_categoria() + "')";
        bd.actualizarBD(cadena);
        // T = ta + to

    }

    public void mostrardata(String e) throws SQLException {
        bd.actualizarBD(e);
    }

    public void eliminar_Categoria() throws SQLException {
        String cadena = "DELETE FROM Categorias WHERE ID_categoria = " + getID_categoria();// 1| ta + to
        bd.actualizarBD(cadena);
        // T = ta
    }

    public Connection getConnection() {
        return bd.getConnection();
    }

    public void Consultar_Categoria() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from Categorias");// 1| ta
        while (rs.next()) {// 2| n(tc)
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");

            System.out.println(" ");
        }
        // T = ta + ntc
    }

    public ResultSet consultaTabla(String sql) throws SQLException {

        return bd.consultaBD(sql);
    }
}
