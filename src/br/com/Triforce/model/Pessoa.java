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
public class Pessoa implements Serializable{
    private int codigo;
    private String nome;
    private String rg;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    
    public void setCodigo(int cod) {
        this.codigo = cod;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setNome(String name) {
        this.nome = name;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getRg() {
        return this.rg;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setTelefone(String tel) {
        this.telefone = tel;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setEndereco(String end) {
        this.endereco = end;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
          
}
