package goncalves.ribeiro.lucas.models;

import java.util.Comparator;

public class ItemComparable implements Comparator<Item> {
    /**
     * Classe com a regra de comparação entre itens
     */
    @Override
    public int compare(Item o1, Item o2) {
        if(o1.id > o2.id) return -1;
        else if(o1.id == o2.id) return 0;
        else return 0;
    }
}
