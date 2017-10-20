package asprojekt.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nils.berg
 */
public class AbstractDBConnector {

    private static Connection c;
    private static String db;
    private static String user;
    private static String pw;

    public AbstractDBConnector() {
        getData();
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbstractDBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        try {
            if (AbstractDBConnector.c == null || AbstractDBConnector.c.isClosed()) {
                AbstractDBConnector.c = DriverManager.getConnection(db, user, pw);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AbstractDBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AbstractDBConnector.c;
    }

    public void closeConnection() {
        try {
            AbstractDBConnector.c.close();
        } catch (SQLException ex) {

        }
        AbstractDBConnector.c = null;
    }

    public static void getData() {
        
        user = "oszimtas\r\n";
        db = "jdbc:mariadb://nilssonsound.de:3306/Projekt/oszimttim\r\n";
        pw = "abc()42V=s1";

    }

}
