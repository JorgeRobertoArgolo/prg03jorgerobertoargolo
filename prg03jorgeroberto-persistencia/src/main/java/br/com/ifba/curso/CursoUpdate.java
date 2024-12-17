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
 * Classe CursoUpdate é responsável por atualizar uma entidade Curso 
 * no banco de dados utilizando a API JPA (Java Persistence API).
 * 
 * <p>Esta classe realiza as seguintes operações:</p>
 * <ul>
 *   <li>Configura uma fábrica de gerenciadores de entidade (EntityManagerFactory).</li>
 *   <li>Cria um gerenciador de entidades (EntityManager).</li>
 *   <li>Realiza a transação para atualizar o objeto Curso no banco de dados.</li>
 *   <li>Garante o fechamento dos recursos utilizados após a operação.</li>
 * </ul>
 * 
 * @author rober
 */
public class CursoUpdate {
    /**
     * Fábrica de gerenciadores de entidade (EntityManagerFactory).
     * É configurada com base na unidade de persistência 
     * "gerenciamento_curso" definida no arquivo persistence.xml.
     */
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory(
                    "gerenciamento_curso");
    
     /**
     * Atualiza uma entidade {@link Curso} existente no banco de dados.
     * 
     * <p>Este método utiliza a operação <code>merge</code> da JPA para atualizar 
     * os dados do objeto Curso. Caso ocorra algum erro durante a operação, 
     * uma tentativa de <code>rollback</code> da transação será realizada.</p>
     * 
     * @param curso O objeto {@link Curso} com os dados atualizados.
     *              Não deve ser <code>null</code>.
     * @throws IllegalArgumentException Caso o parâmetro <code>curso</code> seja <code>null</code>.
     */
    public static void update(Curso curso) {
        
        if (curso == null) {
                throw new IllegalArgumentException("O objeto Curso não pode ser nulo.");
        }  
        
        /**
        * Gerenciador de entidades (EntityManager).
        * Responsável por realizar operações de busca no banco de dados.
        */
       EntityManager entityManager = null;
        
        try {  
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();  // Inicia a transação
            entityManager.merge(curso);              // Atualiza o objeto Curso
            entityManager.getTransaction().commit(); // Confirma a transação
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
    }
    
    /**
     * Fecha a fábrica de gerenciadores de entidade (EntityManagerFactory).
     * 
     * <p>Este método deve ser chamado ao final da aplicação para liberar os 
     * recursos alocados pela fábrica de gerenciadores de entidade.</p>
     */
    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
