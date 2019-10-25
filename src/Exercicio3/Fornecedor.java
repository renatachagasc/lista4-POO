/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author 20171148060029
 */
public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(double valorCredito, double valorDivida, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", nome = " + getNome() + ", endereco = " +getEndereco() + ", telefone = " + getTelefone()
                + ", saldo= "+ obterSaldo() + '}';
    }
    
    
}
