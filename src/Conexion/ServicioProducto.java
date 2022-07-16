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
public class ServicioProducto extends Servicio{
    
    public List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = super.conseguirConexion().createStatement();
            String sql = "SELECT * FROM producto";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodigoProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("NombreProducto"));
                producto.setPrecioProducto(rs.getDouble("PrecioProducto"));
                producto.setCantidadProducto(rs.getInt("StockProducto"));
                producto.setCategoriaProducto(rs.getString("CategoriaProducto"));
                producto.setEstadoProducto(rs.getString("EstadoProducto"));
                JOptionPane.showMessageDialog(null,"Entre");
                //JOptionPane.showMessageDialog(null,""+producto.toString());
                productos.add(producto);
            }
        } catch (SQLException e) {
        } finally {
            super.usarTodosCierres(stmt, rs);
        }
        return productos;
    }
    
    public void insertarProducto(String nombre,double precio, int cantidad, String categoria,String estado)
    {
        PreparedStatement pStmt = null;
        try {
            //stmt = super.conseguirConexion().createStatement();
            /*String sql = "INSERT INTO producto(`NombreProducto`,`PrecioProducto`,`StockProducto`,`CategoriaProducto`,`EstadoProducto`)"
                    + "VALUES('"+nombre+"',"+precio+","+cantidad+",'"+ categoria+"','"+ estado+"')";*/
            String sql = "INSERT INTO producto(`NombreProducto`,`PrecioProducto`,`StockProducto`,`CategoriaProducto`,`EstadoProducto`)"
                    + "VALUES(?,?,?,?,?)";
            pStmt = super.conseguirConexion().prepareStatement(sql);
            pStmt.setString(1, nombre);
            pStmt.setDouble(2, precio);
            pStmt.setInt(3, cantidad);
            pStmt.setString(4, categoria);
            pStmt.setString(5, estado);
            pStmt.executeUpdate();
        } catch (SQLException e) {
        } finally {
            super.cerrarSentencia(pStmt);
            super.cerrarConexion();
        }
        
        
        
    }
    
    
    
}
