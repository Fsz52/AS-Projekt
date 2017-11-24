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
    
    int p_vlan_id;
    int vlanID;
    String gruppe;
    String vlanName;

    public Vlan(int p_vlan_id, int vlanID, String gruppe, String vlanName) {
        this.p_vlan_id = p_vlan_id;
        this.vlanID = vlanID;
        this.gruppe = gruppe;
        this.vlanName = vlanName;
    }

    public int getP_vlan_id() {
        return p_vlan_id;
    }

    public void setP_vlan_id(int p_vlan_id) {
        this.p_vlan_id = p_vlan_id;
    }

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
