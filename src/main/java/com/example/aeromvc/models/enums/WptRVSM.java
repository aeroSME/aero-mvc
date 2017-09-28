package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class WptRVSM {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "wptrvsm_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public WptRVSM() {}

    public WptRVSM(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}
//package com.example.aeromvc.models.enums;
//
//public class WptRVSM {
//
//    E ("Entry Point Only"),
//    EE ("Entry/Exit Point"),
//    R ("RVSM (Used on an airway or stand alone in RVSM airspace)"),
//    T ("RVSM Transition Waypoint"),
//    X ("Exit Point Only");
//
//    private final String displayName;
//
//    WptRVSM(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//
//}
