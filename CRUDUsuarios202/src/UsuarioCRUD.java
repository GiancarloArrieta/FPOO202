/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elin
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioCRUD {
    private Connection conexion;
    
    public UsuarioCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean crearUsuario(String nombre, String correo, String contrasena){
        String sqlInsert = "INSERT INTO usuarios(nombre, correo, contrasena) VALUE (?,?,?);";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasena);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar insertar: " + exception.getMessage());
            return false;
        }
    }
}
