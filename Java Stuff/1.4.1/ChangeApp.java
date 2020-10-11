
/**
 * ICS4U0 Computer Science, Grade 12
 * @fileame ChangeApp.java
 * @author Ajinkya
 * @date September 23, 2020
 * @modified October 9, 2020
 * @version 2.0
 * @description: This application prompts a user for an amount of money in
 * dollars and cents that [s]he would like to exchange for coins. 
 * The change is to be made up of the minimum number of:
 * loonies
 * toonies
 * quarters
 * dimes
 * nickels
 * pennies
 */

public class ChangeApp extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ChangeApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        totalAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quartersDisplay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dimesDisplay = new javax.swing.JTextField();
        aaa = new javax.swing.JLabel();
        nickelsDisplay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        penniesDisplay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        looniesDisplay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tooniesDisplay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        totalAmountDisplay = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        statusDisplay = new javax.swing.JTextField();
        aaa1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        totalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalAmountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Change Exchange");

        jLabel2.setText("Enter Currency");

        jLabel3.setText("Amout(xxx.xx)");

        quartersDisplay.setEditable(false);
        quartersDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuartersActionPerformed(evt);
            }
        });

        jLabel4.setText("Quarters");

        dimesDisplay.setEditable(false);
        dimesDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DimesActionPerformed(evt);
            }
        });

        aaa.setText("Dimes");

        nickelsDisplay.setEditable(false);
        nickelsDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NickelsActionPerformed(evt);
            }
        });

        jLabel6.setText("Nickles");

        penniesDisplay.setEditable(false);
        penniesDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenniesActionPerformed(evt);
            }
        });

        jLabel7.setText("Pennies");

        looniesDisplay.setEditable(false);
        looniesDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LooniesActionPerformed(evt);
            }
        });

        jLabel8.setText("Loonies");

        tooniesDisplay.setEditable(false);
        tooniesDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TooniesActionPerformed(evt);
            }
        });

        jLabel9.setText("Toonies");

        totalAmountDisplay.setEditable(false);
        totalAmountDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalAmountDisplayActionPerformed(evt);
            }
        });

        jLabel10.setText("Amount");

        statusDisplay.setEditable(false);
        statusDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusDisplayActionPerformed(evt);
            }
        });

        aaa1.setText("Status");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quartersDisplay)
                            .addComponent(dimesDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nickelsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(penniesDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(looniesDisplay)
                            .addComponent(tooniesDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aaa1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(calculateButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quartersDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dimesDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aaa)))
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(looniesDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tooniesDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nickelsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(penniesDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aaa1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        try{
            String total;
            double t;
            int totalCents, toonies, loonies, quarters, dimes, nickels, pennies;
            
            // turning dollars to cents for easier processing
            total = totalAmount.getText();
            t = Double.parseDouble(total) * 100;

            
            // checks if the format(xxxx.xx) is correct
            if((t-(int)t)!=0){
                statusDisplay.setText("FAILED!");
                System.out.println("Please Enter An Amount In Correct Format!");
            }
            
            // checks if the amount is positive
            else if (t <= 0){
                statusDisplay.setText("FAILED!");
                System.out.println("Please Enter A Positive Value!");
            }
            
            // finaly process the information
            else{
                // displays the amount in the display area
                totalCents = (int)t;
                totalAmountDisplay.setText(total);

                // find toonies
                toonies = totalCents / 200;
                totalCents -= toonies * 200;

                // find loonies
                loonies = totalCents / 100;
                totalCents -= loonies * 100;

                // find quarters
                quarters = totalCents / 25;
                totalCents -= quarters * 25;

                // find dimes
                dimes = totalCents /10;
                totalCents -= dimes * 10;

                // find nickles
                nickels = totalCents / 5;
                totalCents -= nickels * 5;

                // find pennies
                pennies = totalCents;

                //Output the values after processsing
                totalAmountDisplay.setText(total);
                tooniesDisplay.setText(Integer.toString(toonies));
                looniesDisplay.setText(Integer.toString(loonies));
                quartersDisplay.setText(Integer.toString(quarters));
                dimesDisplay.setText(Integer.toString(dimes));
                nickelsDisplay.setText(Integer.toString(nickels));
                penniesDisplay.setText(Integer.toString(pennies));
                statusDisplay.setText("SUCCESSFUL!");
            }
        }catch(IllegalArgumentException e){
            statusDisplay.setText("FAILED!");
            System.out.println("Please Enter A Number");
        }
        catch(Exception e){
            statusDisplay.setText("FAILED!");
            System.out.println("There Was An Error!!!");
        }
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void TotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalAmountActionPerformed

    private void QuartersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuartersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuartersActionPerformed

    private void DimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DimesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DimesActionPerformed

    private void NickelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NickelsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NickelsActionPerformed

    private void PenniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenniesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PenniesActionPerformed

    private void LooniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LooniesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LooniesActionPerformed

    private void TooniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TooniesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TooniesActionPerformed

    private void TotalAmountDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalAmountDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalAmountDisplayActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void StatusDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField dimesDisplay;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField looniesDisplay;
    private javax.swing.JTextField nickelsDisplay;
    private javax.swing.JTextField penniesDisplay;
    private javax.swing.JTextField quartersDisplay;
    private javax.swing.JTextField statusDisplay;
    private javax.swing.JTextField tooniesDisplay;
    private javax.swing.JTextField totalAmount;
    private javax.swing.JTextField totalAmountDisplay;
    private javax.swing.JLabel aaa;
    private javax.swing.JLabel aaa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
