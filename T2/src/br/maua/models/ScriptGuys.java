package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;

public class ScriptGuys extends Members{

    public ScriptGuys(int ID, String name, String email, Roles role) {
        super(ID, name, email, role);
    }

    @Override
    public String postMessage(OfficeHour hour) {
        if(hour == OfficeHour.REGULAR){
            return("Prazer em ajudar novos amigos de código!");
        } else{
            return("QU3Ro_S3us_r3curs0s.py");
        }    }

    @Override
    public String presentation(Members member) {
        return("ID:" + member.getID() + " | " + member.getEmail() + " - " + member.getName()+ "(" + member.getRole() + ")");
    }
}
