/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import javax.swing.JOptionPane;
import pilha.PilhaVetor;

public class ViewCalculadora extends javax.swing.JFrame {

    public ViewCalculadora() {
        initComponents();
        //btCalcular.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCalcular1 = new javax.swing.JButton();
        lbExpressao = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        btnVetor = new javax.swing.JButton();
        inputExpressao = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        btnLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        limparBtn = new javax.swing.JButton();

        btCalcular1.setText("Calcular");
        btCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcular1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        lbExpressao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbExpressao.setText("Expressão");

        lbResultado.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbResultado.setText("Resultado");

        btnVetor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnVetor.setText("Calcular via PilhaVetor");
        btnVetor.setToolTipText("calcula o resultado da expressão via vetor de pilhas");
        btnVetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVetorActionPerformed(evt);
            }
        });

        inputExpressao.setText("1 2 -4 5 + *");
        inputExpressao.setToolTipText("expressão deve ter formato pós-fixada");

        resultado.setEditable(false);

        btnLista.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnLista.setText("Calcular via PilhaLista");
        btnLista.setToolTipText("calcula o resultado da expressão via lista encadeada de pilhas");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("    \n    Olá! Aqui você encontra uma calculadora diferente! Funciona assim:\n\n    Digitando sua expressão na forma de notação pós-fixa*, o cálculo \n    pode ser feito via um vetor de pilhas (navegação pelo índice do\n    vetor) ou uma lista encadeada de pilhas (cada elemento tem seus ponteiros).\n    Você decide!\n\n   * Exemplos de Notação pós-fixa:\n\n    Expressão (1-2)*(4+5) em notação pós-fixa 1 2 -4 5 + *\n\n    Expressão ((23+12)/7)*(5+(3-12)) em notação pós-fixa 23 12 + 7 / 3 12 –5 + *");
        jScrollPane1.setViewportView(jTextArea1);

        limparBtn.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        limparBtn.setText("Limpar");
        limparBtn.setToolTipText("limpar resultado");
        limparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbExpressao)
                                        .addGap(344, 344, 344))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(inputExpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbResultado)
                                .addComponent(btnVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(limparBtn)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbExpressao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputExpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVetor)
                    .addComponent(btnLista))
                .addGap(33, 33, 33)
                .addComponent(lbResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limparBtn)
                .addGap(75, 75, 75))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVetorActionPerformed
        String result = "Resultado via Vetor de pilhas: ";
        try {
            Calculadora calculadora = new Calculadora();
            double expressao = calculadora.Vetor(inputExpressao.getText());
            result += Double.toString(expressao);
            resultado.setText(result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnVetorActionPerformed

    private void btCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcular1ActionPerformed
    }//GEN-LAST:event_btCalcular1ActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        String result = "Resultado via Lista Encadeada de pilhas: ";
        try {
            Calculadora calculadora = new Calculadora();
            double expressao = calculadora.Lista(inputExpressao.getText());
            result += Double.toString(expressao);
            resultado.setText(result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }    }//GEN-LAST:event_btnListaActionPerformed

    private void limparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtnActionPerformed
        resultado.setText("");
    }//GEN-LAST:event_limparBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular1;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnVetor;
    private javax.swing.JTextField inputExpressao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbExpressao;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JButton limparBtn;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
