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
public class Gerente extends Empregado {

    String nomeGerencia;

    public Gerente(String nomeGerencia, double salario, String matricula, String nome, int idade, String sexo) {
        super(salario, matricula, nome, idade, sexo);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente{" + "nomeGerencia = " + nomeGerencia + ", nome = " + getNome() + ", idade = " + getIdade() + ", matricula = " + getMatricula() + " inss = " + valorInss(getSalario()) + '}';
    }

}
