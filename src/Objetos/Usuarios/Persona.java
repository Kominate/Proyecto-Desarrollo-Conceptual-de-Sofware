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
public abstract class Persona {

    protected int identificacion;
    protected String nombre;
    protected String apellidoA;
    protected String apellidoB;
    protected String correo;

    public Persona() {
    }

    public Persona(String nombre, String apellidoA, String apellidoB, String correo) {
        this.nombre = nombre;
        this.apellidoA = apellidoA;
        this.apellidoB = apellidoB;
        this.correo = correo;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoA() {
        return apellidoA;
    }

    public void setApellidoA(String apellidoA) {
        this.apellidoA = apellidoA;
    }

    public String getApellidoB() {
        return apellidoB;
    }

    public void setApellidoB(String apellidoB) {
        this.apellidoB = apellidoB;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
