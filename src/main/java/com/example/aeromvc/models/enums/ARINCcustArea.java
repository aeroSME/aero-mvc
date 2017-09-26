package com.example.aeromvc.models.enums;

public enum  ARINCcustArea {

    USA ("United States"),
    LAM ("Latin America"),
    SAM ("South America"),
    CAN ("Canada"),
    PAC ("Pacific"),
    EEU (""),
    SPA (""),
    AFR ("Africa"),
    MES ("Middle East"),
    EUR ("Europe");

    private final String displayName;

    ARINCcustArea(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
