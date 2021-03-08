package goncalves.ribeiro.lucas;

public class Main {

    public static void main(String[] args) {

        //Cria um objeto do tipo conta
        Conta c1;
        //Instancia um objeto conta
        c1 = new Conta();
        // Conta c1 = new Conta();

        //Pede para conta exibir o saldo
        c1.visualizarSaldo();

        //Modificar o saldo
        c1.saldo = 100;

        c1.visualizarSaldo();
        //Cria um novo objeto do tipo conta

        Conta c2 = new Conta();
        c2.saldo = 123;

        c1.depositar(300);
        c2.depositar(100);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        c1.sacar(4000);

        c1.transferirDinheiro(c2, 50);

        c1.cliente = new Cliente();
        c2.cliente = new Cliente();

        c1.cliente.nome = "Cliente";
        c2.cliente.sobrenome = "1";
        c1.numero = 9;

        System.out.println("Nome do cliente: " + c1.cliente.nome);
        System.out.println("Nome do cliente: " + c2.cliente.nome);

        System.out.println("C1:" + c1.toString());

    }
}
