package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Datum {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "datum_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public Datum() {}

    public Datum(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}
//package com.example.aeromvc.models.enums;
//
//public class  Datum {
//
//    WGE	("WGS 1984	Global Definition"),
//    WGX	("WGS 1984	GPS");
//
//    private final String displayName;
//
//    Datum(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//
//}
//
//
