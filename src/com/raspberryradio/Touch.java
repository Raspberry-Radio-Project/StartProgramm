/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raspberryradio;

import javax.swing.JOptionPane;


public class Touch extends javax.swing.JFrame {

    /**
     * Creates new form Touch
     */
    public Touch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_Internet = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jB_Play = new javax.swing.JButton();
        jB_Stop = new javax.swing.JButton();
        jP_Bild = new javax.swing.JPanel();
        jC_Radiosender = new javax.swing.JComboBox<>();
        jL_note = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jDialog_AUX = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jB_verbinden = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDialog_USB = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_Play = new javax.swing.JButton();
        jButton_Stop = new javax.swing.JButton();
        jButton_Next = new javax.swing.JButton();
        jButton_Previous = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jB_Internet = new javax.swing.JButton();
        jB_AUX = new javax.swing.JButton();
        jB_USB = new javax.swing.JButton();
        jB_Neustart = new javax.swing.JButton();
        jB_Beenden = new javax.swing.JButton();

        jDialog_Internet.setTitle("Internet");
        jDialog_Internet.setAlwaysOnTop(true);
        jDialog_Internet.setMinimumSize(new java.awt.Dimension(800, 450));
        jDialog_Internet.setUndecorated(true);
        jDialog_Internet.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Internet");

        jB_Play.setText("PLAY");
        jB_Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PlayActionPerformed(evt);
            }
        });

        jB_Stop.setText("STOP");
        jB_Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_StopActionPerformed(evt);
            }
        });

        jC_Radiosender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Radiosender","AfterhourFM","Bailrigg","BigFM","Blackbeats","ClubTimeFM","HousFM","NDR1" }));
        jC_Radiosender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_RadiosenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_BildLayout = new javax.swing.GroupLayout(jP_Bild);
        jP_Bild.setLayout(jP_BildLayout);
        jP_BildLayout.setHorizontalGroup(
            jP_BildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BildLayout.createSequentialGroup()
                .addComponent(jC_Radiosender, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_BildLayout.setVerticalGroup(
            jP_BildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BildLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jC_Radiosender, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jL_note.setForeground(new java.awt.Color(204, 0, 0));
        jL_note.setText("Wähle einen Radiosender!");

        jButton3.setText("Zurück");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog_InternetLayout = new javax.swing.GroupLayout(jDialog_Internet.getContentPane());
        jDialog_Internet.getContentPane().setLayout(jDialog_InternetLayout);
        jDialog_InternetLayout.setHorizontalGroup(
            jDialog_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_InternetLayout.createSequentialGroup()
                .addGroup(jDialog_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDialog_InternetLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jDialog_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_note, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialog_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jDialog_InternetLayout.createSequentialGroup()
                                    .addComponent(jB_Play, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jP_Bild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialog_InternetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jDialog_InternetLayout.setVerticalGroup(
            jDialog_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_InternetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(73, 73, 73)
                .addComponent(jP_Bild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66)
                .addGroup(jDialog_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Play, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jL_note)
                .addGap(25, 25, 25))
        );

        jL_note.setVisible(false);

        jDialog_AUX.setTitle("AUX");
        jDialog_AUX.setAlwaysOnTop(true);
        jDialog_AUX.setMinimumSize(new java.awt.Dimension(800, 450));
        jDialog_AUX.setUndecorated(true);
        jDialog_AUX.setResizable(false);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel4.setText("AUX");

        jB_verbinden.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jB_verbinden.setText("Verbinden / Trennen");
        jB_verbinden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_verbindenActionPerformed(evt);
            }
        });

        jButton1.setText("Zurück");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog_AUXLayout = new javax.swing.GroupLayout(jDialog_AUX.getContentPane());
        jDialog_AUX.getContentPane().setLayout(jDialog_AUXLayout);
        jDialog_AUXLayout.setHorizontalGroup(
            jDialog_AUXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AUXLayout.createSequentialGroup()
                .addGroup(jDialog_AUXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_AUXLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog_AUXLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jB_verbinden, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jDialog_AUXLayout.setVerticalGroup(
            jDialog_AUXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AUXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_AUXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jB_verbinden, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jDialog_USB.setTitle("USB");
        jDialog_USB.setAlwaysOnTop(true);
        jDialog_USB.setMinimumSize(new java.awt.Dimension(800, 450));
        jDialog_USB.setUndecorated(true);
        jDialog_USB.setResizable(false);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel2.setText("USB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jButton_Play.setText("PLAY");
        jButton_Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlayActionPerformed(evt);
            }
        });

        jButton_Stop.setText("STOP");
        jButton_Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StopActionPerformed(evt);
            }
        });

        jButton_Next.setText("Nächster Song");
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        jButton_Previous.setText("Vorheriger Song");
        jButton_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreviousActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Kein USB-Stick erkannt!");

        jButton2.setText("Zurück");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog_USBLayout = new javax.swing.GroupLayout(jDialog_USB.getContentPane());
        jDialog_USB.getContentPane().setLayout(jDialog_USBLayout);
        jDialog_USBLayout.setHorizontalGroup(
            jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_USBLayout.createSequentialGroup()
                .addGroup(jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDialog_USBLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog_USBLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jDialog_USBLayout.createSequentialGroup()
                                .addGroup(jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Play, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Stop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jDialog_USBLayout.setVerticalGroup(
            jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_USBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Previous)
                    .addComponent(jButton_Next))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog_USBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Stop)
                    .addComponent(jButton_Play))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seminarkurs TGM 12/2: Raspberry-Radio");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setUndecorated(true);
        setResizable(false);

        jB_Internet.setText("Internet");
        jB_Internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_InternetActionPerformed(evt);
            }
        });

        jB_AUX.setText("AUX");
        jB_AUX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AUXActionPerformed(evt);
            }
        });

        jB_USB.setText("USB");
        jB_USB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_USBActionPerformed(evt);
            }
        });

        jB_Neustart.setText("Neustart");
        jB_Neustart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_NeustartActionPerformed(evt);
            }
        });

        jB_Beenden.setText("Beenden");
        jB_Beenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BeendenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Internet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_Neustart, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Beenden, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 534, Short.MAX_VALUE))
                    .addComponent(jB_AUX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_USB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jB_Internet, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_AUX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_USB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Beenden, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Neustart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_AUXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AUXActionPerformed
        // TODO add your handling code here:
        jDialog_AUX.setVisible(true);
    }//GEN-LAST:event_jB_AUXActionPerformed

    private void jB_USBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_USBActionPerformed
        // TODO add your handling code here:
        jDialog_USB.setVisible(true);
    }//GEN-LAST:event_jB_USBActionPerformed

    private void jB_NeustartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_NeustartActionPerformed
        SerialConnection.disconnect();
        String str = "sudo reboot";
        ExecuteCommand.executeCMD(str);
    }//GEN-LAST:event_jB_NeustartActionPerformed

    private void jB_PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_PlayActionPerformed
        // TODO add your handling code here:
        String Radiosender;
        Radiosender = (String) jC_Radiosender.getSelectedItem();      
        String Bailrigg = "Bailrigg";
        String BigFM = "BigFM";
        String Blackbeats = "Blackbeats";
        String ClubTimeFM = "ClubTimeFM";
        String HouseFM = "HouseFM";
        String noradio = "Radiosender";
        String nothing = "";
        String Afterhour = "AfterhourFM";
        String Ndr1 = "NDR1";
        
        jL_note.setVisible(false);
        
        if(Radiosender.equals(Bailrigg)){
            MPD_Functions.clear();
            MPD_Functions.loadPlaylist("Bailrigg"); //Name des Onlinestreams
            MPD_Functions.play(1);
        }
        if(Radiosender.equals(BigFM)){
            MPD_Functions.clear();
            MPD_Functions.loadPlaylist("BigFM");
            MPD_Functions.play(1);
        }      
        if(Radiosender.equals(Blackbeats)){
            MPD_Functions.clear();
            MPD_Functions.loadPlaylist("Blackbeats");
            MPD_Functions.play(1);
        }
        if(Radiosender.equals(ClubTimeFM)){
            MPD_Functions.clear();
            MPD_Functions.loadPlaylist("ClubTimeFM");
            MPD_Functions.play(1);
        }
        if(Radiosender.equals(HouseFM)){
            MPD_Functions.clear();
            MPD_Functions.loadPlaylist("HouseFM");
            MPD_Functions.play(1);
        }
        if(Radiosender.equals(Afterhour)){
            MPD_Functions.clear();
            MPD_Functions.loadPlaylist("afterhours.fm");
            MPD_Functions.play(1);
        }
        if(Radiosender.equals(Ndr1)){
            MPD_Functions.clear();
            MPD_Functions.loadPlaylist("ndr1");
            MPD_Functions.play(1);
        }
        if(Radiosender.equals(noradio)|| Radiosender.equals(nothing)){
            jL_note.setVisible(true);
        }
        
    }//GEN-LAST:event_jB_PlayActionPerformed

    private void jB_StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_StopActionPerformed
        MPD_Functions.pause(); //Hält die Wiedergabe an
    }//GEN-LAST:event_jB_StopActionPerformed

    private void jC_RadiosenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_RadiosenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_RadiosenderActionPerformed

    private void jButton_PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PlayActionPerformed
        MPD_Functions.play(); 
    }//GEN-LAST:event_jButton_PlayActionPerformed

    private void jButton_StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StopActionPerformed
        MPD_Functions.stop();
    }//GEN-LAST:event_jButton_StopActionPerformed

    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextActionPerformed
        MPD_Functions.next();
    }//GEN-LAST:event_jButton_NextActionPerformed

    private void jButton_PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreviousActionPerformed
        MPD_Functions.previous();
    }//GEN-LAST:event_jButton_PreviousActionPerformed

    private void jB_BeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BeendenActionPerformed
        SerialConnection.disconnect();
        System.exit(0);
    }//GEN-LAST:event_jB_BeendenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jDialog_AUX.dispose(); //Schließt den Dialog
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jB_verbindenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_verbindenActionPerformed
        SerialConnection.change(); //Wechselt den Audioeingang von dem Verstärker
    }//GEN-LAST:event_jB_verbindenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog_Internet.dispose(); //Schließt den Dialog
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog_USB.dispose(); //Schließt den Dialog
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jB_InternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_InternetActionPerformed
        jDialog_Internet.setVisible(true);
    }//GEN-LAST:event_jB_InternetActionPerformed

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
            java.util.logging.Logger.getLogger(Touch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Touch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Touch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Touch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Touch().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_AUX;
    private javax.swing.JButton jB_Beenden;
    private javax.swing.JButton jB_Internet;
    private javax.swing.JButton jB_Neustart;
    private javax.swing.JButton jB_Play;
    private javax.swing.JButton jB_Stop;
    private javax.swing.JButton jB_USB;
    private javax.swing.JButton jB_verbinden;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JButton jButton_Play;
    private javax.swing.JButton jButton_Previous;
    private javax.swing.JButton jButton_Stop;
    private javax.swing.JComboBox<String> jC_Radiosender;
    private javax.swing.JDialog jDialog_AUX;
    private javax.swing.JDialog jDialog_Internet;
    private javax.swing.JDialog jDialog_USB;
    private javax.swing.JLabel jL_note;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP_Bild;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
