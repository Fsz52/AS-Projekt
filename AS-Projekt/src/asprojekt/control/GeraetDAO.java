/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import asprojekt.model.Geraet;
import asprojekt.model.Raum;
import asprojekt.model.NetKonfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tim
 */
public class GeraetDAO extends AbstractDBConnector {

    public ArrayList<Geraet> readAll() {
        Connection c = getConnection();
        ArrayList<Geraet> geraete = new ArrayList<>();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM T_Geraete, T_Raeume, T_Netzkonfigs WHERE T_Geraete.f_raum_nr = T_Raeume.p_raum_nr AND T_Geraete.p_geraete_id = T_Netzkonfigs.f_geraeteID");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer p_geraete_id = rs.getInt(1);
                String sn = rs.getString(2);
                int f_raum_nr = rs.getInt(3);
                String standort = rs.getString(4);
                double anschPreis = rs.getDouble(5);
                boolean isSwitch = false;
                    if (rs.getInt(6) == 1){
                        isSwitch = true;
                    }
                int p_raum_id = rs.getInt(7);
                String gebaeude = rs.getString(8);
                String raumBez = rs.getString(9);

                Integer f_geraeteID = rs.getInt(10);
                String mac = rs.getString(11);
                String dns_name = rs.getString(12);
                double uebertragungsrate = rs.getDouble(13);
                String netzmaske = rs.getString(14);
                String ip_adresse = rs.getString(15);
                String dns_server = rs.getString(16);

                Raum raum = new Raum(p_raum_id, raumBez, gebaeude);
                NetKonfig netzkonfig = new NetKonfig(f_geraeteID, mac, dns_name, uebertragungsrate, netzmaske, ip_adresse, dns_server);
                Geraet g = new Geraet(p_geraete_id, sn, anschPreis, raum, standort, netzkonfig, isSwitch);
                geraete.add(g);

            }
        } catch (SQLException ex) {
            Logger.getLogger(RaumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return geraete;
    }
    
    public int addGeraet(Geraet g){
        int id = 0;
        Connection c = getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("INSERT INTO T_Geraete (`sn`, `f_raum_nr`, `standort`, `anschaffungspreis`, `isSwitch`) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, g.getSn());
            ps.setInt(2, g.getRaum().getId());
            ps.setString(3, g.getStandort());
            ps.setDouble(3, g.getAnschPreis());
            ps.setBoolean(5, g.isIsSwitch());
            ResultSet rs = ps.executeQuery();
            
            PreparedStatement ps2 = c.prepareStatement("SELECT LAST_INSERT_ID()");
            ResultSet rs2 = ps2.executeQuery();
            rs2.next();
            id = rs2.getInt(1);
            return id;
            
        } catch (SQLException ex) {
            Logger.getLogger(GeraetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return id;
    }
}
