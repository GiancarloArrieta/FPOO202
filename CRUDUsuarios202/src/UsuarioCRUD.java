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
import java.sql.ResultSet;

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
    
    public ResultSet obtenerUsuarioID(int id){
        String selectSQL = "select * from usuarios where id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException exception){
            System.out.println("Error al intentar consultar: " + exception.getMessage());
            return null;
        }
    }
    public ResultSet obtenerUsuarios(){
        String selectSQL = "select * from usuarios";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            return ps.executeQuery();
        }
        catch(SQLException exception){
            System.out.println("Error al intentar consultar: " + exception.getMessage());
            return null;
        }
    }
    
    public boolean actualizarUsuario(String id, String nombre, String correo, String contrasena){
        String sqlUpdate = "update usuarios set nombre = ?, correo = ?, contrasena = ? where id = ?;";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlUpdate);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasena);
            ps.setString(4, id);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar insertar: " + exception.getMessage());
            return false;
        }
    }
    
    public boolean eliminarUsuario(String id){
        String sqlDelete = "delete from usuarios where id = ?;";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlDelete);
            ps.setString(1, id);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar eliminar: " + exception.getMessage());
            return false;
        }
    }
}
