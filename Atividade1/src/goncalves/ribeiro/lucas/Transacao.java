package goncalves.ribeiro.lucas;

import java.util.Random;
import java.util.Scanner;

public class Transacao {

    public Scanner scanner;

    /*Toda transação deve ser composta pelo id da conta;
- A String gerada deve conter o nome do usuário que
    vai receber o valor;
- A String gerada deve conter o valor da transação;
- Ela deve conter um número aleatório no intervalo
1000 e 9999, gerado por:*/

    //Métodos

    //Cria um numero aleatório para um intervalo
    private static int getRandomNumberInRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    public static void pagamento(String pagador, String recebedor, int valor,String QRCode){

    }
    //gera QRCode
    public void gerarChave() {
        System.out.println("Digite o valor da requisição: ");
        int valor = scanner.nextInt();
        System.out.println();
    }

    public Transacao(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }
}
   /* String s = "5;PERIGO;1;1234";
    String[] dados = s.split(";");
    Para acessar os membros de dados, utilizar dados[índice],
onde índice é um número inteiro que representa a informação
desejada.
*/
