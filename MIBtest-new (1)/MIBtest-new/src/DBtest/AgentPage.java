/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author arvid
 */
public class AgentPage extends javax.swing.JFrame {

    private static InfDB idb;
    private ArrayList<AgentPage> agent;
    private static String anvandare;
    private static boolean admin;

    private static java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");

    /**
     * Creates new form AgentPAge
     */
    public AgentPage(InfDB iidb, String anvandare, boolean admin) {
        initComponents();
        this.admin = admin;
        updateLabel(anvandare);
        this.anvandare = anvandare;
        idb = iidb;
        agent = new ArrayList<AgentPage>();
        fillPlatsCmb();
        fillOmradeCmb();
        setAdminButtonVisibility();

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
        jList1 = new javax.swing.JList<>();
        label = new javax.swing.JLabel();
        andraLosenordField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        andraLosenordButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        utrustningField = new javax.swing.JTextField();
        utrustningButton = new javax.swing.JButton();
        alienButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        platsCmb = new javax.swing.JComboBox<>();
        rasCmb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        forstaDatum = new javax.swing.JTextField();
        andraDatum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        platsButton = new javax.swing.JButton();
        rasButton = new javax.swing.JButton();
        registreradButton = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        specAlienButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        specAlienTextBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        omradeCmb = new javax.swing.JComboBox<>();
        omradeButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        adminButton = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        label.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                labelInputMethodTextChanged(evt);
            }
        });

        andraLosenordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenordFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Ändra lösenord:");

        andraLosenordButton.setText("Ändra");
        andraLosenordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenordButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Lägg till ny utrustning:");

        utrustningButton.setText("Lägg till");
        utrustningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningButtonActionPerformed(evt);
            }
        });

        alienButton.setText("Lägg till");
        alienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Lägg till en ny Alien:");

        platsCmb.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                platsCmbComponentAdded(evt);
            }
        });
        platsCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platsCmbActionPerformed(evt);
            }
        });

        rasCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "squid", "worm", "boglodite" }));

        jLabel5.setText("Aliens på plats:");

        jLabel6.setText("Aliens som är ras:");

        jLabel7.setText("Aliens registrerade mellan:");

        forstaDatum.setText("datum");
        forstaDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forstaDatumActionPerformed(evt);
            }
        });

        andraDatum.setText("datum");

        jLabel8.setText("och");

        platsButton.setText(">");
        platsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platsButtonActionPerformed(evt);
            }
        });

        rasButton.setText(">");
        rasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasButtonActionPerformed(evt);
            }
        });

        registreradButton.setText(">");
        registreradButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreradButtonActionPerformed(evt);
            }
        });

        logOut.setText("Logga ut");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        specAlienButton.setText(">");
        specAlienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specAlienButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Se info om specifik alien:");

        jLabel10.setText("Se områdeschef över :");

        omradeButton.setText(">");
        omradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradeButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel11.setText("(Format: åååå-mm-dd)");

        adminButton.setText("Adminfunktioner");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(41, 41, 41))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(9, 9, 9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(utrustningField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(andraLosenordField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(utrustningButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(andraLosenordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alienButton)
                                .addGap(75, 75, 75)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(71, 71, 71)
                                .addComponent(rasCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rasButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(85, 85, 85)
                                .addComponent(platsCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(platsButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(specAlienTextBox)
                                                .addComponent(omradeCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(specAlienButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(omradeButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(forstaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(andraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(registreradButton))))))
                        .addGap(36, 36, 36)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logOut)
                        .addGap(18, 18, 18)
                        .addComponent(adminButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(andraLosenordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(andraLosenordButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(utrustningField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(utrustningButton))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alienButton)
                            .addComponent(jLabel4))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logOut)
                            .addComponent(adminButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(platsCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(platsButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rasCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(rasButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(forstaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(andraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(registreradButton))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(specAlienButton)
                            .addComponent(specAlienTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(omradeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(omradeButton)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_labelInputMethodTextChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_labelInputMethodTextChanged

    private void andraLosenordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_andraLosenordFieldActionPerformed

    private void andraLosenordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenordButtonActionPerformed

        // Denna metod ändrar lösenord på agenten som är inloggad
        try {
            String losenordInput = andraLosenordField.getText();
            Validation validering = new Validation(losenordInput);
            boolean test = validering.testaString(losenordInput);
            if (test == true) {
                if (losenordInput.length() < 7) {

                    String fraga = "UPDATE agent SET Losenord = '" + losenordInput + "' WHERE agent.Namn = '" + anvandare + "'";
                    idb.update(fraga);
                } else {
                    JOptionPane.showMessageDialog(null, "Ditt lösenord får inte överstiga 5 tecken!");
                }
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_andraLosenordButtonActionPerformed

    private void utrustningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningButtonActionPerformed
// Lägg till utrustning på en agent
        try {
            LocalDate tid = LocalDate.now();
            System.out.println(tid);

            String utrustningInput = utrustningField.getText();
            Validation validering = new Validation(utrustningInput);
            boolean test = validering.testaString(utrustningInput);
            if (test == true) {
                String nyttUtrustningID = "SELECT MAX(Utrustnings_ID) + 1 FROM Utrustning";
                String utrustningId = idb.fetchSingle(nyttUtrustningID);
                //-------------------------------------------------------
                String utrustningFraga = "INSERT INTO utrustning (Utrustnings_ID, Benamning) VALUES ('" + utrustningId + "', '" + utrustningInput + "')";
                idb.insert(utrustningFraga);
                //-------------------------------------------------------
                String agentID = "SELECT Agent_id FROM agent where Namn = '" + anvandare + "'";
                String ettAgentID = idb.fetchSingle(agentID);
                //-------------------------------------------------------
                String utrustningID = "SELECT Utrustnings_id FROM utrustning where Benamning = '" + utrustningInput + "'";
                String ettUtrustningID = idb.fetchSingle(utrustningID);
                //-------------------------------------------------------
                String sambandFraga = "INSERT INTO innehar_utrustning (Agent_ID, Utrustnings_ID, Utkvitteringsdatum) VALUES ('" + ettAgentID + "','" + ettUtrustningID + "', '" + tid + "')";
                idb.insert(sambandFraga);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_utrustningButtonActionPerformed
    private void fillPlatsCmb() {
        //Fyller comboboxen som har de olika platserna
        try {
            ArrayList<String> platsLista = new ArrayList<String>();
            String platserFraga = "SELECT Benamning FROM plats";
            platsLista = idb.fetchColumn(platserFraga);
            for (String platsen : platsLista) {
                platsCmb.addItem(platsen);

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void fillOmradeCmb() {
        //Fyller comboboxen som har de olika områdena

        try {
            ArrayList<String> omradeLista = new ArrayList<String>();
            String omradeFraga = "SELECT Benamning FROM omrade";
            omradeLista = idb.fetchColumn(omradeFraga);
            for (String omrade : omradeLista) {
                omradeCmb.addItem(omrade);

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private void alienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienButtonActionPerformed
        //Registrera en alien knappen
        new RegistreraAlien(idb).setVisible(true);
    }//GEN-LAST:event_alienButtonActionPerformed

    private void platsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platsButtonActionPerformed
        //Se aliens som är på en plats
        String enPlats = platsCmb.getSelectedItem().toString();
        new aliensPaPlats(idb, enPlats).setVisible(true);
    }//GEN-LAST:event_platsButtonActionPerformed
    
    private void platsCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platsCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_platsCmbActionPerformed

    private void platsCmbComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_platsCmbComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_platsCmbComponentAdded

    private void rasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasButtonActionPerformed
        //Se aliens av en ras
        String enRas = rasCmb.getSelectedItem().toString();
        new AlienAvRas(idb, enRas).setVisible(true);
    }//GEN-LAST:event_rasButtonActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        //Logga ut
        setVisible(false);
        anvandare = "";
    }//GEN-LAST:event_logOutActionPerformed

    private void registreradButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreradButtonActionPerformed
        //Se aliens som registrerats mellan vissa datum
        boolean rattFormatForstaDatum = false;
        boolean rattFormatAndraDatum = false;

        String ettDatum = forstaDatum.getText();
        String tvaDatum = andraDatum.getText();
        try {
            java.util.Date ret = sdf.parse(ettDatum.trim());
            java.util.Date ret2 = sdf.parse(tvaDatum.trim());
            if (sdf.format(ret).equals(ettDatum.trim()) && sdf.format(ret2).equals(tvaDatum.trim())) {
                rattFormatForstaDatum = true;
                rattFormatAndraDatum = true;
            }
            if (rattFormatForstaDatum == true & rattFormatAndraDatum == true) {
                System.out.println(ettDatum);
                new AlienMellanDatum(idb, ettDatum, tvaDatum).setVisible(true);
            }
        } catch (ParseException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Datumet måste vara i rätt format!");
        }


    }//GEN-LAST:event_registreradButtonActionPerformed

    private void specAlienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specAlienButtonActionPerformed
        //Se info om en specifik alien
        String alien = specAlienTextBox.getText();
        Validation validering = new Validation(alien);
        boolean test = validering.testaString(alien);
        if (test == true) {
            new SpecAlien(idb, alien).setVisible(true);
        }
    }//GEN-LAST:event_specAlienButtonActionPerformed

    private void omradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradeButtonActionPerformed
        //Se Aliens i ett specifikt område
        String ettOmrade = omradeCmb.getSelectedItem().toString();
        new OmradesChef(idb, ettOmrade).setVisible(true);
    }//GEN-LAST:event_omradeButtonActionPerformed
    
    private void forstaDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forstaDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forstaDatumActionPerformed
   
    private void setAdminButtonVisibility() {
        //ifall en agent är admin kommer en knapp visas på den agentens homepage
        if (admin) {
            adminButton.setVisible(true);
        } else if (!admin) {
            adminButton.setVisible(false);
        }
    }
    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        //Gå till admin sidan
        new AdminPage(idb, anvandare).setVisible(true);
    }//GEN-LAST:event_adminButtonActionPerformed
    private void updateLabel(String anvandare) {
        //Uppdatera 
        label.setText("Välkommen " + anvandare);
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
            java.util.logging.Logger.getLogger(AgentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentPage(idb, anvandare, admin).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JButton alienButton;
    private javax.swing.JTextField andraDatum;
    private javax.swing.JButton andraLosenordButton;
    private javax.swing.JTextField andraLosenordField;
    private javax.swing.JTextField forstaDatum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JButton logOut;
    private javax.swing.JButton omradeButton;
    private javax.swing.JComboBox<String> omradeCmb;
    private javax.swing.JButton platsButton;
    private javax.swing.JComboBox<String> platsCmb;
    private javax.swing.JButton rasButton;
    private javax.swing.JComboBox<String> rasCmb;
    private javax.swing.JButton registreradButton;
    private javax.swing.JButton specAlienButton;
    private javax.swing.JTextField specAlienTextBox;
    private javax.swing.JButton utrustningButton;
    private javax.swing.JTextField utrustningField;
    // End of variables declaration//GEN-END:variables
}