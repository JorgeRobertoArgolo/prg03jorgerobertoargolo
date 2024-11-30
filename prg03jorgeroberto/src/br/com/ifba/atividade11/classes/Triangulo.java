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
 * A classe Triangulo representa uma forma geométrica do tipo triângulo.
 * Ela herda da classe {@link Forma2D} e fornece métodos para calcular a área
 * com base na base e altura do triângulo.
 */
public class Triangulo extends Forma2D{
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        super.tipo = "Triangulo";
        if (base > 0 && altura > 0) {
            this.base = base;
            this.altura = altura;
        } else {
            System.out.println("A Base ou Altura Informados sao invalidos!");            
        }
    }
    
    @Override
    public void obterArea() {
        super.area = (base * altura) / 2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        if (base > 0) {
            this.base = base;
            obterArea();
        } else {
            System.out.println("A Base Informada e invalida!");            
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
            obterArea();
        } else {
            System.out.println("A Altura Informada e invalida!");            
        } 
    }
}