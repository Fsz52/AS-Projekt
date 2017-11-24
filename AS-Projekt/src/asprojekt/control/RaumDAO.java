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
import javax.swing.JOptionPane;

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
            Logger.getLogger(RaumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return raeume;
    }

    public void delRaum(Raum r) {
        Connection c = getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("DELETE FROM T_Raeume WHERE p_raum_nr = ?");
            ps.setInt(1, r.getId());
            ResultSet rs = ps.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Du kannst diesen Raum nicht löschen.", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
        closeConnection();
    }

    public void addRaum(Raum r) {

        String gebaeude = r.getGebaeude();
        String raumnr = r.getRaumNr();

        Connection c = getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("INSERT INTO `T_Raeume` (`gebaeude`,`raum`) "
                    + "VALUES (?, ?)");
            ps.setString(1, gebaeude);
            ps.setString(2, raumnr);
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RaumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }

    public void updateRaum(Raum r) {
        String gebaeude = r.getGebaeude();
        String raumnr = r.getRaumNr();
        int raum_id = r.getId();

        Connection c = getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE `T_Raeume` SET `gebaeude` = ?, "
                    + "`raum` = ?, "
                    + "WHERE `T_Raeume`.`p_raum_nr` = ?");
            ps.setString(1, gebaeude);
            ps.setString(2, raumnr);
            ps.setInt(3, raum_id);
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RaumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
}
