package com.example.aeromvc.models;

import com.example.aeromvc.models.enums.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.YearMonth;

@Entity
public class Wpt {

  @Id
  @GeneratedValue
  private int wptid;

//  @NotNull
//  @Size(min=5, max=5, message = "Waypoint Ident must be five characters")
  private String wpt_ident;

  @ManyToOne
//  @NotNull(message = "ICAO Region required")
  private IcaoRgn icaoRgn;

//  @NotNull(message = "Latitude required")
  private float latitude;

//  @NotNull(message = "Longitude required")
  private float longitude;

//  @ManyToOne
//  private Datum datum;

//  @ManyToOne
//  private LocalDatum localDatum;

//  @ManyToOne
//  private Coordacc coordacc;

  private String d_magvar;

  private Double var;

  private java.sql.Date var_date;

//  @ManyToOne
////  @NotNull (message = "Waypoint Usage required")
//  private Wptusage1 wptusage1;
//  @ManyToOne
////  @NotNull (message = "Waypoint Type required")
//  private Wpttype1 wpttype1;
//  @ManyToOne
//  private Wptrvsm1 wptrvsm1;
  private int wp_elev;
//  @NotNull(message = "Required")
//  @ManyToOne
//  private inDafif in_dafif;
  private boolean drv_ident;
  private String chart_text;
//  @ManyToOne
//  private Nameindicator1 name_ind;
  @NotNull
  @Size(min = 1, message = "Waypoint Naming Description required")
  private String name_desc;
  private String place_name;
//  @ManyToOne
//  private Arincrgn1 arincrgn1;
  private String cont_app_type;
  //@NotNull
  private java.sql.Timestamp mod_date;
  //@NotNull
  private YearMonth airac_cycle;

//  public Wpt(String aWpt_ident, IcaoRgn aIcao_rgn) {
//    setWpt_ident(aWpt_ident);
//    setIcao_rgn(aIcao_rgn);
//  }

  public Wpt() {}

  public int getWptid() { return wptid; }

  public String getWpt_ident() {
    return wpt_ident;
  }

  public void setWpt_ident(String wpt_ident) {
    this.wpt_ident = wpt_ident;
  }

  public IcaoRgn getIcao_rgn() { return icaoRgn; }

  public void setIcao_rgn(IcaoRgn icaoRgn) { this.icaoRgn = icaoRgn; }

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

//  public Datum getDatum() {
//    return datum;
//  }
//
//  public void setDatum(Datum datum) {
//    this.datum = datum;
//  }
//
//  public LocalDatum getLocal_datum() {
//    return localDatum;
//  }
//
//  public void setLocal_datum(LocalDatum localDatum) {
//    this.localDatum = localDatum;
//  }
//
//  public Coordacc getCoordacc() {
//    return coordacc;
//  }
//
//  public void setCoordacc(Coordacc coordacc) {
//    this.coordacc = coordacc;
//  }

  public String getD_magvar() {
    return d_magvar;
  }

  public void setD_magvar(String d_magvar) {
    this.d_magvar = d_magvar;
  }

  public Double getVar() {
    return var;
  }

  public void setVar(Double var) {
    this.var = var;
  }

  public java.sql.Date getVar_date() {
    return var_date;
  }

  public void setVar_date(java.sql.Date var_date) {
    this.var_date = var_date;
  }

//  public Wptusage1 getWpt_usage() {
//    return wptusage1;
//  }
//
//  public void setWpt_usage(Wptusage1 wptusage1) {
//    this.wptusage1 = wptusage1;
//  }
//
//  public Wpttype1 getWpt_type() {
//    return wpttype1;
//  }
//
//  public void setWpt_type(Wpttype1 wpttype1) {
//    this.wpttype1 = wpttype1;
//  }
//
//  public Wptrvsm1 getWpt_rvsm() {
//    return wptrvsm1;
//  }
//
//  public void setWpt_rvsm(Wptrvsm1 wpt_rvsm) {
//    this.wptrvsm1 = wpt_rvsm;
//  }
//
//  public int getWp_elev() {
//    return wp_elev;
//  }
//
//  public void setWp_elev(int wp_elev) {
//    this.wp_elev = wp_elev;
//  }
//
//  public inDafif getIn_dafif() {
//    return in_dafif;
//  }
//
//  public void setIn_dafif(inDafif in_dafif) {
//    this.in_dafif = in_dafif;
//  }

  public boolean isDrv_ident() {
    return drv_ident;
  }

  public void setDrv_ident(boolean drv_ident) {
    this.drv_ident = drv_ident;
  }

  public String getChart_text() {
    return chart_text;
  }

  public void setChart_text(String chart_text) {
    this.chart_text = chart_text;
  }

//  public Nameindicator1 getName_ind() {
//    return name_ind;
//  }
//
//  public void setName_ind(Nameindicator1 name_ind) {
//    this.name_ind = name_ind;
//  }

  public String getName_desc() {
    return name_desc;
  }

  public void setName_desc(String name_desc) {
    this.name_desc = name_desc;
  }

  public String getPlace_name() {
    return place_name;
  }

  public void setPlace_name(String place_name) {
    this.place_name = place_name;
  }

//  public Arincrgn1 getArincCustArea() {
//    return arincrgn1;
//  }
//
//  public void setArincCustArea(Arincrgn1 arincrgn1) {
//    this.arincrgn1 = arincrgn1;
//  }

  public String getCont_app_type() {
    return cont_app_type;
  }

  public void setCont_app_type(String cont_app_type) {
    this.cont_app_type = cont_app_type;
  }

  public java.sql.Timestamp getMod_date() {
    return mod_date;
  }

  public void setMod_date(java.sql.Timestamp mod_date) {
    this.mod_date = mod_date;
  }

  public YearMonth getAirac_cycle() {
    return airac_cycle;
  }

  public void setAirac_cycle(YearMonth airac_cycle) {
    this.airac_cycle = airac_cycle;
  }

}
