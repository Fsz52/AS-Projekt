/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.model;

import java.sql.Date;

/**
 *
 * @author Leon
 */
public class Mitarbeiter {
    
    int mitarbeiterID;
    String vorNachname;
    Date geburtstag;
    String addresse;

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public String getVorNachname() {
        return vorNachname;
    }

    public void setVorNachname(String vorNachname) {
        this.vorNachname = vorNachname;
    }

    public Date getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
    
    
    
}
