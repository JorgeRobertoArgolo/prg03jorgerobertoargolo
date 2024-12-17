/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.curso;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe {@code CursoSave} é responsável por salvar uma entidade {@code Curso}
 * no banco de dados utilizando a API JPA (Java Persistence API).
 *
 * <p>Esta classe realiza as seguintes operações:</p>
 * <ul>
 *     <li>Configura uma fábrica de gerenciadores de entidade ({@code EntityManagerFactory}).</li>
 *     <li>Cria um gerenciador de entidades ({@code EntityManager}).</li>
 *     <li>Realiza a persistência (inserção) do objeto {@code Curso} no banco de dados.</li>
 *     <li>Garante o fechamento adequado dos recursos utilizados.</li>
 * </ul>
 * 
 * <p>O método {@code closeEntityManagerFactory()} deve ser chamado ao final da aplicação 
 * para liberar os recursos do {@code EntityManagerFactory}.</p>
 * 
 * @author rober
 */
public class CursoSave {
    
    /**
     * Fábrica de gerenciadores de entidade (EntityManagerFactory).
     * É configurada com base na unidade de persistência 
     * "gerenciamento_curso" definida no arquivo persistence.xml.
     */
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory(
                    "gerenciamento_curso");
    
    /**
     * Salva a entidade {@code Curso} no banco de dados.
     *
     * <p>Este método realiza as seguintes etapas:</p>
     * <ul>
     *     <li>Cria uma instância de {@code EntityManager} para gerenciar a persistência.</li>
     *     <li>Inicia uma transação com {@code getTransaction().begin()}.</li>
     *     <li>Persiste o objeto {@code Curso} no banco de dados.</li>
     *     <li>Confirma a transação com {@code commit()}.</li>
     *     <li>Em caso de erro, realiza o rollback da transação.</li>
     * </ul>
     *
     * <p><b>Tratamento de erros:</b> Se ocorrer alguma exceção durante a persistência, a transação
     * será revertida utilizando o método {@code rollback()}, e os detalhes do erro serão impressos.</p>
     * 
     * <p><b>Liberação de recursos:</b> O {@code EntityManager} é fechado no bloco {@code finally}
     * para evitar vazamentos de recursos.</p>
     *
     * @param curso O objeto {@code Curso} a ser salvo no banco de dados.
     * @throws IllegalArgumentException Se o objeto {@code curso} for {@code null}.
     */
    public static void save(Curso curso) {
        
        /**
        * Gerenciador de entidades (EntityManager).
        * Responsável por realizar operações de persistência no banco de dados.
        */
        EntityManager entityManager = null;
        
        try {
            if (curso == null) {
                throw new IllegalArgumentException("O objeto Curso não pode ser nulo.");
            }
            entityManager = entityManagerFactory.createEntityManager();
            //Salvando Curso
            entityManager.getTransaction().begin();  // Inicia a transação
            entityManager.persist(curso);            // Salva o objeto Curso
            entityManager.getTransaction().commit(); // Confirma a transação
        } catch (Exception e){
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
     * Método que deve ser chamado para fechar o EntityManagerFactory 
     * ao final da aplicação.
     */
    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}