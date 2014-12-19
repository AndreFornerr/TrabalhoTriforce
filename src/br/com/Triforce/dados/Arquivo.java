/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author André
 */
public class Arquivo {
    
    private File arquivoProduto;
    private File arquivoCliente;
    private File arquivoFuncionario;
    private File arquivoFornecedor;
    private File arquivoPedido;
    private File arquivoExcluido;
    final private String nomeArqProd = "Prod.dat";
    final private String nomeArqCli = "Cli.dat";
    final private String nomeArqFunc = "Func.dat";
    final private String nomeArqForn = "Forn.dat";
    final private String nomeArqPed = "Ped.dat";
    final private String nomeArqExclu = "codigo.dat";
    
    
    public Arquivo(){
        
        arquivoProduto = new File(nomeArqProd);
        arquivoCliente = new File(nomeArqCli);
        arquivoFuncionario = new File(nomeArqFunc);
        arquivoFornecedor = new File(nomeArqForn);
        arquivoPedido = new File(nomeArqPed);
        arquivoExcluido = new File(nomeArqExclu);
    }
    
    //Inicio operacoes com Arquivo Produto
    public Map getProduto(){
    Map produto = null;
    if(arquivoProduto.exists()){
      try{
        produto = (Map) new ObjectInputStream(new FileInputStream(arquivoProduto)).readObject();
         }catch (IOException | ClassNotFoundException ex ){
            Logger.getLogger(Arquivo.class.getName() ).log(Level.SEVERE,"Ler Aruivo Produto",ex ); 
         }
    }else{
        produto = new  TreeMap<>();
    }
    return produto;
        
}
    
    public void salvarProd (Map mp){
        try {
             new ObjectOutputStream(new FileOutputStream (arquivoProduto)).writeObject(mp);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, "Salvando arquivo",ex);
        }
            
        
    }
    
    // inicio operaçoes com cliente
    public Map getCliente(){
    Map cliente = null;
    if(arquivoCliente.exists()){
      try{
        cliente = (Map) new ObjectInputStream(new FileInputStream(arquivoCliente)).readObject();
         }catch (IOException | ClassNotFoundException ex ){
            Logger.getLogger(Arquivo.class.getName() ).log(Level.SEVERE,"Ler Arquivo Cliente",ex ); 
         }
    }else{
        cliente = new  TreeMap<>();
    }
    return cliente;
        
}
    
    public void salvarCliente (Map mp){
        try {
             new ObjectOutputStream(new FileOutputStream (arquivoCliente)).writeObject(mp);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, "Salvando arquivo",ex);
        }
            
        
    }
    
    //inicio operaçoes com funcionario
    public Map getFuncionario(){
    Map funcionario = null;
    if(arquivoFuncionario.exists()){
      try{
        funcionario = (Map) new ObjectInputStream(new FileInputStream(arquivoFuncionario)).readObject();
         }catch (IOException | ClassNotFoundException ex ){
            Logger.getLogger(Arquivo.class.getName() ).log(Level.SEVERE,"Ler Arquivo Cliente",ex ); 
         }
    }else{
        funcionario = new  TreeMap<>();
    }
    return funcionario;
        
}
    
    public void salvarFuncionario (Map mp){
        try {
             new ObjectOutputStream(new FileOutputStream (arquivoFuncionario)).writeObject(mp);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, "Salvando arquivo",ex);
        }
            
        
    }
    
    //inicio operaçoes com funcionario
    public Map getFornecedor(){
    Map fornecedor = null;
    if(arquivoFornecedor.exists()){
      try{
        fornecedor = (Map) new ObjectInputStream(new FileInputStream(arquivoFornecedor)).readObject();
         }catch (IOException | ClassNotFoundException ex ){
            Logger.getLogger(Arquivo.class.getName() ).log(Level.SEVERE,"Ler Arquivo Cliente",ex ); 
         }
    }else{
        fornecedor = new  TreeMap<>();
    }
    return fornecedor;
        
}
    
    public void salvarFornecedor (Map mp){
        try {
             new ObjectOutputStream(new FileOutputStream (arquivoFornecedor)).writeObject(mp);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, "Salvando arquivo",ex);
        }
            
        
    }
    
    public Map getPedidos(){
    Map pedidos = null;
    if(arquivoPedido.exists()){
      try{
        pedidos = (Map) new ObjectInputStream(new FileInputStream(arquivoPedido)).readObject();
         }catch (IOException | ClassNotFoundException ex ){
            Logger.getLogger(Arquivo.class.getName() ).log(Level.SEVERE,"Ler Arquivo Pedido",ex ); 
         }
    }else{
        pedidos = new  TreeMap<>();
    }
    return pedidos;
        
}
    
    public void salvarPedido (Map mp){
        try {
             new ObjectOutputStream(new FileOutputStream (arquivoPedido)).writeObject(mp);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, "Salvando arquivo",ex);
        }
            
        
    }
    
    public Map getExcluidos(){
    Map excluidos = null;
    if(arquivoExcluido.exists()){
      try{
        excluidos = (Map) new ObjectInputStream(new FileInputStream(arquivoExcluido)).readObject();
         }catch (IOException | ClassNotFoundException ex ){
            Logger.getLogger(Arquivo.class.getName() ).log(Level.SEVERE,"Ler Arquivo Pedido",ex ); 
         }
    }else{
        excluidos = new  TreeMap<>();
    }
    return excluidos;
        
}
    
    public void salvarExcluidos(Map mp){
        try {
             new ObjectOutputStream(new FileOutputStream (arquivoExcluido)).writeObject(mp);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, "Salvando arquivo",ex);
        }
            
        
    }
    
}



