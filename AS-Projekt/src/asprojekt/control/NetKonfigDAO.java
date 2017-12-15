/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import asprojekt.model.Geraet;
import asprojekt.model.NetKonfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tim
 */
public class NetKonfigDAO extends AbstractDBConnector {

    public void addNetKonfig(Geraet g, NetKonfig netkonfig) {
        Connection c = getConnection();
        
        int f_geraet_id = g.getP_geraete_id();
        String mac = netkonfig.getMac();
        String dns_name = netkonfig.getDns_name();
        double uebertragungsrate = netkonfig.getUebertragungsrate();
        String netzmaske = netkonfig.getNetzmaske();
        String ip = netkonfig.getIp_adresse();
        String dns_server = netkonfig.getDns_server();
        
        try {
            PreparedStatement ps = c.prepareStatement("INSERT INTO `T_Netzkonfigs` (`f_geraeteID`,`mac`, `dns-name`, `uebertragungsrate`, `netzmaske`, `ip-adresse`, `dns`) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, f_geraet_id);
            ps.setString(2, mac);
            ps.setString(3, dns_name);
            ps.setDouble(4, uebertragungsrate);
            ps.setString(5, netzmaske);
            ps.setString(6, ip);
            ps.setString(7, dns_server);
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(NetKonfigDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
}
