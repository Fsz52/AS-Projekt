/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asprojekt.view;

/**
 *
 * @author Kenny Ahlwarth
 */
public class ports extends javax.swing.JPanel {

    private int port;

    public ports() {
        initComponents();
        int i = 1;
        while (i <= port) {
            String s = String.valueOf(i);
            lblPortNr.setText(s);
            i++;
        }

    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblPortNr = new javax.swing.JLabel();
        checkBelegt = new javax.swing.JCheckBox();
        checkTrunk = new javax.swing.JCheckBox();
        cmbVlan = new javax.swing.JComboBox<>();
        lblVlan = new javax.swing.JLabel();
        lblNr = new javax.swing.JLabel();

        lblPortNr.setText("Port NR: ");

        checkBelegt.setText("Belegt");
        checkBelegt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBelegtActionPerformed(evt);
            }
        });

        checkTrunk.setText("Trunk Port ");

        cmbVlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblVlan.setText("VLAN");

        lblNr.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblPortNr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBelegt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkTrunk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbVlan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(checkBelegt)
                .addComponent(checkTrunk)
                .addComponent(cmbVlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblVlan)
                .addComponent(lblNr)
                .addComponent(lblPortNr))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkBelegtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBelegtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBelegtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkBelegt;
    private javax.swing.JCheckBox checkTrunk;
    private javax.swing.JComboBox<String> cmbVlan;
    private javax.swing.JLabel lblNr;
    private javax.swing.JLabel lblPortNr;
    private javax.swing.JLabel lblVlan;
    // End of variables declaration//GEN-END:variables
}