/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;


import javax.swing.table.AbstractTableModel;
import br.com.Triforce.model.ProdutoEstoque;

/**
 *
 * @author André
 */
public class ProdutoTableBusca extends AbstractTableModel{
    private final ProdutoEstoque tabelaProd;
    private final int codigo;
private final String[] colunas = {"Codigo","Titulo","Volume","Autor","Data","Categoria","Preco","Saldo"};

private final int CODIGO = 0 ;
private final int TITULO = 1 ;
private final int VOLUME = 2 ;
private final int AUTOR = 3 ;
private final int DATA = 4 ;
private final int CATEGORIA = 5 ;
private final int PRECO = 6 ;
private final int SALDO = 7 ;

public ProdutoTableBusca(ProdutoEstoque prod,int codigo){
    tabelaProd = prod;
    this.codigo = codigo;
    
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
            case TITULO:
                 return tabelaProd.getTitulo(codigo);
            case  VOLUME:
                   return tabelaProd.getVolume(codigo);
            case AUTOR:
                    return tabelaProd.getAutor(codigo);
            case DATA:
                    return tabelaProd.getData(codigo);
            case CATEGORIA:
                return tabelaProd.getCategoria(codigo);
            case PRECO:
                return tabelaProd.getPreco(codigo);
            case SALDO:
                return tabelaProd.getSaldo(codigo);
    }
        return codigo;
    }
    
    @Override 
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
  
  @Override 
   public Class<?>getColumnClass (int columnIndex){
       switch(columnIndex){
           case VOLUME:
           case SALDO:
            return Integer.class;
           case PRECO:
               return Double.class;
       }
       
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
   public void setValueAt (Object aValue,int rowIndex,int columnIndex){
    switch(columnIndex){
        case TITULO:
            tabelaProd.setTitulo(codigo,(String) aValue);
            break;
        case  VOLUME:
            tabelaProd.setVolume(codigo,(int)aValue);
            break;
        case AUTOR:
            tabelaProd.setAutor(codigo,(String)aValue);
            break;
        case DATA:
            tabelaProd.setData(codigo,(String)aValue);
            break;
        case CATEGORIA:
            tabelaProd.setCategoria(codigo,(String)aValue);
            break;
        case PRECO:
            tabelaProd.setPreco(codigo,(double)aValue);
            break;
        case SALDO:
            tabelaProd.setSaldo(codigo,(int)aValue);
            break;
    }   
       fireTableCellUpdated(rowIndex, columnIndex);
   }
    
}
