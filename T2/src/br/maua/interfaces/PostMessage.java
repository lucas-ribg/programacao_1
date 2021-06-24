package br.maua.interfaces;

import br.maua.enums.OfficeHour;

public interface PostMessage {
    void postMessage(int value, OfficeHour hour);
}
