/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author Jorge
 */

/**
 * Interface que define operações básicas para uma publicação.
 * 
 * Representa ações comuns realizadas em publicações, como abrir, fechar,
 * folhear e navegar entre páginas.
 */
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear();
    public abstract void avancarPagina();
    public abstract void voltarPagina();
}