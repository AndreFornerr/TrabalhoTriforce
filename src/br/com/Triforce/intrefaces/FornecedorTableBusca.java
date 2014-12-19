/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.com.Triforce.model.FornecedorRegistro;

/**
 *
 * @author André
 */
public class FornecedorTableBusca extends AbstractTableModel{
private final FornecedorRegistro tabelaForn;
private final int codigo;
private final String[] colunas = {"Codigo","Razão Social","Nome Fantasia","CNPJ","Telefone","Email"};

private final int CODIGO = 0 ;
private final int RAZAO = 1 ;
private final int FANTASIA = 2 ;
private final int CNPJ = 3 ;
private final int TELEFONE = 4 ;
private final int EMAIL = 5 ;
public FornecedorTableBusca(FornecedorRegistro fornReg,int cod){
    tabelaForn = fornReg;
    this.codigo = cod ;
}
    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case RAZAO:
                 return tabelaForn.getRazao(codigo);
            case  FANTASIA:
                   return tabelaForn.getFantasia(codigo);
            case CNPJ:
                    return tabelaForn.getCnpj(codigo);
            case TELEFONE:
                    return tabelaForn.getTelefone(codigo);
            case EMAIL:
                return tabelaForn.getEmail(codigo);         
    }
        return codigo;
    }
    @Override 
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
   @Override 
   public Class<?>getColumnClass (int columnIndex){
       return String.class;
   }
   
   @Override
   public boolean isCellEditable(int rowIndex,int columnIndex){
       boolean  edit = true;
       if(columnIndex == CODIGO){
           edit = false;
       }
       return edit;
   }
   @Override
    public void setValueAt(Object aValue,int rowIndex, int columnIndex) {
        switch(columnIndex){
            case RAZAO:
                 tabelaForn.setRazao(codigo,(String)aValue);
                break;
            case  FANTASIA:
                    tabelaForn.setFantasia(codigo,(String)aValue);
                 break;
            case CNPJ:
                     tabelaForn.setCnpj(codigo,(String)aValue);
                 break;
            case TELEFONE:
                     tabelaForn.setTelefone(codigo,(String)aValue);
                 break;
            case EMAIL:
                 tabelaForn.setEmail(codigo,(String)aValue); 
                 break;
    }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
   
}
