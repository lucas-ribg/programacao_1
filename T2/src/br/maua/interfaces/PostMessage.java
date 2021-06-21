package br.maua.interfaces;

import br.maua.enums.OfficeHour;

public interface PostMessage {
    public void postMessage(int value, OfficeHour hour);
}
