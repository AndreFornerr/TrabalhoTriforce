/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;

import java.io.Serializable;

/**
 *
 * @author angelo
 */
public class Funcionario extends Pessoa implements Serializable{
    private String usuario;
    private String senha;
    
    public void setUsuario(String user) {
        this.usuario = user;
    }
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setSenha(String pass) {
        this.senha = pass;
    }
    
    public String getSenha() {
        return this.senha;
    }
}
