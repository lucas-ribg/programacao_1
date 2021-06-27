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

    /**
     * Quando chamado, grava ID;nome;email;role escolhidos pelo usuário no "arquivo_super_Secreto_nao_abrir.csv".
     * @throws IOException mostra a mensagem "Erro" caso haja algum problema.
     */
    public void registerMember() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean aux = true;
        FileWriter csvWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
        File csvTest = path;

        if (csvTest.length() == 0){
            csvWriter.append("ID");
            csvWriter.append(";");
            csvWriter.append("Name");
            csvWriter.append(";");
            csvWriter.append("Email");
            csvWriter.append(";");
            csvWriter.append("Role");
            csvWriter.append("\n");
        }

        while(aux) {
            boolean aux1 = true;
            System.out.println("Digite o ID:");
            String ID = scanner.nextLine();
            while (aux1) {
                Scanner y = new Scanner(csvTest);
                y.useDelimiter("[;\n]");
                String Teste = "";
                while (y.hasNext()) {
                    String idTest = y.next();
                    y.next();
                    y.next();
                    y.next();
                    if (idTest.equals(ID)) {
                        System.out.println("ID já existe!\nEscolha outro:");
                        Teste = "existe";
                        break;
                    }
                }
                if (Teste.equals("existe")) {
                    System.out.println("Digite o ID:");
                    ID = scanner.nextLine();
                } else aux1 = false;
                y.close();
            }
            System.out.println("Digite o nome:");
            String name = scanner.nextLine();
            System.out.println("Digite o email:");
            String email = scanner.nextLine();
            String role;
            while(true) {
                System.out.println("Escolha a função:\n");
                System.out.println("0 - Mobile Member");
                System.out.println("1 - Heavy Lifter");
                System.out.println("2 - Script Guy");
                System.out.println("3 - Big Brother");
                int op = Integer.parseInt(scanner.nextLine());
                if (op == 0) {
                    role = "MOBILE_MEMBERS";
                    break;
                } if (op == 1) {
                    role = "HEAVY_LIFTERS";
                    break;
                } if (op == 2) {
                    role = "SCRIPT_GUYS";
                    break;
                } if (op == 3) {
                    role = "BIG_BROTHERS";
                    break;
                } else {
                    System.out.println("Função escolhida não existe!");
                }
            }
            List<List<String>> Dados = Arrays.asList(Arrays.asList(ID, name, email, role));

            for (List<String> novosDados : Dados) {
                csvWriter.append(String.join(";", novosDados));
                csvWriter.append("\n");
            }

            csvWriter.flush();

            System.out.println("Deseja registrar mais um membro? (S/N)");
            String aux2 =scanner.nextLine();

            if (aux2.equals("s")|aux2.equals("S")) {
                aux = true;
            } else {
                csvWriter.close();
                aux = false;
            }
        }
    }

    public void fireMember(){

    }

    public void hourType(){

    }

}


