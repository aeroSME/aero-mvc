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

    private int freqprotalt;

    private int freqprotdist;

//    @NotNull(message = "Latitude required")
//    private float latitude;
//
//    @NotNull(message = "Longitude required")
//    private float longitude;
//
//    @ManyToOne
//    private Datum datum;

    @ManyToOne
    private LocalDatum localDatum;

    @ManyToOne
    private CoordAcc coordAcc;

    private String d_magvar;

    private Date var_date;

    private int mslelev;

    @ManyToOne
    private UsageCd usageCd;
//
//    @NotNull(message = "Required")
//    private boolean in_dafif;
//
//    private boolean drv_ident;
//
//    private String chart_text;
//
//    @ManyToOne
//    private NameIndicator nameIndicator;
//
    private String navservicename;
//
//    private String place_name;
//
    @ManyToOne
    private ArincRgn arincRgn;

    private String cont_app_type;

    //@NotNull
    private java.sql.Timestamp mod_date;

    //@NotNull
    private YearMonth airac_cycle;
}
