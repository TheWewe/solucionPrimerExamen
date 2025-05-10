package com.example;

import java.util.List;

public class SumaParesImpares {

    public static int calcularDiferencia(List<Integer> numeros) {
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                sumaPares += num;  
            } else {
                sumaImpares += num; 
            }
        }
        return sumaPares - sumaImpares;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 4, 5);

      
        int resultado = calcularDiferencia(numeros);
        System.out.println("Resultado: " + resultado);  
    }
}
