/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import asprojekt.model.Raum;
import asprojekt.model.Vlan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tim
 */
public class VlanDAO extends AbstractDBConnector{
    
    public ArrayList<Vlan> readAll() {
        Connection c = getConnection();
        ArrayList<Vlan> vlans = new ArrayList<>();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM T_VLANs");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer p_vlan_id = rs.getInt(1);
                Integer vlanID = rs.getInt(2);
                String gruppe = rs.getString(3);
                String vlanName = rs.getString(4);

                Vlan vlan = new Vlan(p_vlan_id, vlanID, gruppe, vlanName);
                vlans.add(vlan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RaumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return vlans;
    }

    public void delVlan(Vlan vlan) {
        Connection c = getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("DELETE FROM T_VLANs WHERE p_vlan_id = ?");
            ps.setInt(1, vlan.getP_vlan_id());
            ResultSet rs = ps.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Du kannst dieses VLAN nicht löschen.", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
        closeConnection();
    }
    
    
}
