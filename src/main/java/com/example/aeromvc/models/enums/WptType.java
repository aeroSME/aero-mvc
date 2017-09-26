package com.example.aeromvc.models.enums;

public enum  WptType {

    F ("Off route"),
    I ("Unnamed, charted or Computer Navigation Fix (CNF)"),
    N ("NDB"),
    R ("NAmed"),
    V ("VFR (Ed7) Only used when specifically indicates VFR. DO NOT use on a terminal procedure or ATS Routes."),
    W ("FAA NRS (Navigational Reference System) Waypoint.");

    private final String displayName;

    WptType(String displayName) {
        this.displayName = displayName;
    }
}
