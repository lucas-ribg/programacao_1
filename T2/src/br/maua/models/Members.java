package br.maua.models;

import br.maua.enums.Roles;

public abstract class Members {

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

