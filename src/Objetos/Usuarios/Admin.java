/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos.Usuarios;

/**
 *
 * @author josep
 */
public class Admin extends Persona{
    
    private String contrasena;

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    @Override
    public String toString() {
        return "Admin{" + "contrasena=" + contrasena + '}';
    }
    
    
    
    
    
}
