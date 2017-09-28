package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FaaIdent {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "faaident_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public FaaIdent() {}

    public FaaIdent(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}


//package com.example.aeromvc.models.enums;
//
//public class  FaaIdent {
//
//    STL ("STL");
//
//    public final String displayName;
//
//    FaaIdent(String displayName) { this.displayName = displayName; }
//
//    public String getDisplayName() { return displayName; }
//
//}
//
