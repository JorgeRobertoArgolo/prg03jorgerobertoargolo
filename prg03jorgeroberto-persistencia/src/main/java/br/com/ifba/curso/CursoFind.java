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
 * Classe {@code CursoFind} é responsável por buscar uma entidade {@code Curso} 
 * no banco de dados utilizando a API JPA (Java Persistence API).
 * 
 * <p>Esta classe realiza as seguintes operações:</p>
 * <ul>
 *     <li>Configura uma fábrica de gerenciadores de entidade ({@code EntityManagerFactory}).</li>
 *     <li>Cria um gerenciador de entidades ({@code EntityManager}).</li>
 *     <li>Realiza a busca de uma entidade {@code Curso} no banco de dados com base em seu identificador.</li>
 *     <li>Garante o fechamento adequado dos recursos utilizados após a operação.</li>
 * </ul>
 * 
 * @author rober
 */
public class CursoFind {
        
    /**
     * Fábrica de gerenciadores de entidade (EntityManagerFactory).
     * É configurada com base na unidade de persistência 
     * "gerenciamento_curso" definida no arquivo persistence.xml.
     */
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory(
                    "gerenciamento_curso");
    
    /**
     * Busca uma entidade {@code Curso} no banco de dados com base no identificador fornecido.
     * 
     * <p>Este método realiza as seguintes etapas:</p>
     * <ul>
     *     <li>Cria uma instância de {@code EntityManager} para gerenciar a operação.</li>
     *     <li>Inicia a transação com {@code getTransaction().begin()}.</li>
     *     <li>Busca a entidade {@code Curso} utilizando o método {@code find}.</li>
     * </ul>
     * 
     * <p><b>Tratamento de erros:</b> Em caso de erro durante a busca, a transação é revertida com {@code rollback()} 
     * e a pilha de erro é impressa.</p>
     * 
     * <p><b>Liberação de recursos:</b> O {@code EntityManager} é fechado no bloco {@code finally}, 
     * garantindo a liberação dos recursos alocados.</p>
     * 
     * @param id O identificador da entidade {@code Curso} que será buscada no banco de dados.
     * @return O objeto {@code Curso} encontrado ou {@code null} caso a entidade não exista.
     */
    public static Curso find(double id) {
        
        /**
        * Gerenciador de entidades (EntityManager).
        * Responsável por realizar operações de busca no banco de dados.
        */
        EntityManager entityManager = null;
        
        Curso cursoEncontrado = null;
        
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin(); // Inicia a transação
            cursoEncontrado = entityManager.find(Curso.class, id); //Atribui o valor encontrado a um objeto
        } catch (Exception e) {
            // Rollback em caso de erro
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
       
        return cursoEncontrado;
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