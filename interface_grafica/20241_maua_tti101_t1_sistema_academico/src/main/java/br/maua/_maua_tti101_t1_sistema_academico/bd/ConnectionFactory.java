/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua._maua_tti101_t1_sistema_academico.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author 23.10260-8
 */
public class ConnectionFactory {

    private String host = "mysql-1542a601-teladelogin.b.aivencloud.com";
    private String port = "24374";
    private String db = "defaultdb";
    private String user = "avnadmin";
    private String password = "AVNS_mEviFbuUI95pzyqCgVA";

    public Connection obterConexao() throws Exception {
        // jdbc:mysql://host:port/db - isso é uma string de conexão
        // catch or declare

        var stringConexao = String.format(
                "jdbc:mysql://%s:%s/%s", host, port, db);
        Connection conexao = DriverManager.getConnection(stringConexao, user, password);
        return conexao;
    }
}
