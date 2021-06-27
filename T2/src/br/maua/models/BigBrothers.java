package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;


public class BigBrothers extends Members {

    public BigBrothers(int ID, String name, String email, Roles role){
        super(ID, name, email, role);
    }

    @Override
    public String postMessage(OfficeHour hour) {
        if(hour == OfficeHour.REGULAR){
            return("Sempre ajudando as pessoas membros ou não S2!");
        } else {
            return("...");
        }
    }

    @Override
    public String presentation(Members member) {
        return("ID:" + member.getID() + " | " + member.getEmail() + " - " + member.getName()+ "(" + member.getRole() + ")");
    }
}
