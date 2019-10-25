/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author 20171148060029
 */
public class Vendedor extends Empregado{
    private double valorDivida;
    private int quantidadeDivida;

    public Vendedor(double valorDivida, int quantidadeDivida, double salario, String matricula, String nome, int idade, String sexo) {
        super(salario, matricula, nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.quantidadeDivida = quantidadeDivida;
    }

  
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getQuantidadeDivida() {
        return quantidadeDivida;
    }

    public void setQuantidadeDivida(int quantidadeDivida) {
        this.quantidadeDivida = quantidadeDivida;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "valorDivida=" + valorDivida + ", quantidadeDivida=" + quantidadeDivida + ", nome = " + getNome() + ", salario = " + getSalario() +'}';
    }
    
    
}
