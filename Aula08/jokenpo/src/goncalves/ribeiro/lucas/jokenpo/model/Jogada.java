package goncalves.ribeiro.lucas.jokenpo.model;

import goncalves.ribeiro.lucas.jokenpo.enumeracao.Resultado;

public abstract class Jogada {
    final public Resultado verificarResultado(Jogada jogada){
        if(verificarSeGanhei(jogada)){
            return Resultado.EMPATOU;
        }
        if (verificarSeGanhei(jogada)) {
            return Resultado.GANHOU;
        }
        if (verificarSePerdi(jogada)) {
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }

    final private boolean verificarSeGanhei(Jogada jogada){
        for (Jogada jogadaGanha : jogadaQueVenco()) {
            if (jogadaGanha.getClass() == jogada.getClass()) {
                return true;
            }
        }
        return false;
    }

    final private boolean verificarSePerdi(Jogada jogada){
        for (Jogada jogadaGanha : jogadaQuePerco()) {
            if (jogadaGanha.getClass() == jogada.getClass()) {
                return true;
            }
        }
        return false;
    }
    public abstract jogadaQueVenco();
}
