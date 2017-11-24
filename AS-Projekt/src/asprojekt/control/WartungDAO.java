/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import asprojekt.model.Mitarbeiter;
import asprojekt.model.Raum;
import asprojekt.model.Wartung;
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
public class WartungDAO extends AbstractDBConnector {

    public ArrayList<Wartung> readAll() {
        Connection c = getConnection();
        ArrayList<Wartung> wartungen = new ArrayList<>();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM T_Wartungen");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Wartung wa = new Wartung();
                wa.setWartung_id(rs.getInt(1));
                wa.setTime(rs.getTimestamp(2));

                PreparedStatement ps2 = c.prepareStatement("SELECT * FROM T_Mitarbeiter "
                        + "                                 WHERE T_Wartungen_Mitarbeiter.f_mitarbeiter_id "
                        + "                                 AND T_Wartungen_Mitarbeiter.f_wartung_id = ?");
                ps2.setInt(1, wa.getWartung_id());
                ResultSet rs2 = ps2.executeQuery();

                while (rs2.next()) {
                    Mitarbeiter ma = new Mitarbeiter(rs.getInt(1),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getDate(5),
                            rs.getString(2));
                    wa.setMa(ma);
                }
                PreparedStatement ps3 = c.prepareStatement("SELECT * FROM T_Raeume "
                        + "                                 WHERE T_Wartungen.f_raumNr = T_Raeume.p_raum_nr"
                        + "                                 AND T_Wartungen.p_id = ?");
                ps3.setInt(1, wa.getWartung_id());
                ResultSet rs3 = ps3.executeQuery();

                while (rs3.next()) {
                    Raum r = new Raum(rs3.getInt(1),
                            rs3.getString(3),
                            rs3.getString(2));
                    wa.setRaum(r);
                    wartungen.add(wa);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(WartungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return wartungen;
    }
}
