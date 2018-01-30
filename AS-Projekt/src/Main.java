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
import asprojekt.view.Hauptmenue;
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
        JFrame jf = new JFrame("IT-Infrastruktur 2018");

        jf.setSize(800, 650);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Hauptmenue());
        jf.setVisible(true);

    }
}
