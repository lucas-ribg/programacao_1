package goncalves.ribeiro.lucas.jokenpo.model.alternativo;

import goncalves.ribeiro.lucas.jokenpo.model.Jogada;
import goncalves.ribeiro.lucas.jokenpo.model.classico.Pedra;

public class Lizard extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof );
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof ) || (jogada instanceof );
    }

    @Override
    public String toString() {
        return "Lizard";
    }
}
