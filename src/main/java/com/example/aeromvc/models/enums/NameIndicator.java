package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NameIndicator {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "nameindicator_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public NameIndicator() {}

    public NameIndicator(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}
//package com.example.aeromvc.models.enums;
//
//public class NameIndicator {
//
//    A ("Abeam Fix;)"),
//    B ("   Bearing and Distance Fix"),
//    D ("Airport Name as Fix"),
//    F ("FIR Fix"),
//    H ("Phonetic Letter Name Fix"),
//    I ("Airport Ident as Fix"),
//    L ("Latitude/Longitude Fix"),
//    M ("Multiple Word Name Fix"),
//    N ("Navaid Ident as Fix"),
//    P ("Published Five - Letter - Name - Fix"),
//    Q ("Published Name Fix, less than five letters"),
//    R ("Published Name Fix, more than five letters"),
//    T ("Airport/Rwy Related Fix (Note 2)"),
//    U ("UIR Fix"),
//    O ("Localizer Marker with officially published five - letter identifier"),
//    M2 (" Localizer Marker without officially published five - letter identifier");
//
//    private final String displayName;
//
//    NameIndicator(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//}
