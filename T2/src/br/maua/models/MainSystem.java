package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainSystem {
    Scanner scanner;
    OfficeHour hour = OfficeHour.REGULAR;
    private boolean executeSystem = true;
    ArrayList<Members> member = new ArrayList<>();

    /**
     * Execute system
     */
    public void execute(){
        while(executeSystem){
            int op;
            welcome();
            menu();
            op = Integer.parseInt(scanner.nextLine());
            menuValue(op);
        }
    }

    public void welcome(){
        System.out.println("\n=========================");
        System.out.println("Welcome to MAsK_S0c13ty!");
        System.out.println("=========================\n");
    }

    public void menu(){
        hourType();
        System.out.println("- Press 1 to add a member");
        System.out.println("- Press 2 to fire a member");
        System.out.println("- Press 3 to post message");
        System.out.println("- Press 4 to change Office Hour");
        System.out.println("- Press 5 to report");
        System.out.println("- Press 6 to exit settings");
    }


    public void menuValue(int op){
        switch(op){
            case 1:
                try {
                    this.registerMember();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                fireMember();
                break;

            case 3:
                //for member => PostMessage();
                break;

            case 4:
                if(this.hour == OfficeHour.REGULAR){
                    hour = OfficeHour.EXTRA;
                }
                if(this.hour == OfficeHour.EXTRA){
                    hour = OfficeHour.REGULAR;
                }
                break;

            case 5:
                //for member => report

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

            this.member.add();
        }
    }

    public void fireMember(){

    }

    public void hourType(){

    }

}


