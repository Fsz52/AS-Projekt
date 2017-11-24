/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.model;

import java.util.ArrayList;

/**
 *
 * @author Leon
 */
public class Switch {

    int switchID;
    String model;
    ArrayList<Port> ports;
    int f_geraete_id;

    public Switch(int switchID, String model, int f_geraete_id, ArrayList<Port> ports) {
        this.switchID = switchID;
        this.model = model;
        this.ports = ports;
        this.f_geraete_id = f_geraete_id;
    }

    public Switch() {
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

    public ArrayList<Port> getPorts() {
        return ports;
    }

    public void setPorts(ArrayList<Port> ports) {
        this.ports = ports;
    }

    public int getF_geraete_id() {
        return f_geraete_id;
    }

    public void setF_geraete_id(int f_geraete_id) {
        this.f_geraete_id = f_geraete_id;
    }

    @Override
    public String toString() {
        return "Switch{" + "switchID=" + switchID + ", model=" + model + ", ports=" + ports.toString() + ", f_geraete_id=" + f_geraete_id + '}';
    }
    
    

       

}
