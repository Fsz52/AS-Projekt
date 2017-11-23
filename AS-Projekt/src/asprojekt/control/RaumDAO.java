/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import asprojekt.model.Raum;
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
public class RaumDAO extends AbstractDBConnector {

    public ArrayList<Raum> readAll() {
        Connection c = getConnection();
        ArrayList<Raum> raeume = new ArrayList<>();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM T_Raeume ORDER BY p_raum_nr");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer raum_id = rs.getInt(1);
                String gebaeude = rs.getString(2);
                String raumnr = rs.getString(3);

                Raum r = new Raum();
                r.setId(raum_id);
                r.setRaumNr(raumnr);
                r.setGebaeude(gebaeude);
                raeume.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return raeume;
    }

}
