package goncalves.ribeiro.lucas.sets;

import goncalves.ribeiro.lucas.models.Item;
import goncalves.ribeiro.lucas.models.ItemComparable;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new TreeSet<>(new ItemComparable());
        //Adiciona itens no set
        itemSet.add((new Item("maca", 1)));
        itemSet.add((new Item("pera", 2)));
        itemSet.add((new Item("maca", 1)));
        itemSet.add((new Item("banana", 3)));

        //Passa pelos itens
        itemSet.forEach(item -> System.out.println(item));
    }
}
