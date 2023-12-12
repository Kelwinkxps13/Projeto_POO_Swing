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
        String sql = "insert into Usuarios (nome_usuario,senha_usuario) values (?,?)";

        conn = new ConecSQL().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getCriar_nome_usuario());
            pstm.setString(2, objusuariodto.getCriar_senha_usuario());

            pstm.execute();
            pstm.close();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO (cadastrar)" + error);
        }
    }
    
    
    
}
