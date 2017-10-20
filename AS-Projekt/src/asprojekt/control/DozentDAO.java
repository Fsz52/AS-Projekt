/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

//import de.teamc.feedback.control.AbstractDBConnector;
//import de.teamc.feedback.model.Dozent;
//import de.teamc.feedback.model.Firma;
//import de.teamc.feedback.model.Seminar;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author Tim.Gleichmann
// */
//public class DozentDAO extends AbstractDBConnector {
//
//    private java.sql.Date sqlDate;
//
//    public DozentDAO() {
//
//        // Gibt heutiges Datum im SQL Format aus
//        DatumFormatieren datumFormat = new DatumFormatieren();
//        sqlDate = datumFormat.getSqlToday();
//
//    }
//
//    public ArrayList<Dozent> readAll() {
//        Connection c = getConnection();
//        ArrayList<Dozent> dozenten = new ArrayList<>();
//        try {
//            PreparedStatement ps = c.prepareStatement("SELECT * FROM dozenten ORDER BY name");
//            // 1 = ID, 2 = Name
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String name = rs.getString(2);
//                Integer id = rs.getInt(1);
//                Dozent d = new Dozent();
//                d.setId(id);
//                d.setName(name);
//                d.setKennzeichen(rs.getString(3));
//                dozenten.add(d);
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//        return dozenten;
//    }
//
//    public void delDozent(Dozent d) {
//        Connection c = getConnection();
//        try {
//            PreparedStatement ps = c.prepareStatement("DELETE FROM dozenten WHERE id = ?");
//            ps.setInt(1, d.getId());
//            ResultSet rs = ps.executeQuery();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Diese/r Dozent/in führt bereits Seminare duch.", "Fehler", JOptionPane.ERROR_MESSAGE);
//        }
//        closeConnection();
//    }
//
//    public int addDozent(String name, String kennzeichen) {
//        int id = 0;
//        Dozent d = new Dozent();
//        d.setName(name);
//        if (dozentVorhanden(d))                
//        {
//            Connection c = getConnection();
//            try
//            {
//                PreparedStatement ps = c.prepareStatement("INSERT INTO `dozenten` (`Name`, `Kennzeichen`) VALUES (?, ?);");
//                ps.setString(1, name);
//                ps.setString(2, kennzeichen);
//                ResultSet rs = ps.executeQuery();
//
//                PreparedStatement ps2 = c.prepareStatement("SELECT LAST_INSERT_ID()");
//                ResultSet rs2 = ps2.executeQuery();
//                rs2.next();
//                id = rs2.getInt(1);
//                return id;
//            } catch (SQLException ex)
//            {
//                Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            closeConnection();
//            return 0;
//        } else
//        {
//            JOptionPane.showMessageDialog(null, "Diese/r Dozent/in ist bereits vorhanden.");
//            return 0;
//        }
//    }
//
//    public ArrayList<Dozent> readAllFirmen(Dozent doz) {
//        Connection c = getConnection();
//        ArrayList<Dozent> dozenten = new ArrayList<>();
//        ArrayList<Firma> firmen = new ArrayList<>();
//        try {
//            PreparedStatement ps = c.prepareStatement(" SELECT DISTINCT dozenten.*,firmen.* "
//                    + "                                 FROM dozenten, firmen_dozenten, firmen "
//                    + "                                 WHERE dozenten.ID = firmen_dozenten.F_Dozent "
//                    + "                                 AND firmen.ID = firmen_dozenten.F_Firma"
//                    + "                                 AND dozenten.ID = ?");
//            // 1 = dozentID, 2 = dozentenname, 3 = firmenid, 4 = firmenname, 5 = address, 6 =  ort, 7 = PLZ, 8 = TelefonNummer, 8 = Mail
//            ps.setInt(1, doz.getId());
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                Integer dozid = rs.getInt(1);
//                String dozname = rs.getString(2);
//                Integer firmid = rs.getInt(3);
//                String firmname = rs.getString(4);
//                String address = rs.getString(5);
//                String ort = rs.getString(6);
//                Integer plz = rs.getInt(7);
//                String tel = rs.getString(8);
//                String mail = rs.getString(9);
//
//                Firma f = new Firma();
//                f.setId(firmid);
//                f.setName(firmname);
//                f.setAdresse(address);
//                f.setOrt(ort);
//                f.setPlz(plz);
//                f.setTelNummer(tel);
//                f.setMail(mail);
//                firmen.add(f);
//
//                Dozent d = new Dozent();
//                d.setId(dozid);
//                d.setName(dozname);
//                d.setFirmen(firmen);
//                dozenten.add(d);
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//        return dozenten;
//    }
//
//    public ArrayList<Firma> readFirmen(Dozent d) {
//        Connection c = getConnection();
//        ArrayList<Firma> firmen = new ArrayList<>();
//
//        try {
//            PreparedStatement ps = c.prepareStatement(" SELECT DISTINCT firmen.* "
//                    + "                                 FROM dozenten, firmen_dozenten, firmen "
//                    + "                                 WHERE dozenten.ID = firmen_dozenten.F_Dozent "
//                    + "                                 AND firmen.ID = firmen_dozenten.F_Firma "
//                    + "                                 AND dozenten.ID = ? ");
//            // 1 = id, 2 = name, 3 = address, 4 =  ort, 5 = PLZ, 6 = TelefonNummer, 7 = Mail
//            ps.setInt(1, d.getId());
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                Integer id = rs.getInt(1);
//                String name = rs.getString(2);
//                String address = rs.getString(3);
//                String ort = rs.getString(4);
//                Integer plz = rs.getInt(5);
//                String tel = rs.getString(6);
//                String mail = rs.getString(7);
//
//                Firma f = new Firma();
//                f.setId(id);
//                f.setName(name);
//                f.setAdresse(address);
//                f.setOrt(ort);
//                f.setPlz(plz);
//                f.setTelNummer(tel);
//                f.setMail(mail);
//
//                firmen.add(f);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return firmen;
//    }
//
//    public ArrayList<Seminar> readSeminare(Dozent d) {
//        Connection c = getConnection();
//        ArrayList<Seminar> seminare = new ArrayList<>();
//
//        try {
//            PreparedStatement ps = c.prepareStatement(" SELECT seminare.*, seminartypen.Name "
//                    + "                                 FROM dozenten, seminare, seminartypen "
//                    + "                                 WHERE seminartypen.ID = seminare.F_Seminartyp "
//                    + "                                 AND seminare.F_Dozent = dozenten.ID "
//                    + "                                 AND dozenten.ID = ? ");
////            1 = ID, 2 = Start, 3 = Ende, 4 = F_Dozent, 5 = F_Zielgruppe, 6 = F_Seminartyp, 7 = F_Firma 8 = Seminartypname
//            ps.setInt(1, d.getId());
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Integer id = rs.getInt(1);
//                Date start = rs.getDate(2);
//                Date ende = rs.getDate(3);
//                Integer fDozent = rs.getInt(4);
//                Integer fZielgruppe = rs.getInt(5);
//                Integer fSeminartyp = rs.getInt(6);
//                Integer fFirma = rs.getInt(7);
//                String typname = rs.getString(10);
//
//                Seminar s = new Seminar();
//                s.setId(id);
//                s.setStart(start);
//                s.setEnde(ende);
//                s.setfDozent(fDozent);
//                s.setfZielgruppe(fZielgruppe);
//                s.setfSeminartyp(fSeminartyp);
//                s.setSeminartypname(typname);
//
//                seminare.add(s);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return seminare;
//    }
//
//    public ArrayList<Dozent> leseName(String dozentSuche) {
//        Connection c = getConnection();
//        ArrayList<Dozent> dozenten = new ArrayList<>();
//        try {
//            PreparedStatement ps = c.prepareStatement("SELECT * FROM dozenten WHERE name LIKE ?");
//            ps.setString(1, "%" + dozentSuche + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String name = rs.getString(2);
//                Integer id = rs.getInt(1);
//
//                Dozent d = new Dozent();
//                d.setId(id);
//                d.setName(name);
//                dozenten.add(d);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//
//        return dozenten;
//    }
//
//    public String sucheName(int id) {
//        String ausgabe = "";
//        Connection c = getConnection();
//        try {
//            PreparedStatement ps = c.prepareStatement("SELECT name FROM dozenten WHERE id LIKE ?");
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            rs.next();
//            ausgabe = rs.getString(1);
//        } catch (SQLException ex) {
//            Logger.getLogger(ZielgruppeDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//
//        return ausgabe;
//    }
//
//    public void updateDozent(Dozent d) {
//        Connection c = getConnection();
//        try {
//            PreparedStatement ps = c.prepareStatement("UPDATE `dozenten` SET `Name` = ?, `Kennzeichen` = ? WHERE `dozenten`.`ID` = ?;");
//            ps.setString(1, d.toStringDB());
//            ps.setString(2, d.getKennzeichen());
//            ps.setInt(3, d.getId());
//            ResultSet rs = ps.executeQuery();
//            rs.next();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ZielgruppeDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//
//    }
//
//    public Seminar readAktuellesSeminar(Dozent d) {
//        Connection c = getConnection();
//        Seminar s = new Seminar();
//
//        try {
//            PreparedStatement ps = c.prepareStatement(" SELECT seminare.*, seminartypen.Name "
//                    + "                                 FROM seminare, dozenten, seminartypen "
//                    + "                                 WHERE ? BETWEEN seminare.Start and seminare.Ende"
//                    + "                                 AND seminare.F_Seminartyp = seminartypen.ID "
//                    + "                                 AND seminare.F_Dozent = dozenten.ID "
//                    + "                                 AND dozenten.ID = ? ");
//            ps.setDate(1, sqlDate);
//            ps.setInt(2, d.getId());
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                s.setId(rs.getInt(1));
//                s.setStart(rs.getDate(2));
//                s.setEnde(rs.getDate(3));
//                s.setfDozent(rs.getInt(4));
//                s.setfZielgruppe(rs.getInt(5));
//                s.setfSeminartyp(rs.getInt(6));
//                s.setfFirma(rs.getInt(7));
//                s.setFeedbackAktiv(rs.getInt(8));
//                s.setFeedbackCounter(rs.getInt(9));
//                s.setSeminartypname(rs.getString(10));
//
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Sie haben zurzeit kein Seminar. Bei Problemen wenden Sie sich bitte an die Verwaltung.");
//            System.exit(0);
//        }
//        closeConnection();
//        return s;
//    }
//
//    public boolean checkDozentVerfuegbar(Dozent dozent) {
//        Connection c = getConnection();
//        boolean dozentVerfuegbar = true;
//        int id = dozent.getId();
//        try {
//            PreparedStatement ps = c.prepareStatement("SELECT * FROM seminare WHERE f_dozent = ? AND ? between start AND ende");
//            ps.setInt(1, id);
//            ps.setDate(2, new DatumFormatieren().getSqlToday());
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                dozentVerfuegbar = false;
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ZielgruppeDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//        return dozentVerfuegbar;
//    }
//
//    // Methode welche prüft ob ein Dozent mehr als ein Seminar in der Datenbank zur ausgewählten Zeit hat (wird beim Seminar bearbeiten benötigt)
//    public boolean checkDozentVerfuegbar(Dozent dozent, boolean b) {
//        Connection c = getConnection();
//        boolean dozentVerfuegbar = true;
//        int id = dozent.getId();
//        int i = 0;
//        try {
//            PreparedStatement ps = c.prepareStatement("SELECT * FROM seminare WHERE f_dozent = ? AND ? between start AND ende");
//            ps.setInt(1, id);
//            ps.setDate(2, new DatumFormatieren().getSqlToday());
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                i++;
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ZielgruppeDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//        if (i > 1) {
//            dozentVerfuegbar = false;
//        }
//        return dozentVerfuegbar;
//    }
//
//    public Dozent getDozent(int ID) {
//        Connection c = getConnection();
//        Dozent d = new Dozent();
//        try {
//            PreparedStatement ps = c.prepareStatement("SELECT * FROM `dozenten` WHERE ID = ?");
////          1 = ID, 2 = Name
//            ps.setInt(1, ID);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                String name = rs.getString(2);
//                Integer id = rs.getInt(1);
//                d.setId(id);
//                d.setName(name);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(SeminarDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return d;
//    }
//
//    public Dozent ueberpruefeDozent(String dozentSuche) {
//        Connection c = getConnection();
//        Dozent d = new Dozent();
//        try {
//            PreparedStatement ps = c.prepareStatement("SELECT * FROM dozenten WHERE LCASE(name) = ?");
//            ps.setString(1, dozentSuche.toLowerCase());
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String name = rs.getString(2);
//                Integer id = rs.getInt(1);
//                String kennzeichen = rs.getString(3);
//
//                d.setId(id);
//                d.setName(name);
//                d.setKennzeichen(kennzeichen);
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//
//        return d;
//    }
//    
//    public boolean dozentVorhanden(Dozent d)
//    {
//        Connection c = getConnection();
//        System.out.println(d.getName());
//        try {
//            PreparedStatement ps = c.prepareStatement("SELECT * FROM dozenten WHERE name = ?");
//            ps.setString(1, d.getName());
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                c.close();
//                return false;
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DozentDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        closeConnection();
//
//        return true; 
//    }
//}
