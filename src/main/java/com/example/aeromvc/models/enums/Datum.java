package com.example.aeromvc.models.enums;

public enum  Datum {

    WGE	("WGS 1984	Global Definition"),
    WGX	("WGS 1984	GPS");

    private final String displayName;

    Datum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}


