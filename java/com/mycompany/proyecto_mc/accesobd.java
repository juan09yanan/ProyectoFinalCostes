//Clase editada por Juan Jimenez
package com.mycompany.proyecto_mc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class accesobd {
     Connection conexion = null;
    private final String host;
    private final String user;
    private final String pasword;
    private final String bd;

    public accesobd(String host, String user, String pasword, String bd) {
        this.host = host;
        this.user = user;
        this.pasword = pasword;
        this.bd = bd;
    }


    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPasword() {
        return pasword;
    }

    public String getBd() {
        return bd;
    }
    
    public void conectarBD(){
        try{
            Driver driver =(Driver)  //1 | ta
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    DriverManager.registerDriver(driver);
                    String cadena ="jdbc:mysql://"+getHost()+"/"+getBd(); //2 | (ta + too)
                    conexion= DriverManager.getConnection(cadena, getUser(), getPasword()); //3 | ta
                    System.out.println("Conexion exitosa a la base de datos");
        }catch (Exception e){
            System.out.println("Error al conectar a la base de datos"+e.toString());
            //calculo del tiempo del método conectar para la clase accesobd
            //T= ta + (ta + to)
            //T= 2ta + to
            
        }
    }
    public Connection getConnection(){
        return conexion;
    }
    
    public void actualizarBD (String sql) throws SQLException{
        try{
            Statement stm= conexion.createStatement();//1| ta
            stm.executeUpdate(sql);
            System.out.println("Actualizacion exitosa de la base de datos");
            
        }catch(SQLException e){
            System.out.println("Error en la actualizacion de la base de datos"+e.toString());
        }
        //T=ta
      }  
        public  ResultSet consultaBD (String sql) throws SQLException{
            ResultSet cursor;
            Statement stm=conexion.createStatement();//1| ta
            cursor= stm.executeQuery(sql);//2| ta
            return cursor;
            //T= ta+ta
            //T= 2ta
        }

    PreparedStatement prepareStatement(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
        
}
