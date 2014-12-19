/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author angelo
 */
public class Geral extends javax.swing.JDialog {
    
    protected int tag = 0;

    public Geral() {
        initComponents();
    }
    
    public void abreJanela(Geral janela, int tag){
        janela.setTag(tag);
        janela.setModal(true);
        janela.setVisible(true);
    }
    
    public void setTag(int tag){
        this.tag = tag;
    }
    
    public void percorreComponents() {
        //Todos os componentes do Painel do Frame  
        Component components[] = getContentPane().getComponents();  
        //Para cada componente  
        for (int i = 0; i < components.length; i++) {  
           //É campo de texto?  
            if (components[i] instanceof JTextField) {  
                //Está preenchido?  
                if (((JTextField) components[i]).getText().isEmpty()) {  
                    //Não, então exibo mensagem de erro  
                    JOptionPane.showMessageDialog(null, "Preencher todos os campos");  
                    break;  
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("geral");
        setName("frameGeral"); // NOI18N
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
