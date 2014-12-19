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
public class FuncionarioRegistro implements Serializable{
    
    private Map<Integer, Funcionario> funcionarios;
    private Arquivo arqFuncPer;
    
    public FuncionarioRegistro(){
        arqFuncPer = new  Arquivo();
        funcionarios = arqFuncPer.getFuncionario();
        
    }
    public void adicionaFunc(int codigo,String nome, String rg,String cpf,String email, String telefone, String endereco,String user,String senha){
        Funcionario dados = new Funcionario();
        dados.setNome(nome);
        dados.setRg(rg);
        dados.setCpf(cpf);
        dados.setEmail(email);
        dados.setTelefone(telefone);
        dados.setEndereco(endereco);
        dados.setUsuario(user);
        dados.setSenha(senha);
        Funcionario put = funcionarios.put(codigo, dados);
        this.salvar();
        
    }

    public void salvar() {
        arqFuncPer.salvarFuncionario(funcionarios);
    }
    
    public Set<Integer>mostrarTodos(){
        return funcionarios.keySet();
    }
    
    public String getNome(int codigo){
        return funcionarios.get(codigo).getNome();
    }
    public void setNome(int codigo, String nome){
         funcionarios.get(codigo).setNome(nome);
    }
    public String getRg(int codigo){
        return funcionarios.get(codigo).getRg();
    }
    public void setRg(int codigo,String rg){
      funcionarios.get(codigo).setRg(rg);
    }
    public String getEmail(int codigo){
        return funcionarios.get(codigo).getEmail();
    }
    public void setEmail(int codigo,String email){
         funcionarios.get(codigo).setEmail(email);
    }
    public String getTelefone(int codigo){
        return funcionarios.get(codigo).getTelefone();
    }
    public void setTelefone(int codigo,String telefone){
         funcionarios.get(codigo).setTelefone(telefone);
    }
    public String getEndereco(int codigo){
        return funcionarios.get(codigo).getEndereco();
    }
    public void setEndereco(int codigo,String endereco){
         funcionarios.get(codigo).setEndereco(endereco);
    }
    public String getUsuario(int codigo){
        return funcionarios.get(codigo).getUsuario();
    }
    public void setUsuario(int codigo,String user){
         funcionarios.get(codigo).setUsuario(user);
    }
    public String getCpf(int codigo){
        return funcionarios.get(codigo).getCpf();
    }
    public void setCpf(int codigo,String cpf){
         funcionarios.get(codigo).setCpf(cpf);
    }
    public String getSenha(int codigo){
        return funcionarios.get(codigo).getSenha();
    }
    
    public int retornaMap(){
        return funcionarios.size();
    }
    
}
