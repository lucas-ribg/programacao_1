package goncalves.ribeiro.lucas;

import java.util.Random;

public class Transacao {
    //Métodos

    //Cria um numero aleatório para um intervalo
    private static int getRandomNumberInRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    //Realiza o pagamento de uma conta para a outra
    public static void pagamento(Conta pagador, Conta recebedor, String QRCode){
        String[] dados = QRCode.split(";");
        String idConta = dados[0];
        String nome = dados[1];
        double valor = Integer.parseInt(dados[2]);

        if (recebedor.getUsuario().getNome() == nome && recebedor.getIdConta() == idConta){
            pagador.transferir(recebedor, valor);
        }
    }

    //gera QRCode
    public void gerarChave(String idConta, String usuario, double valor2) {
        String QRCode = idConta + ";" + usuario + ";" + valor2 + ";" + getRandomNumberInRange(1000, 9999);
        System.out.println(QRCode);
    }

}