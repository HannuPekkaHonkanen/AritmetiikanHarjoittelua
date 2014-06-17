package AritmetiikanHarjoittelua.kayttoliittyma;

import AritmetiikanHarjoittelua.logiikka.Aritmetiikkakone;
import AritmetiikanHarjoittelua.logiikka.Tehtava;
import javax.swing.JOptionPane;

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
    private final int tehtavaLkm = 10;
    private String[] vastaukset;

    public Gui(Aritmetiikkakone kone) {
        initComponents();
        this.kone = kone;
//        ks. kommentit metodissa tehtavatyyppiAlasvetovalikkoActionPerformed
        String tyyppiString = (String) tehtavatyyppiAlasvetovalikko.getSelectedItem();
        char tyyppiMerkki = tyyppiString.charAt(0);
        this.tehtavaTyyppi = String.valueOf(tyyppiMerkki);
        this.vastaukset = new String[tehtavaLkm];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uusiTehtavaNappi = new javax.swing.JButton();
        tarkistaVastausNappi = new javax.swing.JButton();
        tehtavatyyppiAlasvetovalikko = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tehtavaTaulukko = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uusiTehtavaNappi.setText("Luo uudet tehtävät");
        uusiTehtavaNappi.setToolTipText("Valitse tehtävätyyppi alta ja paina tästä!");
        uusiTehtavaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uusiTehtavaActionPerformed(evt);
            }
        });

        tarkistaVastausNappi.setText("Tarkista vastaukset");
        tarkistaVastausNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarkistaVastausNappiActionPerformed(evt);
            }
        });

        tehtavatyyppiAlasvetovalikko.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yhteenlasku", "vähennyslasku", "kertolasku", "jakolasku", "huono valinta" }));
        tehtavatyyppiAlasvetovalikko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tehtavatyyppiAlasvetovalikkoActionPerformed(evt);
            }
        });

        tehtavaTaulukko.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tehtävä", "Vastaus", "Tulos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tehtavaTaulukko.setToolTipText("Klikkaa Vastaus-kenttää, anna vastaus esim. 2 tai -4 ja paina enter. Tuplaklikkaamalla pääset muuttamaan vastausta.");
        jScrollPane1.setViewportView(tehtavaTaulukko);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tehtavatyyppiAlasvetovalikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uusiTehtavaNappi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tarkistaVastausNappi)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uusiTehtavaNappi)
                    .addComponent(tarkistaVastausNappi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tehtavatyyppiAlasvetovalikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uusiTehtavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uusiTehtavaActionPerformed
        try {
            this.kone.luoTehtavat(this.tehtavaTyyppi, tehtavaLkm);
            for (int i = 0; i < tehtavaLkm; i++) {
                tehtavaTaulukko.setValueAt(this.kone.getTehtavat()[i].tekstina(), i, 0);
                tehtavaTaulukko.setValueAt("", i, 1);
                tehtavaTaulukko.setValueAt("", i, 2);
            }
        } catch (Exception exception) {// EXCEPTION 
            JOptionPane.showMessageDialog(rootPane, "Laskutoimitusten luonti ei onnistunut. Ehkä valitsit laskutoimitustyypin huonosti. Yritä uudelleen!");
        }
    }//GEN-LAST:event_uusiTehtavaActionPerformed

    private void tarkistaVastausNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarkistaVastausNappiActionPerformed
        if (this.kone.getTehtavat() != null) {
            for (int i = 0; i < tehtavaLkm; i++) {
                this.vastaukset[i] = tehtavaTaulukko.getValueAt(i, 1).toString();
            }
            this.kone.tarkistaTehtavat(vastaukset, tehtavaLkm);
            for (int i = 0; i < tehtavaLkm; i++) {
                tehtavaTaulukko.setValueAt(this.kone.getTulokset()[i], i, 2);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Luo ensin tehtävät!");
        }

    }//GEN-LAST:event_tarkistaVastausNappiActionPerformed

    private void tehtavatyyppiAlasvetovalikkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tehtavatyyppiAlasvetovalikkoActionPerformed
//        hieman hankalan nakoista koodia mutta nain txt kayttoliittyman voi
//        pitaa ennallaan ja alasvetovalikossa puolestaan voi kayttaa skandinaavisia merkkeja
        String tyyppiString = (String) tehtavatyyppiAlasvetovalikko.getSelectedItem();
        char tyyppiMerkki = tyyppiString.charAt(0);
        this.tehtavaTyyppi = String.valueOf(tyyppiMerkki);
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
                new Gui(new Aritmetiikkakone()).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tarkistaVastausNappi;
    private javax.swing.JTable tehtavaTaulukko;
    private javax.swing.JComboBox tehtavatyyppiAlasvetovalikko;
    private javax.swing.JButton uusiTehtavaNappi;
    // End of variables declaration//GEN-END:variables
}
