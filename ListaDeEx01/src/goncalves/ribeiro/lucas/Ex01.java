package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        String nome, email;
        int RA, telefone, idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu RA: ");
        RA = scanner.nextInt();

        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe seu email: ");
        email = scanner.nextLine();

        System.out.println("Informe seu telefone: ");
        telefone = scanner.nextInt();

        System.out.println("Informe seu idade: ");
        idade = scanner.nextInt();

        System.out.println("RA: " + RA + "\n"+ "Nome: " + nome + "\n" + "email: " + email + "\n" + "telefone: " + telefone + "\n" + "idade: " + idade);

    }
}
