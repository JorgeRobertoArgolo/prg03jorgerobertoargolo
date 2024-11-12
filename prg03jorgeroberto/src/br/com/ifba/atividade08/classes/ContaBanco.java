/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    /**
    * Construtor da classe ContaBanco.
    * Inicializa a conta como inativa e saldo inicial como zero.
    */
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }
    
    /**
    * Abre a conta com o tipo especificado, se ela estiver inativa.
    * Define o tipo da conta e aplica uma bonificação inicial 
    * dependendo do tipo de conta.
    *
    * @param tipo O tipo da conta ("cc" para conta-corrente ou "cp" para conta-poupança)
    */
    public void abrirConta(String tipo){
        if (!this.status) {
            if (tipo.equalsIgnoreCase("cc") || tipo.equalsIgnoreCase("cp")) {
                this.status = true;
                setTipo(tipo);
                bonificaoConta();
            } else {
                System.out.println("Tipo De Conta Invalida!"
                        + "Error ao criar conta!");
            }
        } else {
            System.out.println("Sua Conta já foi aberta!");
        }
    }
    
    /**
    * Fecha a conta se o saldo for zero.
    * Exibe uma mensagem de erro caso a conta
    * esteja com valor positivo ou negativo.
    */
    public void fecharConta(){
        if (getSaldo() == 0) {
            this.status = false;
            System.out.println("Conta Encerrada...");
        } else if (getSaldo() < 0) {
            System.out.println("Não é possível fechar a conta!\n"
                    + "A Conta está negativada");
        } else {
            System.out.println("Não é possível fechar a conta!\n"
                    + "A Conta está com saldo");
        }
    }
    
    /**
    * Realiza um depósito na conta se ela estiver aberta 
    * e o valor for positivo.
    * @param valor O valor a ser depositado
    */
    public void depositar(int valor){
        if (this.status) {
            if (valor > 0) {
                setSaldo(getSaldo() + valor);
                System.out.println("Valor Depositado com sucesso!");
            } else {
                System.out.println("O Valor informado para deposito é inválido!");
            }
        } else {
            System.out.println("A Conta não foi aberta!\n"
                    + "Abra para depositar!");
        }
    }
    
    /**
    * Realiza um saque na conta se ela estiver aberta, 
    * o valor for positivo e menor ou igual ao saldo.
    *
    * @param valor O valor a ser sacado
    */
    public void sacar(int valor){
        if (this.status) {
            if (valor > 0 && valor <= getSaldo()) {
                setSaldo(getSaldo() - valor);
                System.out.println("Valor Sacado com sucesso!");
            } else {
                System.out.println("O Valor informado para saque é inválido!");
            }
        } else {
            System.out.println("A Conta não foi aberta!\n"
                    + "Abra para sacar!");
        }
    }
    
    /**
    * Desconta a mensalidade da conta de acordo com o tipo de conta.
    * Aplica valores diferentes para 
    * conta-corrente (CC) e conta-poupança (CP).
    */
    public void pagarMensal(){
        if(getTipo().equalsIgnoreCase("cc")) {
            setSaldo(getSaldo() - 12);
            System.out.println("Mensalidade Da Conta-Corrente Descontada!");
        } else if (getTipo().equalsIgnoreCase("cp")) {
            setSaldo(getSaldo() - 20);
            System.out.println("Mensalidade Da Conta-Poupança Descontada!");
        } else {
            System.out.println("Tipo De Conta Inválida!");
        }
    }
    
    
    /**
     * Aplica uma bonificação inicial ao saldo ao abrir a conta.
     * Conta-corrente recebe uma bonificação de 50, 
     * e conta-poupança, 150.
     */
    private void bonificaoConta() {
        if (tipo.equalsIgnoreCase("cc")) {
            setSaldo(50);
        } else if (tipo.equalsIgnoreCase("cp")) {
            setSaldo(150);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    
    /**
    * Define o tipo da conta, se for válido.
    *
    * @param tipo O tipo da conta ("cc" para conta-corrente
    * ou "cp" para conta-poupança)
    */
    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("cc") || tipo.equalsIgnoreCase("cp")) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo de Conta Inválido!");
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}