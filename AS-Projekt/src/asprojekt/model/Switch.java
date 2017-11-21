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
public class Switch {

    int switchID;
    String model;
    TrunkPort tport;
    int tPortNr;
    AccessPort aport;
    int aPortNr;

    public Switch(int switchID, String model, TrunkPort tport, int tPortNr, AccessPort aport, int aPortNr) {
        this.switchID = switchID;
        this.model = model;
        this.tport = tport;
        this.tPortNr = tPortNr;
        this.aport = aport;
        this.aPortNr = aPortNr;
    }

    public int getSwitchID() {
        return switchID;
    }

    public void setSwitchID(int switchID) {
        this.switchID = switchID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TrunkPort getTport() {
        return tport;
    }

    public void setTport(TrunkPort tport) {
        this.tport = tport;
    }

    public int gettPortNr() {
        return tPortNr;
    }

    public void settPortNr(int tPortNr) {
        this.tPortNr = tport.tPortNr;
    }

    public AccessPort getAport() {
        return aport;
    }

    public void setAport(AccessPort aport) {
        this.aport = aport;
    }

    public int getaPortNr() {
        return aPortNr;
    }

    public void setaPortNr(int aPortNr) {
        this.aPortNr = aport.portNr;
    }

}
