/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class MySqlConnector {
    Connection con = null;
    
    public Connection connect(){
    
        String db = "jdbc:mysql://localhost/formulario";
        String user = "root";
        String password = "";
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(db, user, password);
            
            JOptionPane.showMessageDialog(null, "¡Base de Datos Conectada!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡Error! Base de Datos");
        }
        return con;
    }
}
