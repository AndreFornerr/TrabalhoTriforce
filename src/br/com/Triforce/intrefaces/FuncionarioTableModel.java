/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.com.Triforce.model.FuncionarioRegistro;

/**
 *
 * @author André
 */
public class FuncionarioTableModel extends AbstractTableModel{
private final FuncionarioRegistro tabelafunc;
private final List <Integer> codigo;
private final String[] colunas = {"Codigo","Nome","RG","CPF","Email","Telefone","Endereço","User"};

private final int CODIGO = 0 ;
private final int NOME = 1 ;
private final int RG = 2 ;
private final int CPF = 3 ;
private final int EMAIL = 4 ;
private final int TELEFONE = 5 ;
private final int ENDERECO = 6 ;
private final int USER = 7 ;

    public FuncionarioTableModel(FuncionarioRegistro funcForn){
        tabelafunc = funcForn;
        codigo = new ArrayList(funcForn.mostrarTodos());
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
            case NOME:
                 return tabelafunc.getNome(codigo);
            case  RG:
                   return tabelafunc.getRg(codigo);
            case CPF:
                    return tabelafunc.getCpf(codigo);
            case EMAIL:
                    return tabelafunc.getEmail(codigo);
            case TELEFONE:
                return tabelafunc.getTelefone(codigo);
            case ENDERECO:
                return tabelafunc.getEndereco(codigo);
            case USER:
                return tabelafunc.getUsuario(codigo);
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
    public void setValueAt(Object aVlaue,int rowIndex, int columnIndex) {
         Integer codigo = this.codigo.get(rowIndex);
        switch(columnIndex){
            case NOME:
                tabelafunc.setNome(codigo,(String)aVlaue);
                break;
            case  RG:
                    tabelafunc.setRg(codigo,(String)aVlaue);
                  break;
            case CPF:
                    tabelafunc.setCpf(codigo,(String)aVlaue);
                  break;
            case EMAIL:
                    tabelafunc.setEmail(codigo,(String)aVlaue);
                  break;
            case TELEFONE:
                 tabelafunc.setTelefone(codigo,(String)aVlaue);
                  break;
            case ENDERECO:
                 tabelafunc.setEndereco(codigo,(String)aVlaue);
                  break;
            case USER:
                 tabelafunc.setUsuario(codigo,(String)aVlaue);
                 break;
        }
      
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
}
