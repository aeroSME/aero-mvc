//package com.example.aeromvc.models.enums;
//
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
//    @JoinColumn(name = "icao_ident_id")
//    private List<Aerodrome> airports = new ArrayList<>();
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
//    public List<Aerodrome> getAirports() { return airports; }
//
//}
//
////    KSTL ("KSTL");
