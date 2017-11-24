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
public class Raum {
    int id;
    String raumNr;
    String gebaeude;

    public Raum(int id, String raumNr, String gebaeude) {
        this.id = id;
        this.raumNr = raumNr;
        this.gebaeude = gebaeude;
    }

    public Raum() {
    }

    
    public String getRaumNr() {
        return raumNr;
    }

    public void setRaumNr(String raumNr) {
        this.raumNr = raumNr;
    }

    public String getGebaeude() {
        return gebaeude;
    }

    public void setGebaeude(String gebaeude) {
        this.gebaeude = gebaeude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Raum: " + raumNr + ", Gebaeude: " + gebaeude;
    }
    
    
}
