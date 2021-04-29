package br.maua.estudoexceção;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1(){
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo");
        int [] array = new int[10];
        for(int i=0; i<=15; i++){
            try {
                array[i] = i;
            }catch (ArrayIndexOutOfBoundsException exception){
                exception.printStackTrace();
                System.out.println("OPA! Fora do Limite do vetor!");
            }

            System.out.println(i);
        }
        System.out.println("Fim do metodo");
    }


}
