/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.service.CursoIService;
import br.com.ifba.curso.service.CursoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * Controlador responsável pelo gerenciamento de cursos.
 *
 * Esta classe oferece os métodos necessários para realizar operações de CRUD (criação, leitura, atualização e exclusão)
 * sobre a entidade {@link Curso}, utilizando o serviço {@link CursoIService} para delegar as operações de negócio.
 * As operações incluem a validação de campos essenciais antes de interagir com o serviço.
 */
@Controller
@RequiredArgsConstructor
public class CursoController implements CursoIController{

    private final CursoIService cursoIService;  
    
    @Override
    public List<Curso> findAll() throws RuntimeException {
        return cursoIService.findAll();
    }

    @Override
    public void save(Curso curso) throws RuntimeException {
        cursoIService.save(curso);
    }

    @Override
    public void update(Curso curso) throws RuntimeException {
        cursoIService.update(curso);
    }

    @Override
    public void delete(Curso curso) throws RuntimeException {
        cursoIService.delete(curso);
    }

    @Override
    public Curso findById(Long id) throws RuntimeException {
        return cursoIService.findById(id);
    }

    @Override
    public List<Curso> findByNome(String nome) throws RuntimeException {
        return cursoIService.findByNome(nome);
    }
    
    @Override
    public List<Curso> findByNomeLikeIgnoreCase(String nome) throws RuntimeException {
        return cursoIService.findByNomeLikeIgnoreCase(nome);
    }
}