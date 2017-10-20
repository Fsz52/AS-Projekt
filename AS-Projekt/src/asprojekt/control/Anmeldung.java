/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.control;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patrick.oelmann
 */
public class Anmeldung {

    private String benutzer;
    private String userip;
    private String password;
    private File file;
    private String appdata = System.getenv("APPDATA");
    private String filedirectory = appdata + "\\config.properties";
    private String inhalt;
    private FileWriter writer;

    public Anmeldung() {
        this.file = new File(filedirectory);
        
    }

    public ArrayList<String> searchFile() {

        ArrayList<String> arrlst = new ArrayList();

        try {

            if (!file.exists()) {

                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filedirectory)));
                file.createNewFile();

                benutzer = "root\r\n";
                userip = "jdbc:mariadb://192.168.1.167:3306/feedback\r\n";
                password = "";

                bw.write(benutzer);
                bw.write(userip);
                bw.write(password);
                bw.flush();
                bw.close();

                arrlst.add(benutzer);
                arrlst.add(userip);
                arrlst.add(password);

            }

        } catch (Exception e) {

        }
        return arrlst;
    }

    public ArrayList<String> readFile() {

        BufferedReader br = null;
        ArrayList<String> strings = new ArrayList<>();
        try {

            br = new BufferedReader(new FileReader(filedirectory));
            String zeile1 = br.readLine();
//            System.out.println(zeile1);
            String zeile2 = br.readLine();
//            System.out.println(zeile2);
            String zeile3 = br.readLine();
//            System.out.println(zeile3);
            
            strings.add(zeile1);
            strings.add(zeile2);
            strings.add(zeile3);
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Anmeldung.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Anmeldung.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Anmeldung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return strings;
    }
}
