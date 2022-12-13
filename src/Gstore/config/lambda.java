package Gstore.config;
public class lambda {
    
    
    public String valorMONTO(String monto){
        ModificarCadena valor = (t) ->  "S/. " + t + ".00";
        String mostrar = valor.ejecutar(monto);
        
        return mostrar;
    }
    
    interface ModificarCadena{
    String ejecutar(String texto);}
}
