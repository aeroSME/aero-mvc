package com.example.aeromvc.models.enums;

public enum WptUsage {

    B ("Both high level and low level"),
    H ("High level"),
    L ("Low level"),
    R ("RNAV"),
    T ("Terminal waypoint"),
    G ("Runway or Displaced Threshold (DAFIF Terminal Team Only)"),
    P ("Pitch and Catch (RNAV)"),
    E ("Off Route Intersection in FAA Airspace (NRS Waypoints)"),
    S ("ATCAA and SUAS Waypoint in FAA High Altitude Structure");

    private final String displayName;

    WptUsage(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
