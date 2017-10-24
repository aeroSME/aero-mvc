package com.example.aeromvc.models.forms;

import com.example.aeromvc.models.enums.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.time.YearMonth;
import java.util.List;

@Entity
public class Wpt {

  @Id
  @GeneratedValue
  private int id;

  @NotNull
  @Size(min=5, max=5, message = "Waypoint Ident must be five characters")
  private String wpt_ident;

  @ManyToOne
  @NotNull(message = "ICAO Region required")
  private IcaoRgn icaoRgn;

  @NotNull(message = "Latitude required")
  private float latitude;

  @NotNull(message = "Longitude required")
  private float longitude;

  @ManyToOne
  private Datum datum;

  @ManyToOne
  private LocalDatum localDatum;

  @ManyToOne
  private CoordAcc coordAcc;

  @ManyToMany(mappedBy = "waypoints")
  private List<AerNavSvc> navaids;

  private String d_magvar;

  private Date var_date;

  @ManyToOne
  @NotNull (message = "Waypoint Usage required")
  private UsageCd usageCd;

  @ManyToOne
  @NotNull (message = "Waypoint Type required")
  private WptType wptType;

  @ManyToOne
  private WptRvsm wptRvsm;

  private int wp_elev;

  @NotNull(message = "Required")
  private boolean in_dafif;

  private boolean drv_ident;

  private String chart_text;

  @ManyToOne
  private NameIndicator nameIndicator;

  @NotNull
  @Size(min = 1, message = "Waypoint Naming Description required")
  private String name_desc;

  private String place_name;

  @ManyToOne
  private ArincRgn arincRgn;
  private String cont_app_type;
  //@NotNull
  private java.sql.Timestamp mod_date;
  //@NotNull
  private YearMonth airac_cycle;

  public Wpt(String aWpt_ident, IcaoRgn icaoRgn) {
    setWpt_ident(aWpt_ident);
    setIcaoRgn(icaoRgn);
  }

  public Wpt() {}

  public int getId() { return id; }

  public String getWpt_ident() {
    return wpt_ident;
  }

  public void setWpt_ident(String wpt_ident) {
    this.wpt_ident = wpt_ident;
  }

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public IcaoRgn getIcaoRgn() {
    return icaoRgn;
  }

  public void setIcaoRgn(IcaoRgn icaoRgn) {
    this.icaoRgn = icaoRgn;
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

  public LocalDatum getLocalDatum() {
    return localDatum;
  }

  public void setLocalDatum(LocalDatum localDatum) {
    this.localDatum = localDatum;
  }

  public CoordAcc getCoordAcc() {
    return coordAcc;
  }

  public void setCoordAcc(CoordAcc coordAcc) {
    this.coordAcc = coordAcc;
  }

  public String getD_magvar() {
    return d_magvar;
  }

  public void setD_magvar(String d_magvar) {
    this.d_magvar = d_magvar;
  }

  public Date getVar_date() {
    return var_date;
  }

  public void setVar_date(Date var_date) {
    this.var_date = var_date;
  }

  public UsageCd getUsageCd() {
    return usageCd;
  }

  public void setUsageCd(UsageCd usageCd) {
    this.usageCd = usageCd;
  }

  public WptType getWptType() {
    return wptType;
  }

  public void setWptType(WptType wptType) {
    this.wptType = wptType;
  }

  public WptRvsm getWptRvsm() {
    return wptRvsm;
  }

  public void setWptRvsm(WptRvsm wptRvsm) {
    this.wptRvsm = wptRvsm;
  }

  public int getWp_elev() {
    return wp_elev;
  }

  public void setWp_elev(int wp_elev) {
    this.wp_elev = wp_elev;
  }

  public boolean isIn_dafif() {
    return in_dafif;
  }

  public void setIn_dafif(boolean in_dafif) {
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

  public NameIndicator getNameIndicator() { return nameIndicator; }

  public void setNameIndicator(NameIndicator nameIndicator) {
    this.nameIndicator = nameIndicator;
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

  public ArincRgn getArincRgn() { return arincRgn; }

  public void setArincRgn(ArincRgn arincRgn) { this.arincRgn = arincRgn; }

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
