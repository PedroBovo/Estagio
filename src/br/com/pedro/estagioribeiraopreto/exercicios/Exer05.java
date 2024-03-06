package br.com.pedro.estagioribeiraopreto.exercicios;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = s.nextLine();
        String palavraIvertida = "";
        for (int i = palavra.length() -1 ; i >= 0 ; i--) {
            palavraIvertida = palavraIvertida + palavra.charAt(i);

        }
        System.out.println(palavraIvertida);
    }
}
