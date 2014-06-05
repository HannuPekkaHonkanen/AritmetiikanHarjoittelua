package AritmetiikanHarjoittelua.kayttoliittyma;

import AritmetiikanHarjoittelua.logiikka.Aritmetiikkakone;

/**
 *
 * @author Hannu
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    private Aritmetiikkakone kone;
    private String tehtavaTyyppi;
    private String tehtavaT;

    public Gui(Aritmetiikkakone kone) {
        initComponents();
        this.kone = kone;
        this.tehtavaTyyppi=(String)tehtavatyyppiAlasvetovalikko.getSelectedItem();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        uusiTehtavaNappi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tehtavaKentta = new javax.swing.JTextArea();
        vastaaNappi = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        tehtavatyyppiAlasvetovalikko = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        uusiTehtavaNappi.setText("Uusi tehtävä");
        uusiTehtavaNappi.setToolTipText("");
        uusiTehtavaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uusiTehtavaActionPerformed(evt);
            }
        });

        tehtavaKentta.setEditable(false);
        tehtavaKentta.setBackground(new java.awt.Color(255, 255, 204));
        tehtavaKentta.setColumns(20);
        tehtavaKentta.setRows(1);
        jScrollPane1.setViewportView(tehtavaKentta);

        vastaaNappi.setText("Vastaa");
        vastaaNappi.setActionCommand("annaVastaus");
        vastaaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastaaNappiActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("anna vastaus, esim 4 tai -2");

        tehtavatyyppiAlasvetovalikko.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "y", "v", "kertolasku", "jakolasku", "kaikki" }));
        tehtavatyyppiAlasvetovalikko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tehtavatyyppiAlasvetovalikkoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(uusiTehtavaNappi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vastaaNappi)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(tehtavatyyppiAlasvetovalikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uusiTehtavaNappi)
                    .addComponent(vastaaNappi))
                .addGap(53, 53, 53)
                .addComponent(tehtavatyyppiAlasvetovalikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Nappia painettu");
        tehtavaKentta.setText("nappia painettu");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uusiTehtavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uusiTehtavaActionPerformed
//        this.tehtavaTyyppi = "k";
        this.kone.luoTehtava(this.tehtavaTyyppi); // EXCEPTION 
//        String a=String(tehtavatyyppiAlasvetovalikko[${selectedItem}]);
        tehtavaKentta.setText(this.kone.getTehtava().tekstina());
    }//GEN-LAST:event_uusiTehtavaActionPerformed

    private void vastaaNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastaaNappiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vastaaNappiActionPerformed

    private void tehtavatyyppiAlasvetovalikkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tehtavatyyppiAlasvetovalikkoActionPerformed
//        String k;
//        tehtavatyyppiAlasvetovalikko.setSelectedItem(this.tehtavaT);
        this.tehtavaTyyppi=(String)tehtavatyyppiAlasvetovalikko.getSelectedItem();
//        tehtavaKentta.setText(this.tehtavaTyyppi);
//        this.tehtavaTyyppi="v";
//        this.tehtavaTyyppi=(String)tehtavatyyppiAlasvetovalikko[selectedItem];
//////        uusiTehtavaNappiaPainettu(evt);
//        Enum aaa = ${selectedItem};
//        uusiTehtavaNappi.setText("yhteenlasku");
    }//GEN-LAST:event_tehtavatyyppiAlasvetovalikkoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
//                Gui gui;
                new Gui(new Aritmetiikkakone()).setVisible(true);


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea tehtavaKentta;
    private javax.swing.JComboBox tehtavatyyppiAlasvetovalikko;
    private javax.swing.JButton uusiTehtavaNappi;
    private javax.swing.JButton vastaaNappi;
    // End of variables declaration//GEN-END:variables
}
