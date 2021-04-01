package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Main {
    //Atributos
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;
    private Transacao transacao;

    public static void main(String[] args) {
        Main main = new Main();
        Conta conta2 = new Conta("c2", 250.00, "Marcio");
        Conta conta3 = new Conta("c3", 3000.00, "Catarina");
        main.executar();

    }

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
                System.out.println("Informe seu nome:");
                String pagador = scanner.nextLine();

                System.out.println("Informe o nome recebedor:");
                String recebedor = scanner.nextLine();

                System.out.println("Informe o QRCode: ");
                String QRCode = scanner.nextLine();

                //realiza o pagamento
                this.transacao.pagamento(pagador, recebedor, QRCode);
                break;
            case 2:
                System.out.println("Informe o Id da Conta");
                String idConta = scanner.nextLine();

                System.out.println("Informe seu usuario:");
                String usuario = scanner.nextLine();

                System.out.println("Informe o valor:");
                double valor2 = scanner.nextInt();
                //gera o QRCode
                this.transacao.gerarChave(idConta, usuario, valor2);
                break;
            case 0:
                System.out.println("Agradecemos a preferência!");
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
    public Main(){

        this.scanner = new Scanner(System.in);
        this.executarSistema = true;
        this.transacao = new Transacao();
        this.conta = new Conta("c1", 1000.00, "Lucas");
    }

    @Override
    public String toString() {
        return "Main{" +
                "executarSistema=" + executarSistema +
                ", scanner=" + scanner +
                ", conta=" + conta +
                ", transacao=" + transacao +
                '}';
    }
}