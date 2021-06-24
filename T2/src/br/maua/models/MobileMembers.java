package br.maua.models;

import br.maua.enums.Roles;

public class MobileMembers  extends Members {

    public MobileMembers(int ID, String name, String email, Roles role) {
        super(ID, name, email, role);
    }

}
