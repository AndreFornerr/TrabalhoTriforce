/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;

import java.io.Serializable;

/**
 *
 * @author N00
 */
public class Fornecedor implements Serializable{
    private String razaosocial;
    private String nomefan;
    private String cnpj;
    private String telefone;
    private String email;
    
    public String getRazao(){
        return razaosocial;
    }
    public void setRazao(String razao){
        
        this.razaosocial = razao;
    }
    
    public String getFantasia(){
        return nomefan;
    }
    public void setFantasia(String fantasia){
        
        this.nomefan = fantasia;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        
        this.cnpj = cnpj;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        
        this.email = email;
    }
}
