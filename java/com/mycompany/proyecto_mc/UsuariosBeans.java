/* editada por Edison Jimenez */
package com.mycompany.proyecto_mc;

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuariosBeans {

    private int ID_usuario;
    private String password;
    private String nombre;
    accesobd bd;

    public UsuariosBeans() {
        bd = new accesobd("localhost", "root", "", "tecnologia");// 1| ta
        bd.conectarBD();
        // T = ta
    }

    public int getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;// 1| ta
        // T = ta
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;// 1| ta
        // T = ta
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;// 1| ta
        // T = ta
    }

    public accesobd getBd() {
        return bd;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;// 1| ta
        // T = ta
    }

    public void insertar_Usuario() throws SQLException {

        String cadena = "insert into Usuarios values ('" + getID_usuario() + "','" + "" + "','" + getNombre() + "')";// 1|
                                                                                                                     // ta+
                                                                                                                     // to
        bd.actualizarBD(cadena);
        // T = ta + to

    }

    public void mostrardata(String e) throws SQLException {
        bd.actualizarBD(e);
    }

    public Connection getConnection() {
        return bd.getConnection();
    }

    public boolean consultar() throws SQLException {
        Connection conet;
        Statement st;
        ResultSet rs;

        String sql = "SELECT ID_usuario, password, nombre FROM usuarios WHERE ID_usuario=?";// 1| ta
        try {
            conet = getConnection();// 2| ta
            st = conet.createStatement();// 3| ta
            PreparedStatement preparedStatement = conet.prepareStatement(sql);// 4| ta
            preparedStatement.setInt(1, getID_usuario());// 5| ta
            rs = preparedStatement.executeQuery();// 6| ta

            if (rs.next()) {// 7| n(tc)
                if (getPassword().equals(rs.getString("password"))) {// 8| n(tc)
                    setNombre(rs.getString("nombre"));// 9| ta
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        /*
         * Tiempo total del metodo
         * T= ta + ta + ta + ta + ta + ta + n(tc) + n(tc) + ta
         * T= 7ta + 2ntc
         * 
         */
    }

}
