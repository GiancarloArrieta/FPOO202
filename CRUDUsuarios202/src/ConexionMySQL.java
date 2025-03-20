/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/dbpoo?serverTimezone=UTC"; //cuida el nombre de la BD
    private static final String USUARIO = "root"; // Cambia esto si tienes otro usuario
    private static final String CONTRASENA = "plasma320"; // Pon tu contraseña aquí en workbeach

    public static Connection conectar() {
        
        Connection conex = null;
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el driver
            conex = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexion exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontro el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("🚨 Error en la conexion: " + e.getMessage());
            e.printStackTrace();
        }
        return conex;
    }
    
}
