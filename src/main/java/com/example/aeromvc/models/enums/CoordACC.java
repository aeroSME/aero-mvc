package com.example.aeromvc.models.enums;

public enum CoordACC {

    ZERO ("Accurate to hundredths of seconds"),
    ONE ("Accurate to tenths of seconds"),
    TWO ("Accurate to seconds"),
    FOUR ("Accurate to minutes");

    private final String displayName;

    CoordACC(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
