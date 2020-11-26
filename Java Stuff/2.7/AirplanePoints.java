
/**
 * ICS4U0 Computer Science, Grade 12
 * @fileame AirplanePoints.java
 * @author Ajinkya
 * @date October 16, 2020
 * @version 1.0
 * @description: A application that stores passenger points (using associative 
 * array) for four different weeks  and computes if a passenger is eligible for 
 * bonus points.
 */

import java.util.ArrayList;


public class AirplanePoints extends javax.swing.JFrame {
    ArrayList <AirplanePoints> passengerDb = new ArrayList <>();

    
    /**
     * Creates new form AirplanePoints
     */
    public AirplanePoints() {
        initComponents();
    }
    
    
    String pName, w1, w2, w3, w4;
    AirplanePoints (String _pName, String _w1, String _w2, String _w3, String _w4) {
        pName = _pName;
        w1 = _w1;
        w2 = _w2;
        w3 = _w3;
        w4 = _w4;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        week1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        week2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        week3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        week4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        listBtn = new javax.swing.JButton();
        totalPtsBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayDb = new javax.swing.JTextArea();
        exitBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        displayStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Onyx", 3, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Airplane Points");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Full Name:");

        week1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Week 1:");

        week2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Week 2:");

        week3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Week 3:");

        week4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Week 4:");

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        listBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listBtn.setText("LIST");
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });

        totalPtsBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalPtsBtn.setText("TOTAL POINTS");
        totalPtsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPtsBtnActionPerformed(evt);
            }
        });

        displayDb.setEditable(false);
        displayDb.setColumns(20);
        displayDb.setRows(5);
        jScrollPane1.setViewportView(displayDb);

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Airplane.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salesman.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Status");

        displayStatus.setEditable(false);
        displayStatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        displayStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(28, 28, 28)
                                        .addComponent(week2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(28, 28, 28)
                                        .addComponent(week1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(28, 28, 28)
                                        .addComponent(week3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(28, 28, 28)
                                        .addComponent(week4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(displayStatus)
                            .addComponent(totalPtsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(listBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(week1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(week2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(listBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(week3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(totalPtsBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(week4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(exitBtn))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(displayStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try{
            AirplanePoints passenger;
            String userName, we1, we2, we3, we4, t;
            int checkW1, checkW2, checkW3, checkW4;


            userName = txtName.getText().trim();
            we1 = week1.getText().trim();
            we2 = week2.getText().trim();
            we3 = week3.getText().trim();
            we4 = week4.getText().trim();


            // checks if the passenger points are a valid integer
            checkW1 = Integer.parseInt(we1);
            checkW2 = Integer.parseInt(we2);
            checkW3 = Integer.parseInt(we3);
            checkW4 = Integer.parseInt(we4);


            // checks for empty passenger name
            if(!userName.isEmpty()){
		// checks for valid weekly points values
		if(checkW1 >= 0 && checkW2 >= 0 && checkW3 >= 0 && checkW4 >= 0){    
                    passenger = new AirplanePoints(userName, we1, we2, we3, we4);
                    passengerDb.add(passenger); // adds object to the associative array
                    
                    // Output for the TextArea --> prints the entire associative array
                    String temp="";
                    for (int x=0; x<=passengerDb.size()-1; x++) {
                        temp += "Name: [" +  passengerDb.get(x).pName + "]     "
                              + "Week1: [" + passengerDb.get(x).w1 + "]     "
                              + "Week2: [" + passengerDb.get(x).w2 + "]\n"
                              + "Week3: [" + passengerDb.get(x).w3 + "]     "
                              + "Week4: [" + passengerDb.get(x).w4 + "]\n\n";
                    }
                    displayDb.setText(temp);
                    displayStatus.setText("Successful!");
                    
		}else{
		    System.out.println("Please Enter Valid Weekly Point Value!");
                    displayStatus.setText("Failed!");
                
		}
            }else{
                System.out.println("Please Enter Passenger Name!");
                displayStatus.setText("Failed!");
            }

            
        }catch(IllegalArgumentException e){
            System.out.println("Please Enter A Integer For The Airplane Points!");
            displayStatus.setText("Failed!");
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
            displayStatus.setText("Failed!");
        }
    }                                      

    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try{
            
            // Output for the TextArea --> prints the entire associative array
            String temp="";
            for (int x=0; x<=passengerDb.size()-1; x++) {
                temp += "Name: [" +  passengerDb.get(x).pName + "]     "
                      + "Week1: [" + passengerDb.get(x).w1 + "]     "
                      + "Week2: [" + passengerDb.get(x).w2 + "]\n"
                      + "Week3: [" + passengerDb.get(x).w3 + "]     "
                      + "Week4: [" + passengerDb.get(x).w4 + "]\n\n";
            }


            displayDb.setText(temp);
            
            displayStatus.setText("Successful!");
            
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
            displayStatus.setText("Failed!");
        }
    }                                       

    private void totalPtsBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        try{
            String userName;
            int totalPoints, bonusPoints;


            userName = txtName.getText().toLowerCase();
            displayDb.setText("");


            // finding the total points for a specific passenger
            for (int x=0; x<=passengerDb.size()-1; x++) {
              
                if(userName.equals(passengerDb.get(x).pName.toLowerCase())){

                    totalPoints = 0;
                    bonusPoints = 0;


                    totalPoints += Integer.parseInt(passengerDb.get(x).w1) 
                                +  Integer.parseInt(passengerDb.get(x).w2)
                                +  Integer.parseInt(passengerDb.get(x).w3)
                                +  Integer.parseInt(passengerDb.get(x).w4);


                    // determines if a specific passenger qualifies for bonus points
                    if(totalPoints > 5000){
                        bonusPoints = 1000;
                    }


                    // Output for the TextArea --> prints the passenger name, 
                    // with the total points and bonus points
                    displayDb.append("Name: [" + passengerDb.get(x).pName + "]     "
                      + "Total Points: [" + Integer.toString(totalPoints) + "]\n"
                      + "Bonus Points: [" + Integer.toString(bonusPoints) + "]\n\n");
                }
            }
            
            displayStatus.setText("Successful!");
            
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
            displayStatus.setText("Failed!");
        } 
    }                                           

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        System.exit(0);
    }                                       

    private void displayStatusActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(AirplanePoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirplanePoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirplanePoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirplanePoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirplanePoints().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea displayDb;
    private javax.swing.JTextField displayStatus;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listBtn;
    private javax.swing.JButton totalPtsBtn;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField week1;
    private javax.swing.JTextField week2;
    private javax.swing.JTextField week3;
    private javax.swing.JTextField week4;
    // End of variables declaration                   
}
