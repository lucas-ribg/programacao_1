package br.maua.enums;

public enum OfficeHour {
    REGULAR(0), EXTRA(1);

    private int code;

    OfficeHour(int code) {
        this.code = code;
    }
}
