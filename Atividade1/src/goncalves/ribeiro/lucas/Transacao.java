package goncalves.ribeiro.lucas;

import java.util.Random;

public class Transacao {

    //Gerando QRCode

    /*Toda transação deve ser composta pelo id da conta;
- A String gerada deve conter o nome do usuário que
    vai receber o valor;
- A String gerada deve conter o valor da transação;
- Ela deve conter um número aleatório no intervalo
1000 e 9999, gerado por:*/



    //Cria um numero aleatório para um intervalo
    private static int getRandomNumberInRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    private static void pagamento(String pagador, String recebedor, String QRCode){

    }
}
   /* String s = "5;PERIGO;1;1234";
    String[] dados = s.split(";");
    Para acessar os membros de dados, utilizar dados[índice],
onde índice é um número inteiro que representa a informação
desejada.
*/
