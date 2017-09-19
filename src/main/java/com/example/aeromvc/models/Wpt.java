package com.example.aeromvc.models;

public class Wpt {
  private Long wptid;
  private Long ardmid;
  private String wpt_ident;
  private String icao_rgn;
  private Double latitude;
  private Double longitude;
  private String datum;
  private String local_datum;
  private Long geo_acc;
  private String d_magvar;
  private Double var;
  private java.sql.Date var_date;
  private String usage_cd;
  private String wpt_type;
  private String wpt_rvsm;
  private Long wp_elev;
  private Long in_dafif;
  private Long drv_ident;
  private String chart_text;
  private String name_ind;
  private String name_desc;
  private String place_name;
  private String custarea;
  private String cont_app_type;
  private java.sql.Timestamp mod_date;
  private Long airac_cycle;

  public Long getWptid() {
    return wptid;
  }

  public Long getArdmid() {
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

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public String getDatum() {
    return datum;
  }

  public void setDatum(String datum) {
    this.datum = datum;
  }

  public String getLocal_datum() {
    return local_datum;
  }

  public void setLocal_datum(String local_datum) {
    this.local_datum = local_datum;
  }

  public Long getGeo_acc() {
    return geo_acc;
  }

  public void setGeo_acc(Long geo_acc) {
    this.geo_acc = geo_acc;
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

  public String getUsage_cd() {
    return usage_cd;
  }

  public void setUsage_cd(String usage_cd) {
    this.usage_cd = usage_cd;
  }

  public String getWpt_type() {
    return wpt_type;
  }

  public void setWpt_type(String wpt_type) {
    this.wpt_type = wpt_type;
  }

  public String getWpt_rvsm() {
    return wpt_rvsm;
  }

  public void setWpt_rvsm(String wpt_rvsm) {
    this.wpt_rvsm = wpt_rvsm;
  }

  public Long getWp_elev() {
    return wp_elev;
  }

  public void setWp_elev(Long wp_elev) {
    this.wp_elev = wp_elev;
  }

  public Long getIn_dafif() {
    return in_dafif;
  }

  public void setIn_dafif(Long in_dafif) {
    this.in_dafif = in_dafif;
  }

  public Long getDrv_ident() {
    return drv_ident;
  }

  public void setDrv_ident(Long drv_ident) {
    this.drv_ident = drv_ident;
  }

  public String getChart_text() {
    return chart_text;
  }

  public void setChart_text(String chart_text) {
    this.chart_text = chart_text;
  }

  public String getName_ind() {
    return name_ind;
  }

  public void setName_ind(String name_ind) {
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

  public String getCustarea() {
    return custarea;
  }

  public void setCustarea(String custarea) {
    this.custarea = custarea;
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

  public Long getAirac_cycle() {
    return airac_cycle;
  }

  public void setAirac_cycle(Long airac_cycle) {
    this.airac_cycle = airac_cycle;
  }
}
