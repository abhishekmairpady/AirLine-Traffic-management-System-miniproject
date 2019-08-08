/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

/**
 *
 * @author Abhishek
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("java.sql.Driver");
            String path="jdbc:mysql://localhost/jdc";
            String user="root";
            String pass="password";
            Connection conn=DriverManager.getConnection(path,user,pass);
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        } 
        }
    }
    
       
    

