/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;
import java.lang.Math;

/**
 *
 * @author rober
 */

/**
 * A classe abstrata Forma representa uma forma geométrica genérica.
 * Ela define os atributos e métodos comuns para todas as formas geométricas,
 * como o tipo da forma e a área. A classe também inclui um método abstrato 
 * {@link #obterArea()} para ser implementado pelas classes filhas, que deve 
 * calcular a área da forma específica.
 */
public abstract class Forma {
    protected String tipo;
    protected double area;
    
    public abstract void obterArea();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}