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
public class Pedido implements Serializable  {
    
    private String dataReserva;
    private String dataLctoP;
    private int codForn;
    private int codProd;
    private int volume;
    private int saldo;
    private double preco;
    private String titulo;
    private String autor;
    private String dataLcto;
    private String categoria;
    private char baixar;
    
    public char getBaixa(){
        return baixar;
    }
    public void setBaixa(char baixa){
        this.baixar = baixa;
    }
    public String getDtaRev(){
        return dataReserva;
    }
    public void setDtaRev(String rev){
        this.dataReserva = rev;
    }
    public String getDtaLcto(){
        return dataLctoP;
    }
    public void setDtaLcto(String lcto){
        this.dataLctoP = lcto;
    }
    public int getCodForn(){
       return codForn ;
   }
   public void setCodForn(int forn){
       this.codForn = forn;
   }
   public int getCodProd(){
       return codProd ;
   }
   public void setCodProd(int prod){
       this.codProd = prod;
   }
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
       return dataLcto ;
   }
   public void setData(String data){
       this.dataLcto = data;
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
