/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.classes;

/**
 *
 * @author Roberto
 */

/**
 * Classe que implementa a interface Controlador, representando um controle remoto
 * com funcionalidades de controle de volume, ligar/desligar, mute e reprodução de mídia.
 */
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    /**
    * Construtor da classe ControleRemoto..
    */
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
     /**
     * Liga o controle remoto, se ele não estiver ligado.
     * E chama a função init para resetar os atributos
     */
    @Override
    public void ligar() {
        if (!isLigado()) {
            setLigado(true);
            System.out.println("Ligando Controle...");
        } else {
            System.out.println("O Controle ja esta ligado!");
        }
    }

    /**
     * Desliga o controle remoto, se ele estiver ligado.
     * E faz com que pare de tocar
     */
    @Override
    public void desligar() {
        if (isLigado()) {
            setTocando(false); 
            setLigado(false);
            System.out.println("Desligando Controle...");
        } else {
            System.out.println("O Controle ja esta desligado!");
        }
    }
    /**
     * Exibe o menu com informações do estado atual do controle se estiver ligado.
     */
    @Override
    public void abrirMenu() {
        if (isLigado()) {
            System.out.println("---------------------------");
            System.out.println("            MENU");
            System.out.println("---------------------------");
            System.out.println("Volume : " + getVolume());
            System.out.println("Ligado: " + isLigado());
            System.out.println("Tocando : " + isTocando());
            System.out.println("---------------------------\n");
        } else {
            System.out.println("O Controle esta desligado...");
        }
    }

    /**
     * Fecha o menu se estiver ligado.
     */
    @Override
    public void fecharMenu() {
        if (isLigado()) {
            System.out.println("\nFechando Menu...");
        } else {
            System.out.println("O Controle esta desligado...");
        }   
    }

     /**
     * Aumenta o volume em 2 unidades, até o máximo de 100 se estiver ligado.
     */
    @Override
    public void maisVolume() {
        if (isLigado()) {
            if (getVolume() < 100) {
                setVolume(getVolume() + 2);
            } else {
                System.out.println("Já está no volume máximo");
            }
        } else {
            System.out.println("O Controle esta desligado...");
        } 
    }

    /**
     * Diminui o volume em 1 unidade, até o mínimo de 0 se estiver ligado.
     */
    @Override
    public void menosVolume() {
        if (isLigado()) {
            if (getVolume() > 0) {
                setVolume(getVolume() - 1);
            } else {
                System.out.println("Já está no volume mínimo");
            }
        } else {
            System.out.println("O Controle esta desligado...");
        }
        
    }

    /**
     * Ativa o modo mudo, zerando o volume.
     */
    @Override
    public void ligarMudo() {
        if (isLigado()) {
            if (getVolume() != 0) {
                setVolume(0);
                System.out.println("Mudo ativado...");
            } else {
                System.out.println("Já está no mudo...");
            }
        } else {
            System.out.println("O Controle esta desligado...");
        }
    }

    /**
     * Desativa o modo mudo, retornando o volume para 50 se estiver ligado.
     */
    @Override
    public void desligarMudo() {
        if (isLigado()) {
            if (getVolume() == 0) {
                setVolume(50);
                System.out.println("Mudo desligado...");
            } else {
                System.out.println("Não está no mudo...");
            }
        } else {
            System.out.println("O Controle esta desligado...");
        }
    }

    /**
     * Inicia a reprodução de mídia, se não estiver tocando.
     */
    @Override
    public void play() {
        if (isLigado()) {
            if (!isTocando()) {
                setTocando(true);
                System.out.println("Tocando....");
            } else {
                System.out.println("Já está tocando...");
            }
        } else {
            System.out.println("O Controle esta desligado...");
        } 
    }

    /**
     * Pausa a reprodução de mídia, se estiver tocando.
     */
    @Override
    public void pause() {
        if (isLigado()) {
            if (isTocando()) {
                setTocando(false);
                System.out.println("Pausado....");
            } else {
                System.out.println("Já está pausado...");
            }
        } else {
            System.out.println("O Controle esta desligado...");
        } 
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}