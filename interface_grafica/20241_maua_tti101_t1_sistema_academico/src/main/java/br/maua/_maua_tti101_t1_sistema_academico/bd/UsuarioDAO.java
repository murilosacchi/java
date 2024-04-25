/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua._maua_tti101_t1_sistema_academico.bd;

import br.maua._maua_tti101_t1_sistema_academico.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author 23.10260-8
 */
public class UsuarioDAO {
    public boolean existe(Usuario u) throws Exception{ 
        //1. especificar o comando SQL (SELECT) 
        String sql = "SELECT * FROM tb_usuario_t1 WHERE login = ? AND senha = ?";
        //2. estabelecer uma conexão com o banco de dados
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        //5. executar o comando
        ResultSet rs = ps.executeQuery();
        //6. lidar com o resultado 
        boolean achou = rs.next();
        //7. fechar a conexão
        conexao.close();
        //8. devolver o resultado obtido da base
        return achou;
    }
}                        
