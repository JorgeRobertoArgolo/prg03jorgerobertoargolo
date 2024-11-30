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
 * Representa uma forma tridimensional abstrata.
 * Estende a classe {@link Forma} e adiciona características específicas
 * de formas tridimensionais, como volume.
 */
public abstract class Forma3D extends Forma{
    private double volume;
    
    /**
     * Método abstrato para calcular o volume da forma.
     * Deve ser implementado pelas subclasses para fornecer o cálculo específico.
     */
    public abstract void obterVolume();
    
    /**
     * Retorna uma descrição detalhada da forma tridimensional.
     *
     * @return Uma string contendo o tipo, a área e o volume da forma.
     */
    @Override
    public String toString() {
        return "Tipo De Objeto : " + super.getTipo()
                + "\nArea : " + super.getArea() + " unidades quadradas"
                + "\nVolume : " + this.volume + " unidades cubicas";
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}