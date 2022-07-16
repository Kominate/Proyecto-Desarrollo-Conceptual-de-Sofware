/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author josep
 */
public class Producto {
    
   
    private int codigoProducto;
    private String nombreProducto;
    private double precioProducto;
    private int cantidadProducto;
    private String categoriaProducto;
    private String estadoProducto;

    public Producto() {
    }

    public Producto(int codigoProducto, String nombreProducto, double precioProducto, int cantidadProducto, String categoriaProducto, String estadoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.categoriaProducto = categoriaProducto;
        this.estadoProducto = estadoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", cantidadProducto=" + cantidadProducto + ", categoriaProducto=" + categoriaProducto + ", estadoProducto=" + estadoProducto + '}';
    }
    
    
    
    
    
}
