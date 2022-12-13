/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author CRISTIAN
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productos {
    private int idproductos;
    private String nombre;
    private float precio;
    private int stock;
    private String oferta;
    private int proovedor_id;
    private int categoria_id;
        
    
}
