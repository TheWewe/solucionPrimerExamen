package com.example;

import java.util.List;

public class ContarFrecuencia {

    public static void contarApariciones(List<Character> lista) {

        int[] contador = new int[26]; 
        
      
        for (char c : lista) {
           
            if (c >= 'a' && c <= 'z') {

                contador[c - 'a']++;
            }
        }

       
        for (int i = 0; i < 26; i++) {
            if (contador[i] > 0) {
               
                System.out.println((char) (i + 'a') + ": " + contador[i]);
            }
        }
    }

    public static void main(String[] args) {
       
        List<Character> lista = List.of('a', 'b', 'c', 'a', 'a', 'a', 'd', 'b', 'f', 'a', 'c', 'c',
                                        'c', 'f', 'c', 'a', 'a', 'a', 'b', 'c');
        
        contarApariciones(lista);
    }
}
