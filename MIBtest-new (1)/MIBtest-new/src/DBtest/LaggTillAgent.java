/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.awt.HeadlessException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author arvid
 */
public class LaggTillAgent extends javax.swing.JFrame {

    private static InfDB idb;

    public LaggTillAgent(InfDB iidb) {
        initComponents();
        idb = iidb;
        fillCmb();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        losenField = new javax.swing.JTextField();
        namnField = new javax.swing.JTextField();
        telField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        omradeCmb = new javax.swing.JComboBox<>();
        adminCmb = new javax.swing.JComboBox<>();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        losenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losenFieldActionPerformed(evt);
            }
        });

        namnField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        namnField.setText("Agent ");

        jLabel1.setText("Lösenord:");

        jLabel2.setText("Namn:");

        jLabel3.setText("Telefonnr:");

        jLabel4.setText("Område:");

        jLabel5.setText("Admin:");

        adminCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nej", "Ja" }));

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namnField)
                            .addComponent(losenField)
                            .addComponent(telField)
                            .addComponent(omradeCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminCmb, 0, 157, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(omradeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adminCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void losenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losenFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_losenFieldActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
//knapp för att lägga till agenten
        try {

            //ta ut dagens datum i rätt form
            LocalDate dagensDatum = LocalDate.now();
            String losenord = losenField.getText();

            String tel = telField.getText();
            //använder regex för att validera att nummersträngen endast innehåller siffror

            String namn = namnField.getText();
            //kolla ifall alla fält är ifyllda
            //ta ut det som är valt i comboboxar
            String omradeNamn = omradeCmb.getSelectedItem().toString();
            String omradeFraga = "SELECT Omrades_ID from omrade where Benamning = '" + omradeNamn + "'";
            String omrade = idb.fetchSingle(omradeFraga);
            String adminStatus = adminCmb.getSelectedItem().toString();
            //ändra ja/nej till ja/nej för att det ska passa i databasen
            if (adminStatus.equals("Ja")) {
                adminStatus = "J";
            } else if (adminStatus.equals("Nej")) {
                adminStatus = "N";
            }
            //Validerar alla fält från valideringsklassen
            Validation validering5 = new Validation(losenord);
            boolean rattLosenord = validering5.kollaLosen(losenord);
            
            Validation validering = new Validation(tel);
            boolean rattTel = validering.kollaInt(tel);

            Validation validering2 = new Validation(namn);
            boolean test2 = validering2.testaString(namn);

            Validation validering3 = new Validation(tel);
            boolean test3 = validering3.testaString(tel);

            Validation validering4 = new Validation(losenord);
            boolean test4 = validering4.testaString(losenord);
            //stämmer alla inputs kommer det läggas in i databasen
            if (rattLosenord == true && rattTel == true && test2 == true && test3 == true && test4 == true) {
                String regAgentFraga = "INSERT INTO agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade)\n"
                        + "SELECT MAX(Agent_ID) + 1, '" + namn + "', '" + tel + "', '" + dagensDatum + "','" + adminStatus + "','" + losenord + "','" + omrade + "' FROM agent";
                idb.insert(regAgentFraga);
                setVisible(false);
            }

        } catch (HeadlessException | InfException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_okButtonActionPerformed
    private void fillCmb() {
        try {
            //fyll comboboxen med områden
            String omradeFraga = "SELECT benamning FROM omrade";
            ArrayList<String> omradeLista = new ArrayList<String>();
            omradeLista = idb.fetchColumn(omradeFraga);
            for (String omrade : omradeLista) {
                omradeCmb.addItem(omrade);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    

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
            java.util.logging.Logger.getLogger(LaggTillAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaggTillAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adminCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField losenField;
    private javax.swing.JTextField namnField;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> omradeCmb;
    private javax.swing.JTextField telField;
    // End of variables declaration//GEN-END:variables
}