/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.bancodedados;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author aj_un
 */
<<<<<<< HEAD
public class ConexaoDAO{
    public Connection conexaodao(){
        Connection conn = null;
        // 192.168.18.165
        try {
            String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10667929?user=sql10667929&password=ITlAAuv14Z";
=======
public class ConexaoDAO {
    public Connection conexaodao(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://192.168.18.165:3306/urnaeletronica?user=root&passoword=";
>>>>>>> b2e51846350cecd28786440f31539bf99e7aeba0
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDao "+erro);
        }
        
        return conn;
    }

}