/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;

import java.io.Serializable;



/**
 *
 * @author André
 */
public class Produto implements Serializable{
    
   private int volume;
   private int saldo;
   private double preco;
   private String titulo;
   private String autor;
   private String datalcto;
   private String categoria;
   
   public int getVolume(){
       return volume ;
   }
   public void setVolume(int vol){
       this.volume = vol;
   }
   
   
   public int getSaldo(){
       return saldo ;
   }
   public void setSaldo(int saldo){
       this.saldo = saldo;
   }
   
   public String getTitulo(){
       return titulo ;
   }
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
   
   public String getAutor(){
       return autor ;
   }
   public void setAutor(String autor){
       this.autor = autor;
   }
   
   public String getData(){
       return datalcto ;
   }
   public void setData(String data){
       this.datalcto = data;
   }
   public String getCategoria(){
       return categoria ;
   }
   public void setCategoria(String categoria){
       this.categoria = categoria;
   }
   public Double getPreco(){
       return preco ;
   }
   public void setPreco(double preco){
       this.preco = preco;
   }
}

