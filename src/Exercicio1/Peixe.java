/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author 20171148060029
 */
public class Peixe extends Animal{
    
    String habitate;

    public String getHabitate() {
        return habitate;
    }

    public void setHabitate(String habitate) {
        this.habitate = habitate;
    }
    
    public Peixe(String nome, double peso, String habitate) {
        super(nome, peso);
        this.habitate= habitate;
    }

    @Override
    public String toString() {
        return "Peixe{" + "nome=" + nome + ", peso=" + peso + ", habitate=" + habitate + '}';
    }
    
}
