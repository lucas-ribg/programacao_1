package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;

/**
 * Classe que representa o cargo dos BigBrothers e extend a classe membros
 */
public class BigBrothers extends Members {

    public BigBrothers(int ID, String name, String email, Roles role){
        super(ID, name, email, role);
    }

    /**
     * Método que posta a mensagem pelo membro em seu respectivo horario de trabalho
     * @param hour Horátio de trabalho em que se encontra
     * @return retorna a mensagem a ser postada pelo membro
     */
    @Override
    public String postMessage(OfficeHour hour) {
        if(hour == OfficeHour.REGULAR){
            return("Sempre ajudando as pessoas membros ou não S2!");
        } else {
            return("...");
        }
    }

    /**
     * Método que realiza a apresentação do membro
     * @param member Membro referente a apresentação
     * @return retorna a apresentação do membro
     */
    @Override
    public String presentation(Members member) {
        return("ID:" + member.getID() + " | " + member.getEmail() + " - " + member.getName()+ "(" + member.getRole() + ")");
    }
}
