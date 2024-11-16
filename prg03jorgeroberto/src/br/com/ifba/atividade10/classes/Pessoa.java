/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author Jorge
 */

/**
 * Classe que representa uma pessoa com atributos básicos, como nome, idade e sexo.
 * Permite criar uma pessoa, modificar seus atributos e realizar operações básicas.
 */
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    /**
    * Incrementa a idade da pessoa em 1.
    */
    public void fazerAniversario(){
        setIdade(getIdade() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    /**
    * Define o sexo da pessoa, validando o valor informado.
    * Aceita 'H', 'h', 'M' ou 'm'.
    *
    * @param sexo o valor do sexo a ser definido
    */
    public void setSexo(char sexo) {
        if (sexo == 'H' || sexo == 'h' || sexo == 'M' || sexo == 'm') {
            this.sexo = sexo;
        } else {
            System.out.println("Valor Informado Inválido");
        }
    }
}