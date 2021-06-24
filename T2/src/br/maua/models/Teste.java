package br.maua.models;

import br.maua.enums.Roles;

public class Teste {
    public static void main(String[] args) {
        Members daniel = new MobileMembers(12, "daniel", "danie", Roles.MOBILE_MEMBERS);
        daniel.getRole().postMessage();
    }
}
