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
public class Wartung {
    
    Mitarbeiter ma;
    String vorNachname = ma.vorNachname;
    Raum raum;
    String rNr = raum.raumNr;

    public Wartung(Mitarbeiter ma, Raum raum) {
        this.ma = ma;
        this.raum = raum;
    }

    public Mitarbeiter getMa() {
        return ma;
    }

    public void setMa(Mitarbeiter ma) {
        this.ma = ma;
    }

    public String getVorNachname() {
        return vorNachname;
    }

    public void setVorNachname(String vorNachname) {
        this.vorNachname = vorNachname;
    }

    public Raum getRaum() {
        return raum;
    }

    public void setRaum(Raum raum) {
        this.raum = raum;
    }

    public String getrNr() {
        return rNr;
    }

    public void setrNr(String rNr) {
        this.rNr = rNr;
    }
    
    
}
