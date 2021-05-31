package goncalves.ribeiro.lucas.maps;

import goncalves.ribeiro.lucas.models.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTestDrive {
    public static void main(String[] args) {
        Map<String, Item> itemMap = new TreeMap<>();

        //Adiciona itens no mapa
        itemMap.put("Item1", new Item("maca", 1));
        itemMap.put("Item2", new Item("pera", 2));
        itemMap.put("Item3", new Item("maca", 1));
        itemMap.put("Item1", new Item("banana", 3));

        //Passa por todos os elementos
        itemMap.forEach((chave, valor) -> System.out.println("Chave: " + chave + "\tValor: " + valor));

        //Imprime todos os elementos do map
        System.out.println(itemMap);

        //Outra forma de recuperar os itens do Mapa
        Item item = itemMap.get("Item1");
        System.out.println(item);
        item = itemMap.get("Goku");
        System.out.println(item);
        item = itemMap.getOrDefault("Vegeta", new Item("Ola", 100));
        System.out.println(item);
        item = itemMap.getOrDefault("Item2", new Item("Ola2", 200));
        System.out.println(item);
    }
}
