/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainApp.Botones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author calde
 */
public class CConexion {
    Connection conectar = null;
    
    String usuario = "userSQL";
    String pass = "admin";
    String bd = "compiladoresDB";
    String ip = "localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion()
    {
        try{
            String cadena = "jdbc:sqlserver://localhost:" + puerto + ";" + "databaseName=" + bd + ";" + "IntegratedSecurity=true;" + "encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadena,usuario,pass);
            JOptionPane.showMessageDialog(null, "Conexion realizada de manera correcta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos. \n" + e.toString()) ;
            System.out.println(e.toString());
        }
        return conectar;
    }
}
