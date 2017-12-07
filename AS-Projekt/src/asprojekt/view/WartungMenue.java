package asprojekt.view;

import javax.swing.JFrame;

/**
 *
 * @author Kenny Ahlwarth
 */
public class WartungMenue extends javax.swing.JPanel {

    /**
     * Creates new form ansichtWartung
     */
    private JFrame jf;

    public WartungMenue() {
        initComponents();
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWartungsPro = new javax.swing.JLabel();
        lblLetzteWartung = new javax.swing.JLabel();
        lblWartungenGes = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnADD = new javax.swing.JButton();
        lblDatumLetzWartun = new javax.swing.JLabel();
        lblLetzterBearbeitung = new javax.swing.JLabel();
        lblWartungengesAnzeige = new javax.swing.JLabel();
        lblNameGeraet = new javax.swing.JLabel();
        lblGeplateWartung = new javax.swing.JLabel();
        txtPlanung = new javax.swing.JTextField();
        cmbMitarbeiter = new javax.swing.JComboBox<>();
        btnSafe = new javax.swing.JButton();

        lblWartungsPro.setText("Wartungs Protkoll");

        lblLetzteWartung.setText("Letzte Wartung ");

        lblWartungenGes.setText("Durchfühte Wartungen ");

        btnClose.setText("OK ");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnADD.setText("Hinzufügen");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        lblDatumLetzWartun.setText("jLabel5");

        lblLetzterBearbeitung.setText("letzter Bearbeiter/in");

        lblWartungengesAnzeige.setText("jLabel9");

        lblNameGeraet.setText("jLabel10");

        lblGeplateWartung.setText("Geplante Wartung");

        txtPlanung.setText("jTextField1");
        txtPlanung.setEnabled(false);

        cmbMitarbeiter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMitarbeiter.setEnabled(false);

        btnSafe.setText("Speichern");
        btnSafe.setEnabled(false);
        btnSafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSafeActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblLetzterBearbeitung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblWartungsPro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblWartungenGes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLetzteWartung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblGeplateWartung))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDatumLetzWartun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWartungengesAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNameGeraet, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtPlanung)
                            .addComponent(cmbMitarbeiter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSafe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnADD)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWartungsPro)
                    .addComponent(lblNameGeraet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeplateWartung)
                    .addComponent(txtPlanung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLetzteWartung)
                    .addComponent(lblDatumLetzWartun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLetzterBearbeitung)
                    .addComponent(cmbMitarbeiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWartungenGes)
                    .addComponent(lblWartungengesAnzeige))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnADD)
                    .addComponent(btnSafe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        jf.dispose();

    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        txtPlanung.setEnabled(true);
        cmbMitarbeiter.setEnabled(true);
        btnSafe.setEnabled(true);
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnSafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSafeActionPerformed
        txtPlanung.setEnabled(false);
        cmbMitarbeiter.setEnabled(false);
        btnSafe.setEnabled(false);
    }//GEN-LAST:event_btnSafeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSafe;
    private javax.swing.JComboBox<String> cmbMitarbeiter;
    private javax.swing.JLabel lblDatumLetzWartun;
    private javax.swing.JLabel lblGeplateWartung;
    private javax.swing.JLabel lblLetzteWartung;
    private javax.swing.JLabel lblLetzterBearbeitung;
    private javax.swing.JLabel lblNameGeraet;
    private javax.swing.JLabel lblWartungenGes;
    private javax.swing.JLabel lblWartungengesAnzeige;
    private javax.swing.JLabel lblWartungsPro;
    private javax.swing.JTextField txtPlanung;
    // End of variables declaration//GEN-END:variables
}
