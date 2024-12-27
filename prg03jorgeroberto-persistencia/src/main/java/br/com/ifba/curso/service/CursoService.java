/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.util.StringUtil;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Implementação do serviço de gerenciamento de cursos.
 * 
 * Esta classe oferece os métodos necessários para realizar operações de CRUD (criação, leitura, atualização e exclusão)
 * sobre a entidade {@link Curso}, utilizando o DAO {@link CursoIDao} para persistência de dados. 
 * As operações incluem a validação de campos essenciais antes de interagir com o banco de dados.
 */
public class CursoService implements CursoIService{
    
    private final CursoIDao cursoDao = new CursoDao();

    @Override
    public List<Curso> findAll() throws RuntimeException {
        return cursoDao.findAll();
    }

    @Override
    public void save(Curso curso) throws RuntimeException {
        if (curso == null) {
            throw new RuntimeException ("Dados do Curso nao preenchidos!");
        }
        
        if (StringUtil.isNullOrEmpty(curso.getNome()) ||
                StringUtil.isNullOrEmpty(curso.getCodigoCurso())) {
            throw new IllegalArgumentException("O Campo nome ou código do curso está vazio ou em branco!");
        }
        
        curso.setNome(StringUtil.trimExtraSpaces(curso.getNome()));
        curso.setCodigoCurso(StringUtil.trimExtraSpaces(curso.getCodigoCurso()));
        
        cursoDao.save(curso);
    }

    @Override
    public void update(Curso curso) throws RuntimeException, EntityNotFoundException {
        if (curso == null) {
            throw new RuntimeException ("Dados do Curso nao preenchidos!");
        }
        
        if (curso.getId() == 0) {
            throw new IllegalArgumentException("O Campo ID é invalido!");        
        }
        
        if (StringUtil.isNullOrEmpty(curso.getNome()) ||
                StringUtil.isNullOrEmpty(curso.getCodigoCurso())) {
            throw new IllegalArgumentException("O Campo nome ou código do curso está vazio ou em branco!");
        }
        
        if (findById(curso.getId()) == null) {
            throw new EntityNotFoundException("Curso não encontrado com o ID: " + curso.getId());
        }
        
        curso.setNome(StringUtil.trimExtraSpaces(curso.getNome()));
        curso.setCodigoCurso(StringUtil.trimExtraSpaces(curso.getCodigoCurso()));
        
        cursoDao.update(curso);
    }

    @Override
    public void delete(Curso curso) throws RuntimeException, EntityNotFoundException {
        if (curso == null) {
            throw new RuntimeException ("Dados do Curso nao preenchidos!");
        }
        
        if (findById(curso.getId()) != null) {
            cursoDao.delete(curso);
        } else {
            throw new EntityNotFoundException("Curso não encontrado com o ID: " + curso.getId());
        }
    }

    @Override
    public Curso findById(Long id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException ("Curso nao presente no banco de dados!");
        }
        
        return cursoDao.findById(id);
    }

    @Override
    public List<Curso> findByNome(String nome) throws RuntimeException {
        return cursoDao.findByNome(nome);
    } 
}