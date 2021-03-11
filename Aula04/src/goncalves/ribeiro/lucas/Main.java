package goncalves.ribeiro.lucas;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta("Saitama", 999.99);

        c1.depositar(300);
        c1.sacar(250);
        System.out.println("Conta 1: " + c1.toString());
    }
}
