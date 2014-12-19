/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;

import br.com.Triforce.dados.Arquivo;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author André
 */
public class CodigoExcluidoRegistro implements Serializable{
    private Map<Integer, CodigoExcluido> excluidos;
    private Arquivo arqExcluidoPer;
    
    public CodigoExcluidoRegistro(){
        arqExcluidoPer = new Arquivo();
        excluidos = arqExcluidoPer.getExcluidos();
        
    }
    public void adicionarExcluidos(int codigo,int forn,int prod,int ped,int func, int cli,int venda){
        CodigoExcluido dados = new CodigoExcluido();
        dados.setForn(forn);
        dados.setPed(ped);
        dados.setProd(prod);
        dados.setFunc(func);
        dados.setCli(cli);
        dados.setVenda(venda);
        
        CodigoExcluido put = excluidos.put(codigo, dados);
        this.salvar();
    }

    public int getForn(int codigo){
        return excluidos.get(codigo).getForn();
    }
    public void setForn(int codigo, int forn){
         excluidos.get(codigo).setForn(forn);
    }
    public int getProd(int codigo){
        return excluidos.get(codigo).getProd();
    }
    public void setProd(int codigo, int prod){
         excluidos.get(codigo).setProd(prod);
    }
    public int getPed(int codigo){
        return excluidos.get(codigo).getPed();
    }
    public void setPed(int codigo, int ped){
         excluidos.get(codigo).setForn(ped);
    }
    public int getFunc(int codigo){
        return excluidos.get(codigo).getFunc();
    }
    public void setFunc(int codigo, int func){
         excluidos.get(codigo).setForn(func);
    }
    public int getCli(int codigo){
        return excluidos.get(codigo).getCli();
    }
    public void setCli(int codigo, int cli){
         excluidos.get(codigo).setCli(cli);
    }
    public int getVenda(int codigo){
        return excluidos.get(codigo).getVenda();
    }
    public void setVenda(int codigo, int ven){
         excluidos.get(codigo).setVenda(ven);
    }
    public void salvar() {
    }
}
