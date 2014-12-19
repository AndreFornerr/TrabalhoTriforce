/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.com.Triforce.model.ClienteRegistro;

/**
 *
 * @author André
 */
public class ClienteTableModel extends AbstractTableModel{
private final ClienteRegistro tabelaCli;
private final List<Integer> codigo;
private final String[] colunas = {"Codigo","Nome","RG","CPF","Email","Telefone","Endereço"};

private final int CODIGO = 0 ;
private final int NOME = 1 ;
private final int RG = 2 ;
private final int CPF = 3 ;
private final int EMAIL = 4 ;
private final int TELEFONE = 5 ;
private final int ENDERECO = 6 ;

public ClienteTableModel(ClienteRegistro cliReg){
    tabelaCli = cliReg;
    codigo = new ArrayList(cliReg.mostrarTodos());
    
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
                 return tabelaCli.getNome(codigo);
            case  RG:
                   return tabelaCli.getRg(codigo);
            case CPF:
                    return tabelaCli.getCpf(codigo);
            case EMAIL:
                    return tabelaCli.getEmail(codigo);
            case TELEFONE:
                return tabelaCli.getTelefone(codigo);
            case ENDERECO:
                return tabelaCli.getEndereco(codigo);
            
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
                tabelaCli.setNome(codigo,(String)aVlaue);
                break;
            case  RG:
                    tabelaCli.setRg(codigo,(String)aVlaue);
                  break;
            case CPF:
                    tabelaCli.setCpf(codigo,(String)aVlaue);
                  break;
            case EMAIL:
                    tabelaCli.setEmail(codigo,(String)aVlaue);
                  break;
            case TELEFONE:
                 tabelaCli.setTelefone(codigo,(String)aVlaue);
                  break;
            case ENDERECO:
                 tabelaCli.setEndereco(codigo,(String)aVlaue);
                  break;
        }
      
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
