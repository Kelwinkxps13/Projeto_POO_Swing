package br.edu.bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Connection conn;
   

    public ResultSet autenticacaoUsuario(User objusuariodto) {
        conn = new ConexaoDAO().conexaodao();

        try {
            String sql = ("SELECT * FROM usuarios WHERE email = ? AND senha = ?");

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getEmail());
            pstm.setString(2, objusuariodto.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO (autenticação): " + error);
            return null;
        }

    }
    
    
    public void cadastrarUsuario(UsuarioDTO objusuariodto) {
        PreparedStatement pstm;
        String sql = "insert into usuarios (nome, email, senha, votosA, votosB, votosC, votosBranco, votosNulo, votosEx) values (?,?,?,0,0,0,0,0,0)";

        conn = new ConexaoDAO().conexaodao();

        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getCriar_nome_usuario());
            pstm.setString(2, objusuariodto.getCriar_email_usuario());
            pstm.setString(3, objusuariodto.getCriar_senha_usuario());

            pstm.execute();
            pstm.close();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO (cadastrar)" + error);
        }
    }
    
    
    
    
    
    public ResultSet checarUsuarioExistente(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conexaodao();
        
        try {
            String sql = "select * from usuarios where email = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getCriar_email_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO (checagem): " + error);
            return null;
        }
    }
    
}
