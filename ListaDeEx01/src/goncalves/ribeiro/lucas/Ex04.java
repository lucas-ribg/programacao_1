package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        String palindromo;
        Scanner scanner = new Scanner(System.in);
        char [] inversao = new char[30];

        System.out.println("Digite a palavra: ");
        palindromo = scanner.nextLine();

        //transformando a string em um array
        char [] letras = palindromo.toCharArray();
        int tamanho = letras.length; //tamanho da palavra

        //invertendo a palavra
        int i;
        for (i=0; i<tamanho; i++){
            inversao[i] = letras[tamanho-(i+1)];
            i++;
        }

        if (inversao == letras) System.out.println("\né palindromo!");
        else System.out.println("\nnão é palindromo!");
        }



    }

