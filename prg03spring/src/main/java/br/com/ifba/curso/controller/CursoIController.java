/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import java.util.List;

/** 
 * Interface de controle para operações relacionadas à entidade Curso. 
 * 
 * Esta interface define os métodos para manipulação e consulta de cursos, 
 * incluindo operações de criação, atualização, exclusão e busca por critérios 
 * específicos, como ID ou nome. 
 */
public interface CursoIController {
    /**
     * Recupera todos os cursos disponíveis no sistema.
     *
     * @return uma lista contendo todos os cursos.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract List<Curso> findAll() throws RuntimeException;
    
    /**
     * Salva um novo curso no sistema.
     *
     * @param curso o curso a ser salvo.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     * @throws IllegalArgumentException se o nome ou código do curso estiverem vazios.
     */
    public abstract void save(Curso curso) throws RuntimeException;
    
    /**
     * Atualiza as informações de um curso existente.
     *
     * @param curso o curso com as informações atualizadas.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     * @throws IllegalArgumentException se o nome ou código do curso estiverem vazios ou ID inválido.
     */
    public abstract void update(Curso curso) throws RuntimeException;
    
    /**
     * Remove um curso do sistema.
     *
     * @param curso o curso a ser removido.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract void delete(Curso curso) throws RuntimeException;
    
     /**
     * Busca um curso pelo seu identificador único.
     *
     * @param id o identificador único do curso.
     * @return o curso correspondente ao ID fornecido, ou {@code null} se não encontrado.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract Curso findById(Long id) throws RuntimeException;
    
    /**
     * Busca cursos com base no nome fornecido.
     *
     * @param nome o nome (ou parte do nome) dos cursos a serem buscados.
     * @return uma lista de cursos correspondentes ao nome fornecido.
     * @throws RuntimeException se ocorrer algum erro durante a operação.
     */
    public abstract List<Curso> findByNome(String nome) throws RuntimeException;
}