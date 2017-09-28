package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class WptType {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "wpttype_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public WptType() {}

    public WptType(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}
//package com.example.aeromvc.models.enums;
//
//public class  WptType {
//
//    F ("Off route"),
//    I ("Unnamed, charted or Computer Navigation Fix (CNF)"),
//    N ("NDB"),
//    R ("NAmed"),
//    V ("VFR (Ed7) Only used when specifically indicates VFR. DO NOT use on a terminal procedure or ATS Routes."),
//    W ("FAA NRS (Navigational Reference System) Waypoint.");
//
//    private final String displayName;
//
//    WptType(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//}
