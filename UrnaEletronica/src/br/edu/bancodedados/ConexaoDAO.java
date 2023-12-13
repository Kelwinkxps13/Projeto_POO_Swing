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
public class ConexaoDAO{
    public Connection conexaodao(){
        Connection conn = null;
        // 192.168.18.165
        try {
            String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10669860?user=sql10669860&password=dPvlAtAmq6";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDao "+erro);
        }
        
        return conn;
    }

}