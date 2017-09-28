package com.example.aeromvc.models;

import com.example.aeromvc.models.enums.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.YearMonth;

@Entity
public class Arpt {

    @Id
    @GeneratedValue
    private int ARPTID;
    @NotNull
    private int DAFIF_IDENT;
    private IcaoIdent ICAO_IDENT;
    @NotNull
    private inDafif IN_DAFIF = inDafif.N;
    @NotNull
    private String ARPT_NAME;
    private String ARPT_ALTN_NAME;
    private FaaIdent FAA_IDENT;
    private String FAA_SITE_IDENT;
    @NotNull
    private IcaoRgn ICAO_RGN;
    private String OPR_AUTH_NAME;
    //private OprAgency OPR_AGY;
    private Datum DATUM = Datum.WGE;
    private float LATITUDE;
    private float LONGITUDE;
    private CoordACC COORD_ACC = CoordACC.ZERO;
    private LocalDatum LOCAL_DATUM;
    //private ArincRgn ARINC_RGN;
    private float ELEV;
    //@NotNull
    //private Symbol SYMBOL;
    @NotNull
    private Double VAR;
    @NotNull
    private java.sql.Date VAR_DATE;
    private float MV_RECORD;
    private int WACID;
    private boolean BEACON;
    private boolean SEC_ARPT;
    private String SEC_ARPT_NAME;
    //private IcaoIdent SEC_ICAO_IDENT;
    //private FaaIdent SEC_FAA_IDENT;
    //private OprAgency SEC_OPY_AGY;
    private boolean TERRAIN;
    private boolean HYDRO;
    private boolean SMR;
    private boolean inAQP;
    private boolean FLIP_IAP;
//    private String OSUFFIX;
//    @NotNull
//    private DateTimeFormatter INFO_CURRENCY;
//    private DateTimeFormatter FIRST_INFO;
//    private DateTimeFormatter REVIEW_DATE;
    private String MAX_DEMO_USAGE;
//    @NotNull
//    private ExistVal existVal = ExistVal.6;
    private String CAT_CODE;
    private String PREV_CAT_CODE;
    //private Sector sector;
    //private GeoLocCode geoLocCode;
    //@NotNull
    private java.sql.Timestamp MOD_DATE;
    //@NotNull
    private YearMonth AIRAC_CYCLE;

}
