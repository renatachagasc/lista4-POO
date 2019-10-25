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
public class Cachorro extends Animal{
    
    String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{"+ "nome=" + nome + ", peso=" + peso + ", raca=" + raca + '}';
    }
    
    
}
