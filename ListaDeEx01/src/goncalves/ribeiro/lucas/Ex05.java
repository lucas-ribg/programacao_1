package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        int numero, numeroAnterior, i, resp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a posição da sequência fibonnacci: ");
        i = scanner.nextInt();

        resp = fibonacci(i);
        System.out.println(resp);
    }

    private static int fibonacci(int i) {

        int x=0 ,y=1 ,z=0, c;

        for ( c=0 ; c<i ; c++ ){

            z = x + y;
            x = y;
            y = z;

        }
     return y;
    }
}
