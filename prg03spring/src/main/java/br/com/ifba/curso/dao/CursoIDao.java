/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericIDao;

/**
 * Interface DAO específica para a entidade {@link Curso}.
 * 
 * Extende a interface genérica {@link GenericIDao} para realizar operações de persistência
 * com objetos da classe {@link Curso}.
 */
public interface CursoIDao extends GenericIDao<Curso>{
    
}