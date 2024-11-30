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
 * A classe Quadrado representa uma forma geométrica do tipo quadrado.
 * Ela herda da classe {@link Forma2D} e fornece métodos para calcular a área
 * com base na base e altura do quadrado.
 */

public class Quadrado extends Forma2D{
    private float lado;

    public Quadrado(float lado) {
        super.tipo = "Quadrado";
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("O Lado Informado e invalidos!");            
        }
    }
    
    @Override
    public void obterArea() {
        super.area = Math.pow(lado, 2);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        if (lado > 0) {
            this.lado = lado;
            obterArea();
        } else {
            System.out.println("O Lado Informado e invalidos!");            
        }
    }
}