package goncalves.ribeiro.lucas.sets;

import goncalves.ribeiro.lucas.models.Item;

import java.util.HashSet;
import java.util.Set;

public class HashSetTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new HashSet<>();
        //Adiciona itens no set
        itemSet.add((new Item("maca", 1)));
        itemSet.add((new Item("pera", 2)));
        itemSet.add((new Item("maca", 1)));
        itemSet.add((new Item("banana", 3)));

        //Passa pelos itens
        itemSet.forEach(item -> System.out.println(item));
    }
}
