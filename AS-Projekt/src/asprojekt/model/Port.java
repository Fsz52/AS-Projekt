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


public class Port {
    
    int portID;
    String portNr;
    boolean belegt;
    boolean trunk;
    Switch sw;    

    public Port(int portID, String portNr, boolean belegt, boolean trunk, Switch sw) {
        this.portID = portID;
        this.portNr = portNr;
        this.belegt = belegt;
        this.trunk = trunk;
        this.sw = sw;
    }

    public Port() {
        
    }

    public int getPortID() {
        return portID;
    }

    public void setPortID(int portID) {
        this.portID = portID;
    }

    public String getPortNr() {
        return portNr;
    }

    public void setPortNr(String portNr) {
        this.portNr = portNr;
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public Switch getSw() {
        return sw;
    }

    public void setSw(Switch sw) {
        this.sw = sw;
    }

    @Override
    public String toString() {
        return "Port{" + "portID=" + portID + ", portNr=" + portNr + ", belegt=" + belegt + ", trunk=" + trunk + '}';
    }

    
    
    
    
    
    
}
