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
    public boolean pagamento(Conta pagador, Conta recebedor, String QRCode){
        String[] dados = QRCode.split(";");
        String idConta = dados[0];
        String nome = dados[1].toLowerCase();
        String valor = dados[2];
        double dValor = Double.parseDouble(valor);

        if (recebedor.getUsuario().getNome().equals(nome) && recebedor.getIdConta().equals(idConta)){
            if(pagador.transferir(recebedor, dValor)){
                return true;
            } else { return false; }

        } else { return false; }
    }

    //gera QRCode
    public void gerarChave(String idConta, String usuario, String valor2) {
        String QRCode = idConta + ";" + usuario + ";" + valor2 + ";" + getRandomNumberInRange(1000, 9999);
        System.out.println(QRCode);
    }

}