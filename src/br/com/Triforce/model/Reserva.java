/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;
import java.util.*;
/**
 *
 * @author angelo
 */
public class Reserva {
    private int codigo;
    private Date dataLcto;
    private Date dataRes;
    private boolean baixado;
    private int cliente;
    
    public void setCodigo(int cod) {
        this.codigo = cod;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setDataLcto(Date lcto) {
        this.dataLcto = lcto;
    }
    
    public Date getDataLcto() {
        return this.dataLcto;
    }
    
    public void setDataRes(Date res) {
        this.dataRes = res;
    }
    
    public Date getDataRes() {
        return this.dataRes;
    }
    
    public void setBaixado(boolean baixado) {
        this.baixado = baixado;
    }
    
    public boolean getBaixado() {
        return this.baixado;
    }
    
    public void setCliente(int cli) {
        this.cliente = cli;
    }
    
    public int getCliente() {
        return this.cliente;
    }
}
