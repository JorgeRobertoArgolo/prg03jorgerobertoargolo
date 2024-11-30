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
 * A classe abstrata Forma2D estende a classe {@link Forma} e serve como base
 * para formas geométricas bidimensionais (2D).
 * Ela fornece uma implementação do método {@link #toString()}, que retorna
 * uma representação textual da forma, incluindo o tipo e a área.
 */
public abstract class Forma2D extends Forma{
    @Override
    public String toString() {
        return "Tipo De Objeto : " + super.getTipo()
                + "\nArea : " + super.getArea() + " unidades quadradas";
    }
}