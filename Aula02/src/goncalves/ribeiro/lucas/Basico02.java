package goncalves.ribeiro.lucas;

public class Basico02 {
    public static void main(String[] args) {
        //Estruturas de decisão no java
        int poderDeLuta = 8000;

        //Decisão Simples
        if(poderDeLuta >= 8000){
            System.out.println("Kakaroto!");
        }
        if(poderDeLuta > 10000){
            System.out.println("Pode ser Sayan");
        }
        else {
            System.out.println("Pode ser Kuriri");
        }

        //Decisão multipla - switch

        int morreu =5;
        switch (morreu){
            case 0:
                System.out.println("Olá mundo");
                break;
            case 10:
                System.out.println("Tchau mundo");
                break;
            default:
                System.out.println("vixi!");
                break;

        }

    }
}
