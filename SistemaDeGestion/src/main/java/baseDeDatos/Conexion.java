package baseDeDatos;
import Objetos.Clientes;

import java.sql.*;
import java.util.Scanner;

public class Conexion {

    String driver = "com.mysql.jdbc.Driver";
    String link = "jdbc:mysql://localhost:3306/sistema";
    Connection conexion = null;

    public void add(Clientes cliente) {

        try {
            conexion = DriverManager.getConnection(link,"root","");
            PreparedStatement pst = conexion.prepareStatement("insert into registro values (?,?,?) ");
            pst.setString(1,"0");
            pst.setString(2,cliente.getNombre());
            pst.setInt(3,cliente.getNumero());
            pst.executeUpdate();
            System.out.println("funco");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}