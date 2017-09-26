package com.example.aeromvc.models.enums;

public enum WptRVSM {

    E ("Entry Point Only"),
    EE ("Entry/Exit Point"),
    R ("RVSM (Used on an airway or stand alone in RVSM airspace)"),
    T ("RVSM Transition Waypoint"),
    X ("Exit Point Only");

    private final String displayName;

    WptRVSM(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
