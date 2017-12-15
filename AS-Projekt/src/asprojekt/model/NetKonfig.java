/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.model;

/**
 *
 * @author Tim der King
 */
public class NetKonfig {
    
    int f_geraeteID;
    String mac;
    String dns_name;
    double uebertragungsrate;
    String netzmaske;
    String ip_adresse;
    String dns_server;

    public NetKonfig(int f_geraeteID, String mac, String dns_name, double uebertragungsrate, String netzmaske, String ip_adresse, String dns_server) {
        this.f_geraeteID = f_geraeteID;
        this.mac = mac;
        this.dns_name = dns_name;
        this.uebertragungsrate = uebertragungsrate;
        this.netzmaske = netzmaske;
        this.ip_adresse = ip_adresse;
        this.dns_server = dns_server;
    }

    public NetKonfig() {
    }
    
    

    public int getF_geraeteID() {
        return f_geraeteID;
    }

    public void setF_geraeteID(int f_geraeteID) {
        this.f_geraeteID = f_geraeteID;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDns_name() {
        return dns_name;
    }

    public void setDns_name(String dns_name) {
        this.dns_name = dns_name;
    }

    public double getUebertragungsrate() {
        return uebertragungsrate;
    }

    public void setUebertragungsrate(int uebertragungsrate) {
        this.uebertragungsrate = uebertragungsrate;
    }

    public String getNetzmaske() {
        return netzmaske;
    }

    public void setNetzmaske(String netzmaske) {
        this.netzmaske = netzmaske;
    }

    public String getIp_adresse() {
        return ip_adresse;
    }

    public void setIp_adresse(String ip_adresse) {
        this.ip_adresse = ip_adresse;
    }

    public String getDns_server() {
        return dns_server;
    }

    public void setDns_server(String dns_server) {
        this.dns_server = dns_server;
    }
    
    
    
}
