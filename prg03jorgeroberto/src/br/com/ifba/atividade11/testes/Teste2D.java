/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.testes;

import br.com.ifba.atividade11.classes.Triangulo;
import br.com.ifba.atividade11.classes.Quadrado;
import br.com.ifba.atividade11.classes.Circulo;

/**
 *
 * @author rober
 */
public class Teste2D {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(5);
        Triangulo triangulo = new Triangulo(5, 4);
        
        circulo.obterArea();
        System.out.println(circulo.toString());
        
        System.out.println("");
        
        quadrado.obterArea();
        System.out.println(quadrado.toString());
        
        System.out.println("");
        
        triangulo.obterArea();
        System.out.println(triangulo.toString());
    }
}