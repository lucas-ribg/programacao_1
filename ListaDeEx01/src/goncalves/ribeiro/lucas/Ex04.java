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
        System.out.println(letras);
        int tamanho = letras.length;

        int i;
        for (i=0; i<=tamanho; i++){
            inversao[tamanho-1] = letras[i];
            i++;
        }

        System.out.println(inversao);

        if (inversao == letras) System.out.println("é palindromo!");
        else System.out.println("não é palindromo!");
        }



    }

