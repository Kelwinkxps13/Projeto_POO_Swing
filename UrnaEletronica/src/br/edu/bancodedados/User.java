/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.bancodedados;

/**
 *
 * @author aj_un
 */
public class User {
    
    protected String nome;
    protected String senha;
    protected String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
    String nome = campoNome.getText();
        String senha = campoSenha.getText();
        
        PreparedStatement pstm;
        
        Connection conn;
        String sql = "insert into login (nome_usuario, senha_usuario) values(?, ?)";
        
        conn = new ConexaoDAO().conexaodao();
        
        
        try {
            pstm = conn.prepareStatement(sql);
            
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    */

    
}
