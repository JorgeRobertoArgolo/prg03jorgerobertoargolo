/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.repository;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
    public List<Curso> findByNome(String nome);

    // Retorna cursos cujo nome começa com o valor informado.
    List<Curso> findByNomeStartingWith(String nome);

    // Ordena os cursos pelo nome.
    List<Curso> findByNomeStartingWithOrderByNome(String nome);

    // Ignora diferenças entre maiúsculas e minúsculas ao pesquisar.
    List<Curso> findByNomeStartingWithIgnoreCase(String nome);

    // Utiliza o operador "LIKE" para busca com padrão.
    List<Curso> findByNomeLike(String nome);
    
    // Utiliza o operador "LIKE" para busca com padrão e ignora o tipo de case
    List<Curso> findByNomeLikeIgnoreCase(String nome);

    // Retorna todos os cursos onde a propriedade "ativo" é verdadeira.
    List<Curso> findByAtivoTrue();

}
