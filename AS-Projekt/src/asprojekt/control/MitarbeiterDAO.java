/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import asprojekt.model.Mitarbeiter;
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
public class MitarbeiterDAO extends AbstractDBConnector{
    
    public ArrayList<Mitarbeiter> readAll(){
        Connection c = getConnection();
        ArrayList<Mitarbeiter> mas = new ArrayList<>();
        
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM T_Mitarbeiter");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Mitarbeiter ma = new Mitarbeiter(   rs.getInt(1), 
                                                    rs.getString(3),
                                                    rs.getString(4), 
                                                    rs.getDate(5),
                                                    rs.getString(2));
                mas.add(ma);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MitarbeiterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return mas;
    }
    
    public int addMitarbeiter(Mitarbeiter ma){
        Connection c = getConnection();
        Integer id = null;
        try {            
            PreparedStatement ps = c.prepareStatement("INSERT INTO T_Mitarbeiter (adresse, vorname, nachname, geburtstag) VALUES (?, ?, ?, ?)");
            ps.setString(1, ma.getAddresse());
            ps.setString(2, ma.getVorname());
            ps.setString(3, ma.getNachname());
            ps.setDate(4, ma.getGeburtstag());
            ps.executeQuery();
            
            PreparedStatement ps2 = c.prepareStatement("SELECT_LAST_INSERT_ID()");
            ResultSet rs2 = ps2.executeQuery();
            rs2.next();
            id = rs2.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(MitarbeiterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return id;
    }
    
    public void delMitarbeiter(Mitarbeiter ma){
        try {
            Connection c = getConnection();
            PreparedStatement ps = c.prepareStatement("DELETE FROM T_Mitarbeiter WHERE p_id = ?");
            ps.setInt(1, ma.getMitarbeiterID());
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(MitarbeiterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
}
