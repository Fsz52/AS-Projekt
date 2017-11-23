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
import asprojekt.control.RaumDAO;
import asprojekt.model.Raum;
import java.util.ArrayList;

public class Main {
    
    
    
    public static void main(String[] args) {
        AbstractDBConnector dbconnector = new AbstractDBConnector();
        dbconnector.getConnection();
        
        RaumDAO rDAO = new RaumDAO();
        ArrayList<Raum> alleRaeume = rDAO.readAll();
        for (Raum raum : alleRaeume)
        {
            System.out.println(raum.getRaumNr());
        }
        
    }
}
