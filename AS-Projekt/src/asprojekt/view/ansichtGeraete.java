/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.view;

import asprojekt.model.Geraet;

/**
 *
 * @author Kenny Ahlwarth
 */
public class ansichtGeraete extends javax.swing.JPanel {

    /**
     * Creates new form ansichGeraete
     */
    public ansichtGeraete() {
        initComponents();
    }

    public ansichtGeraete(Geraet g) {
        initComponents();
        setInfos(g);
    }

    public void setInfos(Geraet g) {
        lblshowNameG.setText(g.getNetconfig().getDns_name());
        lblShSnNR.setText(g.getSn());
        lblshowPreis.setText(String.valueOf(g.getAnschPreis()));
        lblshowOrt.setText(g.getStandort());
        lblShowRaum.setText(g.getRaum().getRaumNr());
        txtDNSNa.setText(g.getNetconfig().getDns_name());
        txtDNS.setText(g.getNetconfig().getDns_server());
        txtIP.setText(g.getNetconfig().getIp_adresse());
        txtMaske.setText(g.getNetconfig().getNetzmaske());
        txtRate.setText(String.valueOf(g.getNetconfig().getUebertragungsrate()));
        lblMacAn.setText(g.getNetconfig().getMac());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblueberGaert = new javax.swing.JLabel();
        lblshowNameG = new javax.swing.JLabel();
        lblSnNr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblOrt = new javax.swing.JLabel();
        lblShSnNR = new javax.swing.JLabel();
        lblshowPreis = new javax.swing.JLabel();
        lblshowOrt = new javax.swing.JLabel();
        lblRaumNr = new javax.swing.JLabel();
        lblShowRaum = new javax.swing.JLabel();
        lblConfi = new javax.swing.JLabel();
        lblDNSname = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        txtDNSNa = new javax.swing.JTextField();
        lblMaske = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblDNS = new javax.swing.JLabel();
        lblMAC = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();
        txtMaske = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        txtDNS = new javax.swing.JTextField();
        lblMacAn = new javax.swing.JLabel();
        btnSafe = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        lblueberGaert.setText("Gerät Übersicht");

        lblshowNameG.setText("jLabel1");

        lblSnNr.setText("Serien-Nr");

        jLabel1.setText("Anschaffungspreis");

        lblOrt.setText("Standort");

        lblShSnNR.setText("jLabel2");

        lblshowPreis.setText("jLabel3");

        lblshowOrt.setText("jLabel4");

        lblRaumNr.setText("Raum-Nr.");

        lblShowRaum.setText("jLabel2");

        lblConfi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConfi.setText("Netzkonfiguration");

        lblDNSname.setText("DNS-Name");

        lblRate.setText("Übertagungsrate");

        txtDNSNa.setText("jTextField1");
        txtDNSNa.setEnabled(false);

        lblMaske.setText("Netzmaske");

        lblIP.setText("IP-Adresse");

        lblDNS.setText("DNS");

        lblMAC.setText("MAC");

        txtRate.setText("jTextField2");
        txtRate.setEnabled(false);

        txtMaske.setText("jTextField3");
        txtMaske.setEnabled(false);

        txtIP.setText("jTextField4");
        txtIP.setEnabled(false);

        txtDNS.setText("jTextField5");
        txtDNS.setEnabled(false);

        lblMacAn.setText("jLabel2");

        btnSafe.setText("Speichern");
        btnSafe.setEnabled(false);
        btnSafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSafeActionPerformed(evt);
            }
        });

        btnEdit.setText("Bearbeiten");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setText("Clear ");
        btnClear.setEnabled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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
                            .addComponent(lblMAC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDNS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaske, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDNSname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaske)
                            .addComponent(txtRate)
                            .addComponent(txtDNSNa)
                            .addComponent(txtIP)
                            .addComponent(txtDNS)
                            .addComponent(lblMacAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblSnNr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblueberGaert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblRaumNr, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblShowRaum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblshowOrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblshowPreis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblShSnNR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblshowNameG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSafe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addGap(0, 252, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblueberGaert)
                    .addComponent(lblshowNameG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSnNr)
                    .addComponent(lblShSnNR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblshowPreis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrt)
                    .addComponent(lblshowOrt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaumNr)
                    .addComponent(lblShowRaum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConfi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNSname)
                    .addComponent(txtDNSNa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRate)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaske)
                    .addComponent(txtMaske, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIP)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNS)
                    .addComponent(txtDNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMAC)
                    .addComponent(lblMacAn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSafe)
                    .addComponent(btnEdit)
                    .addComponent(btnClear))
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtDNS.setText("");
        txtDNSNa.setText("");
        txtIP.setText("");
        txtMaske.setText("");
        txtRate.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtDNS.setEnabled(true);
        txtDNSNa.setEnabled(true);
        txtIP.setEnabled(true);
        txtMaske.setEnabled(true);
        txtRate.setEnabled(true);
        btnClear.setEnabled(true);
        btnSafe.setEnabled(true);
        btnEdit.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSafeActionPerformed
       txtDNS.setEnabled(false);
        txtDNSNa.setEnabled(false);
        txtIP.setEnabled(false);
        txtMaske.setEnabled(false);
        txtRate.setEnabled(false);
        btnClear.setEnabled(false);
        btnSafe.setEnabled(false);
        btnEdit.setEnabled(true);
    }//GEN-LAST:event_btnSafeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSafe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblConfi;
    private javax.swing.JLabel lblDNS;
    private javax.swing.JLabel lblDNSname;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblMAC;
    private javax.swing.JLabel lblMacAn;
    private javax.swing.JLabel lblMaske;
    private javax.swing.JLabel lblOrt;
    private javax.swing.JLabel lblRate;
    private javax.swing.JLabel lblRaumNr;
    private javax.swing.JLabel lblShSnNR;
    private javax.swing.JLabel lblShowRaum;
    private javax.swing.JLabel lblSnNr;
    private javax.swing.JLabel lblshowNameG;
    private javax.swing.JLabel lblshowOrt;
    private javax.swing.JLabel lblshowPreis;
    private javax.swing.JLabel lblueberGaert;
    private javax.swing.JTextField txtDNS;
    private javax.swing.JTextField txtDNSNa;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtMaske;
    private javax.swing.JTextField txtRate;
    // End of variables declaration//GEN-END:variables
}
