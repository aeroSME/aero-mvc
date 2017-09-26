package com.example.aeromvc.models.enums;

public enum  IcaoRgn {

    K1 ("K1"),
    K2 ("K2"),
    K3 ("K3"),
    K4 ("K4"),
    K5 ("K5"),
    K6 ("K6"),
    K7 ("K7");

    private final String displayName;

    IcaoRgn(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
