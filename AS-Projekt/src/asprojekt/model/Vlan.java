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
public class Vlan {
    
    int vlanID;
    String gruppe;
    String vlanName;

    public int getVlanID() {
        return vlanID;
    }

    public void setVlanID(int vlanID) {
        this.vlanID = vlanID;
    }

    public String getGruppe() {
        return gruppe;
    }

    public void setGruppe(String gruppe) {
        this.gruppe = gruppe;
    }

    public String getVlanName() {
        return vlanName;
    }

    public void setVlanName(String vlanName) {
        this.vlanName = vlanName;
    }
    
    
}
