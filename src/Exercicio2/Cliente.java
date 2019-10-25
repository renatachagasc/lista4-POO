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
public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascimento;

    public Cliente(double valorDivida, int anoNascimento, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "valorDivida = " + valorDivida + ", anoNascimento = " + anoNascimento + ", nome = " + getNome() + ", idade = " + getIdade() + ", seksu = " + getSexo() + '}';
    }
 
}
