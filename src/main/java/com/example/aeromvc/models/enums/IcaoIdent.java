//package com.example.aeromvc.models.enums;
//
//import com.example.aeromvc.models.forms.Wpt;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class IcaoIdent {
//
//    @Id
//    @GeneratedValue
//    private int id;
//
//    @NotNull
//    private String name;
//
//    @OneToMany
//    @JoinColumn(name = "icaoident_id")
//    private List<Wpt> waypoints = new ArrayList<>();
//
//    public IcaoIdent() {}
//
//    public IcaoIdent(String name) { this.name = name; }
//
//    public int getId() { return id; }
//
//    public String getName() { return name; }
//
//    public void setName(String name) { this.name = name; }
//
//    public List<Wpt> getWaypoints() { return waypoints; }
//
//}
//
////    KSTL ("KSTL");
