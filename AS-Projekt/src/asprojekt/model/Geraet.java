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

    int p_geraete_id;
    String sn;
    double anschPreis;
    Raum raum;
    NetKonfig netconfig;
    String standort;
    boolean isSwitch;

    public Geraet(int p_geraete_id, String sn, double anschPreis, Raum raum, String standort, NetKonfig netconfig, boolean isSwitch) {
        this.p_geraete_id = p_geraete_id;
        this.anschPreis = anschPreis;
        this.raum = raum;
        this.standort = standort;
        this.sn = sn;
        this.netconfig = netconfig;
        this.isSwitch = isSwitch;
    }

    public int getP_geraete_id() {
        return p_geraete_id;
    }

    public void setP_geraete_id(int p_geraete_id) {
        this.p_geraete_id = p_geraete_id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Raum getRaum() {
        return raum;
    }

    public void setRaum(Raum raum) {
        this.raum = raum;
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

    @Override
    public String toString() {
        return netconfig.dns_name;
    }

    public NetKonfig getNetconfig() {
        return netconfig;
    }

    public void setNetconfig(NetKonfig netconfig) {
        this.netconfig = netconfig;
    }

    public boolean isIsSwitch() {
        return isSwitch;
    }

    public void setIsSwitch(boolean isSwitch) {
        this.isSwitch = isSwitch;
    }

}
