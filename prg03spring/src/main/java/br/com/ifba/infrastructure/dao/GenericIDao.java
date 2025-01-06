/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import java.util.List;

/**
 * Interface genérica para operações básicas de persistência.
 * 
 * Define métodos padrão para salvar, atualizar, deletar, buscar todos os registros
 * e buscar registros por ID. Pode ser implementada por classes específicas para 
 * diferentes tipos de entidades.
 * 
 * @param <Entity> o tipo da entidade que estende {@link PersistenceEntity}.
 */
public interface GenericIDao<Entity extends PersistenceEntity> {
    
    public abstract void save(Entity obj);
    
    public abstract void update(Entity obj);

    public abstract void delete(Entity obj);
    
    public abstract List<Entity> findAll();
    
    public abstract Entity findById(Long id);
    
    public abstract List<Entity> findByNome(String nome);
}