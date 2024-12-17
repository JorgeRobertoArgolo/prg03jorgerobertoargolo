/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 * Classe JPQL é responsável por realizar consultas no banco de dados
 * utilizando a API JPA (Java Persistence API) e a linguagem de consulta JPQL.
 * 
 * <p>Esta classe contém métodos para:</p>
 * <ul>
 *   <li>Listar todos os cursos ativos.</li>
 *   <li>Listar todos os cursos armazenados no banco.</li>
 * </ul>
 * 
 * @author rober
 */

public class JPQL {
    /**
     * Fábrica de gerenciadores de entidade (EntityManagerFactory).
     * É configurada com base na unidade de persistência 
     * "gerenciamento_curso" definida no arquivo persistence.xml.
     */
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory(
                    "gerenciamento_curso");
    
    /**
     * Recupera todos os cursos ativos (onde o atributo <code>ativo</code> é <code>true</code>)
     * no banco de dados.
     * 
     * <p>O método executa uma consulta JPQL para buscar os cursos ativos e armazena os 
     * resultados em uma lista de objetos {@link Curso}.</p>
     * 
     * @return Uma lista de cursos ativos. Retorna uma lista vazia caso nenhum curso seja encontrado.
     * @throws RuntimeException Se ocorrer algum erro durante a execução da consulta.
     */
    public static List<Curso> listAllAtive() {
        /**
        * Gerenciador de entidades (EntityManager).
        * Responsável por realizar operações de busca no banco de dados.
        */
        
        EntityManager entityManager = null;
        List<Curso> cursos = null;
                
        try {
            entityManager = entityManagerFactory.createEntityManager();
            cursos = entityManager.createQuery("select c from Curso as c where c.ativo = true").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar cursos ativos: " + e.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        
        return cursos;
    }
    
    /**
     * Recupera todos os cursos armazenados no banco de dados.
     * 
     * <p>O método executa uma consulta JPQL para buscar todos os registros da entidade
     * {@link Curso} e armazena os resultados em uma lista.</p>
     * 
     * @return Uma lista com todos os cursos. Retorna uma lista vazia caso nenhum curso seja encontrado.
     * @throws RuntimeException Se ocorrer algum erro durante a execução da consulta.
     */
    public static List<Curso> listAll() {
        /**
        * Gerenciador de entidades (EntityManager).
        * Responsável por realizar operações de busca no banco de dados.
        */
        
        EntityManager entityManager = null;
        List<Curso> cursos = null;
                
        try {
            entityManager = entityManagerFactory.createEntityManager();
            cursos = entityManager.createQuery("select c from Curso c").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar cursos : " + e.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        
        return cursos;
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