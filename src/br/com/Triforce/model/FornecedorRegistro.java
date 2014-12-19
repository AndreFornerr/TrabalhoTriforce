/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;

import br.com.Triforce.dados.Arquivo;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author N00
 */
public class FornecedorRegistro implements Serializable {
    
    private Map <Integer, Fornecedor> fornecedores;
    private Arquivo arqForPer;

    public FornecedorRegistro() {
    arqForPer = new Arquivo();
    fornecedores = arqForPer.getFornecedor();
    
    }
    
    public void adicionaFornecedor(int codigo,String razao,String fantasia,String cnpj, String telefone,String email){
        Fornecedor dados = new Fornecedor();
        dados.setRazao(razao);
        dados.setFantasia(fantasia);
        dados.setCnpj(cnpj);
        dados.setTelefone(telefone);
        dados.setEmail(email);
        
        
        Fornecedor put = fornecedores.put(codigo,dados);
        this.salvar();
        
        
    }
    public Set<Integer> mostrarTodosFor(){
        return fornecedores.keySet();
    }
    
    public String getRazao(int codigo){
        return fornecedores.get(codigo).getRazao();
    }
    public void setRazao(int codigo,String razao){
         fornecedores.get(codigo).setRazao(razao);
    }
    public String getFantasia(int codigo){
        return fornecedores.get(codigo).getFantasia(); 
    }
    public void setFantasia(int codigo,String fantasia){
        fornecedores.get(codigo).setFantasia(fantasia);   
    }
    public String getCnpj(int codigo){
        return fornecedores.get(codigo).getCnpj();
    }
    public void setCnpj(int codigo,String cnpj){
        fornecedores.get(codigo).setCnpj(cnpj);
    }
    public String getTelefone(int codigo){
        return fornecedores.get(codigo).getTelefone();
    }
    public void setTelefone(int codigo, String telefone){
     fornecedores.get(codigo).setTelefone(telefone);
    }
    public String getEmail(int codigo){
        return fornecedores.get(codigo).getEmail();
    }
    public void setEmail(int codigo,String email){
         fornecedores.get(codigo).setEmail(email);
    }
    public void salvar() {
        arqForPer.salvarFornecedor(fornecedores);
    }
    
    public int retornaMap(){
        return fornecedores.size();
    }
}
