/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.testes;

import br.com.ifba.atividade11.classes.Cubo;
import br.com.ifba.atividade11.classes.Esfera;
import br.com.ifba.atividade11.classes.Forma3D;
import br.com.ifba.atividade11.classes.Piramide;

/**
 *
 * @author rober
 */
public class Teste3D {
    public static void main(String[] args) {
        Forma3D esfera = new Esfera(7.5f);
        
        esfera.obterArea();
        esfera.obterVolume();
        System.out.println(esfera.toString());
        
        Forma3D cubo = new Cubo(8);
        
        cubo.obterArea();
        cubo.obterVolume();
        System.out.println("\n" + cubo.toString());
        
        Forma3D piramide = new Piramide(10f, 5f, 5f, 6f);
        
        piramide.obterArea();
        piramide.obterVolume();
        System.out.println("\n" + piramide.toString());
    }
}
