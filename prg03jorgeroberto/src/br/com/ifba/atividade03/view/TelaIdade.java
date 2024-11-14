/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade03.view;

import java.time.LocalDate;

/**
 *
 * @author Roberto
 */
public class TelaIdade extends javax.swing.JFrame {

    /**
     * Creates new form TelaIdade
     */
    public TelaIdade() {
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

        lblTextoAnoNascimento = new javax.swing.JLabel();
        spnAnoNascimento = new javax.swing.JSpinner();
        btnCalcularIdade = new javax.swing.JButton();
        lblTextoIdade = new javax.swing.JLabel();
        lblResultadoIdade = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTextoAnoNascimento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTextoAnoNascimento.setText("Ano De Nacimento");

        spnAnoNascimento.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, null, 1));

        btnCalcularIdade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCalcularIdade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/atividade03/images/calculadora.png"))); // NOI18N
        btnCalcularIdade.setText("Calcular");
        btnCalcularIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIdadeActionPerformed(evt);
            }
        });

        lblTextoIdade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTextoIdade.setText("Idade");

        lblResultadoIdade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblResultadoIdade.setText("0");

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/atividade03/images/usuario.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTextoIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblResultadoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTextoAnoNascimento)
                                .addGap(18, 18, 18)
                                .addComponent(spnAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnCalcularIdade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblImagem))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoAnoNascimento)
                    .addComponent(spnAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnCalcularIdade)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoIdade)
                    .addComponent(lblResultadoIdade)))
            .addComponent(lblImagem)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
    * Calcula a idade com base no ano de nascimento informado.
    * Se o ano de nascimento for inválido (maior que o ano
    * atual), exibe uma mensagem de erro.
    * @param evt o evento de ação disparado pelo botão calcular idade
    */
    private void btnCalcularIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIdadeActionPerformed
        // TODO add your handling code here: 
        int anoNascimento = Integer.parseInt(spnAnoNascimento.getValue().toString());
        LocalDate dataAtual = LocalDate.now();
        
        if (dataAtual.getYear() >= anoNascimento) {
            int idade = dataAtual.getYear() - anoNascimento;
            lblResultadoIdade.setText(Integer.toString(idade));
        } else {
            lblResultadoIdade.setText("Ano de nascimento inválido!");
        }
    }//GEN-LAST:event_btnCalcularIdadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIdade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularIdade;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblResultadoIdade;
    private javax.swing.JLabel lblTextoAnoNascimento;
    private javax.swing.JLabel lblTextoIdade;
    private javax.swing.JSpinner spnAnoNascimento;
    // End of variables declaration//GEN-END:variables
}