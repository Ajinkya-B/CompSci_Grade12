
/**
 * ICS4U0 Computer Science, Grade 12
 * @fileame MatchingGame.java
 * @author Ajinkya
 * @date October 8, 2020
 * @version 1.0
 * @Description: A modification to the matching game that dosen't require a 
 * Guess Again button, it changes the textfield to Congratulations when user 
 * wins, and has 12 cards with a Avengers theme. 
 * The user has to pick two cards within two seconds in order to make a successful 
 * match. This is to make the game more fast-pased and interesting!
 */

import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class MatchingGame extends javax.swing.JFrame {
    // create a path for accessing the images locally in the current dir
    String path = "./";

    ArrayList<String> cards = new ArrayList<>();
    ArrayList<String> set = new ArrayList<>();
    
    ImageIcon a = new ImageIcon(path + "antMan.png"); // https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5b8d2b12-21e8-4931-8a6d-fb9ecdd60383/dcc5qj5-6d473056-8bbf-488d-b285-ef9f9803722a.png/v1/fill/w_792,h_1009,strp/antman_and_the_wasp_scott_lang_png_by_metropolis_hero1125_dcc5qj5-pre.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTAyNSIsInBhdGgiOiJcL2ZcLzViOGQyYjEyLTIxZTgtNDkzMS04YTZkLWZiOWVjZGQ2MDM4M1wvZGNjNXFqNS02ZDQ3MzA1Ni04YmJmLTQ4OGQtYjI4NS1lZjlmOTgwMzcyMmEucG5nIiwid2lkdGgiOiI8PTgwNSJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.Ml1AytY_RrMK9JbWGy867dj_iwz5ffP4OwRhc07JgvY
    ImageIcon b = new ImageIcon(path + "blackWidow.png"); // https://vignette.wikia.nocookie.net/marvelcrossroads/images/1/1d/Black_Widow_(Earth-2992).png/revision/latest?cb=20150915155327
    ImageIcon c = new ImageIcon(path + "hulk.png"); // https://orig04.deviantart.net/8a62/f/2016/108/3/f/hulk_by_alexiscabo1-d9zf99d.png
    ImageIcon d = new ImageIcon(path + "ironMan.png"); // https://www.freeiconspng.com/uploads/iron-man-png-15.png
    ImageIcon e = new ImageIcon(path + "thor.png"); // https://purepng.com/public/uploads/large/thor-fighting-with-his-hammer-1m5.png
    ImageIcon f = new ImageIcon(path + "captainAmerica.png"); // https://pngimg.com/uploads/captain_america/captain_america_PNG22.png
    ImageIcon back = new ImageIcon(path + "cardBack.png"); // https://nerdbasego.files.wordpress.com/2013/05/logo-avengers-assemble.png?w=593&h=265
    ImageIcon done = new ImageIcon(path + "cardDone.png"); // https://i.pinimg.com/originals/0d/b2/4e/0db24e299dbf284f714ebcf44ef57183.png
    
    int count, c1, c2, card1, card2;
    int cardsLeft = 12;
    int[] change = new int[12];
    
    
    // ccreating timer obj --> runs code inside for 2 seconds
    Timer delayTime = new Timer (2000, e ->{
        guessCard();
    });

    
    public MatchingGame() {
        initComponents();
        
        // resets and sets up randomized cards
        resetCards();
        setPlay();
	count = 0;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitle = new javax.swing.JLabel();
        Card1 = new javax.swing.JButton();
        Card2 = new javax.swing.JButton();
        Card3 = new javax.swing.JButton();
        Card4 = new javax.swing.JButton();
        Card5 = new javax.swing.JButton();
        Card6 = new javax.swing.JButton();
        Card7 = new javax.swing.JButton();
        Card8 = new javax.swing.JButton();
        Card9 = new javax.swing.JButton();
        Card10 = new javax.swing.JButton();
        Card11 = new javax.swing.JButton();
        Card12 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtInstruction = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avengers Matching Game");

        mainTitle.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(255, 5, 5));
        mainTitle.setText("Matching Game");

        Card1.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card1ActionPerformed(evt);
            }
        });

        Card2.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card2ActionPerformed(evt);
            }
        });

        Card3.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card3ActionPerformed(evt);
            }
        });

        Card4.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card4ActionPerformed(evt);
            }
        });

        Card5.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card5ActionPerformed(evt);
            }
        });

        Card6.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card6ActionPerformed(evt);
            }
        });

        Card7.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card7ActionPerformed(evt);
            }
        });

        Card8.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card8ActionPerformed(evt);
            }
        });

        Card9.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card9ActionPerformed(evt);
            }
        });

        Card10.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card10ActionPerformed(evt);
            }
        });

        Card11.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card11ActionPerformed(evt);
            }
        });

        Card12.setIcon(new javax.swing.ImageIcon("./cardBack.jpg")); // NOI18N
        Card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card12ActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtInstruction.setEditable(false);
        txtInstruction.setText("Click the Play button to start!");
        txtInstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstructionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnReset)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Card5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Card6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Card7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Card8, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(Card12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Card9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtInstruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainTitle)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Card4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Card3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Card8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Card5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Card6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Card7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Card12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Card9, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(Card10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Card11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addGap(18, 18, 18)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(txtInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // method to check if cards match, and then decide to whether filp the card 
    // back over or mark it as done
    private void guessCard(){
        try{
            if (c1 == c2) {
                for (int y = 1; y <= 2; y++) {
                    if (change[0] == 0) {
                        if(count == 2){
                            Card1.setEnabled(false);
                            Card1.setIcon(done);
                            change[0] = 2;
                        }else{
                            Card1.setEnabled(true);
                            Card1.setIcon(back);
                            change[0] = 1;
                        }
                    } else if (change[1] == 0) {
                        if(count == 2){
                            Card2.setEnabled(false);
                            Card2.setIcon(done);
                            change[1] = 2;
                        }else{
                            Card2.setEnabled(true);
                            Card2.setIcon(back);
                            change[1] = 1;
                        }
                    } else if (change[2] == 0) {
                        if(count == 2){
                            Card3.setEnabled(false);
                            Card3.setIcon(done);
                            change[2] = 2;
                        }else{
                            Card3.setEnabled(true);
                            Card3.setIcon(back);
                            change[2] = 1;
                        }
                    } else if (change[3] == 0) {
                        if(count == 2){
                            Card4.setEnabled(false);
                            Card4.setIcon(done);
                            change[3] = 2;
                        }else{
                            Card4.setEnabled(true);
                            Card4.setIcon(back);
                            change[3] = 1;
                        }
                    } else if (change[4] == 0) {
                        if(count == 2){
                            Card5.setEnabled(false);
                            Card5.setIcon(done);
                            change[4] = 2;
                        }else{
                            Card5.setEnabled(true);
                            Card5.setIcon(back);
                            change[4] = 1;
                        }
                    } else if (change[5] == 0) {
                        if(count == 2){
                            Card6.setEnabled(false);
                            Card6.setIcon(done);
                            change[5] = 2;
                        }else{
                            Card6.setEnabled(true);
                            Card6.setIcon(back);
                            change[5] = 1;
                        }
                    } else if (change[6] == 0) {
                        if(count == 2){
                            Card7.setEnabled(false);
                            Card7.setIcon(done);
                            change[6] = 2;
                        }else{
                            Card7.setEnabled(true);
                            Card7.setIcon(back);
                            change[6] = 1;
                        }
                    } else if (change[7] == 0) {
                        if(count == 2){
                            Card8.setEnabled(false);
                            Card8.setIcon(done);
                            change[7] = 2;
                        }else{
                            Card8.setEnabled(true);
                            Card8.setIcon(back);
                            change[7] = 1;
                        }
                    } else if (change[8] == 0) {
                        if(count == 2){
                            Card9.setEnabled(false);
                            Card9.setIcon(done);
                            change[8] = 2;
                        }else{
                            Card9.setEnabled(true);
                            Card9.setIcon(back);
                            change[8] = 1;
                        }
                    } else if (change[9] == 0) {
                        if(count == 2){
                            Card10.setEnabled(false);
                            Card10.setIcon(done);
                            change[9] = 2;
                        }else{
                            Card10.setEnabled(true);
                            Card10.setIcon(back);
                            change[9] = 1;
                        }
                    } else if (change[10] == 0) {
                        if(count == 2){
                            Card11.setEnabled(false);
                            Card11.setIcon(done);
                            change[10] = 2;
                        }else{
                            Card11.setEnabled(true);
                            Card11.setIcon(back);
                            change[10] = 1;
                        }
                    } else if (change[11] == 0) {
                        if(count == 2){
                            Card12.setEnabled(false);
                            Card12.setIcon(done);
                            change[11] = 2;
                        }else{
                            Card12.setEnabled(true);
                            Card12.setIcon(back);
                            change[11] = 1;
                        }
                    }
                    // change text in textfield to say congratulations when all have been matched
                    if (Card1.getIcon().equals(done)&&Card2.getIcon().equals(done)&&Card3.getIcon().equals(done)&&Card4.getIcon().equals(done)&&Card5.getIcon().equals(done)&&Card6.getIcon().equals(done)&&Card7.getIcon().equals(done)&&Card8.getIcon().equals(done)&&Card9.getIcon().equals(done)&&Card10.getIcon().equals(done)&&Card11.getIcon().equals(done)&&Card12.getIcon().equals(done)){
                        txtInstruction.setText("Congratulations!");
                    }
                }
            }
            else {
                for (int z = 1; z <= 2; z++) {
                    if (change[0] == 0) {
                        Card1.setEnabled(true);
                        Card1.setIcon(back);
                        change[0] = 1;
                    } else if (change[1] == 0) {
                        Card2.setEnabled(true);
                        Card2.setIcon(back);
                        change[1] = 1;
                    } else if (change[2] == 0) {
                        Card3.setEnabled(true);
                        Card3.setIcon(back);
                        change[2] = 1;
                    } else if (change[3] == 0) {
                        Card4.setEnabled(true);
                        Card4.setIcon(back);
                        change[3] = 1;
                    } else if (change[4] == 0) {
                        Card5.setEnabled(true);
                        Card5.setIcon(back);
                        change[4] = 1;
                    } else if (change[5] == 0) {
                        Card6.setEnabled(true);
                        Card6.setIcon(back);
                        change[5] = 1;
                    } else if (change[6] == 0) {
                        Card7.setEnabled(true);
                        Card7.setIcon(back);
                        change[6] = 1;
                    } else if (change[7] == 0) {
                        Card8.setEnabled(true);
                        Card8.setIcon(back);
                        change[7] = 1;
                    } else if (change[8] == 0) {
                        Card9.setEnabled(true);
                        Card9.setIcon(back);
                        change[8] = 1;
                    } else if (change[9] == 0) {
                        Card10.setEnabled(true);
                        Card10.setIcon(back);
                        change[9] = 1;
                    } else if (change[10] == 0) {
                        Card11.setEnabled(true);
                        Card11.setIcon(back);
                        change[10] = 1;
                    } else if (change[11] == 0) {
                        Card12.setEnabled(true);
                        Card12.setIcon(back);
                        change[11] = 1;
                    }
                }
            }
            count = 0; // set count back to zero to look for the next 2 selected cards
            
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }
    
    
    // starts the game and places cards randomly
    private void setPlay(){
        try{
            /** Set change array */
            for (int z = 0; z <= 11; z++) {
                change[z] = 1;
            }

            /** Assign cards at random */
            String temp;
            for (int x = 0; x <= 7; x++) {
                for (int y = 1; y <= 2; y++) {
                    temp = Integer.toString(x);
                    set.add(temp);
                }
            }

            for (int x=0; x <= 11; x++) {
                double index = Math.floor(Math.random()*(12-x));
                int index1 = (int)index;
                cards.add(set.get(index1));
                set.remove(set.get(index1));
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }
    
    // It tuns all cards back and enables them
    private void resetCards(){
        try{
            Card1.setIcon(back);
            Card1.setEnabled(true);
            Card2.setIcon(back);
            Card2.setEnabled(true);
            Card3.setIcon(back);
            Card3.setEnabled(true);
            Card4.setIcon(back);
            Card4.setEnabled(true);
            Card5.setIcon(back);
            Card5.setEnabled(true);
            Card6.setIcon(back);
            Card6.setEnabled(true);
            Card7.setIcon(back);
            Card7.setEnabled(true);
            Card8.setIcon(back);
            Card8.setEnabled(true);
            Card9.setIcon(back);
            Card9.setEnabled(true);
            Card10.setIcon(back);
            Card10.setEnabled(true);
            Card11.setIcon(back);
            Card11.setEnabled(true);
            Card12.setIcon(back);
            Card12.setEnabled(true);
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }
    
    
    // functioning exit button
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    
    // creates new array with randomly placed cards and flips back all the cards
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        change = new int[12];
        cards.clear();
        set.clear();      
        resetCards(); 
        setPlay();
        txtInstruction.setText("Find the matching cards");
    }
    
    
    // reveal card1
    private void Card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card1ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(0);

                if (temp.equals("0")) {
                    Card1.setIcon(a);
                } else if (temp.equals("1")) {
                    Card1.setIcon(b);
                } else if (temp.equals("2")) {
                    Card1.setIcon(c);
                } else if (temp.equals("3")) {
                    Card1.setIcon(d);
                } else if (temp.equals("4")) {
                    Card1.setIcon(e);
                } else if (temp.equals("5")) {
                    Card1.setIcon(f);
                }
                Card1.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[0] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[0] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card1ActionPerformed

    // reveal card2
    private void Card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card2ActionPerformed
        // TODO add your handling code here:
        try{       
            if (count < 2){
                String temp = cards.get(1);

                if (temp.equals("0")) {
                    Card2.setIcon(a);
                } else if (temp.equals("1")) {
                    Card2.setIcon(b);
                } else if (temp.equals("2")) {
                    Card2.setIcon(c);
                } else if (temp.equals("3")) {
                    Card2.setIcon(d);
                } else if (temp.equals("4")) {
                    Card2.setIcon(e);
                } else if (temp.equals("5")) {
                    Card2.setIcon(f);
                }
                Card2.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[1] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[1] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card2ActionPerformed

    // reveal card3
    private void Card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card3ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(2);

                if (temp.equals("0")) {
                    Card3.setIcon(a);
                } else if (temp.equals("1")) {
                    Card3.setIcon(b);
                } else if (temp.equals("2")) {
                    Card3.setIcon(c);
                } else if (temp.equals("3")) {
                    Card3.setIcon(d);
                } else if (temp.equals("4")) {
                    Card3.setIcon(e);
                } else if (temp.equals("5")) {
                    Card3.setIcon(f);
                }
                Card3.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[2] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[2] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card3ActionPerformed

    // reveal card4
    private void Card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card5ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(3);

                if (temp.equals("0")) {
                    Card4.setIcon(a);
                } else if (temp.equals("1")) {
                    Card4.setIcon(b);
                } else if (temp.equals("2")) {
                    Card4.setIcon(c);
                } else if (temp.equals("3")) {
                    Card4.setIcon(d);
                } else if (temp.equals("4")) {
                    Card4.setIcon(e);
                } else if (temp.equals("5")) {
                    Card4.setIcon(f);
                }
                Card4.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[3] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[3] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card5ActionPerformed

    // reveal card5
    private void Card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card4ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(4);

                if (temp.equals("0")) {
                    Card5.setIcon(a);
                } else if (temp.equals("1")) {
                    Card5.setIcon(b);
                } else if (temp.equals("2")) {
                    Card5.setIcon(c);
                } else if (temp.equals("3")) {
                    Card5.setIcon(d);
                } else if (temp.equals("4")) {
                    Card5.setIcon(e);
                } else if (temp.equals("5")) {
                    Card5.setIcon(f);
                }
                Card5.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[4] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[4] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card4ActionPerformed

    // reveal card6
    private void Card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card6ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(5);

                if (temp.equals("0")) {
                    Card6.setIcon(a);
                } else if (temp.equals("1")) {
                    Card6.setIcon(b);
                } else if (temp.equals("2")) {
                    Card6.setIcon(c);
                } else if (temp.equals("3")) {
                    Card6.setIcon(d);
                } else if (temp.equals("4")) {
                    Card6.setIcon(e);
                } else if (temp.equals("5")) {
                    Card6.setIcon(f);
                }
                Card6.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[5] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[5] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card6ActionPerformed

    // reveal card7
    private void Card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card7ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(6);

                if (temp.equals("0")) {
                    Card7.setIcon(a);
                } else if (temp.equals("1")) {
                    Card7.setIcon(b);
                } else if (temp.equals("2")) {
                    Card7.setIcon(c);
                } else if (temp.equals("3")) {
                    Card7.setIcon(d);
                } else if (temp.equals("4")) {
                    Card7.setIcon(e);
                } else if (temp.equals("5")) {
                    Card7.setIcon(f);
                }
                Card7.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[6] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[6] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card7ActionPerformed

    // reveal card8
    private void Card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card8ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(7);

                if (temp.equals("0")) {
                    Card8.setIcon(a);
                } else if (temp.equals("1")) {
                    Card8.setIcon(b);
                } else if (temp.equals("2")) {
                    Card8.setIcon(c);
                } else if (temp.equals("3")) {
                    Card8.setIcon(d);
                } else if (temp.equals("4")) {
                    Card8.setIcon(e);
                } else if (temp.equals("5")) {
                    Card8.setIcon(f);
                }
                Card8.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[7] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[7] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card8ActionPerformed

    // reveal card9
    private void Card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card9ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(8);

                if (temp.equals("0")) {
                    Card9.setIcon(a);
                } else if (temp.equals("1")) {
                    Card9.setIcon(b);
                } else if (temp.equals("2")) {
                    Card9.setIcon(c);
                } else if (temp.equals("3")) {
                    Card9.setIcon(d);
                } else if (temp.equals("4")) {
                    Card9.setIcon(e);
                } else if (temp.equals("5")) {
                    Card9.setIcon(f);
                }
                Card9.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[8] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[8] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card9ActionPerformed

    // reveal card10
    private void Card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card10ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(9);

                if (temp.equals("0")) {
                    Card10.setIcon(a);
                } else if (temp.equals("1")) {
                    Card10.setIcon(b);
                } else if (temp.equals("2")) {
                    Card10.setIcon(c);
                } else if (temp.equals("3")) {
                    Card10.setIcon(d);
                } else if (temp.equals("4")) {
                    Card10.setIcon(e);
                } else if (temp.equals("5")) {
                    Card10.setIcon(f);
                }
                Card10.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[9] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[9] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card10ActionPerformed

    // reveal card11
    private void Card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card11ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(10);

                if (temp.equals("0")) {
                    Card11.setIcon(a);
                } else if (temp.equals("1")) {
                    Card11.setIcon(b);
                } else if (temp.equals("2")) {
                    Card11.setIcon(c);
                } else if (temp.equals("3")) {
                    Card11.setIcon(d);
                } else if (temp.equals("4")) {
                    Card11.setIcon(e);
                } else if (temp.equals("5")) {
                    Card11.setIcon(f);

                }
                Card11.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[10] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[10] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card11ActionPerformed

    // reveal card12
    private void Card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card12ActionPerformed
        // TODO add your handling code here:
        try{
            if (count < 2){
                String temp = cards.get(11);

                if (temp.equals("0")) {
                    Card12.setIcon(a);
                } else if (temp.equals("1")) {
                    Card12.setIcon(b);
                } else if (temp.equals("2")) {
                    Card12.setIcon(c);
                } else if (temp.equals("3")) {
                    Card12.setIcon(d);
                } else if (temp.equals("4")) {
                    Card12.setIcon(e);
                } else if (temp.equals("5")) {
                    Card12.setIcon(f);
                }

                Card12.setEnabled(false);

                // based on whether it is first or second click wait for another click or compare
                count++;
                if (count == 1) {
                    c1 = Integer.parseInt(temp);
                    change[11] = 0;
                } else if (count == 2) {
                    c2 = Integer.parseInt(temp);
                    change[11] = 0;
                    delayTime.start();
                }
            }
        }catch(Exception e){
            System.out.println("There was an Error!");
        }
    }//GEN-LAST:event_Card12ActionPerformed

    private void txtInstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstructionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstructionActionPerformed

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
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Card1;
    private javax.swing.JButton Card10;
    private javax.swing.JButton Card11;
    private javax.swing.JButton Card12;
    private javax.swing.JButton Card2;
    private javax.swing.JButton Card3;
    private javax.swing.JButton Card4;
    private javax.swing.JButton Card5;
    private javax.swing.JButton Card6;
    private javax.swing.JButton Card7;
    private javax.swing.JButton Card8;
    private javax.swing.JButton Card9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JTextField txtInstruction;
    // End of variables declaration//GEN-END:variables
}
