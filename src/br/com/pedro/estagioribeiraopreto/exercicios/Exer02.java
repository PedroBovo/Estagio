package br.com.pedro.estagioribeiraopreto.exercicios;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 1;
        int y = -1;
        int guarda = 0;

        System.out.println("Digite um numero para saber se está na sequencia de Fibonacci: ");
        int n = s.nextInt();
        int fibonacci = 0;
        boolean aparece = false;
        for (int i = 0; i < 20 ; i++) {
            fibonacci = x + y;
            guarda = x;
            y  = guarda;
            x = fibonacci;
            System.out.print(fibonacci + " ");
            System.out.println();
            if (fibonacci  == n){
                aparece = true;
            }
        }
        if (aparece == true){
            System.out.println("O numero "  + n + " aparece na sequencia");
        }else{
            System.out.println("O numero "  + n + " não aparece na sequencia");
        }

    }
}
