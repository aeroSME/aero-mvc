package com.example.aeromvc.models;

import com.example.aeromvc.models.enums.*;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.YearMonth;

@Entity
public class Wpt {

  @Id
  @GeneratedValue
  private int wptid;
  private int ardmid;
  @NotNull
  @Size(min=5, max=5, message = "Waypoint Ident must be five characters")
  private String wpt_ident;
  @NotNull(message = "ICAO Region required")
  private String icao_rgn;
  @NotNull(message = "Latitude required")
  private float latitude;
  @NotNull(message = "Longitude required")
  private float longitude;
  private Datum datum = Datum.WGE;
  private LocalDatum local_datum;
  private CoordACC coordACC = CoordACC.ZERO;
  private String d_magvar;
  private Double var;
  private java.sql.Date var_date;
  @NotNull (message = "Waypoint Usage required")
  private WptUsage wpt_usage;
  @NotNull (message = "Waypoint Type required")
  private WptType wpt_type;
  private WptRVSM wpt_rvsm;
  private int wp_elev;
  @NotNull(message = "Required")
  private InDAFIF in_dafif = InDAFIF.N;
  private boolean drv_ident;
  private String chart_text;
  private NameIndicator name_ind;
  @NotNull
  @Size(min = 1, message = "Waypoint Naming Description required")
  private String name_desc;
  private String place_name;
  private ARINCcustArea arincCustArea;
  private String cont_app_type;
  //@NotNull
  private java.sql.Timestamp mod_date;
  //@NotNull
  private YearMonth airac_cycle;

  public Wpt(String aWpt_ident, String aIcao_rgn) {
    setWpt_ident(aWpt_ident);
    setIcao_rgn(aIcao_rgn);
  }

  public Wpt() {}

  public int getWptid() { return wptid; }


  public int getArdmid() {
    return ardmid;
  }

  public String getWpt_ident() {
    return wpt_ident;
  }

  public void setWpt_ident(String wpt_ident) {
    this.wpt_ident = wpt_ident;
  }

  public String getIcao_rgn() {
    return icao_rgn;
  }

  public void setIcao_rgn(String icao_rgn) {
    this.icao_rgn = icao_rgn;
  }

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

  public Datum getDatum() {
    return datum;
  }

  public void setDatum(Datum datum) {
    this.datum = datum;
  }

  public LocalDatum getLocal_datum() {
    return local_datum;
  }

  public void setLocal_datum(LocalDatum local_datum) {
    this.local_datum = local_datum;
  }

  public CoordACC getCoordACC() {
    return coordACC;
  }

  public void setCoordACC(CoordACC coordACC) {
    this.coordACC = coordACC;
  }

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

  public WptUsage getWpt_usage() {
    return wpt_usage;
  }

  public void setWpt_usage(WptUsage wpt_usage) {
    this.wpt_usage = wpt_usage;
  }

  public WptType getWpt_type() {
    return wpt_type;
  }

  public void setWpt_type(WptType wpt_type) {
    this.wpt_type = wpt_type;
  }

  public WptRVSM getWpt_rvsm() {
    return wpt_rvsm;
  }

  public void setWpt_rvsm(WptRVSM wpt_rvsm) {
    this.wpt_rvsm = wpt_rvsm;
  }

  public int getWp_elev() {
    return wp_elev;
  }

  public void setWp_elev(int wp_elev) {
    this.wp_elev = wp_elev;
  }

  public InDAFIF getIn_dafif() {
    return in_dafif;
  }

  public void setIn_dafif(InDAFIF in_dafif) {
    this.in_dafif = in_dafif;
  }

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

  public NameIndicator getName_ind() {
    return name_ind;
  }

  public void setName_ind(NameIndicator name_ind) {
    this.name_ind = name_ind;
  }

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

  public ARINCcustArea getArincCustArea() {
    return arincCustArea;
  }

  public void setArincCustArea(ARINCcustArea arincCustArea) {
    this.arincCustArea = arincCustArea;
  }

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

//  public int getWptid() {
//    return wptid;
//  }
//
//  public int getArdmid() { return ardmid; }
//
//  public String getWpt_ident() {
//    return wpt_ident;
//  }
//
//  public void setWpt_ident(String wpt_ident) {
//    this.wpt_ident = wpt_ident;
//  }
//
//  public String getIcao_rgn() {
//    return icao_rgn;
//  }
//
//  public void setIcao_rgn(String icao_rgn) {
//    this.icao_rgn = icao_rgn;
//  }
//
//  public float getLatitude() {
//    return latitude;
//  }
//
//  public void setLatitude(float latitude) { this.latitude = latitude; }
//
//  public float getLongitude() {
//    return longitude;
//  }
//
//  public void setLongitude(float longitude) {
//    this.longitude = longitude;
//  }
//
//  public Datum getDatum() {
//    return datum;
//  }
//
//  public void setDatum(String datum) {
//    this.datum = datum;
//  }
//
//  public String getLocal_datum() {
//    return local_datum;
//  }
//
//  public void setLocal_datum(String local_datum) {
//    this.local_datum = local_datum;
//  }
//
//  public int getGeo_acc() {
//    return geo_acc;
//  }
//
//  public void setGeo_acc(int geo_acc) {
//    this.geo_acc = geo_acc;
//  }
//
//  public String getD_magvar() {
//    return d_magvar;
//  }
//
//  public void setD_magvar(String d_magvar) {
//    this.d_magvar = d_magvar;
//  }
//
//  public Double getVar() {
//    return var;
//  }
//
//  public void setVar(Double var) {
//    this.var = var;
//  }
//
//  public java.sql.Date getVar_date() {
//    return var_date;
//  }
//
//  public void setVar_date(java.sql.Date var_date) {
//    this.var_date = var_date;
//  }
//
//  public String getUsage_cd() {
//    return usage_cd;
//  }
//
//  public void setUsage_cd(String usage_cd) {
//    this.usage_cd = usage_cd;
//  }
//
//  public String getWpt_type() {
//    return wpt_type;
//  }
//
//  public void setWpt_type(String wpt_type) {
//    this.wpt_type = wpt_type;
//  }
//
//  public String getWpt_rvsm() {
//    return wpt_rvsm;
//  }
//
//  public void setWpt_rvsm(String wpt_rvsm) {
//    this.wpt_rvsm = wpt_rvsm;
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
//  public String getIn_dafif() {
//    return in_dafif;
//  }
//
//  public void setIn_dafif(boolean in_dafif) {
//    this.in_dafif = in_dafif;
//  }
//
//  public boolean getDrv_ident() {
//    return drv_ident;
//  }
//
//  public void setDrv_ident(boolean drv_ident) {
//    this.drv_ident = drv_ident;
//  }
//
//  public String getChart_text() {
//    return chart_text;
//  }
//
//  public void setChart_text(String chart_text) {
//    this.chart_text = chart_text;
//  }
//
//  public String getName_ind() {
//    return name_ind;
//  }
//
//  public void setName_ind(String name_ind) {
//    this.name_ind = name_ind;
//  }
//
//  public String getName_desc() {
//    return name_desc;
//  }
//
//  public void setName_desc(String name_desc) {
//    this.name_desc = name_desc;
//  }
//
//  public String getPlace_name() {
//    return place_name;
//  }
//
//  public void setPlace_name(String place_name) {
//    this.place_name = place_name;
//  }
//
//  public String getCustarea() {
//    return custarea;
//  }
//
//  public void setCustarea(String custarea) {
//    this.custarea = custarea;
//  }
//
//  public String getCont_app_type() {
//    return cont_app_type;
//  }
//
//  public void setCont_app_type(String cont_app_type) {
//    this.cont_app_type = cont_app_type;
//  }
//
//  public java.sql.Timestamp getMod_date() {
//    return mod_date;
//  }
//
//  public void setMod_date(java.sql.Timestamp mod_date) {
//    this.mod_date = mod_date;
//  }
//
//  public int getAirac_cycle() { return airac_cycle; }
//
//  public void setAirac_cycle(int airac_cycle) {
//    this.airac_cycle = airac_cycle;
//  }
}
