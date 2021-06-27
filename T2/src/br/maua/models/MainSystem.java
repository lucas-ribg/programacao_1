package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que realiza o funciona do sistema
 */
public class MainSystem {
    Scanner scanner = new Scanner(System.in);
    OfficeHour hour = OfficeHour.REGULAR;
    private boolean executeSystem = true;
    File path = new File("arquivo_super_Secreto_nao_abrir.csv");

    /**
     * Executa o sistema, exibe as boas vindas e o menu de opções
     */
    public void execute(){
        while(executeSystem){
            int op;
            welcome();
            menu();
            menuValue(scanner.nextInt());
        }
    }

    /**
     * Método que da boas vindas ao usuário
     */
    public void welcome(){
        System.out.println("\n=========================");
        System.out.println("Welcome to MAsK_S0c13ty!");
        System.out.println("=========================\n");
    }

    /**
     * Método que exibe um menu com as opções do sistema
     */
    public void menu(){
        hourType();
        System.out.println("- Press 1 to add a member");
        System.out.println("- Press 2 to fire a member");
        System.out.println("- Press 3 to post message");
        System.out.println("- Press 4 to change Office Hour");
        System.out.println("- Press 5 for report");
        System.out.println("- Press 6 to exit settings");
    }

    /**
     * Seleciona e executa a opção escolhida pelo usuário
     * @param op número inteiro referente a escolha da operação escolhida no menu (entrada pelo usuário)
     */
    public void menuValue(int op){
        switch(op){
            case 1:
                try {
                    registerMember();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Erro");
                }
                break;

            case 2:
                exibirCadastrados();
                fireMember(path.getName());
                break;

            case 3:
                postMessage(hour);
                break;

            case 4:
                if(this.hour == OfficeHour.REGULAR){
                    hour = OfficeHour.EXTRA;
                } else {
                    hour = OfficeHour.REGULAR;
                }
                break;

            case 5:
                exibirCadastrados();
                break;
            case 6:
                executeSystem = false;
                break;
        }
    }

    public void registerMember() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean aux = true;

        while(aux){
            System.out.println("\nDigite o nome:\n");
            String name = scanner.nextLine();
            System.out.println("Digite o ID:\n");
            String ID = scanner.nextLine();
            System.out.println("Escolha a função:\n");
            String role = scanner.nextLine();

            FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);

            fileWriter.write("ROLE  NAME  ID\n");
            fileWriter.append(role + ";" + name + ";" + ID + "\n");

            System.out.println("Deseja registrar mais um membro? (S/N)\n");
            String aux2 = scanner.nextLine();

            if (aux2.equals("s")) {
                aux = true;
            } else {
                aux = false;
            }

            //this.member.add();
        }
    }

    public void fireMember(){

    }

    public void hourType(){

    }

}


