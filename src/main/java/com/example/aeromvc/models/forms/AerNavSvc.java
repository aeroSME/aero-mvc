package com.example.aeromvc.models.forms;

import com.example.aeromvc.models.enums.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.YearMonth;
import java.util.List;

@Entity
public class AerNavSvc {

    @Id
    @GeneratedValue
    private int aernavsvcid;

    @NotNull
    @Size(min=2, max=4, message = "Navaid Ident must be between 2 and 4 characters")
    private String nav_ident;

    @ManyToOne
    @NotNull(message = "ICAO Region required")
    private IcaoRgn icaoRgn;

    @ManyToOne
    private FaaIdent faaIdent;

    private float broadfreq;

    @ManyToOne
    private FreqCd freqCd;

    private int freqprotalt;

    private int freqprotdist;

    private int radiatedpower;

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

    private float d_magvar;

    private Date d_var_date;

    private float s_magvar;

    private Date s_var_date;

    private SlavedGridTrue slavedGridTrue;

    private MagVarMethodCd magVarMethodCd;

    private StdOpTmCd stdOpTmCd;

    private VoiceCd voiceCd;

    private int mslelev;

    @ManyToOne
    private NavClassCd navClassCd;

    @ManyToOne
    private UsageCd usageCd;

    @ManyToOne
    private OpStatCd opStatCd;

    private String navservicename;

    @ManyToOne
    private ArincRgn arincRgn;

    private String cont_app_type;

    //@NotNull
    private java.sql.Timestamp mod_date;

    //@NotNull
    private YearMonth airac_cycle;

    @ManyToMany
    private List<Wpt> waypoints;

    public AerNavSvc() {}

    public int getAernavsvcid() {
        return aernavsvcid;
    }

    public String getNav_ident() {
        return nav_ident;
    }

    public void setNav_ident(String nav_ident) {
        this.nav_ident = nav_ident;
    }

    public IcaoRgn getIcaoRgn() {
        return icaoRgn;
    }

    public void setIcaoRgn(IcaoRgn icaoRgn) {
        this.icaoRgn = icaoRgn;
    }

    public FaaIdent getFaaIdent() {
        return faaIdent;
    }

    public void setFaaIdent(FaaIdent faaIdent) {
        this.faaIdent = faaIdent;
    }

    public float getBroadfreq() {
        return broadfreq;
    }

    public void setBroadfreq(float broadfreq) {
        this.broadfreq = broadfreq;
    }

    public FreqCd getFreqCd() {
        return freqCd;
    }

    public void setFreqCd(FreqCd freqCd) {
        this.freqCd = freqCd;
    }

    public int getFreqprotalt() {
        return freqprotalt;
    }

    public void setFreqprotalt(int freqprotalt) {
        this.freqprotalt = freqprotalt;
    }

    public int getFreqprotdist() {
        return freqprotdist;
    }

    public void setFreqprotdist(int freqprotdist) {
        this.freqprotdist = freqprotdist;
    }

    public int getRadiatedpower() {
        return radiatedpower;
    }

    public void setRadiatedpower(int radiatedpower) {
        this.radiatedpower = radiatedpower;
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

    public float getD_magvar() {
        return d_magvar;
    }

    public void setD_magvar(float d_magvar) {
        this.d_magvar = d_magvar;
    }

    public Date getD_var_date() {
        return d_var_date;
    }

    public void setD_var_date(Date d_var_date) {
        this.d_var_date = d_var_date;
    }

    public float getS_magvar() {
        return s_magvar;
    }

    public void setS_magvar(float s_magvar) {
        this.s_magvar = s_magvar;
    }

    public Date getS_var_date() {
        return s_var_date;
    }

    public void setS_var_date(Date s_var_date) {
        this.s_var_date = s_var_date;
    }

    public SlavedGridTrue getSlavedGridTrue() {
        return slavedGridTrue;
    }

    public void setSlavedGridTrue(SlavedGridTrue slavedGridTrue) {
        this.slavedGridTrue = slavedGridTrue;
    }

    public MagVarMethodCd getMagVarMethodCd() {
        return magVarMethodCd;
    }

    public void setMagVarMethodCd(MagVarMethodCd magVarMethodCd) {
        this.magVarMethodCd = magVarMethodCd;
    }

    public StdOpTmCd getStdOpTmCd() {
        return stdOpTmCd;
    }

    public void setStdOpTmCd(StdOpTmCd stdOpTmCd) {
        this.stdOpTmCd = stdOpTmCd;
    }

    public VoiceCd getVoiceCd() {
        return voiceCd;
    }

    public void setVoiceCd(VoiceCd voiceCd) {
        this.voiceCd = voiceCd;
    }

    public int getMslelev() {
        return mslelev;
    }

    public void setMslelev(int mslelev) {
        this.mslelev = mslelev;
    }

    public NavClassCd getNavClassCd() {
        return navClassCd;
    }

    public void setNavClassCd(NavClassCd navClassCd) {
        this.navClassCd = navClassCd;
    }

    public UsageCd getUsageCd() {
        return usageCd;
    }

    public void setUsageCd(UsageCd usageCd) {
        this.usageCd = usageCd;
    }

    public OpStatCd getOpStatCd() {
        return opStatCd;
    }

    public void setOpStatCd(OpStatCd opStatCd) {
        this.opStatCd = opStatCd;
    }

    public String getNavservicename() {
        return navservicename;
    }

    public void setNavservicename(String navservicename) {
        this.navservicename = navservicename;
    }

    public ArincRgn getArincRgn() {
        return arincRgn;
    }

    public void setArincRgn(ArincRgn arincRgn) {
        this.arincRgn = arincRgn;
    }

    public String getCont_app_type() {
        return cont_app_type;
    }

    public void setCont_app_type(String cont_app_type) {
        this.cont_app_type = cont_app_type;
    }

    public Timestamp getMod_date() {
        return mod_date;
    }

    public void setMod_date(Timestamp mod_date) {
        this.mod_date = mod_date;
    }

    public YearMonth getAirac_cycle() {
        return airac_cycle;
    }

    public void setAirac_cycle(YearMonth airac_cycle) {
        this.airac_cycle = airac_cycle;
    }
}
