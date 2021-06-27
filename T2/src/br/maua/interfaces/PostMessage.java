package br.maua.interfaces;

import br.maua.enums.OfficeHour;

/**
 * Interface com um método para o membro postar uma messagem
 */
public interface PostMessage {
    String postMessage(OfficeHour hour);
}
