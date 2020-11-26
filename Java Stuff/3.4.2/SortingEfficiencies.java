
/**
 * ICS4U0 Computer Science, Grade 12
 * @fileame SortingEfficiencies.java
 * @author Ajinkya
 * @date October 28, 2020
 * @version 1.0
 * @Description: A program that will display a list of random numbers. The
 * random numbers are in range from -10 000 to 10 000.
 * 
 * A user should have the choice of:
 * the number of random numbers to display (10, 100, 1000, or 5000)
 * and the order the numbers will be sorted in (ascending, descending)
 * 
 * The program then sorts the original unsorted numbers using each of the four
 * sorting methods:selection, bubble, insertion, and quick. Then the program
 * will display the counters for: loopCounter, comparisonCounter, shiftCounter,
 * and the actual time, in milliseconds, that it took to complete the sort.
 */


import java.util.Random;
import java.util.Arrays;

public class SortingEfficiencies extends javax.swing.JFrame {
    
    int[] randArr, temp1, temp2, temp3, temp4;
    int loopCounter, comparisonCounter, shiftCounter;
    long start, finish;
    

    public SortingEfficiencies() {
        initComponents();
    }

    
    private void selectionSort(){ 
        
        int n = temp1.length;
        
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n; i++){
            loopCounter++;
            
            // Find the minimum element in unsorted array
            for (int j = i+1; j < n; j++){
                
                loopCounter ++;
                comparisonCounter ++;
                
                if (temp1[j] < temp1[i]){
                    
                    // Swap the found minimum element with the first
                    // element
                    shiftCounter ++;
                    int temp = temp1[i];
                    temp1[i] = temp1[j];
                    temp1[j] = temp;
                    
                }
            }            
        }
    }
    
    
    private void bubbleSort() { 
        
        int temp;
        int bottom = temp2.length-1;
        Boolean swap = true;


        while(swap){
            
            loopCounter++;
            swap = false;
            
            for(int j = 0; j < bottom; j++){
                
                loopCounter++;
                comparisonCounter++;
                
                // compares current element to next, and continues this until 
                // the end of the Array
                if(temp2[j] > temp2[j+1]){
                    
                    shiftCounter ++;
                    swap = true;
                    temp = temp2[j];
                    temp2[j] = temp2[j+1];
                    temp2[j+1] = temp;
                    
                }
            }
            bottom --;
        }
    }  
    
    
    private void insertionSort(){
        
        int temp, j;
        int n = temp3.length;
        
        
        // Puts the first two items in correct relative order, then insert the 
        // third item in the correct place and so on
        for(int i = 1; i < n; i++){
            
            loopCounter++;
            temp = temp3[i];
            j = i - 1;
            
            while((j >= 0) && (temp3[j] > temp)){
                loopCounter++;
                temp3[j+1] = temp3[j];
                j--;
            }
            shiftCounter ++;
            temp3[j+1] = temp;
        }
    }
    
    
    void quickSort(int intArray[], int low, int high) { 
        
        comparisonCounter++;
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
            
            loopCounter++;
            comparisonCounter++;
            
            // check if current element is less than or equal to pi 
            if (intArray[j] <= pi) { 
                i++; 
                
                // swap intArray[i] and intArray[j] 
                shiftCounter++;
                int temp = intArray[i]; 
                intArray[i] = intArray[j]; 
                intArray[j] = temp; 
            } 
        } 
        
        // swap intArray[i+1] and intArray[high] (or pi) 
        shiftCounter++;
        int temp = intArray[i+1]; 
        intArray[i+1] = intArray[high]; 
        intArray[high] = temp; 
        
        
        return i+1; 
    }
    
    
    // reverses the arrays --> ascending to descending
    private void reverse(int[] arr) {
        int num = arr.length;
        
        for(int i=0; i<num/2; i++){

            int j = arr[i];
            arr[i] = arr[num -i -1];
            arr[num -i -1] = j;
        }
    }
    
    
    private void resetCounters(){
        loopCounter = 0 ;
        comparisonCounter = 0;
        shiftCounter = 0;
    }
    
    
    private void displayCounters(){
        resultDisplay.append("\nNumber of of times loop was executed: " + Integer.toString(loopCounter));
        resultDisplay.append("\nNumber of of times comparison was made: " + Integer.toString(comparisonCounter));
        resultDisplay.append("\nNumber of of times a value was shifted: " + Integer.toString(shiftCounter));
        resultDisplay.append("\nNumber of milliseconds to complete the sort: " + Long.toString(finish-start));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalNum = new javax.swing.ButtonGroup();
        sortOrder = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num10 = new javax.swing.JRadioButton();
        num100 = new javax.swing.JRadioButton();
        num1000 = new javax.swing.JRadioButton();
        num5000 = new javax.swing.JRadioButton();
        calculateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ascending = new javax.swing.JRadioButton();
        descending = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        originalDisplay = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sortedDisplay = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultDisplay = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        statusDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Sorting Efficiencies");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Enter the amount of Numbers in List:");

        totalNum.add(num10);
        num10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        num10.setText("10");

        totalNum.add(num100);
        num100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        num100.setText("100");

        totalNum.add(num1000);
        num1000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        num1000.setText("1000");

        totalNum.add(num5000);
        num5000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        num5000.setText("5000");

        calculateBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Sort Order:");

        sortOrder.add(ascending);
        ascending.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ascending.setText("Ascending");

        sortOrder.add(descending);
        descending.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descending.setText("Descending");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Original");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Sorted");

        originalDisplay.setEditable(false);
        originalDisplay.setColumns(20);
        originalDisplay.setRows(5);
        jScrollPane1.setViewportView(originalDisplay);

        sortedDisplay.setEditable(false);
        sortedDisplay.setColumns(20);
        sortedDisplay.setRows(5);
        jScrollPane2.setViewportView(sortedDisplay);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Sort Results:");

        resultDisplay.setEditable(false);
        resultDisplay.setColumns(20);
        resultDisplay.setRows(5);
        jScrollPane3.setViewportView(resultDisplay);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Status:");

        statusDisplay.setEditable(false);
        statusDisplay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        statusDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descending, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ascending, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(num100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(num1000))
                                    .addComponent(jLabel5)))
                            .addComponent(calculateBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num5000)
                        .addContainerGap(449, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(num10)
                    .addComponent(num100)
                    .addComponent(num1000)
                    .addComponent(num5000))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(calculateBtn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ascending))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descending)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(statusDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane3))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        try{
            int rand; 
            Boolean notSelected, reverse;


            originalDisplay.setText("");
            sortedDisplay.setText("");
            resultDisplay.setText("");


            Random random = new Random(); // creating a Random type object
            notSelected = false;
            reverse = false;


            // creating a random array of the size user selects. If user dosen't 
            // select any radioButtons, it initializes notSelected to true and 
            // appends the sorted array to the sortedDisplay
            if (num10.isSelected()){

                if(ascending.isSelected() || descending.isSelected()){

                    randArr = new int [10];
                    for(int i = 0; i < 10; i++){
                        rand = random.nextInt(20000)-10000;
                        randArr[i] = rand;
                        originalDisplay.append(Integer.toString(rand) + "\n");
                    }

                    if(descending.isSelected()){
                        reverse = true;
                    }

                }else{
                    notSelected = true;
                }

            }else if (num100.isSelected()){

                if(ascending.isSelected() || descending.isSelected()){

                    randArr = new int [100];
                    for(int i = 0; i < 100; i++){
                        rand = random.nextInt(20000)-10000;
                        randArr[i] = rand;
                        originalDisplay.append(Integer.toString(rand) + "\n");
                    }

                    if(descending.isSelected()){
                        reverse = true;
                    }

                }else{
                    notSelected = true;
                }

            }else if (num1000.isSelected()){

                if(ascending.isSelected() || descending.isSelected()){

                    randArr = new int [1000];
                    for(int i = 0; i < 1000; i++){
                        rand = random.nextInt(20000)-10000;
                        randArr[i] = rand;
                        originalDisplay.append(Integer.toString(rand) + "\n");
                    }

                    if(descending.isSelected()){
                        reverse = true;
                    }

                }else{
                    notSelected = true;
                }

            }else if (num5000.isSelected()){

                if(ascending.isSelected() || descending.isSelected()){

                    randArr = new int [5000];
                    for(int i = 0; i < 5000; i++){
                        rand = random.nextInt(20000)-10000;
                        randArr[i] = rand;
                        originalDisplay.append(Integer.toString(rand) + "\n");
                    }

                    if(descending.isSelected()){
                        reverse = true;
                    }

                }else{
                    notSelected = true;
                }

            }else{  
                notSelected = true; 
            }


            // checks if on of the options/radioButtons are selected
            if(!notSelected){

                // creates a copy of random array to use them for different sort types
                temp1 = Arrays.copyOf(randArr,randArr.length);
                temp2 = Arrays.copyOf(randArr,randArr.length);
                temp3 = Arrays.copyOf(randArr,randArr.length);
                temp4 = Arrays.copyOf(randArr,randArr.length);



                // Selection Sort
                resetCounters();
                start = System.currentTimeMillis();
                selectionSort();
                finish = System.currentTimeMillis();

                if(reverse){
                    reverse(temp1);
                }

                // appends the sorted array to the sortedDisplay
                for(int i = 0; i < temp1.length; i++){
                    sortedDisplay.append(Integer.toString(temp1[i]) + "\n");
                }

                resultDisplay.append("Selection Sort");
                displayCounters();



                // Bubble Sort
                resetCounters();
                start = System.currentTimeMillis();
                bubbleSort();
                finish = System.currentTimeMillis();

                if(reverse){
                    reverse(temp2);
                }

                resultDisplay.append("\n\nBubble Sort");
                displayCounters();



                // Insertion Sort
                resetCounters();
                start = System.currentTimeMillis();
                insertionSort();
                finish = System.currentTimeMillis();

                if(reverse){
                    reverse(temp3);
                }

                resultDisplay.append("\n\nInsertion Sort");
                displayCounters();



                // Quick Sort
                resetCounters();
                start = System.currentTimeMillis();
                quickSort(temp4, 0, temp4.length-1);
                finish = System.currentTimeMillis();

                if(reverse){
                    reverse(temp4);
                }

                resultDisplay.append("\n\nQuick Sort");
                displayCounters();

            }else{
                System.out.println("Please select all given options!");
            }
            
            statusDisplay.setText("Successful!");
            
        }catch(Exception e){
            statusDisplay.setText("Failed!");
            System.out.println("There Was Un Unknown Error!");
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void statusDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingEfficiencies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ascending;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JRadioButton descending;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton num10;
    private javax.swing.JRadioButton num100;
    private javax.swing.JRadioButton num1000;
    private javax.swing.JRadioButton num5000;
    private javax.swing.JTextArea originalDisplay;
    private javax.swing.JTextArea resultDisplay;
    private javax.swing.ButtonGroup sortOrder;
    private javax.swing.JTextArea sortedDisplay;
    private javax.swing.JTextField statusDisplay;
    private javax.swing.ButtonGroup totalNum;
    // End of variables declaration//GEN-END:variables
}
