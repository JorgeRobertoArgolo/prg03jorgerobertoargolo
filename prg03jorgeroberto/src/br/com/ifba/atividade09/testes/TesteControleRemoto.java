/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.testes;

import br.com.ifba.atividade09.classes.ControleRemoto;

/**
 *
 * @author Roberto
 */

/**
 * Classe de teste para a simulação das funções do ControleRemoto.
 * Este teste verifica o funcionamento dos métodos, como ligar, desligar,
 * ajustar volume, ativar/desativar mudo e controle de reprodução.
 * Teste desenvolvido com o suporte de inteligência artificial
 * Para otimização de tempo.
 */
public class TesteControleRemoto {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.ligar();
        controle.abrirMenu();
        controle.maisVolume();
        controle.maisVolume();
        controle.abrirMenu();
        controle.ligarMudo();
        controle.abrirMenu();
        controle.desligarMudo();
        controle.abrirMenu();
        controle.play();
        controle.pause();
        controle.fecharMenu();
        controle.desligar();
    }
}
