package Gstore.config;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class SQLdata {
    public static ConexionBD CON = new ConexionBD();
    
    lambda lam = new lambda();
    
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    
    public static int resultado_numero = 0;
    
    
    //REGISTRAR USUARIO
    public String monto(int idproducto){
        Connection conexion=null;
        String mostrar = null;
        
        try {
            conexion = CON.conectar();
            String resultado = ("select precio from productos where idproductos = '"+idproducto+"'");
            sentencia_preparada = conexion.prepareStatement(resultado);
            ResultSet rs = sentencia_preparada.executeQuery();
            
        if(rs.next()){
            mostrar = lam.valorMONTO(rs.getString(idproducto));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return mostrar;
    }
}
