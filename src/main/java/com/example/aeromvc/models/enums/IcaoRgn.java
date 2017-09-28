package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class IcaoRgn {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "arincrgn_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public IcaoRgn() {}

    public IcaoRgn(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}

//package com.example.aeromvc.models.enums;
//
//public class  IcaoRgn {
//
//    K1 ("K1"),
//    K2 ("K2"),
//    K3 ("K3"),
//    K4 ("K4"),
//    K5 ("K5"),
//    K6 ("K6"),
//    K7 ("K7");
//
//    private final String displayName;
//
//    IcaoRgn(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//
//}
