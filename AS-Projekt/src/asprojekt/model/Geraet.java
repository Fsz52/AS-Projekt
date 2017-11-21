/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.model;

/**
 *
 * @author Leon
 */
public class Geraet {

    int snNr;
    double anschPreis;
    Raum raum;
    String raumNr;

    public Raum getRaum() {
        return raum;
    }

    public void setRaum(Raum raum) {
        this.raum = raum;
    }

    public String getRaumNr() {
        return raumNr;
    }

    public void setRaumNr(String raumNr) {
        this.raum.raumNr = this.raumNr;
    }
    String standort;

    public int getSnNr() {
        return snNr;
    }

    public void setSnNr(int snNr) {
        this.snNr = snNr;
    }

    public double getAnschPreis() {
        return anschPreis;
    }

    public void setAnschPreis(double anschPreis) {
        this.anschPreis = anschPreis;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

}
