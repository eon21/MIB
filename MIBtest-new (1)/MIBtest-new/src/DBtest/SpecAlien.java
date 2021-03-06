/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;

/**
 *
 * @author arvid
 */
public class SpecAlien extends javax.swing.JFrame {

    private static InfDB idb;
    private static String alien;

    public SpecAlien(InfDB iidb, String alien) {
        initComponents();
        idb = iidb;
        this.alien = alien;
        alienInfo();
    }

    private void alienInfo() {
        try {
            ArrayList<String> alienIDs = new ArrayList<String>();
            ArrayList<String> alienDatums = new ArrayList<String>();
            ArrayList<String> alienLosenords = new ArrayList<String>();
            ArrayList<String> alienNamns = new ArrayList<String>();
            ArrayList<String> alienTels = new ArrayList<String>();

            String alienID = "SELECT Alien_ID FROM alien WHERE namn = '" + alien + "'";
            String alienDatum = "SELECT Registreringsdatum FROM alien WHERE namn = '" + alien + "'";
            String alienLosenord = "SELECT Losenord FROM alien WHERE namn = '" + alien + "'";
            String alienNamn = "SELECT Namn FROM alien WHERE namn = '" + alien + "'";
            String alienTel = "SELECT Telefon FROM alien WHERE namn = '" + alien + "'";

            alienIDs = idb.fetchColumn(alienID);
            String ettAlienID = new String(alienIDs.toString().replace("[", "").replace("]", ""));
            alienDatums = idb.fetchColumn(alienDatum);
            String ettDatum = new String(alienDatums.toString().replace("[", "").replace("]", ""));
            alienLosenords = idb.fetchColumn(alienLosenord);
            String ettLosenord = new String(alienLosenords.toString().replace("[", "").replace("]", ""));
            alienNamns = idb.fetchColumn(alienNamn);
            String ettNamn = new String(alienNamns.toString().replace("[", "").replace("]", ""));
            alienTels = idb.fetchColumn(alienTel);
            String ettTel = new String(alienTels.toString().replace("[", "").replace("]", ""));

            String[] column = {ettAlienID, ettDatum, ettLosenord, ettNamn, ettTel};

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(column);

        } catch (Exception ex) {
            System.out.println(ex);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Datum", "L??senord", "Namn", "Telefon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SpecAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpecAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpecAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpecAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpecAlien(idb, alien).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
