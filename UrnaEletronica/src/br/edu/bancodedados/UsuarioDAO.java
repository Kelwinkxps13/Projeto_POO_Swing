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
    
    
    
}
