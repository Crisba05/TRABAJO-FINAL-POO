
package Gstore.test;

import com.google.gson.Gson;
import Gstore.config.Conexion;
import Gstore.daoImpl.*;
import Gstore.model.*;

public class Test {
    static ProductosDaoImpl adi= new ProductosDaoImpl();
    
    static Gson gson = new Gson ();
    public static void main(String[] args) {
        conexion();
        listar();
        
    }
    
    static void conexion(){
        if(Conexion.getConex()!=null){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    static void listar(){
        System.out.println(gson.toJson(adi.readAll()));
    
    }
    
}
