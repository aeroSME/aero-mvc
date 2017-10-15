package com.example.aeromvc.models;

import com.example.aeromvc.models.enums.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.time.YearMonth;

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

    private

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
}
