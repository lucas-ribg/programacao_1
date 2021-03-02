package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2, diferenca;

        System.out.println("Insira o primeiro nome: ");
        nome1 = scanner.nextLine();
        scanner.nextLine(); //limpa o buffer
        System.out.println("Insira a idade: ");
        idade1 = scanner.nextInt();

        System.out.println("Insira o segundo nome: ");
        nome2 = scanner.nextLine();
        System.out.println("Insira a idade: ");
        idade2 = scanner.nextInt();

        diferenca = diferencaDeIdade(idade1, idade2);

        System.out.println("A diferença de idade é: " + diferenca);

    }

    private static int diferencaDeIdade(int idade1, int idade2) {

        int diferenca = 0;

        if (idade1 > idade2) diferenca = idade1-idade2;
        if (idade1 < idade2) diferenca = idade2-idade1;

        return diferenca;
    }
}
