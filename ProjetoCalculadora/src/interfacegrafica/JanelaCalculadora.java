/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;
import classededados.Calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class JanelaCalculadora extends javax.swing.JFrame {
    Calculadora objeto = null;
    /**
     * Creates new form JanelaCalculadora
     */
    public JanelaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldDigito1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDigito2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jButtonAdição = new javax.swing.JButton();
        jButtonSubtração = new javax.swing.JButton();
        jButtonMultiplicação = new javax.swing.JButton();
        jButtonDivisão = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();
        jButtonPotência = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela Calculadora");

        jLabel1.setText("Digito 1º");

        jLabel2.setText("Digito 2º");

        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaida);

        jButtonAdição.setText("Adição");
        jButtonAdição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdiçãoActionPerformed(evt);
            }
        });

        jButtonSubtração.setText("Subtração");
        jButtonSubtração.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtraçãoActionPerformed(evt);
            }
        });

        jButtonMultiplicação.setText("Multiplicação");
        jButtonMultiplicação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicaçãoActionPerformed(evt);
            }
        });

        jButtonDivisão.setText("Divisão");
        jButtonDivisão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisãoActionPerformed(evt);
            }
        });

        jButtonRaiz.setText("Raiz");
        jButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizActionPerformed(evt);
            }
        });

        jButtonPotência.setText("Potência");
        jButtonPotência.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotênciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDigito1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldDigito2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButtonAdição)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubtração))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonRaiz)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPotência)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonMultiplicação)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDivisão)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldDigito1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDigito2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdição)
                    .addComponent(jButtonSubtração))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonMultiplicação)
                            .addComponent(jButtonDivisão))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRaiz)
                            .addComponent(jButtonPotência))))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdiçãoActionPerformed
        // TODO add your handling code here:
        try {
            Calculadora objeto = new Calculadora();
            
            float num1 = Float.parseFloat(jTextFieldDigito1.getText());
            float num2 = Float.parseFloat(jTextFieldDigito2.getText());
            
            objeto.setNum1(num1);
            objeto.setNum2(num2);
            
            String saida = "A soma é: " + objeto.adiconar();
            
            jTextAreaSaida.setText(saida);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonAdiçãoActionPerformed

    private void jButtonSubtraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtraçãoActionPerformed
        // TODO add your handling code here:
        try {
            Calculadora objeto = new Calculadora();
            float num1 = Float.parseFloat(jTextFieldDigito1.getText());
            float num2 = Float.parseFloat(jTextFieldDigito2.getText());
            
            objeto.setNum1(num1);
            objeto.setNum2(num2);
            
            String saida = "A subtração é: " + objeto.subtrair();
            
            jTextAreaSaida.setText(saida);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonSubtraçãoActionPerformed

    private void jButtonMultiplicaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicaçãoActionPerformed
        // TODO add your handling code here:
        try {
            Calculadora objeto = new Calculadora();
            float num1 = Float.parseFloat(jTextFieldDigito1.getText());
            float num2 = Float.parseFloat(jTextFieldDigito2.getText());
            
            objeto.setNum1(num1);
            objeto.setNum2(num2);
            
            String saida = "A multiplicação é: " + objeto.multiplicar();
            
            jTextAreaSaida.setText(saida);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonMultiplicaçãoActionPerformed

    private void jButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizActionPerformed
        // TODO add your handling code here:
        try {
            Calculadora objeto = new Calculadora();
            
            float num1 = Float.parseFloat(jTextFieldDigito1.getText());
            float num2 = Float.parseFloat(jTextFieldDigito2.getText());
            
            objeto.setNum1(num1);
            objeto.setNum2(num2);
            
            String saida = "A Raiz é: " + objeto.calcularRaiz();
            
            
            jTextAreaSaida.setText(saida);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonRaizActionPerformed

    private void jButtonDivisãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisãoActionPerformed
        // TODO add your handling code here:
        try {
            Calculadora objeto = new Calculadora();
            float num1 = Float.parseFloat(jTextFieldDigito1.getText());
            float num2 = Float.parseFloat(jTextFieldDigito2.getText());
            
            objeto.setNum1(num1);
            objeto.setNum2(num2);
            
            String saida = "A divisão é: " + objeto.dividir();
            
            jTextAreaSaida.setText(saida);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonDivisãoActionPerformed

    private void jButtonPotênciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotênciaActionPerformed
        // TODO add your handling code here:
        try {
            Calculadora objeto = new Calculadora();
            float num1 = Float.parseFloat(jTextFieldDigito1.getText());
            float num2 = Float.parseFloat(jTextFieldDigito2.getText());
            
            objeto.setNum1(num1);
            objeto.setNum2(num2);
            
            String saida = "A Potencia é: " + objeto.calcularPotencia1();
            
            jTextAreaSaida.setText(saida);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonPotênciaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdição;
    private javax.swing.JButton jButtonDivisão;
    private javax.swing.JButton jButtonMultiplicação;
    private javax.swing.JButton jButtonPotência;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonSubtração;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JTextField jTextFieldDigito1;
    private javax.swing.JTextField jTextFieldDigito2;
    // End of variables declaration//GEN-END:variables
}