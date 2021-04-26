package goncalves.ribeiro.lucas.jokenpo.model.alternativo;

import goncalves.ribeiro.lucas.jokenpo.model.Jogada;
import goncalves.ribeiro.lucas.jokenpo.model.classico.Papel;
import goncalves.ribeiro.lucas.jokenpo.model.classico.Pedra;
import goncalves.ribeiro.lucas.jokenpo.model.classico.Tesoura;

public class Spoke extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}
