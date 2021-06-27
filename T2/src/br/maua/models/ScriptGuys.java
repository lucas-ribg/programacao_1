package br.maua.models;

import br.maua.enums.OfficeHour;
import br.maua.enums.Roles;

/**
 * Classe que representa o cargo dos ScriptGuys e extende a classe membros
 */
public class ScriptGuys extends Members{

    public ScriptGuys(int ID, String name, String email, Roles role) {
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
            return("Prazer em ajudar novos amigos de código!");
        } else{
            return("QU3Ro_S3us_r3curs0s.py");
        }    }

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
