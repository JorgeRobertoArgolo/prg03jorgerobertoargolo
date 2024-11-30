/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author rober
 */

/**
 * Representa um cubo tridimensional, uma forma 3D com seis faces quadradas congruentes.
 * Extende a classe {@link Forma3D} e implementa os cálculos para área e volume.
 */
public class Cubo extends Forma3D{
    private float aresta;

    public Cubo(float aresta) {
        super.setTipo("Cubo");
        if (aresta > 0) {
            this.aresta = aresta;
        } else {
            System.out.println("Valor da aresta invalido!");
        }
    }
    
    /**
     * Calcula o volume do cubo
     */
    @Override
    public void obterVolume() {
        super.setVolume(Math.pow(aresta, 3));
    }

    /**
     * Calcula a area do cubo
     */
    @Override
    public void obterArea() {
        super.setArea(Math.pow(aresta, 2) * 6);
    }
    
    public float getAresta() {
        return aresta;
    }

    /**
     * Define o valor da aresta do cubo. Caso o valor seja válido (maior que 0),
     * recalcula a área e o volume do cubo.
     */
    public void setAresta(float aresta) {
        if (aresta > 0) {
            this.aresta = aresta;
            obterArea();
            obterVolume();
        } else {
            System.out.println("Valor da aresta invalido!");
        }
    }
}
