
package Gstore.config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ConexionBD 
{
    String DRIVER = "com.mysql.jdbc.Driver";
    String USUARIO = "root";
    String PASSWORD = "";
    String URL = "jdbc:mysql://localhost:3306/gstore";
    
    
    
    static Connection con;
    
  
    public ConexionBD()
    {
        con=null;
        try 
        {
           Class.forName(DRIVER);
           con=(Connection) DriverManager.getConnection(URL,USUARIO,PASSWORD);
           //JOptionPane.showMessageDialog(null, "Conexión establecida");
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error de conexión "+e.getMessage());
        }
    }
    public Connection conectar()            
    {
        return con;
    }
    
    public void desconectar()
    {
        con=null;
        if(con == null)
           JOptionPane.showMessageDialog(null,"conexión terminada"); 
    }
}
