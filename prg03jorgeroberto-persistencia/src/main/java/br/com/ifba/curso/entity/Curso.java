/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

/**
 *
 * @author rober
 */

/**
 * Representa a entidade "Curso" mapeada para a tabela "cursos" no banco de dados.
 * Utiliza as anotações da JPA para facilitar o mapeamento objeto-relacional.
 */
@Entity
@Table(name = "cursos")
public class Curso {
    
    // Identificador único da entidade, gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    // Coluna "nome" na tabela, não pode ser nula
    @Column (name = "nome", nullable = false)
    private String nome;
    
    // Coluna "codigo_curso" na tabela, não pode ser nula e deve ser única
    @Column (name = "codigo_curso", nullable = false, unique = true)
    private String codigoCurso;
    
    // Coluna "ativo" na tabela, indica se o curso está ativo
    @Column (name = "ativo")
    private boolean ativo;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}