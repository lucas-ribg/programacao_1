package br.maua.models;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSystem {
    Scanner scanner;
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
                registerMember();
                break;

            case 2:
                fireMember();
                break;

            case 3:
                //PostMessage();
                break;

            case 4:
                //changeHour();
                break;
            case 5:
                //report

            case 6:
                executeSystem = false;
            break;
        }
    }

    public void registerMember(){

    }

    public void fireMember(){

    }

    public void hourType(){

    }

}


