/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import br.com.Triforce.model.PedidoRegistro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author André
 */
public class PedidoTableModel extends AbstractTableModel{
    private final PedidoRegistro tabelaPed;
    private final List<Integer>codigo;
    private final String[] colunas ={"Codigo","Codigo Fornecedor","Codigo Produto","Quantidade","Data Lcto","Data Prevista","Baixado" };
    
    private final int CODIGO = 0;
    private final int CODIGOFORN = 1;
    private final int CODIGOPROD = 2;
    private final int QTD = 3;
    private final int DTALCTO = 4;
    private final int DATAPREVISTA = 5;
    private final int BAIXADO = 6;
    
    
    public PedidoTableModel(PedidoRegistro ped) {
        this.tabelaPed = ped;
        this.codigo = new ArrayList(ped.MostratTodos());
        
    }
    
    
    @Override
    public int getRowCount() {
        return codigo.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Integer codigo = this.codigo.get(rowIndex);
        switch(columnIndex){
            case CODIGOFORN:
                return tabelaPed.getCodForn(codigo);
            case DTALCTO:
                return tabelaPed.getDtaLcto(codigo);
            case DATAPREVISTA:
                return tabelaPed.getDtaRev(codigo);
            case BAIXADO:
                   return tabelaPed.getBaixar(codigo);
            case QTD:
                return tabelaPed.getSaldo(codigo);
            case CODIGOPROD:
                return tabelaPed.getCodProd(codigo);
       }
        return codigo;
    }
    @Override 
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    public Integer getCodigo(int linha){
          return codigo.get(linha);
      }
   
}
