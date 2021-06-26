package br.maua.models;

import br.maua.enums.Roles;
import br.maua.interfaces.PostMessage;
import br.maua.interfaces.Presentation;

public abstract class Members implements PostMessage, Presentation {

    private int ID;
    private String name;
    private String email;
    private Roles role;

    public Members(int ID, String name, String email, Roles role) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Roles getRole() {
        return role;
    }
}

