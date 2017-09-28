package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class WptUsage {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "wptusage_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public WptUsage() {}

    public WptUsage(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}
//package com.example.aeromvc.models.enums;
//
//public class WptUsage {
//
//    B ("Both high level and low level"),
//    H ("High level"),
//    L ("Low level"),
//    R ("RNAV"),
//    T ("Terminal waypoint"),
//    G ("Runway or Displaced Threshold (DAFIF Terminal Team Only)"),
//    P ("Pitch and Catch (RNAV)"),
//    E ("Off Route Intersection in FAA Airspace (NRS Waypoints)"),
//    S ("ATCAA and SUAS Waypoint in FAA High Altitude Structure");
//
//    private final String displayName;
//
//    WptUsage(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//}
