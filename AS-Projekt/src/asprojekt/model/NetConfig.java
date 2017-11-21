/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.model;

/**
 *
 * @author Leon
 */
public class NetConfig {
    
    String rate;
    String ipAdd;
    String macAdd;
    String netMask;
    String dnsName;

    public NetConfig(String rate, String ipAdd, String macAdd, String netMask, String dnsName) {
        this.rate = rate;
        this.ipAdd = ipAdd;
        this.macAdd = macAdd;
        this.netMask = netMask;
        this.dnsName = dnsName;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }

    public String getMacAdd() {
        return macAdd;
    }

    public void setMacAdd(String macAdd) {
        this.macAdd = macAdd;
    }

    public String getNetMask() {
        return netMask;
    }

    public void setNetMask(String netMask) {
        this.netMask = netMask;
    }

    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }
    
    
}
