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

        JFrame jf = new JFrame("Krass Bruder");

        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Hauptmenue());
        jf.setVisible(true);

    }
}
