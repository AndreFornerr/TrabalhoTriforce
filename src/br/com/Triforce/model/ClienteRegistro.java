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
 * @author André
 */
public class ClienteRegistro implements Serializable{
    private Map<Integer,Cliente> clientes ;
    private Arquivo arqCliPer;
    
    public ClienteRegistro(){
        arqCliPer = new Arquivo();
        clientes = arqCliPer.getCliente();
        
    }
    public void adicionaCli(int codigo,String nome, String rg,String cpf,String email, String telefone, String endereco){
        Cliente dados = new Cliente();
        dados.setNome(nome);
        dados.setRg(rg);
        dados.setCpf(cpf);
        dados.setEmail(email);
        dados.setTelefone(telefone);
        dados.setEndereco(endereco);
        Cliente put = clientes.put(codigo, dados);
        this.salvar();
        
    }

    public void salvar() {
        arqCliPer.salvarCliente(clientes);
    }
    
    public Set<Integer>mostrarTodos(){
        return clientes.keySet();
    }
    
    public String getNome(int codigo){
        return clientes.get(codigo).getNome();
    }
    public void setNome(int codigo, String nome){
         clientes.get(codigo).setNome(nome);
    }
    public String getRg(int codigo){
        return clientes.get(codigo).getRg();
    }
    public void setRg(int codigo,String rg){
      clientes.get(codigo).setRg(rg);
    }
    public String getEmail(int codigo){
        return clientes.get(codigo).getEmail();
    }
    public void setEmail(int codigo,String email){
         clientes.get(codigo).setEmail(email);
    }
    public String getTelefone(int codigo){
        return clientes.get(codigo).getTelefone();
    }
    public void setTelefone(int codigo,String telefone){
      clientes.get(codigo).setTelefone(telefone);
    }
    public String getEndereco(int codigo){
        return clientes.get(codigo).getEndereco();
    }
    public void setEndereco(int codigo,String endereco){
         clientes.get(codigo).setEndereco(endereco);
    }
    public String getCpf(int codigo){
        return clientes.get(codigo).getCpf();
    }
    public void setCpf(int codigo,String cpf){
         clientes.get(codigo).setCpf(cpf);
    }
   
    
    public int retornaMap(){
        return clientes.size();
    }
}
