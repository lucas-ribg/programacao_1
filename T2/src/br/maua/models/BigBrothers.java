package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;


public class BigBrothers extends Members {

    public BigBrothers(int ID, String name, String email, Roles role){
        super(ID, name, email, role);
    }

    @Override
    public void postMessage(OfficeHour hour) {
        if(hour == OfficeHour.REGULAR){
            System.out.println("Sempre ajudando as pessoas membros ou não S2!");
        }
        if(hour == OfficeHour.EXTRA){
            System.out.println("...");
        }
    }

    @Override
    public void presentation() {
        System.out.println("ID: " + this.getID() + "Nome: " + this.getName() + "Função: " + this.getRole());
    }
}
