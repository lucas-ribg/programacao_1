package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;

public class HeavyLifters extends Members{

    public HeavyLifters(int ID, String name, String email, Roles role) {
        super(ID, name, email, role);
    }

    @Override
    public String postMessage(OfficeHour hour) {
        if(hour == OfficeHour.REGULAR){
            return("Podem contar conosco!");
        } else{
            return("N00b_qu3_n_Se_r3pita.bat");
        }
    }

    @Override
    public String presentation(Members member) {
        return("ID:" + member.getID() + " | " + member.getEmail() + " - " + member.getName()+ "(" + member.getRole() + ")");
    }
}
