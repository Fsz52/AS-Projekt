/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import asprojekt.model.Port;
import asprojekt.model.Switch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leon
 */
public class SwitchDAO extends AbstractDBConnector {

    public ArrayList<Switch> readAll() throws SQLException {
        Connection c = getConnection();
        ArrayList<Switch> switche = new ArrayList<>();
        ArrayList<Port> ports = new ArrayList<>();

        try {
            
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM T_Switch");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Switch sw = new Switch();
                sw.setSwitchID(rs.getInt(1));
                sw.setModel(rs.getString(2));
                sw.setF_geraete_id(rs.getInt(3));
                sw.setPorts(ports);

                PreparedStatement ps2 = c.prepareStatement("SELECT * FROM T_Ports WHERE f_switch = ?");
                ps2.setInt(1, sw.getSwitchID());
                ResultSet rs2 = ps2.executeQuery();

                while (rs2.next()) {
                    Port port = new Port();
                    boolean belegt = false;
                    boolean trunk = false;
                    if (rs2.getInt(3) == 1) {
                        belegt = true;
                    }
                    if (rs2.getInt(4) == 1) {
                        trunk = true;
                    }
                    port.setPortID(rs2.getInt(1));
                    port.setPortNr(rs2.getString(2));
                    port.setBelegt(belegt);
                    port.setTrunk(trunk);
                    ports.add(port);

                    sw.setPorts(ports);
                    for (int i = 0; i < ports.size(); i++) {
                        port.setSw(sw);
                    }
                }
                switche.add(sw);
            }
        } catch (SQLException e) {
            Logger.getLogger(RaumDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        closeConnection();
        return switche;
    }
}
