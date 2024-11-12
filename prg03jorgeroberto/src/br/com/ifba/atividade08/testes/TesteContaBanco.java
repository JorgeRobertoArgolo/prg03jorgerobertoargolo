/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.testes;

import br.com.ifba.atividade08.classes.ContaBanco;

/**
 *
 * @author Roberto
 */
public class TesteContaBanco {
    //Exemplos Gerados com Inteligência Artificial
    public static void main(String[] args) {
        //Teste Conta Corrente
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1001);
        conta1.setDono("João");
        
        conta1.abrirConta("cc");

        System.out.println("Saldo inicial de " + conta1.getDono() + ": " + conta1.getSaldo());

        conta1.depositar(100);
        System.out.println("Saldo após depósito: " + conta1.getSaldo());

        conta1.sacar(30);
        System.out.println("Saldo após saque: " + conta1.getSaldo());

        conta1.pagarMensal();
        System.out.println("Saldo após pagamento de mensalidade: " + conta1.getSaldo());

        conta1.fecharConta();

        conta1.sacar((int) conta1.getSaldo());
        System.out.println("Saldo após sacar tudo: " + conta1.getSaldo());

        conta1.fecharConta();
        
        //Teste Conta Poupanca
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2002);
        conta2.setDono("Maria");
        
        conta2.abrirConta("cp");

        System.out.println("\n\nSaldo inicial de " + conta2.getDono() + ": " + conta2.getSaldo());

        conta2.depositar(200);
        System.out.println("Saldo após depósito: " + conta2.getSaldo());

        conta2.sacar(50);
        System.out.println("Saldo após saque: " + conta2.getSaldo());

        conta2.pagarMensal();
        System.out.println("Saldo após pagamento de mensalidade: " + conta2.getSaldo());

        conta2.fecharConta();

        conta2.sacar((int) conta2.getSaldo());
        System.out.println("Saldo após sacar tudo: " + conta2.getSaldo());

        conta2.fecharConta();
    }
}