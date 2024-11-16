/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.testes;

import br.com.ifba.atividade10.classes.Livro;
import br.com.ifba.atividade10.classes.Pessoa;

/**
 *
 * @author rober
 */

/**
 * Classe para testar a interação com a interface Publicacao através da classe Livro.
 * Simula ações como abrir, folhear, avançar e voltar páginas em um livro.
 */
public class TestePublicacao {
    public static void main(String[] args) {
        Pessoa autor = new Pessoa("J.R.R. Tolkien", 81, 'M');
        Pessoa leitor = new Pessoa("Jorge", 20, 'M');
        
        Livro livro = new Livro("O Senhor dos Aneis", autor , 500, leitor);
        livro.detalhes();
        livro.abrir();
        livro.folhear();
        livro.avancarPagina();
        livro.voltarPagina();
        livro.fechar();
        livro.folhear();
        livro.avancarPagina();
        livro.voltarPagina();
    }
}