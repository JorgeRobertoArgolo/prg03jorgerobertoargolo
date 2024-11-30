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
 * Representa uma pirâmide tridimensional, com uma base poligonal e faces laterais triangulares.
 * Extende a classe {@link Forma3D} e implementa os cálculos para área e volume.
 */
public class Piramide extends Forma3D{
    private float perimentroBase;
    private float alturaInclinada;
    private float alturaPerpendicular;
    private float areaBase;
    private float areaLateral;

    public Piramide(float perimentroBase, float alturaInclinada, float alturaPerpendicular, float areaBase) {
        super.setTipo("Piramede");
        if (perimentroBase > 0) {
            this.perimentroBase = perimentroBase;
        }
        if (alturaInclinada > 0) {
            this.alturaInclinada = alturaInclinada;
        }
        if (alturaPerpendicular > 0) {
            this.alturaPerpendicular = alturaPerpendicular;
        }
        if (areaBase > 0) {
            this.areaBase = areaBase;
        }
    }
    
    /**
     * Calcula o volume da piramide
     */
    @Override
    public void obterVolume() {
        super.setVolume(((float) 0.33) * areaBase * alturaPerpendicular);
    }

    /**
     * Calcula a area da piramide
     */
    @Override
    public void obterArea() {
        setAreaLateral();
        super.setArea(areaBase + areaLateral);
    }

    public float getPerimentroBase() {
        return perimentroBase;
    }

    public void setPerimentroBase(float perimentroBase) {
        if (perimentroBase > 0) {
            this.perimentroBase = perimentroBase;
            setAreaLateral();
        }
    }

    public float getAlturaInclinada() {
        return alturaInclinada;
    }

    public void setAlturaInclinada(float alturaInclinada) {
        if (alturaInclinada > 0) {
            this.alturaInclinada = alturaInclinada;
            setAreaLateral();
        }
    }

    public float getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(float areaBase) {
        this.areaBase = areaBase;
    }

    public float getAlturaPerpendicular() {
        return alturaPerpendicular;
    }

    public void setAlturaPerpendicular(float alturaPerpendicular) {
        this.alturaPerpendicular = alturaPerpendicular;
    }

    public float getAreaLateral() {
        return areaLateral;
    }

    /**
     * Calcula o valor da areal lateral. 
     * Caso os parametros sejam válidos (maior que 0)
     */
    private void setAreaLateral() {
        if (this.perimentroBase > 0 && this.alturaInclinada > 0) {
            this.areaLateral = ((float) 0.5) * this.perimentroBase * this.alturaInclinada;
        } else {
            System.out.println("Valores Invalidos para calcular a area lateral");
        }
    }
}
