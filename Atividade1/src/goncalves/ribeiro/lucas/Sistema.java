package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Sistema {
    //Atributos

    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;
    private Transacao transacao;

    //Métodos
    //roda o programa
    public void executar(){
        int op;
        while(executarSistema){
            exibirMenu();
            op = scanner.nextInt();
            avaliarOpcao(op);
        }
    }
    //permite que a operaçao escolhida pelo usuario seja realizada
    private void avaliarOpcao(int op) {
        switch (op){
            case 1:
                System.out.println("Informe seu usuario");
                String pagador = scanner.nextLine();

                System.out.println("Informe o usuario do destinatário:");
                String recebedor = scanner.nextLine();

                System.out.println("Informe o valor:");
                int valor = scanner.nextInt();

                System.out.println("Informe o QRCode: ");
                String QRCode = scanner.nextLine();
                //realiza o pagamento
                this.transacao.pagamento(pagador, recebedor, valor, QRCode);
                break;
            case 2:
                //gera o QRCode
                this.transacao.gerarChave();
                break;
            case 0:
                System.out.println("Obrigado pela preferência");
                this.executarSistema = false;
                break;
        }
    }
    //exibe menu
    private void exibirMenu() {
        System.out.println("Qual operação deseja realizar?");
        System.out.println("1. Pagar");
        System.out.println("2. Receber");
        System.out.println("0. Encerrar");
    }

    //construtor
    public Sistema(){
        this.scanner = new Scanner(System.in);
        this.executarSistema = true;
        this.transacao = new Transacao();
        this.conta = new Conta("c1", 1000.00 , "Joao");
        this.conta = new Conta("c2", 250.00 , "Catarina");
        this.conta = new Conta("c3", 3000.00 , "Marcio");
    }
}
