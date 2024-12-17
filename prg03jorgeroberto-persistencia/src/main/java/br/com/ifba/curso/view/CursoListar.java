/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

import br.com.ifba.curso.CursoDelete;
import br.com.ifba.curso.CursoFind;
import br.com.ifba.curso.CursoSave;
import br.com.ifba.curso.CursoUpdate;
import br.com.ifba.curso.JPQL;
import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rober
 */
public class CursoListar extends javax.swing.JFrame {

    /**
     * Creates new form CursoListar
     */
    
    /**
     * Modelo da tabela utilizado para exibir os dados dos cursos.
     * Colunas: ID, Nome, Código do Curso e Ativo.
     */
    private DefaultTableModel tabela = new DefaultTableModel(new Object[]{"ID", "Nome", "Código Curso", "Ativo"}, 0);
    
    /**
     * Armazena a linha selecionada na tabela.
     */
    private int linhaSelecionada;
    
    /**
     * Construtor padrão da classe. Inicializa os componentes da interface e a tabela.
     */
    public CursoListar() {
        initComponents();
        initTable();
    }
    
     /**
     * Inicializa a tabela preenchendo-a com os dados de todos os cursos armazenados no banco.
     * 
     * <p>O método utiliza o serviço {@link JPQL#listAll()} para buscar todos os cursos
     * e os insere no modelo da tabela.</p>
     */
    public void initTable () {
        List<Curso> cursos = JPQL.listAll();
        for (Curso curso : cursos) {
            tabela.addRow(new Object[]{curso.getId(), curso.getNome(), curso.getCodigoCurso(), curso.isAtivo()});
        }
        tableCurso.setModel(tabela);
    }
    
    /**
     * Atualiza os dados da tabela, garantindo que as informações exibidas estejam sincronizadas
     * com os dados do banco de dados.
     * 
     * <p>O método limpa todas as linhas existentes na tabela e recarrega os dados chamando 
     * novamente {@link JPQL#listAll()}.</p>
     */
    public void updateTable () {
        tabela.setRowCount(0);
        
        List<Curso> cursos = JPQL.listAll();
        for (Curso curso : cursos) {
            tabela.addRow(new Object[]{curso.getId(), curso.getNome(), curso.getCodigoCurso(), curso.isAtivo()});
        }
        tableCurso.setModel(tabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabelaCurso = new javax.swing.JScrollPane();
        tableCurso = new javax.swing.JTable();
        btnAEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        lblTextoLinhaSelecionada = new javax.swing.JLabel();
        lblLinhaSelecionada = new javax.swing.JLabel();
        txtProcurar = new javax.swing.JTextField();
        lblTextoBuscarCurso = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tableCurso.setModel(tabela);
        tableCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCursoMouseClicked(evt);
            }
        });
        panelTabelaCurso.setViewportView(tableCurso);

        btnAEditar.setText("Edite");
        btnAEditar.setToolTipText("");
        btnAEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAEditarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lblTextoLinhaSelecionada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTextoLinhaSelecionada.setText("Linha Selecionada :");

        lblLinhaSelecionada.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLinhaSelecionada.setText("0");

        txtProcurar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtProcurar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProcurarKeyPressed(evt);
            }
        });

        lblTextoBuscarCurso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTextoBuscarCurso.setText("Informe o ID do Curso");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoBuscarCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(22, 22, 22)
                        .addComponent(lblTextoLinhaSelecionada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLinhaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTabelaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionar)
                            .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoLinhaSelecionada)
                            .addComponent(lblLinhaSelecionada)
                            .addComponent(lblTextoBuscarCurso)
                            .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(45, 45, 45)
                        .addComponent(btnAdicionar)
                        .addGap(51, 51, 51)
                        .addComponent(btnRemover)
                        .addGap(45, 45, 45)
                        .addComponent(btnAEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(panelTabelaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Método acionado ao clicar no botão "Remover". 
    * 
    * <p>Este método realiza as seguintes etapas:</p>
    * <ul>
    *   <li>Verifica se uma linha da tabela foi selecionada.</li>
    *   <li>Exibe uma mensagem de confirmação para o usuário.</li>
    *   <li>Se confirmado, exclui o curso com base no ID selecionado e atualiza a tabela.</li>
    *   <li>Notifica o usuário com mensagens de sucesso, erro ou cancelamento.</li>
    * </ul>
    * 
    * @param evt Evento acionado pela interface ao clicar no botão "Remover".
    */
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        if (linhaSelecionada >= 0) {
            int resposta = JOptionPane.showConfirmDialog(
            null, "Tem certeza que deseja excluir ?",
            "Alerta", JOptionPane.WARNING_MESSAGE);
            
            if (resposta == JOptionPane.YES_OPTION) {
                long idItem = (long) tabela.getValueAt(linhaSelecionada, 0);
                CursoDelete.delete(idItem);
                JOptionPane.showMessageDialog(
                null, "Curso Excluido!",
                "Notificação", JOptionPane.INFORMATION_MESSAGE);
                this.updateTable();
            } else {
                JOptionPane.showMessageDialog(
                null, "Operação Cancelada",
                "Notificação", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(
            null, "Nenhum Curso foi selecionado!",
            "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    /**
    * Evento acionado quando o botão 'Adicionar' é clicado.
    * Este método cria uma nova instância da janela 'CursoCadastro' e a torna visível,
    * permitindo ao usuário adicionar um novo curso.
    *
    * @param evt O evento que representa o clique no botão.
    */
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        CursoCadastro adicionarCurso = new CursoCadastro(this);
        adicionarCurso.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    /**
    * Método acionado ao clicar em uma linha da tabela de cursos.
    * 
    * <p>Este método realiza as seguintes operações:</p>
    * <ul>
    *   <li>Obtém o índice da linha selecionada na tabela.</li>
    *   <li>Atualiza o rótulo (label) com o número da linha selecionada, ajustado para iniciar em 1.</li>
    * </ul>
    * 
    * @param evt Evento do tipo {@code MouseEvent} acionado pelo clique do mouse.
    */
    private void tableCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCursoMouseClicked
        linhaSelecionada = tableCurso.getSelectedRow();
        lblLinhaSelecionada.setText(Integer.toString(linhaSelecionada + 1));
    }//GEN-LAST:event_tableCursoMouseClicked

    /**
    * Método acionado ao clicar no botão de editar.
    * 
    * <p>Este método realiza as seguintes operações:</p>
    * <ul>
    *   <li>Verifica se há uma linha selecionada na tabela.</li>
    *   <li>Se uma linha for selecionada, obtém o ID do curso da linha selecionada e abre a janela de edição do curso.</li>
    *   <li>Se nenhuma linha for selecionada, exibe uma mensagem de alerta informando o usuário.</li>
    * </ul>
    * 
    * @param evt Evento do tipo {@code ActionEvent} acionado ao clicar no botão de editar.
    */
    private void btnAEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAEditarActionPerformed
        if (linhaSelecionada >= 0) {
            long idItem = (long) tabela.getValueAt(linhaSelecionada, 0);
            CursoEditar editarCurso = new CursoEditar(this, idItem);
            editarCurso.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(
                null, "Nenhum Curso foi selecionado para edição!",
                "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAEditarActionPerformed

    private void txtProcurarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcurarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcurarKeyPressed

    /**
    * Evento acionado quando o botão de busca é pressionado.
    * 
    * <p>Este método realiza as seguintes operações:</p>
    * <ul>
    *   <li>Obtém o ID do curso a partir do campo de texto {@code txtProcurar}.</li>
    *   <li>Tenta encontrar o curso correspondente no banco de dados utilizando o método {@code CursoFind.find(id)}.</li>
    *   <li>Se o curso for encontrado, exibe uma caixa de diálogo mostrando os detalhes do curso, como ID, nome, código e status.</li>
    *   <li>Se o curso não for encontrado, exibe uma mensagem de alerta informando que o curso não foi encontrado.</li>
    * </ul>
    * 
    * @param evt O evento de clique do botão que acionou o método.
    */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        long id = Integer.parseInt(txtProcurar.getText());
        Curso curso = CursoFind.find(id);
        if (curso != null) {
            JOptionPane.showMessageDialog(
                null, "Curso Encontrado\n" + 
                        "\nID : " + curso.getId() +
                        "\nNome : " + curso.getNome() +
                        "\nCodigo Curso : " + curso.getCodigoCurso() +
                        "\nStatus : " + curso.isAtivo(),
                "Encontrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                null, "Curso Nao Encontrado",
                "Encontrado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
    * Evento acionado quando a janela está prestes a ser fechada.
    * 
    * <p>Este método realiza as seguintes operações:</p>
    * <ul>
    *   <li>Fecha a {@code EntityManagerFactory} de todos os módulos relacionados à persistência de dados.</li>
    *   <li>Chama o método {@code closeEntityManagerFactory} das classes {@code CursoSave}, {@code CursoDelete}, {@code CursoFind}, 
    *       {@code CursoUpdate} e {@code JPQL} para garantir que os recursos do gerenciador de entidades sejam liberados corretamente.</li>
    * </ul>
    * 
    * @param evt O evento de fechamento da janela.
    */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        CursoSave.closeEntityManagerFactory();
        CursoDelete.closeEntityManagerFactory();
        CursoFind.closeEntityManagerFactory();
        CursoUpdate.closeEntityManagerFactory();
        JPQL.closeEntityManagerFactory();
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JButton btnAEditar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel lblLinhaSelecionada;
    private javax.swing.JLabel lblTextoBuscarCurso;
    private javax.swing.JLabel lblTextoLinhaSelecionada;
    private javax.swing.JScrollPane panelTabelaCurso;
    private javax.swing.JTable tableCurso;
    private javax.swing.JTextField txtProcurar;
    // End of variables declaration//GEN-END:variables
}
