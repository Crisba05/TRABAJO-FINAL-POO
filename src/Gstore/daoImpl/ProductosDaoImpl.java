/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gstore.daoImpl;

import Gstore.config.Conexion;
import Gstore.dao.Operaciones;
import Gstore.model.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductosDaoImpl implements Operaciones<Productos> {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Productos t) {
        int x = 0;
        String SQL = "insert into productos(nombre,precio,stock,oferta,proovedor_id,categoria_id) values(?,?,?,?,?,?)";
        try {

            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, t.getNombre());
            ps.setFloat(2, t.getPrecio());
            ps.setInt(3, t.getStock());
            ps.setString(4, t.getOferta());
            ps.setInt(5, t.getProovedor_id());
            ps.setInt(6, t.getCategoria_id());
            x = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return x;
    }
    @Override
    public int update(Productos t) {
        int x = 0;
        String SQL = "update productos set nombre = ?, precio = ?, stock = ?, oferta = ?, proovedor_id = ?,categoria_id = ?, where idproductos = ?";
        try {

            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, t.getNombre());
            ps.setFloat(2, t.getPrecio());
            ps.setInt(3, t.getStock());
            ps.setString(4, t.getOferta());
            ps.setInt(5, t.getProovedor_id());
            ps.setInt(6, t.getCategoria_id());
            ps.setInt(7, t.getIdproductos());
            x = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return x;
    }

    @Override
    public int delete(int id) {
        int x = 0;
        String SQL = "delete from productos where idproductos = ?";
        try {

            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return x;
    }
    @Override
    public Productos read(int id) {
        String SQL = "select * from productos where idproductos = ?";
        Productos a = new Productos();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                a.setIdproductos(rs.getInt("idproductos"));
                a.setNombre(rs.getString("nombre"));
                a.setPrecio(rs.getFloat("precio"));
                a.setStock(rs.getInt("stock"));    
                a.setOferta(rs.getString("oferta")); 
                a.setProovedor_id(rs.getInt("proovedor_id")); 
                a.setCategoria_id(rs.getInt("categoria_id")); 
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return a;
    }

    @Override
    public List<Productos> readAll() {
        String SQL = "select *from productos";
        List<Productos> datos = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);            
            rs = ps.executeQuery();
            while(rs.next()){
                Productos a = new Productos();
                a.setIdproductos(rs.getInt("idproductos"));
                a.setNombre(rs.getString("nombre"));
                a.setPrecio(rs.getFloat("precio"));
                a.setStock(rs.getInt("stock"));    
                a.setOferta(rs.getString("oferta")); 
                a.setProovedor_id(rs.getInt("proovedor_id")); 
                a.setCategoria_id(rs.getInt("categoria_id")); 
                datos.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return datos;
        
        
        
    }
    
}
