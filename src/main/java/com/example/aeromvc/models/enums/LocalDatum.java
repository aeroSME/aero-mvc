package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class LocalDatum {

    @Id
    @GeneratedValue
    private int Id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "local_datum_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Wpt> getWaypoints() {
        return waypoints;
    }
}
