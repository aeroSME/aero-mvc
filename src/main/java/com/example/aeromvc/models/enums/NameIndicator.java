package com.example.aeromvc.models.enums;

public enum NameIndicator {

    A ("Abeam Fix;)"),
    B ("   Bearing and Distance Fix"),
    D ("Airport Name as Fix"),
    F ("FIR Fix"),
    H ("Phonetic Letter Name Fix"),
    I ("Airport Ident as Fix"),
    L ("Latitude/Longitude Fix"),
    M ("Multiple Word Name Fix"),
    N ("Navaid Ident as Fix"),
    P ("Published Five - Letter - Name - Fix"),
    Q ("Published Name Fix, less than five letters"),
    R ("Published Name Fix, more than five letters"),
    T ("Airport/Rwy Related Fix (Note 2)"),
    U ("UIR Fix"),
    O ("Localizer Marker with officially published five - letter identifier"),
    M2 (" Localizer Marker without officially published five - letter identifier");

    private final String displayName;

    NameIndicator(String displayName) {
        this.displayName = displayName;
    }
}
