/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;

/**
 *
 * @author angelo
 */
public class ProdutoReserva {
    private int reserva;
    private int produto;
    private int qtd;
    
    public void setReserva(int res) {
        this.reserva = res;
    }
    
    public int getReserva() {
        return this.reserva;
    }
    
    public void setProduto(int prod) {
        this.produto = prod;
    }
    
    public int getProduto() {
        return this.produto;
    }
    
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public int getQtd() {
        return this.qtd;
    }
}
