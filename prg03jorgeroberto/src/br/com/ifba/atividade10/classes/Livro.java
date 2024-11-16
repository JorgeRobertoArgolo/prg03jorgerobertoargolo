/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author Jorge
 */

/**
 * Representa um livro com informações sobre título, autor, total de páginas e leitor.
 * 
 * Implementa a interface {@link Publicacao}, permitindo ações como abrir, fechar, 
 * folhear e navegar pelas páginas.
 */
public class Livro implements Publicacao{
    private String titulo;
    private Pessoa autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, Pessoa autor, int totalPaginas, Pessoa leitor) {
        this(titulo, autor, totalPaginas);
        this.leitor = leitor;
    }
    
    public Livro(String titulo, Pessoa autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    /**
    * Exibe os detalhes do livro, como título, nome do autor e total de páginas.
    */
    public void detalhes () {
        System.out.println("-----------------------------");
        System.out.println("   INFORMACOES DO LIVRO");
        System.out.println("-----------------------------");
        System.out.println("Titulo : " + getTitulo());
        System.out.println("Autor : " + getAutor().getNome());
        System.out.println("Total de Paginas : " + getTotalPaginas());
    }
    
    /**
    * Abre o livro, caso ainda esteja fechado.
    */
    @Override
    public void abrir() {
        if (!isAberto()) {
            System.out.println("Abrindo Livro...");
            setAberto(true);
        } else {
            System.out.println("O Livro já está aberto!");
        }
    }

    /**
    * Fecha o livro, caso esteja aberto.
    */
    @Override
    public void fechar() {
        if (isAberto()) {
            System.out.println("Fechando Livro...");
            setAberto(false);
       } else {
            System.out.println("O Livro já está fechado!");
        }
    }

    /**
    * Folheia o livro, avançando até 5 páginas 
    * ou indo até a última página.
    */
    @Override
    public void folhear() {
        if (isAberto()) {
            if (getTotalPaginas() >= getPaginaAtual() + 5) {
                setPaginaAtual(getPaginaAtual() + 5);
            } else {
                setPaginaAtual(getTotalPaginas());
            }
            System.out.println("Folheando...");
        } else {
            System.out.println("O Livro esta fechado!");
        }
    }

    /**
    * Avança uma página no livro, caso não esteja na última página.
    */
    @Override
    public void avancarPagina() {
        if (isAberto()) {
            if (getTotalPaginas() >= getPaginaAtual() + 1) {
                setPaginaAtual(getPaginaAtual() + 1);
                System.out.println("Avancando Pagina...");
            } else {
                System.out.println("Já está na última página");
            }
        } else {
            System.out.println("O Livro esta fechado!");
        }
    }

    /**
    * Volta uma página no livro, caso não esteja na primeira página.
    */
    @Override
    public void voltarPagina() {
        if (isAberto()) {
            if (getPaginaAtual() - 1 >= 0) {
                setPaginaAtual(getPaginaAtual() - 1);
                System.out.println("Voltando Pagina...");
            } else {
                System.out.println("Já está na primeira página");
            }
        } else {
            System.out.println("O Livro esta fechado!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}