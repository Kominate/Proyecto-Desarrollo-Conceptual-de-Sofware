/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodcs;

/**
 *
 * @author josep
 */

import Conexion.ServicioProducto;
import  Objetos.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class ProyectoDCS {

    public static void main(String[] args) {
        ServicioProducto serv = new ServicioProducto();
        serv.insertarProducto("Frijoles", 800, 2, "Alimentos", "Inactivo");
        
        
    }
    
}
