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
public class ProdutoEstoque implements Serializable {
    
    private Map<Integer, Produto> produtos;
    private Arquivo arqProdPer;
    private int codigo;
    public ProdutoEstoque(){
        
       arqProdPer = new Arquivo();
       produtos = arqProdPer.getProduto();
    }
    
    public void adicionaProduto(int codigo,String titulo,int volume,String autor,String datalcto,String categoria,double preco,int saldo ){
        
            Produto dados = new Produto ();
            dados.setTitulo(titulo);
            dados.setVolume(volume);
            dados.setAutor(autor);
            dados.setData(datalcto);
            dados.setCategoria(categoria);
            dados.setPreco(preco);
            dados.setSaldo(saldo);
            
            Produto put = produtos.put(codigo, dados);
            this.salvar();
    }
     
     
     public Set<Integer> mostraTodos(){
         return produtos.keySet();
     }
     
     public String getTitulo(int codigo){
         return produtos.get(codigo).getTitulo();
     }
     public void setTitulo(int codigo, String titulo){
         produtos.get(codigo).setTitulo(titulo);
     }
     public int getVolume(int codigo){
         return produtos.get(codigo).getVolume();
     }
     public void setVolume(int codigo, int volume){
         produtos.get(codigo).setVolume(volume);
     }
     
     public String getAutor(int codigo){
         return produtos.get(codigo).getAutor();
     }
     public void setAutor(int codigo ,String autor){
         produtos.get(codigo).setAutor(autor);
     }
     public String getData(int codigo){
         return produtos.get(codigo).getData();
     }
     public void setData(int codigo,String data){
         produtos.get(codigo).setData(data);
     }
     public String getCategoria(int codigo){
         return produtos.get(codigo).getCategoria();
     }
     public void setCategoria (int codigo,String categoria){
         produtos.get(codigo).setCategoria(categoria);
     }
      public double getPreco(int codigo){
         return produtos.get(codigo).getPreco();
     }
      public void setPreco(int codigo, double preco){
          produtos.get(codigo).setPreco(preco);
      }
     public int getSaldo(int codigo){
         return produtos.get(codigo).getSaldo();
     }
     public void setSaldo (int codigo,int saldo){
         produtos.get(codigo).setSaldo(saldo);
     }
     
     public void salvar() {
        arqProdPer.salvarProd(produtos);
    }
     
     public int retornoMap(){
         return produtos.size();
     }
     public void removeMap(int cod){
         produtos.remove(cod);
     }
     
     public void setCodigo(int cod){
         this.codigo = cod;
     }
     
     public int getCodigo(){
         return this.codigo;
     }
}
