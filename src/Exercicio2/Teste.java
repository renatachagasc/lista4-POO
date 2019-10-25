/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.ArrayList;

/**
 *
 * @author 20171148060029
 */
public class Teste {
    public static void main(String[] args) {
          ArrayList<Pessoa> lista = new ArrayList<>();
          
          lista.add(new Cliente(800.0, 1999, "Francisco", 20, "Masculino"));
          lista.add(new Gerente("Ger. Setor I", 20000.0, "20171148060029", "Renatinha", 12 , "Feminino"));
          lista.add(new Vendedor(0.0, 0, 8000.0, "201491148060007", "vinicin",  10 , "Masculino"));
          
          
          for(Pessoa p: lista)
              System.out.println(p);
    }
}
