/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josep
 */
public abstract class Servicio {

    protected Connection conexion = null;
    protected String host = "localhost";
    protected String puerto = "3306";
    protected String sid = "proyectoconceptual";
    protected String usuario = "root";
    protected String clave = "xtCE2233!";

    private void conectarABase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + puerto + "/" + sid + "?serverTimezone = UTC", usuario, clave);
        } catch (ClassNotFoundException ec) {
            ec.printStackTrace();
        } catch (SQLException eq) {
            eq.printStackTrace();
        }
    }

    protected Connection conseguirConexion() {
        try {
            if (this.conexion != null && !this.conexion.isClosed()) {
                return this.conexion;
            } else {
                this.conectarABase();
            }
        } catch (Exception e) {
        }
        return this.conexion;
    }

    protected void usarTodosCierres(Statement stmt, ResultSet rs) {
        cerrarResultSet(rs);
        cerrarSentencia(stmt);
        cerrarConexion();
    }

    protected void cerrarConexion() {
        try {
            if (conexion != null && conexion.isClosed()) {
                conexion.close();
                conexion = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void cerrarSentencia(Statement stmt) {
        try {
            if (stmt != null && stmt.isClosed()) {
                stmt.close();
                stmt = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void cerrarResultSet(ResultSet rs) {
        try {
            if (rs != null && rs.isClosed()) {
                rs.close();
                rs = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
