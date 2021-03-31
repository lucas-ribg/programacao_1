package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        Scanner scanner;
        String usuario;
        int valor;
        String QRCode;
        Scanner scanner;

        System.out.println("1. Pagar");
        System.out.println("2. Receber");
        scanner = new Scanner(System.in);

        op = scanner.nextInt();

        if (op == 1){
            System.out.println("Informe o destinatário:");
            usuario = scanner.nextLine();

            System.out.println("Informe o valor:");
            valor = scanner.nextInt();

            System.out.println("Informe o QRCode: ");
            QRCode = scanner.nextLine();

        }
        if (op == 2){
            gerarChave();
        }
    }

}
