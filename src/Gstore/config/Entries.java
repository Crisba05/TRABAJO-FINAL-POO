
package Gstore.config;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Entries{
    public static ConexionBD conexionBD = new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    
    public static int resultado_numero = 0;
    
    //REGISTRAR USUARIO
    
    public int guardar(String username, String nombre, String apellido,
    String correo, String contraseña){
    int resultado = 0;
    Connection conexion=null;
    
    String sentencia_guardar = ("INSERT INTO usuarios (username,nombre,apellido,correo,contraseña) values(?,?,?,?,?)");
    
        try {
            conexion = conexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar); 
            sentencia_preparada.setString(1,username); 
            sentencia_preparada.setString(2,nombre); 
            sentencia_preparada.setString(3,apellido); 
            sentencia_preparada.setString(4,correo); 
            sentencia_preparada.setString(5,contraseña); 
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    
    //GUARDAR PRODUCTO
    
    public int guardarPRODUCTO(String nombre,String precio,String stock,String oferta,String proovedor_id){
    int resultado = 0;
    Connection conexion=null;
    
    String sentencia_guardar = ("INSERT INTO productos(nombre,precio,stock,oferta,proovedor_id) values(?,?,?,?,?)");
    
        try {
            conexion = conexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar); 
            sentencia_preparada.setString(1,nombre); 
            sentencia_preparada.setString(2,precio); 
            sentencia_preparada.setString(3,stock); 
            sentencia_preparada.setString(4,oferta); 
            sentencia_preparada.setString(5,proovedor_id);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    
     //MODIFICAR PRODUCTO
    
    public int modificarPRODUCTO(String nombre,String precio,String stock,String oferta,String proovedor_id,String idproductos){
    int resultado = 0;
    Connection conexion=null;
    
    String sentencia_guardar = ("UPDATE productos SET nombre = (?), precio = (?), stock = (?), oferta=(?) , proovedor_id = (?) WHERE (idproductos = (?))");
    
        try {
            conexion = conexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar); 
            sentencia_preparada.setString(1,nombre); 
            sentencia_preparada.setString(2,precio); 
            sentencia_preparada.setString(3,stock); 
            sentencia_preparada.setString(4,oferta); 
            sentencia_preparada.setString(5,proovedor_id);
            sentencia_preparada.setString(6,idproductos);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    
    //INGRESAR USUARIO
    public String cargar(String username, String contraseña){
        Connection conexion=null;
        String cargar_usuario = null;
        
        try {
            conexion = conexionBD.conectar();
            String buscar_usuario = ("select username, contraseña from usuarios where username = '"+username+"' && contraseña = '"+contraseña+"'");
            sentencia_preparada = conexion.prepareStatement(buscar_usuario);
            ResultSet rs = sentencia_preparada.executeQuery();
            
        if(rs.next()){
            cargar_usuario = "usuario existente";}
        else{cargar_usuario = "usuario Inexistente";}
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return cargar_usuario;
        }
        
        
    //NOMBRE DE BIENVENIDA
    public static String buscarNombre(String username){
            String buscar_nombre = null;
            Connection conexion = null; 
            try{
                    conexion = conexionBD.conectar();
                    String sentencia_buscar = ("SELECT nombre,apellidos FROM usuarios WHERE username = '" + username + "'");
                    sentencia_preparada = conexion.prepareStatement(sentencia_buscar); resultado = sentencia_preparada.executeQuery();
                if (resultado.next()) {
                        String nombre = resultado.getString("nombre");
                        String apellidos = resultado.getString("apellidos");
                            buscar_nombre = (nombre + " " + apellidos);
                        conexion.close();}
            }
            catch(Exception e){
                System.out.println(e);}
            
        return buscar_nombre;
    }
}
