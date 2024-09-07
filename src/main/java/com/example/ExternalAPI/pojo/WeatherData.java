package com.example.ExternalAPI.pojo;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WeatherData {
    private int cloudsLow;
    private int cloudsMid;
    private int dni;
    private String windCdir;
    private int rh;
    private String pod;
    private int pres;
    private int clouds;
    private double vis;
    private double windSpd;
    private String windCdirFull;
    private int slp;
    private String datetime;
    private long ts;
    private int snow;
    private double dewpt;
    private int uv;
    private int windDir;
    private int ghi;
    private int dhi;
    private int precip;
    private double windGustSpd;
    private double temp;
    private double appTemp;
    private String timestampLocal;
    private int pop;
    private int ozone;
    private double solarRad;
    private int snowDepth;
    private int cloudsHi;
    private String timestampUtc;

}

