/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.model;

import java.sql.Timestamp;

/**
 *
 * @author Leon
 */
public class Wartung {

    int wartung_id;
    Mitarbeiter ma;
    Raum raum;
    Timestamp time;

    public Wartung(int wartung_id, Mitarbeiter ma, Raum raum, Timestamp time) {
        this.wartung_id = wartung_id;
        this.ma = ma;
        this.raum = raum;
        this.time = time;
    }

    public Wartung() {
    }

    public Mitarbeiter getMa() {
        return ma;
    }

    public void setMa(Mitarbeiter ma) {
        this.ma = ma;
    }

    public Raum getRaum() {
        return raum;
    }

    public void setRaum(Raum raum) {
        this.raum = raum;
    }

    public int getWartung_id() {
        return wartung_id;
    }

    public void setWartung_id(int wartung_id) {
        this.wartung_id = wartung_id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
    
    
}
