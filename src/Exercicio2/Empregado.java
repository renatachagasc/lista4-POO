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
public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public Empregado(double salario, String matricula, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double valorInss(double salario){
        return 0.11 * salario;
    }
    
}
