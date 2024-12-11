/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class CursoListar extends javax.swing.JFrame {

    /**
     * Creates new form CursoListar
     */
    public CursoListar() {
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

        PanelMain = new javax.swing.JPanel();
        btnRemover = new javax.swing.JButton();
        txtProcurar = new javax.swing.JTextField();
        panelTabelaCurso = new javax.swing.JScrollPane();
        tableCurso = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnAEditar = new javax.swing.JButton();
        lblTextoLinhaSelecionada = new javax.swing.JLabel();
        lblLinhaSelecionada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMain.setBackground(new java.awt.Color(0, 51, 255));

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        txtProcurar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtProcurar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProcurar.setText("Procurar . . .");

        tableCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Código Curso", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelTabelaCurso.setViewportView(tableCurso);
        if (tableCurso.getColumnModel().getColumnCount() > 0) {
            tableCurso.getColumnModel().getColumn(0).setResizable(false);
            tableCurso.getColumnModel().getColumn(1).setResizable(false);
            tableCurso.getColumnModel().getColumn(2).setResizable(false);
            tableCurso.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAEditar.setText("Edite");
        btnAEditar.setToolTipText("");

        lblTextoLinhaSelecionada.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTextoLinhaSelecionada.setText("Linha Selecionada :");

        lblLinhaSelecionada.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLinhaSelecionada.setText("0");

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMainLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTextoLinhaSelecionada)
                        .addGap(14, 14, 14)
                        .addComponent(lblLinhaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addComponent(panelTabelaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoLinhaSelecionada)
                    .addComponent(lblLinhaSelecionada))
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(panelTabelaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnAdicionar)
                        .addGap(28, 28, 28)
                        .addComponent(btnRemover)
                        .addGap(18, 18, 18)
                        .addComponent(btnAEditar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 760, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(
            null, "Tem certeza que deseja excluir ?",
            "Alerta", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnRemoverActionPerformed

    /**
    * Evento acionado quando o botão 'Adicionar' é clicado.
    * Este método cria uma nova instância da janela 'CursoCadastro' e a torna visível,
    * permitindo ao usuário adicionar um novo curso.
    *
    * @param evt O evento que representa o clique no botão.
    */
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        CursoCadastro adicionarCurso = new CursoCadastro();
        adicionarCurso.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursoListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMain;
    private javax.swing.JButton btnAEditar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel lblLinhaSelecionada;
    private javax.swing.JLabel lblTextoLinhaSelecionada;
    private javax.swing.JScrollPane panelTabelaCurso;
    private javax.swing.JTable tableCurso;
    private javax.swing.JTextField txtProcurar;
    // End of variables declaration//GEN-END:variables
}