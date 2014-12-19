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
public class CodigoExcluido  implements Serializable {
    private int codigoProd;
    private int codigoForn;
    private int codigoPed;
    private int codigoFunc;
    private int codigoCli;
    private int codigoVenda;
    
    public int getProd(){
        return codigoProd;
    }
    public void setProd(int prod){
        this.codigoProd = prod;
    }
    public int getForn(){
        return codigoForn;
    }
    public void setForn(int forn){
        this.codigoForn = forn;
    }
    public int getFunc(){
        return codigoFunc;
    }
    public void setFunc(int func){
        this.codigoFunc = func;
    }
    public int getPed(){
        return codigoPed;
    }
    public void setPed(int ped){
        this.codigoPed = ped;
    }
    public int getCli(){
        return codigoCli;
    }
    public void setCli(int cli){
        this.codigoCli = cli;
    }
    public int getVenda(){
        return codigoVenda;
    }
    public void setVenda(int ven){
        this.codigoVenda = ven;
    }
}
