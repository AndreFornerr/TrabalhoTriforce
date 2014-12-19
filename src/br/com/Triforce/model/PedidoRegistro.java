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
public class PedidoRegistro implements Serializable {

    private Map<Integer, Pedido> pedidos;
    private Arquivo arqPedidoPers;
    private int cod;

    public PedidoRegistro() {
        arqPedidoPers = new Arquivo();
        pedidos = arqPedidoPers.getPedidos();

    }

    public void adicionarPedido(int cod, int codProd, int codForn, String dta1, String dta2, int saldo, char baixa) {
        Pedido dados = new Pedido();
        dados.setCodProd(codProd);
        dados.setCodForn(codForn);
        dados.setDtaLcto(dta1);
        dados.setDtaRev(dta2);
        dados.setSaldo(saldo);
        dados.setBaixa(baixa);

        Pedido put = pedidos.put(cod, dados);
        this.salvar();

    }

    public void salvar() {
        arqPedidoPers.salvarPedido(pedidos);
    }

    public int retornMap() {
        return pedidos.size();
    }

    public Set<Integer> MostratTodos() {
        return pedidos.keySet();
    }

    public int getCodProd(int codigo) {
        return pedidos.get(codigo).getCodProd();
    }

    public void setCodProd(int codigo, int codProd) {
        pedidos.get(codigo).setCodProd(codProd);
    }

    public int getCodForn(int codigo) {
        return pedidos.get(codigo).getCodForn();
    }

    public void setCodForn(int codigo, int codForn) {
        pedidos.get(codigo).setCodProd(codForn);
    }

    public String getDtaLcto(int codigo) {
        return pedidos.get(codigo).getDtaLcto();
    }

    public void setDtaLcto(int codigo, String lcto) {
        pedidos.get(codigo).setDtaLcto(lcto);
    }

    public String getDtaRev(int codigo) {
        return pedidos.get(codigo).getDtaRev();
    }

    public void setDtaRev(int codigo, String rev) {
        pedidos.get(codigo).setDtaRev(rev);
    }

    public char getBaixar(int codigo) {
        return pedidos.get(codigo).getBaixa();
    }

    public void setBaixar(int codigo, char baixa) {
        pedidos.get(codigo).setBaixa(baixa);
    }

    public int getSaldo(int codigo) {
        return pedidos.get(codigo).getSaldo();
    }

    public void setSaldo(int codigo, int saldo) {
        pedidos.get(codigo).setSaldo(saldo);
    }
    
    public void removeMap(int codigo){
        pedidos.remove(codigo);
    }
    public void verificaMap(int codigo){
        
    }
}
