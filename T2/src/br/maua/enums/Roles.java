package br.maua.enums;

import br.maua.interfaces.PostMessage;
import br.maua.interfaces.Presentation;

public enum Roles implements PostMessage, Presentation {
    MOBILE_MEMBERS(0),
    HEAVY_LIFTERS(1),
    SCRIPT_GUYS(2),
    BIG_BROTHERS(3);

    private int value;

    Roles(final int value){
        this.value = value;
    }

    @Override
    public void postMessage(int value, OfficeHour hour) {
        if(hour == OfficeHour.REGULAR){
            switch (value){
                case 0:
                    System.out.println("Happy Coding!");
                    break;
                case 1:
                    System.out.println("Podem contar conosco!");
                    break;
                case 2:
                    System.out.println("Prazer em ajudar novos amigos de código!");
                    break;
                case 3:
                    System.out.println("Sempre ajudando as pessoas membros ou não S2!");
                    break;
            }
        }
        if(hour == OfficeHour.EXTRA){
            switch (value){
                case 0:
                    System.out.println("MAsK_S0c13ty");
                    break;
                case 1:
                    System.out.println("N00b_qu3_n_Se_r3pita.bat");
                    break;
                case 2:
                    System.out.println("QU3Ro_S3us_r3curs0s.py");
                    break;
                case 3:
                    System.out.println("...");
                    break;
            }
        }
    }

    @Override
    public void presentation(int value) {

    }

    public int getValue() {
        return value;
    }
}
