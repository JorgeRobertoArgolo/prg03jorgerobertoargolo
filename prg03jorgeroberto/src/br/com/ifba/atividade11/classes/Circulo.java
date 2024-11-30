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
 * A classe Circulo representa uma forma geométrica do tipo círculo.
 * Ela herda da classe {@link Forma2D} e fornece métodos para calcular a área
 * com base no raio do círculo. O raio deve ser um valor positivo. Caso contrário,
 * uma mensagem de erro será exibida.
 */
public class Circulo extends Forma2D{
    private float raio;

    public Circulo(float raio) {
        super.tipo = "Circulo";
        if (raio > 0) {
            this.raio = raio;
        } else{
            System.out.println("O Raio Informado é invalido!");
        }    
    }
    
    @Override
    public void obterArea() {
        super.setArea(Math.pow(this.raio, 2) * Math.PI);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio > 0) {
            this.raio = raio;
            obterArea();
        } else{
            System.out.println("O Raio Informado é invalido!");
        }    
    }
}