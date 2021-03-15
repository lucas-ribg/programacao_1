package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;

    public void executar(){
        int opcao;
        while(executarSistema){
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }

    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado por escolher o MauaBank!");
                this.executarSistema = false;
                break;
            case 1:
                System.out.println("Saldo Atual: R$" + this.conta.getSaldo());
                break;
            case 2:
                
            default:
                System.out.println("Essa funcionalidade ainda não foi implementada!");
        }
    }

    public Sistema() {
        this.scanner = new Scanner(System.in); //Deixa ele ler a entrada do sistema - teclado
        this.executarSistema = true;
        this.conta = new Conta("Mario", 1945, 1234);
    }

    private void exibirMenu() {
        System.out.println("Bem Vindo ao MauaBank!");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Sacar Dinheiro");
        System.out.println("3 - Depositar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar Conta");
        System.out.println("0 - Encerrar");
    }
}