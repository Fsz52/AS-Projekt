/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.model;

import java.util.ArrayList;

/**
 *
 * @author leon.mueller
 */
public class Firma
{

    private int id;
    private String name;
    private String adresse;
    private String mail;
    private String ort;
    private int plz;
    private String telNummer;
  //  private ArrayList<Dozent> dozenten = new ArrayList<>();

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public String getMail()
    {
        return mail;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }

    public String getOrt()
    {
        return ort;
    }

    public void setOrt(String ort)
    {
        this.ort = ort;
    }

    public int getPlz()
    {
        return plz;
    }

    public void setPlz(int plz)
    {
        this.plz = plz;
    }

    public String getTelNummer()
    {
        return telNummer;
    }

    public void setTelNummer(String telNummer)
    {
        this.telNummer = telNummer;
    }

//    public ArrayList<Dozent> getDozenten()
//    {
//        return dozenten;
//    }
//
//    public void setDozenten(ArrayList<Dozent> dozenten)
//    {
//        this.dozenten = dozenten;
//    }

    public String toString()
    {
        String ausgabe = (this.name + ", " + this.adresse + ", " + this.plz + "  " + this.ort);
        return ausgabe;
    }

}
