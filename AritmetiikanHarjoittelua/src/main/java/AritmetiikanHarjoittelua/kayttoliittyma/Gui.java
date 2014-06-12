package AritmetiikanHarjoittelua.kayttoliittyma;

import AritmetiikanHarjoittelua.logiikka.Aritmetiikkakone;

import javax.swing.JComponent.AccessibleJComponent;

/**
 * Luokka sisältää graafisen käyttöliittymän, joka käynnistetään metodilla
 * run().
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
//        ks. kommentit metodissa tehtavatyyppiAlasvetovalikkoActionPerformed
        String tyyppiString = (String) tehtavatyyppiAlasvetovalikko.getSelectedItem();
        char tyyppiMerkki = tyyppiString.charAt(0);
        this.tehtavaTyyppi = String.valueOf(tyyppiMerkki);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        uusiTehtavaNappi = new javax.swing.JButton();
        tarkistaVastausNappi = new javax.swing.JButton();
        vastausTextField = new javax.swing.JTextField();
        tehtavatyyppiAlasvetovalikko = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        tulosTextField = new javax.swing.JTextField();
        tehtavaTextField = new javax.swing.JTextField();
        vaaraLaskuTyyppijOptionPane = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Testinappi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestinappiActionPerformed(evt);
            }
        });

        uusiTehtavaNappi.setText("Uusi tehtävä");
        uusiTehtavaNappi.setToolTipText("");
        uusiTehtavaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uusiTehtavaActionPerformed(evt);
            }
        });

        tarkistaVastausNappi.setText("Tarkista vastaus");
        tarkistaVastausNappi.setActionCommand("Tarkista vastaus");
        tarkistaVastausNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarkistaVastausNappiActionPerformed(evt);
            }
        });

        vastausTextField.setToolTipText("anna vastaus, esim 4 tai -2");

        tehtavatyyppiAlasvetovalikko.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yhteenlasku", "vähennyslasku", "kertolasku", "jakolasku", "huono valinta" }));
        tehtavatyyppiAlasvetovalikko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tehtavatyyppiAlasvetovalikkoActionPerformed(evt);
            }
        });

        jButton2.setText("Ikkunatesti");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tulosTextField.setEditable(false);

        tehtavaTextField.setEditable(false);
        tehtavaTextField.setBackground(new java.awt.Color(240, 240, 240));

        vaaraLaskuTyyppijOptionPane.setMessage("Virheilmoituksia..."
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tehtavatyyppiAlasvetovalikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(uusiTehtavaNappi)
                            .addComponent(tehtavaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tarkistaVastausNappi)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vastausTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vaaraLaskuTyyppijOptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tulosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tulosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(vastausTextField)
                    .addComponent(tehtavaTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uusiTehtavaNappi)
                    .addComponent(tarkistaVastausNappi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tehtavatyyppiAlasvetovalikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(vaaraLaskuTyyppijOptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TestinappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestinappiActionPerformed
        // TODO add your handling code here:
        System.out.println("Nappia painettu");
        tehtavaTextField.setText("nappia painettu");
    }//GEN-LAST:event_TestinappiActionPerformed

    private void uusiTehtavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uusiTehtavaActionPerformed
//        this.tehtavaTyyppi = "k";
//        while (true) {
            try {
        this.kone.luoTehtava(this.tehtavaTyyppi); // EXCEPTION 
        tehtavaTextField.setText(this.kone.getTehtava().tekstina());
        tulosTextField.setText("");
        vastausTextField.setText("");
//               break;// EXCEPTION 
            } catch (Exception exception) {// EXCEPTION 
               System.out.println("Väärä laskutoimitustyyppi");// EXCEPTION
               vaaraLaskuTyyppijOptionPane.setMessage("Väärä laskutoimitustyyppi");
               vaaraLaskuTyyppijOptionPane.setVisible(true);
//               JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
           }// EXCEPTION 
//       }// EXCEPTION 
//        String a=String(tehtavatyyppiAlasvetovalikko[${selectedItem}]);
    }//GEN-LAST:event_uusiTehtavaActionPerformed

    private void tarkistaVastausNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarkistaVastausNappiActionPerformed
        if (this.kone.getTehtava().onOikein(vastausTextField.getText())) {
        tulosTextField.setText("Vastaus on oikein.");
        } else {
        tulosTextField.setText("Vastaus on väärin.");
        }
    }//GEN-LAST:event_tarkistaVastausNappiActionPerformed

    private void tehtavatyyppiAlasvetovalikkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tehtavatyyppiAlasvetovalikkoActionPerformed
//        hieman hankalan nakoista koodia mutta nain txt kayttoliittyman voi
//        pitaa ennallaan ja alasvetovalikossa puolestaan voi kayttaa skandinaavisia merkkeja
        String tyyppiString = (String) tehtavatyyppiAlasvetovalikko.getSelectedItem();
        char tyyppiMerkki = tyyppiString.charAt(0);
        this.tehtavaTyyppi = String.valueOf(tyyppiMerkki);
    }//GEN-LAST:event_tehtavatyyppiAlasvetovalikkoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ikkunaTesti();
    }//GEN-LAST:event_jButton2ActionPerformed

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

    public static void ikkunaTesti() {

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
                new NewJFrame().setVisible(true);


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton tarkistaVastausNappi;
    private javax.swing.JTextField tehtavaTextField;
    private javax.swing.JComboBox tehtavatyyppiAlasvetovalikko;
    private javax.swing.JTextField tulosTextField;
    private javax.swing.JButton uusiTehtavaNappi;
    private javax.swing.JOptionPane vaaraLaskuTyyppijOptionPane;
    private javax.swing.JTextField vastausTextField;
    // End of variables declaration//GEN-END:variables
}
