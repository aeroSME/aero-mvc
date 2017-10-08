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
    @JoinColumn(name = "icao_rgn_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public IcaoRgn() {}

    public IcaoRgn(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}