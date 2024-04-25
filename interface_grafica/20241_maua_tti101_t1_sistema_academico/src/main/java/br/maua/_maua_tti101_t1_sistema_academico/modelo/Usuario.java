    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua._maua_tti101_t1_sistema_academico.modelo;

/**
 *
 * @author 23.10260-8
 */
public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    private int tipo;
    
    //getter
    public int getCodigo(){
        return codigo;
    }
    //setter
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
