/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity; 
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.lang.reflect.ParameterizedType;
import org.springframework.stereotype.Repository; 
import org.springframework.transaction.annotation.Transactional; 

import java.util.List;

/**
 * Implementação genérica de um DAO (Data Access Object) para operações básicas de persistência.
 * 
 * Esta classe utiliza JPA para realizar operações como salvar, atualizar, deletar, 
 * e buscar entidades no banco de dados. Ela é projetada para trabalhar com qualquer 
 * entidade que estenda {@link PersistenceEntity}.
 * 
 * @param <Entity> o tipo da entidade que estende {@link PersistenceEntity}.
 */
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class GenericDao<Entity extends PersistenceEntity> implements GenericIDao<Entity>{

    @PersistenceContext
    protected EntityManager entityManager;
    
    /**
     * Salva uma nova entidade no banco de dados.
     */
    @Override
    public void save(Entity obj) {
        entityManager.persist(obj);
    }
    
    /**
     * Atualiza uma entidade existente no banco de dados.
     */
    @Override
    public void update(Entity obj) {
        entityManager.merge(obj);
    }

    /**
     * Remove uma entidade existente no banco de dados.
     */
    @Override
    public void delete(Entity obj) {
        obj = findById(obj.getId());
        entityManager.remove(obj);
    }

    /**
     * Retorna uma lista com todas as entidades do tipo especificado.
     */
    @Override
    public List<Entity> findAll() {
        return entityManager.createQuery(("from " + getTypeClass().getName())).getResultList();
    }

    /**
     * Busca uma entidade pelo seu identificador único.
     */
    @Override
    public Entity findById(Long id) {
        return (Entity) entityManager.find(getTypeClass(), id);
    }
    
    /*
     * Busca todas as entidades que possui como parte de seu nome, a string informada 
     */
    @Override
    public List<Entity> findByNome(String nome) {
        try {
            String queryString = "select c from " + getTypeClass().getSimpleName() + " c where c.nome LIKE :nome";
            Query query = entityManager.createQuery(queryString);
            query.setParameter("nome", "%" + nome + "%");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     /**
     * Obtém a classe do tipo genérico em tempo de execução.
     */
    protected Class<?> getTypeClass () {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }
}