/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class Conexion {
    //imcorporar libreria SQL
    private static String driver = "com.mysql.jdbc.Driver";
    //nombre de la base de datos
    private static String database = "bdTrasefor";
    // servidor
    private static String hostname = "asdasd";
    //puerto
    private static String port = "3306";
    //usuario
    private static String username = "root";
    
    private static String password = "123456789";
    //url de conexion a la base de datos
    private static String connectionURL;
    //conector
    public static Connection conn;
    
    public Conexion(){
        this.connectionURL = "jdbc:mysql://"+hostname+ ":" +port+ "/" + database;
        this.getconnection();
    }
    
    public static Connection getconnection(){
        try {
            Class.forName(driver);
            try {
            conn = DriverManager.getConnection(connectionURL,username,password);
            } catch(SQLException ex){
            System.out.println("Error al crear conector: "+ ex.getMessage());
            }
    } catch(ClassNotFoundException ex) {
    
    }
    return conn;
}
}
