/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.util.ArrayList;

/**
 *
 * @author 20171148060029
 */
public class Teste {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        
        lista.add(new Fornecedor(5000.0, 1500.0, "Danilo", "Mora logo ali! ZN","9911566394" ));
        
        for(Pessoa p:lista)
            System.out.println(p);
    }
   
}
