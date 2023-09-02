
package com.mycompany.proyecto_mc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Detalles_VentaBeans {
     private int  ID_detalle;
   private int ID_venta;
   private int ID_producto;
   private int Cantidad;
   private float Precio_unitario;
   accesobd bd;
   
   public Detalles_VentaBeans(){
       bd = new accesobd("localhost", "root", "", "tecnologia");//1| ta
        bd.conectarBD();
        //T = ta
   }
   
    public void setID_detalle(int ID_detalle) {
        this.ID_detalle = ID_detalle;//1| ta
        //T = ta
    }

    public void setID_venta(int ID_venta) {
        this.ID_venta = ID_venta;//1| ta
        //T = ta
    }

    public void setID_producto(int ID_producto) {
        this.ID_producto = ID_producto;//1| ta
        //T = ta
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;//1| ta
        //T = ta
    }

    public void setPrecio_unitario(float Precio_unitario) {
        this.Precio_unitario = Precio_unitario;//1| ta
        //T = ta
    }

    public int getID_detalle() {
        return ID_detalle;
    }

    public int getID_venta() {
        return ID_venta;
    }

    public int getID_producto() {
        return ID_producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public float getPrecio_unitario() {
        return Precio_unitario;
    }
    
    public int incremento_Detalle() throws SQLException{
        int inc=0; //1| ta
        ResultSet rs;
        rs= bd.consultaBD("SELECT max(ID_detalle) as num FROM Detalles_Venta");//2| ta
        if (rs.next()){//3| n(tc)
            inc= rs.getInt(1)+1;//4| n(ta + to)
        }else{
            inc= 1;//5| ta
        }
        return inc;
        //Total del tiempo
        //T= ta + ta + ntc + nta + nto + ta
        //T= 3ta + ntc + nta + nto
        //T= 3ta + n(ta+ta+to)
    }
    
    public void insertar_detalleventa() throws SQLException {

        String cadena = "insert into Detalles_Venta values ('" + incremento_Detalle()+//1| ta + to
                "','" + incremento_Detalle()+ "','" + incremento_Detalle()+ "','" +
                getCantidad()+ "','" + getPrecio_unitario()+ "')";
        bd.actualizarBD(cadena);
        //T = ta + to

    }
    public void mostrardata(String e) throws SQLException{
        bd.actualizarBD(e);
    }
    
    public void eliminarDetalle() throws SQLException {
    String cadena = "DELETE FROM Detalles_Venta WHERE ID_detalle = " +getID_detalle();//1| ta + to
    bd.actualizarBD(cadena);
    //T = ta + to
}
    public Connection getConnection(){
        return bd.getConnection();
    }
    

    
    public void Consultar_Producto() throws SQLException{
        ResultSet rs;
         rs = bd.consultaBD("select * from Detalles_Venta");//1| ta
       while(rs.next()){//2| n(tc)
           System.out.print(rs.getInt(1)+" ");
           System.out.print(rs.getString(2)+" ");
           System.out.print(rs.getString(3)+" ");
           System.out.print(rs.getString(4)+" ");
           System.out.print(rs.getString(5)+" ");
          
           System.out.println(" ");
       }
    }
    //Total del tiempo del metodo
    //T= ta + ntc
    public  ResultSet consultaTabla(String sql) throws SQLException{
        
        return bd.consultaBD(sql);
    }
}
