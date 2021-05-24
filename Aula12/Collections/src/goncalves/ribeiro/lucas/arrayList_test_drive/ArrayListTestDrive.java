package goncalves.ribeiro.lucas.arrayList_test_drive;

import goncalves.ribeiro.lucas.model.Conta;
import goncalves.ribeiro.lucas.model.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTestDrive {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        //Adiciona um elemento dentro da lista
        pessoas.add(new Pessoa("All Might", "123546"));
        pessoas.add(new Pessoa("Endevor", "343535"));
        pessoas.add(new Pessoa("Hawk", "6131312"));

        System.out.println("Todos os elementos do ArrayList");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        //Adiciona um elemnto no ArrayList
        pessoas.add(1, new Pessoa("midoria", "61321"));

        System.out.println("Todos os elementos do ArrayList");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        //Cria e incializa diversos valores no arrayList
        List<Conta> contas = new ArrayList<>();
        contas.addAll(Arrays.asList(new Conta(), new Conta(90.0)));

        System.out.println("Todos os elementos do ArrayList");
        contas.forEach(conta -> System.out.println(conta));



    }
}
