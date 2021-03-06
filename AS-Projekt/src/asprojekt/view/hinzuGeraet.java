/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.view;

import asprojekt.control.GeraetDAO;
import asprojekt.control.NetKonfigDAO;
import asprojekt.control.RaumDAO;
import asprojekt.model.Geraet;
import asprojekt.model.NetKonfig;
import asprojekt.model.Raum;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/**
 *
 * @author Kenny Ahlwarth
 */
public class hinzuGeraet extends javax.swing.JPanel {

    /**
     * Creates new form hintuGeraet
     */
    private JFrame jf;
    private Hauptmenue hauptmenue;
    private RaumDAO rDAO = new RaumDAO();
    private ArrayList<Raum> raeume = new ArrayList(rDAO.readAll());
    private DefaultComboBoxModel<Raum> dcbmRaum = new DefaultComboBoxModel<>(raeume.toArray(new Raum[0]));

    public hinzuGeraet() {
        initComponents();
        cmb_raum.setModel(dcbmRaum);

    }

    public void setHauptmenue(Hauptmenue hauptmenue) {
        this.hauptmenue = hauptmenue;
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNew = new javax.swing.JLabel();
        lblSerienNr = new javax.swing.JLabel();
        lblPreis = new javax.swing.JLabel();
        lblOrt = new javax.swing.JLabel();
        txtSnNr = new javax.swing.JTextField();
        txtPreis = new javax.swing.JTextField();
        txtOrt = new javax.swing.JTextField();
        btnSpeichern = new javax.swing.JButton();
        btnAbbruch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblRaumNr = new javax.swing.JLabel();
        cb_switch = new javax.swing.JCheckBox();
        cmb_raum = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txt_ports = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_dns_name = new javax.swing.JTextField();
        txt_mac = new javax.swing.JTextField();
        txt_ip = new javax.swing.JTextField();
        txt_netzmaske = new javax.swing.JTextField();
        txt_uebertragung = new javax.swing.JTextField();
        txt_dns_ip = new javax.swing.JTextField();

        lblNew.setText("Neues Gerät ");

        lblSerienNr.setText("Serien-Nr");

        lblPreis.setText("Anschaffungspreis");

        lblOrt.setText("Standort");

        btnSpeichern.setText("Weiter");
        btnSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeichernActionPerformed(evt);
            }
        });

        btnAbbruch.setText("Abbruch");
        btnAbbruch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbbruchActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblRaumNr.setText("Raum-Nr.");

        cb_switch.setText("Switch?");
        cb_switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_switchActionPerformed(evt);
            }
        });

        cmb_raum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Ports");

        txt_ports.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Netzkonfiguration");

        jLabel3.setText("DNS-Name");

        jLabel4.setText("MAC-Adresse");

        jLabel5.setText("IP-Adresse");

        jLabel6.setText("Netzmaske");

        jLabel7.setText("Übertragungsrate");

        jLabel8.setText("DNS-IP");

        txt_dns_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dns_nameActionPerformed(evt);
            }
        });

        txt_uebertragung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_uebertragungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblRaumNr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPreis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSerienNr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOrt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSnNr)
                            .addComponent(txtPreis)
                            .addComponent(txtOrt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_switch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ports, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(0, 124, Short.MAX_VALUE))
                            .addComponent(cmb_raum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(txt_dns_name))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSpeichern)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAbbruch)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear))
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(38, 38, 38)
                                .addComponent(txt_mac))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addComponent(txt_ip))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(53, 53, 53)
                                .addComponent(txt_netzmaske))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_uebertragung))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(72, 72, 72)
                                .addComponent(txt_dns_ip)))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNew)
                    .addComponent(cb_switch)
                    .addComponent(jLabel1)
                    .addComponent(txt_ports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerienNr)
                    .addComponent(txtSnNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreis)
                    .addComponent(txtPreis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrt)
                    .addComponent(txtOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaumNr)
                    .addComponent(cmb_raum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dns_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_mac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_netzmaske, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_uebertragung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_dns_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpeichern)
                    .addComponent(btnAbbruch)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeichernActionPerformed
        // TODO add your handling code here:
        Geraet g = new Geraet();
        NetKonfig netKon = new NetKonfig();
        int portAnzahl;
        GeraetDAO gDAO = new GeraetDAO();
        NetKonfigDAO netDAO = new NetKonfigDAO();

        g.setAnschPreis((Double.parseDouble(txtPreis.getText())));
        g.setNetconfig(null);
        g.setRaum((Raum) cmb_raum.getSelectedItem());
        g.setSn(txtSnNr.getText());
        g.setStandort(txtOrt.getText());
        
        int g_id = gDAO.addGeraet(g);
        g.setP_geraete_id(g_id);
        netKon.setF_geraeteID(g_id);
        netKon.setDns_name(txt_dns_name.getText());
        netKon.setDns_server(txt_dns_ip.getText());
        netKon.setIp_adresse(txt_ip.getText());
        netKon.setMac(txt_mac.getText());
        netKon.setNetzmaske(txt_netzmaske.getText());
        netKon.setUebertragungsrate(Integer.parseInt(txt_uebertragung.getText()));
        
        netDAO.addNetKonfig(g, netKon);
        
        if (cb_switch.isSelected()) {
            g.setIsSwitch(true);
            portAnzahl = Integer.parseInt(txt_ports.getText());
            //Code für Übergabe an Netzkonfig-GUI
        } else {
            g.setIsSwitch(false);
        }
        
        jf.dispose();
        hauptmenue.refreshGeraeteListe();
    }//GEN-LAST:event_btnSpeichernActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtSnNr.setText("");
        txtOrt.setText("");
        txtPreis.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAbbruchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbbruchActionPerformed
        // TODO add your handling code here:
        jf.dispose();
    }//GEN-LAST:event_btnAbbruchActionPerformed

    private void cb_switchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_switchActionPerformed
        // TODO add your handling code here:
        if (cb_switch.isSelected()) {
            txt_ports.setEditable(true);
        } else {
            txt_ports.setEditable(false);
        }

    }//GEN-LAST:event_cb_switchActionPerformed

    private void txt_dns_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dns_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dns_nameActionPerformed

    private void txt_uebertragungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_uebertragungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_uebertragungActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbbruch;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSpeichern;
    private javax.swing.JCheckBox cb_switch;
    private javax.swing.JComboBox cmb_raum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblNew;
    private javax.swing.JLabel lblOrt;
    private javax.swing.JLabel lblPreis;
    private javax.swing.JLabel lblRaumNr;
    private javax.swing.JLabel lblSerienNr;
    private javax.swing.JTextField txtOrt;
    private javax.swing.JTextField txtPreis;
    private javax.swing.JTextField txtSnNr;
    private javax.swing.JTextField txt_dns_ip;
    private javax.swing.JTextField txt_dns_name;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JTextField txt_mac;
    private javax.swing.JTextField txt_netzmaske;
    private javax.swing.JTextField txt_ports;
    private javax.swing.JTextField txt_uebertragung;
    // End of variables declaration//GEN-END:variables

}
