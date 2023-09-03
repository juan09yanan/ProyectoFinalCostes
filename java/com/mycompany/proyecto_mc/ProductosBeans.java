//Clase editada por Juan Jimenez
package com.mycompany.proyecto_mc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductosBeans {

    private int ID_producto;
    private int ID_categoria;
    private String Nombre;
    private String Descripcion;
    private Float Precio;
    private int stock_disponible;
    private float precioTotal = 0.0f; 
    accesobd bd;
  ClientesBeans cl;
    
    public ProductosBeans() {
        bd = new accesobd("localhost", "root", "", "tecnologia");//1| ta
        bd.conectarBD();
        //T = ta
    }

    public void setID_producto(int ID_producto) {
        this.ID_producto = ID_producto;//1| ta
        //T = ta
    }

    public void setID_categoria(int ID_categoria) {
        this.ID_categoria = ID_categoria;//1| ta
        //T = ta
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;//1| ta
        //T = ta
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;//1| ta
        //T = ta
    }

    public void setPrecio(Float Precio) {
        this.Precio = Precio;//1| ta
        //T = ta
    }

    public void setStock_disponible(int stock_disponible) {
        this.stock_disponible = stock_disponible;//1| ta
        //T = ta
    }

    public int getID_producto() {
        return ID_producto;
    }

    public int getID_categoria() {
        return ID_categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public Float getPrecio() {
        return Precio;
    }

    public int getStock_disponible() {
        return stock_disponible;
    }
  public int incremento_Producto() throws SQLException{
        int inc=0;//1| ta
        ResultSet rs;
        rs= bd.consultaBD("SELECT max(ID_producto) as num FROM Productos");//2| ta
        if (rs.next()){//3| n(tc)
            inc= rs.getInt(1)+1; // n(ta+to)
            
        }else{
            inc= 1; //ta
        }
        return inc;
        //Tiempo total
        //T= ta+ta+ntc+nta+nto
        //T= 2ta + nta + ntc +nto
        //T= 2ta + n(ta+tc+to)
    }
    
    public void insertar_producto() throws SQLException {

        String cadena = "insert into Productos values ('" + incremento_Producto()+ "','" //1| ta + to
                + incremento_Producto()+ "','" + getNombre()+ "','" + getDescripcion()+ "','" 
                + getPrecio()+ "','" + getStock_disponible()+ "')";
        bd.actualizarBD(cadena);
        //T = ta + to
    }
    public void mostrardata(String e) throws SQLException{
        bd.actualizarBD(e);
    }
    
    public void eliminarProducto() throws SQLException {
    String cadena = "DELETE FROM Productos WHERE ID_producto = " +getID_producto();//1| ta + to
    bd.actualizarBD(cadena);
    //T = ta + to
}
    public Connection getConnection(){
        return bd.getConnection();
    }
    

    
    public void Consultar_Producto() throws SQLException{
        ResultSet rs;
         rs = bd.consultaBD("select * from Productos"); //1| ta
       while(rs.next()){//2| n(tc)
           System.out.print(rs.getInt(1)+" ");
           System.out.print(rs.getString(2)+" ");
           System.out.print(rs.getString(3)+" ");
           System.out.print(rs.getString(4)+" ");
           System.out.print(rs.getString(5)+" ");
           System.out.print(rs.getString(6)+" ");
           System.out.println(" ");
       }
       //T = ta + ntc
    }
    public  ResultSet consultaTabla(String sql) throws SQLException{
        
        return bd.consultaBD(sql);
    }
    
}
