package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;

public class MobileMembers  extends Members {

    public MobileMembers(int ID, String name, String email, Roles role) {
        super(ID, name, email, role);
    }

    @Override
    public String postMessage(OfficeHour hour) {
        if(hour == OfficeHour.REGULAR){
            return("Happy Coding!");
        } else{
            return("Happy_C0d1ng. Maskers.");
        }
    }

    @Override
    public String presentation(Members member) {
        return("ID:" + member.getID() + " | " + member.getEmail() + " - " + member.getName()+ "(" + member.getRole() + ")");
    }
}
