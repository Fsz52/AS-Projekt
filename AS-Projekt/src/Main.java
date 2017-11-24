/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
import asprojekt.control.AbstractDBConnector;
import asprojekt.control.SwitchDAO;
import asprojekt.model.Port;
import asprojekt.model.Switch;
import asprojekt.view.Hauptmenue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        AbstractDBConnector dbconnector = new AbstractDBConnector();
        dbconnector.getConnection();
//        !!! BITTE NICHT LÖSCHEN::: DIENT ZU TESTZWECKEN !!!
//                    SwitchDAO sdao = new SwitchDAO();
//                            try {
//                                ArrayList<Switch> slist = sdao.readAll();
//                                for (Switch sw : slist){
//                                    System.out.println(sw.toString());
//                                }
//                            } catch (SQLException ex) {
//                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                            }
        JFrame jf = new JFrame("Krass Bruder");

        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Hauptmenue());
        jf.setVisible(true);

        

    }
}
