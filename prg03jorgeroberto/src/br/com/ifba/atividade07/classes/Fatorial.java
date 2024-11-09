/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.classes;

/**
 *
 * @author Roberto
 */

/**
 * Classe para calcular o fatorial de um número e gerar sua fórmula em formato de string.
 */
public class Fatorial {
    private int valor;
    private int fatorial;
    private String formula;

    public Fatorial() {}
    
    /**
     * Define o valor para calcular o fatorial e armazena o resultado.
     * @param n valor inteiro para calcular o fatorial.
     */
    public void setValor(int n) {
        this.valor = n;
        this.fatorial = 1;
        
        if (this.valor > 0) {
            for (int i = 2; i <= valor; i++) {
                fatorial *= i;
            }
        }
    }
    
    /**
     * Retorna o valor do fatorial calculado.
     * @return o valor do fatorial, ou 0 se o valor for negativo.
     */
    public int getFatorial() {
        if (this.valor >= 0) {
            return fatorial;
        }
        return 0;
    }
    
    /**
     * Retorna a fórmula em string representando o cálculo do fatorial.
     * @return a fórmula do cálculo do fatorial.
     */
    public String getFormula() {
        formula = "";
        
        if (this.valor == 0) {
            formula = "0! = ";
            return formula;
        }
        
        for (int i = 1; i <= valor; i++) {
            formula += "" + i;
            if (i != valor) {
                formula += " * ";
            } else {
                formula += " = ";
            }
        }
        return formula;
    }
}
