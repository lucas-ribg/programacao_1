package goncalves.ribeiro.lucas.jokenpo.model.classico;

import goncalves.ribeiro.lucas.jokenpo.model.Jogada;

public class Pedra extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Tesoura) || (jogada instanceof Pedra);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof );
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
