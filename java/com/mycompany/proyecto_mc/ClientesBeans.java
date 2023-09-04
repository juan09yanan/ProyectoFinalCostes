//salvatierra barzola edison esteven

package com.mycompany.proyecto_mc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ClientesBeans {
      private int ID_cliente;
    private String Nombre;
    private String Apellido;
    private String Direccion;
      private String Telefono;
    private String  Correo_electronico;
    accesobd bd;
    
    public ClientesBeans() throws SQLException{
        bd = new accesobd("localhost","root","","tecnologia");//1| ta
        bd.conectarBD();
        //T = ta
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;//1| ta
        //T = ta
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;//1| ta
        //T = ta
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;//1| ta
        //T = ta
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;//1| ta
        //T = ta
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;//1| ta
        //T = ta
    }

    public void setCorreo_electronico(String Correo_electronico) {
        this.Correo_electronico = Correo_electronico;//1| ta
        //T = ta
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo_electronico() {
        return Correo_electronico;
    }
    
    public int incremento_Cliente() throws SQLException{
        int inc=0;//1| ta
        ResultSet rs;
        rs= bd.consultaBD("SELECT max(ID_cliente) as num FROM Clientes");//2| ta
        if (rs.next()){//3| n(tc)
            inc= rs.getInt(1)+1; //4| n(ta+to)
        }else{
            inc= 1;//5| ta
        }
        return inc;
        //Tiempo total del metodo
        //T= ta+ta+ntc+nta+nto+ta
        //T= 3ta + ntc + nta + nto
        //T= 3ta + n(ta+tc+to)
    }
    
    public void insertar_cliente() throws SQLException {

        String cadena = "insert into Clientes values ('" + incremento_Cliente() //1| ta+to
                + "','" + getNombre() + "','" + getApellido() + "','" + 
                getDireccion() + "','" + getTelefono() + "','" +
                getCorreo_electronico() + "')";
        bd.actualizarBD(cadena);
        //T = ta + to

    }
     public void modifica(int id, String nom, String ape, String dir, String tel, String corr) throws SQLException {

        String cadena = "UPDATE Clientes set ID_cliente = '"+id+"', Nombre='"//1| ta + to
                +nom+"', Apellido='"+ape+"', Direccion='"+dir+"', Telefono='"
                +tel+"', Correo_electronico='"+corr+"' WHERE ID_cliente = "+id;
        bd.actualizarBD(cadena);
        //T = ta + to

    }
    public void mostrardata(String e) throws SQLException{
        bd.actualizarBD(e);
    }
    
    public void eliminarCliente() throws SQLException {
    String cadena = "DELETE FROM Clientes WHERE ID_cliente = " +getID_cliente();//1| ta + to
    bd.actualizarBD(cadena);
    //T = ta + to
}
    public Connection getConnection(){
        return bd.getConnection();
    }
    
    public void Consultar_Cliente() throws SQLException{
        ResultSet rs;
         rs = bd.consultaBD("select * from Clientes");//1| ta
       while(rs.next()){//2| n(tc)
           System.out.print(rs.getInt(1)+" ");
           System.out.print(rs.getString(2)+" ");
           System.out.print(rs.getString(3)+" ");
           System.out.print(rs.getString(4)+" ");
           System.out.print(rs.getString(5)+" ");
           System.out.print(rs.getString(6)+" ");
           System.out.println(" ");
           //T = ta + ntc
       }
    }
    public  ResultSet consultaTabla(String sql) throws SQLException{
        
        return bd.consultaBD(sql);
    }
}
