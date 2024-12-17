/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe {@code CursoDelete} é responsável por deletar uma entidade {@code Curso} 
 * do banco de dados utilizando a API JPA (Java Persistence API).
 * 
 * <p>Esta classe realiza as seguintes operações:</p>
 * <ul>
 *     <li>Configura uma fábrica de gerenciadores de entidade ({@code EntityManagerFactory}).</li>
 *     <li>Cria um gerenciador de entidades ({@code EntityManager}).</li>
 *     <li>Realiza a transação para deletar o objeto {@code Curso} no banco de dados.</li>
 *     <li>Garante o fechamento adequado dos recursos utilizados após a operação.</li>
 * </ul>
 * 
 * <p>O método {@code delete} recebe o identificador da entidade {@code Curso} a ser removida.</p>
 * 
 * @author rober
 */
public class CursoDelete {
    /**
     * Fábrica de gerenciadores de entidade (EntityManagerFactory).
     * É configurada com base na unidade de persistência 
     * "gerenciamento_curso" definida no arquivo persistence.xml.
     */
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory(
                    "gerenciamento_curso");
    
     /**
     * Deleta uma entidade {@code Curso} do banco de dados com base no identificador fornecido.
     * 
     * <p>Este método realiza as seguintes etapas:</p>
     * <ul>
     *     <li>Cria uma instância de {@code EntityManager} para gerenciar a operação.</li>
     *     <li>Inicia a transação com {@code getTransaction().begin()}.</li>
     *     <li>Localiza a entidade {@code Curso} no banco de dados usando o método {@code find}.</li>
     *     <li>Remove a entidade localizada utilizando o método {@code remove}.</li>
     *     <li>Confirma a transação com {@code getTransaction().commit()}.</li>
     * </ul>
     * 
     * <p><b>Tratamento de erros:</b> Em caso de exceção, a transação é revertida com {@code rollback()} 
     * e a pilha de erro é impressa.</p>
     * 
     * <p><b>Liberação de recursos:</b> O {@code EntityManager} é fechado no bloco {@code finally}, 
     * garantindo que os recursos sejam liberados corretamente.</p>
     * 
     * @param id O identificador único da entidade {@code Curso} a ser removida do banco de dados.
     */
    public static void delete(long id) {
        /**
        * Gerenciador de entidades (EntityManager).
        * Responsável por realizar operações de persistência no banco de dados.
        */
        EntityManager entityManager = null;
        
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin(); // Inicia a transação
            Curso cursoEncontrado = entityManager.find(Curso.class, id); //Atribui o valor encontrado a um objeto
            entityManager.remove(cursoEncontrado); // Remove o objeto Curso
            entityManager.getTransaction().commit(); // Confirma a transação
        } catch (Exception e) { //Rollback em caso de erro
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally { 
            //Fechando Recursos
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    /**
     * Fecha a instância do {@code EntityManagerFactory}.
     * 
     * <p>Este método deve ser chamado ao final da aplicação para liberar os recursos 
     * associados ao {@code EntityManagerFactory}.</p>
     */
    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
