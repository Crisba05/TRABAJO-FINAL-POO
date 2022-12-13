/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gstore.daoImpl;

import Gstore.config.Conexion;
import Gstore.dao.Operaciones;
import Gstore.model.Categorias;
import Gstore.model.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CRISTIAN
 */
public class CategoriasDaoImpl implements Operaciones<Categorias> {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Categorias t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Categorias t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Categorias read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Categorias> readAll() {
        String SQL = "select * from categorias";
        List<Categorias> list = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categorias a = new Categorias();
                a.setIdCategorias(rs.getInt("idCategorias"));
                a.setNombre(rs.getString("nombre"));
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    

    
}
