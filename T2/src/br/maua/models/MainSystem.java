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

    /**
     * Deleta uma linha no "arquivo_super_Secreto_nao_abrir.csv" de acordo com o ID escolhido pelo usuário.
     * Faz isso criando o arquivo "temporario.csv" e copiando os novos dados nele. Assim que finalizado ele apaga o arquivo antigo e
     * renomeia o arquivo temporario para o nome passado pelo parâmetro fileName.
     * @param fileName nome do arquivo em que serão gravados os novos dados sem a linha com o ID selecionado.
     */
    public void fireMember(String fileName){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do membro que sera demitido:");
        String numID = scanner.nextLine();
        String tempFile = "temporario.csv";
        String ID; String name; String email; String role;

        try{
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            File csvTest = path;
            Scanner y = new Scanner(csvTest);
            y.useDelimiter("[;\n]");

            while(y.hasNext()){
                ID = y.next();
                name = y.next();
                email = y.next();
                role = y.next();

                if(!ID.equals(numID)){
                    pw.print(ID + ";" + name + ";" + email + ";" + role + "\n");
                }
            }
            y.close();
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            new File(fileName).delete();
            File novoNome = new File(fileName);
            new File(tempFile).renameTo(novoNome);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }

    /**
     * Exibe qual o tipo de horário em que o usuário está.
     */
    public void hourType(){
        System.out.println("Você está em horário "+ hour + "!\n");

    }

    /**
     * Posta uma mensagem para cada membro presente em "arquivo_super_Secreto_nao_abrir.csv" de acordo com a role.
     * @param hour hora em que os membros estão trabalhando, diferenciando qual tipo de mensagem cada role irá retornar.
     */
    public void postMessage(OfficeHour hour) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String itemCsv = br.readLine();

            while(itemCsv != null){

                String[] itemSeparado = itemCsv.split(";");
                String ID = itemSeparado[0];
                String name = itemSeparado[1];
                String email = itemSeparado[2];
                String role = itemSeparado[3];

                if (role.equals("MOBILE_MEMBERS")) {

                    MobileMembers temp = new MobileMembers(Integer.parseInt(ID), name, email, Roles.MOBILE_MEMBERS);
                    System.out.println(temp.presentation(temp) + ": " + temp.postMessage(hour));

                } else if (role.equals("HEAVY_LIFTERS")) {

                    HeavyLifters temp = new HeavyLifters(Integer.parseInt(ID), name, email, Roles.HEAVY_LIFTERS);
                    System.out.println(temp.presentation(temp) + ": " + temp.postMessage(hour));

                } else if (role.equals("SCRIPT_GUYS")) {

                    ScriptGuys temp = new ScriptGuys(Integer.parseInt(ID), name, email, Roles.SCRIPT_GUYS);
                    System.out.println(temp.presentation(temp) + ": " + temp.postMessage(hour));

                } else if (role.equals("BIG_BROTHERS")) {

                    BigBrothers temp = new BigBrothers(Integer.parseInt(ID), name, email, Roles.BIG_BROTHERS);
                    System.out.println(temp.presentation(temp) + ": " + temp.postMessage(hour));

                }
                itemCsv = br.readLine();
            }
            br.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }

    
}


