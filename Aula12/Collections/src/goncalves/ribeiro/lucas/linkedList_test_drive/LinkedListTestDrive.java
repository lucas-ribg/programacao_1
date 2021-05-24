package goncalves.ribeiro.lucas.linkedList_test_drive;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<String> cidades = new LinkedList<>();
        cidades.add("pallet");
        cidades.add("veridia");
        cidades.add("pwetwe");
        cidades.add("cerulean");
        cidades.add("celadon");
        cidades.add("safra");
        cidades.add("dsadad");
        cidades.add("seila");

        System.out.println("Passa pelas cidades:");
        cidades.forEach((cidade) -> System.out.println(cidade));

        cidades.add(5, "safari");
        cidades.remove(2);

        System.out.println("Passa pelas cidades:");
        cidades.forEach((cidade) -> System.out.println(cidade));

        //Trabalhando com Iterator
        System.out.println("trabalhando com iterator:");
        Iterator<String> iterator = cidades.iterator();
        //navega pelos elementos do LinkedList usando o iterator
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
