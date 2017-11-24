/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import asprojekt.model.Port;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leon
 */
public class PortDAO extends AbstractDBConnector {
    
    public void addPort(Port p){
        Connection c = getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("INSERT INTO `T_Ports` (`p_ID`, `portNr`, `belegt`, `trunk`, `f_Switch`) VALUES (?, ?, ?, ?, ?);");
            ps.setInt(1, p.getPortID());
            ps.setString(2, p.getPortNr());
            if(p.isBelegt()){
                ps.setInt(3, 1);
            }
            if(p.isTrunk()){
                ps.setInt(4, 1);
            }
            ps.setInt(5, p.getSw().getSwitchID());
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PortDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
