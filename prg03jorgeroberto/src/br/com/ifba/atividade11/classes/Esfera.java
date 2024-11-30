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
 * Representa uma esfera tridimensional, uma forma 3D com todas as suas
 * superfícies equidistantes de um ponto central (raio).
 * Extende a classe {@link Forma3D} e implementa os cálculos para área e volume.
 */
public class Esfera extends Forma3D{

    private float raio;
    
    public Esfera (float raio) {
        super.setTipo("Esfera");
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Valor do raio Invalido!");
        }
    }
    /**
     * Calcula o volume da esfera
     */
    @Override
    public void obterVolume() {
        super.setVolume(((float) 1.33) * Math.PI * Math.pow(raio, 3));
    }

    /**
     * Calcula a area da esfera
     */
    @Override
    public void obterArea() {
        super.setArea(4 * Math.PI * Math.pow(raio, 2));
    }

    public float getRaio() {
        return raio;
    }

    /**
     * Define o valor do raio da esfera. Caso o valor seja válido (maior que 0),
     * recalcula a área e o volume da esfera.
     */
    public void setRaio(float raio) {
        if (raio > 0) {
            this.raio = raio;
            obterArea();
            obterVolume();
        } else {
            System.out.println("Valor do raio Invalido!");
        }
    }
}
