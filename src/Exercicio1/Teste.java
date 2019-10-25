/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.ArrayList;

/**
 *
 * @author 20171148060029
 */
public class Teste {

    public static void main(String[] args) {
        ArrayList<Animal> lista = new ArrayList<>();
        
        lista.add(new Cachorro("Max",20.0, "viralata"));
        lista.add(new Peixe("Nemu",0.6, "Agua Doce"));
        
        for(Animal a: lista)
            System.out.println(a);
        
                
    }
    
}
