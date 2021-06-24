package br.maua.models;

import br.maua.enums.Roles;

public abstract class Members {

    private String name;
    private String email;
    private Roles role;

    public Members(String name, String email, Roles role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

}

