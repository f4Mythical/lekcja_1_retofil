package com.example.zadanie;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
//    @SerializedName("tresc") - w momonecie nadpisywania
    private String tresc;
    private String odpA;
    private String odpB;
    private String odpC;
    private String odpD;
    private int poprawna;

    public Pytanie(String tresc, String odpA, String odpB, String odpC, String odpD, int poprawna) {
        this.tresc = tresc;
        this.odpA = odpA;
        this.odpB = odpB;
        this.odpC = odpC;
        this.odpD = odpD;
        this.poprawna = poprawna;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public String getOdpA() {
        return odpA;
    }

    public void setOdpA(String odpA) {
        this.odpA = odpA;
    }

    public String getOdpB() {
        return odpB;
    }

    public void setOdpB(String odpB) {
        this.odpB = odpB;
    }

    public String getOdpC() {
        return odpC;
    }

    public void setOdpC(String odpC) {
        this.odpC = odpC;
    }

    public String getOdpD() {
        return odpD;
    }

    public void setOdpD(String odpD) {
        this.odpD = odpD;
    }

    public int getPoprawna() {
        return poprawna;
    }

    public void setPoprawna(int poprawna) {
        this.poprawna = poprawna;
    }
}
