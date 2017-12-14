/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.view;

import asprojekt.control.GeraetDAO;
import asprojekt.control.MitarbeiterDAO;
import asprojekt.model.Geraet;
import asprojekt.model.Mitarbeiter;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Kenny Ahlwarth
 */
public class Hauptmenue extends javax.swing.JPanel {

    public Hauptmenue() {
        initComponents();
        this.fillGeraete();

        //Group the radio buttons.
        ButtonGroup auswahl;

        auswahl = new ButtonGroup();
        auswahl.add(jbtnGeraete);
        auswahl.add(jbtnMitarbeiter);

        btnloeschen.setEnabled(false);
        plnMenu.setBackground(Color.red);
        while (jbtnMitarbeiter.isSelected()) {
            btnConf.setEnabled(false);
            btnWartungen.setEnabled(false);
            btnmore.setEnabled(false);

        }
        // Liste zu Einfachauswahl 
        lstUebersicht.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    ButtonGroup group = new ButtonGroup();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUebersicht = new javax.swing.JList();
        txtSuche = new javax.swing.JTextField();
        btnHinzu = new javax.swing.JButton();
        btnloeschen = new javax.swing.JButton();
        jbtnGeraete = new javax.swing.JRadioButton();
        jbtnMitarbeiter = new javax.swing.JRadioButton();
        btnConf = new javax.swing.JButton();
        btnWartungen = new javax.swing.JButton();
        plnMenu = new javax.swing.JPanel();
        btnmore = new javax.swing.JButton();

        lstUebersicht.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstUebersicht.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUebersichtValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstUebersicht);

        txtSuche.setText("Suche ");
        txtSuche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSucheMouseClicked(evt);
            }
        });

        btnHinzu.setText("+");
        btnHinzu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHinzuActionPerformed(evt);
            }
        });

        btnloeschen.setText("-");
        btnloeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloeschenActionPerformed(evt);
            }
        });

        jbtnGeraete.setSelected(true);
        jbtnGeraete.setText("Geräte");
        jbtnGeraete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGeraeteActionPerformed(evt);
            }
        });

        jbtnMitarbeiter.setText("Mitarbeiter");
        jbtnMitarbeiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMitarbeiterActionPerformed(evt);
            }
        });

        btnConf.setText("Confi");
        btnConf.setEnabled(false);
        btnConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfActionPerformed(evt);
            }
        });

        btnWartungen.setText("Wartung");
        btnWartungen.setEnabled(false);
        btnWartungen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWartungenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plnMenuLayout = new javax.swing.GroupLayout(plnMenu);
        plnMenu.setLayout(plnMenuLayout);
        plnMenuLayout.setHorizontalGroup(
            plnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
        plnMenuLayout.setVerticalGroup(
            plnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnmore.setText("Infos");
        btnmore.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnGeraete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnMitarbeiter)
                        .addGap(14, 14, 14)
                        .addComponent(btnHinzu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnloeschen))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnWartungen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmore))
                    .addComponent(plnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtSuche, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHinzu)
                    .addComponent(btnloeschen)
                    .addComponent(jbtnGeraete)
                    .addComponent(jbtnMitarbeiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConf)
                            .addComponent(btnWartungen)
                            .addComponent(btnmore)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHinzuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHinzuActionPerformed

        if (jbtnGeraete.isSelected()) {

            hinzuGeraet hG = new hinzuGeraet();
            JFrame jf = new JFrame("Hinzufügen eines Gerätes");
            jf.setSize(800, 250);
            jf.add(hG);
            hG.setJf(jf);
            hG.setHauptmenue(this);
            jf.setVisible(true);

        } else {
            JFrame jf = new JFrame("Mitarbeiter Erstellung ");
            jf.setSize(400, 250);
            jf.add(new hinzuMitarbeiter());

            jf.setVisible(true);
        }
    }//GEN-LAST:event_btnHinzuActionPerformed

    // Methoden Zum Füllen der Listen
    public void fillGeraete() {
        DefaultListModel<Geraet> geraetListModel = new DefaultListModel<>();
        GeraetDAO gDAO = new GeraetDAO();
        ArrayList<Geraet> alleGeraete = gDAO.readAll();
        for (Geraet geraet : alleGeraete) {
            geraetListModel.addElement(geraet);

        }
        lstUebersicht.setModel(geraetListModel);

    }

    public void fillMitarbeiter() {
        DefaultListModel<Mitarbeiter> mitDefaultListModel = new DefaultListModel<>();
        MitarbeiterDAO mDAo = new MitarbeiterDAO();
        ArrayList<Mitarbeiter> allMitarbeiter = mDAo.readAll();
        for (Mitarbeiter mitarb : allMitarbeiter) {
            mitDefaultListModel.addElement(mitarb);
        }
        lstUebersicht.setModel(mitDefaultListModel);
    }


    private void jbtnGeraeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGeraeteActionPerformed
        btnWartungen.setVisible(true);
        btnConf.setVisible(true);
        btnmore.setVisible(true);
        lstUebersicht.removeAll();
        this.fillGeraete();
    }//GEN-LAST:event_jbtnGeraeteActionPerformed

    private void lstUebersichtValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUebersichtValueChanged
        btnloeschen.setEnabled(true);
        btnWartungen.setEnabled(true);
        btnConf.setEnabled(true);
        btnmore.setEnabled(true);

        if (jbtnGeraete.isSelected()) {
            ansichtGeraete anG = new ansichtGeraete((Geraet) lstUebersicht.getSelectedValue());
            plnMenu.add(anG);
            anG.setSize(plnMenu.getWidth(), plnMenu.getHeight());
            anG.setVisible(true);
            plnMenu.revalidate();
        } else {

            ansichtMitarbeiter anM = new ansichtMitarbeiter((Mitarbeiter) lstUebersicht.getSelectedValue());
            plnMenu.add(anM);
            anM.setSize(plnMenu.getWidth(), plnMenu.getHeight());
            anM.setVisible(true);
            anM.revalidate();
        }
    }//GEN-LAST:event_lstUebersichtValueChanged

    private void jbtnMitarbeiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMitarbeiterActionPerformed
        btnWartungen.setVisible(false);
        btnConf.setVisible(false);
        btnmore.setVisible(false);
        lstUebersicht.removeAll();
        this.fillMitarbeiter();
    }//GEN-LAST:event_jbtnMitarbeiterActionPerformed

    private void txtSucheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSucheMouseClicked
        txtSuche.setText("");
    }//GEN-LAST:event_txtSucheMouseClicked

    private void btnloeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloeschenActionPerformed
        //  while (lstUebersicht.getSelectedValue() != null) 
        //   }
    }//GEN-LAST:event_btnloeschenActionPerformed

    private void btnWartungenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWartungenActionPerformed
        // TODO add your handling code here:
        JFrame jf = new JFrame("Wartungs Menü");
        jf.setSize(600, 600);
        jf.add(new WartungMenue());
        jf.setVisible(true);

    }//GEN-LAST:event_btnWartungenActionPerformed

    private void btnConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfActionPerformed
        JFrame jf = new JFrame("Wartungs Menü");
        ansichtConfi anC = new ansichtConfi((Geraet) lstUebersicht.getSelectedValue());
        jf.setSize(600, 600);
        jf.add(anC);
        jf.setVisible(true);

    }//GEN-LAST:event_btnConfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConf;
    private javax.swing.JButton btnHinzu;
    private javax.swing.JButton btnWartungen;
    private javax.swing.JButton btnloeschen;
    private javax.swing.JButton btnmore;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jbtnGeraete;
    private javax.swing.JRadioButton jbtnMitarbeiter;
    private javax.swing.JList lstUebersicht;
    private javax.swing.JPanel plnMenu;
    private javax.swing.JTextField txtSuche;
    // End of variables declaration//GEN-END:variables
}
