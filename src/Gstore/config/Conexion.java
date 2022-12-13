
package Gstore.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/gstore";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection cx = null;
    
    public static Connection getConex(){
        
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    return cx;
    }

    com.sun.jdi.connect.spi.Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
