
/**
 * ICS4U0 Computer Science, Grade 12
 * @fileame SortingRoutines.java
 * @author Ajinkya
 * @date October 24, 2020
 * @version 1.0
 * @Description: A program that will sort a list of random numbers from -1000 
 * to 1000. 
 * The user has the choice of:
 *
 * selecting a sorting algorithm(selection, bubble, insertion, quick),
 * how many numbers are to be sorted in the list,
 * and whether the list is sorted in ascending or descending order.
 */


import java.util.Random;  


public class SortingRoutines extends javax.swing.JFrame {

    // declaring int type array
    int[] randArr;
   
    public SortingRoutines() {
        initComponents();
    }

    
    private void selectionSort(){
        
        int n = randArr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++){
            
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (randArr[j] < randArr[min_idx]){
                    min_idx = j;
                }
            }
 
            // Swap the found minimum element with the first element
            int temp = randArr[min_idx];
            randArr[min_idx] = randArr[i];
            randArr[i] = temp;
        }
    }
    
    
    private void bubbleSort() {  
    
        int temp;
        int bottom = randArr.length-1;
        Boolean swap = true;


        while(swap){
            swap = false;
            
            for(int j = 0; j < bottom; j++){
                // compares current element to next, and continues this until 
                // the end of the Array
                if(randArr[j] > randArr[j+1]){
                    swap = true;
                    temp = randArr[j];
                    randArr[j] = randArr[j+1];
                    randArr[j+1] = temp;
                }
            }
            bottom --;
        }
    }  
    
    
    private void insertionSort(){
        
        int n = randArr.length;
        int temp, j;

        // Puts the first two items in correct relative order, then insert the 
        // third item in the correct place and so on
        for(int i = 1; i < n; i++){
            
            temp = randArr[i];
            j = i - 1;
            
            while((j >= 0) && (randArr[j] > temp)){
                randArr[j+1] = randArr[j];
                j--;
            }
            randArr[j+1] = temp;
        }
    }
    
    
    void quickSort(int intArray[], int low, int high) { 
        if (low < high) { 
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(intArray, low, high); 
   
            // sort each partition recursively 
            quickSort(intArray, low, pi-1); 
            quickSort(intArray, pi+1, high); 
        } 
    } 
     
      
    int partition(int intArray[], int low, int high) { 
        
        int pi = intArray[high];  
        int i = (low-1); // smaller element index   
        
        for (int j=low; j<high; j++) { 
            
            // check if current element is less than or equal to pi 
            if (intArray[j] <= pi) { 
                
                i++; 
                
                // swap intArray[i] and intArray[j] 
                int temp = intArray[i]; 
                intArray[i] = intArray[j]; 
                intArray[j] = temp; 
            } 
        } 
        
   
        // swap intArray[i+1] and intArray[high] (or pi) 
        int temp = intArray[i+1]; 
        intArray[i+1] = intArray[high]; 
        intArray[high] = temp; 
   
        return i+1; 
    }
    
    
    // reverses the arrays --> ascending to descending
    private void reverse() {
        int num = randArr.length;
        
        for(int i=0; i<num/2; i++){

            int j = randArr[i];
            randArr[i] = randArr[num -i -1];
            randArr[num -i -1] = j;
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        algorithmType = new javax.swing.ButtonGroup();
        algorithmOrder = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selection = new javax.swing.JRadioButton();
        bubble = new javax.swing.JRadioButton();
        insertion = new javax.swing.JRadioButton();
        quick = new javax.swing.JRadioButton();
        ascending = new javax.swing.JRadioButton();
        descending = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        beforeDisplay = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        afterDisplay = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        statusDisplay = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Sorting Routines");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Enter the following information:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Sorting Algorithm:");

        algorithmType.add(selection);
        selection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selection.setText("Selection");
        selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionActionPerformed(evt);
            }
        });

        algorithmType.add(bubble);
        bubble.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bubble.setText("Bubble");

        algorithmType.add(insertion);
        insertion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        insertion.setText("Insertion");
        insertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertionActionPerformed(evt);
            }
        });

        algorithmType.add(quick);
        quick.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quick.setText("Quick");
        quick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickActionPerformed(evt);
            }
        });

        algorithmOrder.add(ascending);
        ascending.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ascending.setText("Ascending");

        algorithmOrder.add(descending);
        descending.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descending.setText("Descending");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Sort Order:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Amount of Numbers:");

        txtNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        calculateBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Before");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("After");

        beforeDisplay.setEditable(false);
        beforeDisplay.setColumns(20);
        beforeDisplay.setRows(5);
        jScrollPane1.setViewportView(beforeDisplay);

        afterDisplay.setEditable(false);
        afterDisplay.setColumns(20);
        afterDisplay.setRows(5);
        jScrollPane2.setViewportView(afterDisplay);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Status");

        statusDisplay.setEditable(false);
        statusDisplay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(insertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descending, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ascending, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(statusDisplay)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel6)))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculateBtn)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(selection))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bubble))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ascending))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descending)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertion)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(statusDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quick))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateBtn))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertionActionPerformed

    private void quickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quickActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        
        try{
            int elem, rand; 
            Boolean notSelected;


            beforeDisplay.setText("");
            afterDisplay.setText("");


            elem = Integer.parseInt(txtNum.getText());
            Random random = new Random(); // creates a Random type object
            randArr = new int [elem]; // creates a array of user inputted size
            notSelected = false;

            
            // creates an array of random numbers ranging from -1000 to 1000
            for(int i = 0; i < elem; i++){
                rand = random.nextInt(2001)-1000;
                randArr[i] = rand;
                beforeDisplay.append(Integer.toString(rand) + "\n");
            }

            
            // checks for what radioButton is selected, and then runs the appropriate 
            // method. If nothing was selected, it initializes notSelected to true
            if(selection.isSelected()){
                
                if (ascending.isSelected()){
                    selectionSort();
                }else if(descending.isSelected()){
                    selectionSort();
                    reverse();
                }else{
                    notSelected = true;
                }
                
            }else if(bubble.isSelected()){
                
                if (ascending.isSelected()){
                    bubbleSort();
                }else if(descending.isSelected()){
                    bubbleSort();
                    reverse();
                }else{
                    notSelected = true;
                }

            }else if(insertion.isSelected()){
                
                if (ascending.isSelected()){
                    insertionSort();
                }else if(descending.isSelected()){
                    insertionSort();
                    reverse();
                }else{
                    notSelected = true;
                }
                
            }else if(quick.isSelected()){
                
                if (ascending.isSelected()){
                    quickSort(randArr, 0, randArr.length-1);
                }else if(descending.isSelected()){
                    quickSort(randArr, 0, randArr.length-1);
                    reverse();
                }else{
                    notSelected = true;
                }
                
            }else{
                
                notSelected = true;
                
            }

            
            // Displaying the sorted array. Checks if one of the radioButton is selected
            if(!notSelected){
                
                for(int i = 0; i < randArr.length; i++){
                    afterDisplay.append(Integer.toString(randArr[i]) + "\n");
                }
                statusDisplay.setText("Successful!");
                
            }else{
                
                statusDisplay.setText("Failed!");
                System.out.println("Please Select A Sorting Algorithm and/or Sort Order!");
                
            }
            
        }catch(NegativeArraySizeException e){
            statusDisplay.setText("Failed!");
            System.out.println("Please Enter An Positive Integer As Array Size!");
        }catch(IllegalArgumentException e){
            statusDisplay.setText("Failed!");
            System.out.println("Please Enter An Integer As Array Size!");
        }catch(Exception e){
            statusDisplay.setText("Failed!");
            System.out.println("There Was Un Unknown Error!");
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void selectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectionActionPerformed

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
            java.util.logging.Logger.getLogger(SortingRoutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingRoutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingRoutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingRoutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingRoutines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea afterDisplay;
    private javax.swing.ButtonGroup algorithmOrder;
    private javax.swing.ButtonGroup algorithmType;
    private javax.swing.JRadioButton ascending;
    private javax.swing.JTextArea beforeDisplay;
    private javax.swing.JRadioButton bubble;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JRadioButton descending;
    private javax.swing.JRadioButton insertion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton quick;
    private javax.swing.JRadioButton selection;
    private javax.swing.JTextField statusDisplay;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
