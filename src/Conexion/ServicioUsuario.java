/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Objetos.Producto;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class ServicioUsuario extends Servicio{
    
    public void insertarNAdministrador(String correo, String clave){
      PreparedStatement pStmt = null;
      try{
      String sql = "INSERT INTO administrador(`Contrasena`,`CorreoAdmin`) VALUE(?,?)";
      pStmt = super.conseguirConexion().prepareStatement(sql);
      pStmt.setString(1, clave);
      pStmt.setString(2, correo);
      
      pStmt.executeUpdate();
      }catch(SQLException s){
      s.printStackTrace();
      }finally{
      super.cerrarSentencia(pStmt);
      super.cerrarConexion();
    }
        
    }
    
}
