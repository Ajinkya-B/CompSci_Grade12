
/**
 * ICS4U0 Computer Science, Grade 12
 * @fileame TicTacEvent.java
 * @author Ajinkya
 * @date October 12, 2020
 * @version 1.0
 * @Description: This program runs the GUI for Tic-Tac-Toe
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class TicTacEvent implements ItemListener, ActionListener, Runnable {
    TicTac gui;
    Thread playing;
    ImageIcon a = new ImageIcon("x.png"); // https://awadalaa.github.io/img/portfolio/proj_tictactoe.png
    ImageIcon b = new ImageIcon("o.png"); // https://awadalaa.github.io/img/portfolio/proj_tictactoe.png
    ImageIcon back = new ImageIcon("cardback.jpg"); // https://i.pinimg.com/originals/06/a0/29/06a029e695bdd2fd89e700df831e64a2.jpg
    int clicks = 0;
    int win = 0;
    int winX,winY,winC = 0; // initializing # wins for everyone(x, y, and cat) to 0
    int[][] check = new int[3][3];

    
    public TicTacEvent (TicTac in){
        gui = in;
        
        // setting all elements in the 2d array to 0
        for (int row=0; row<=2; row++){
            for (int col=0; col<=2; col++){
                check[row][col]=0;
            }
        }
    }
    
    
    // method that enables or disables all the baoxes
    public void enableBoxes(boolean a){
        try{
            gui.boxes[0][0].setEnabled(a);
            gui.boxes[0][1].setEnabled(a);
            gui.boxes[0][2].setEnabled(a);
            gui.boxes[1][0].setEnabled(a);
            gui.boxes[1][1].setEnabled(a);
            gui.boxes[1][2].setEnabled(a);
            gui.boxes[2][0].setEnabled(a);
            gui.boxes[2][1].setEnabled(a);
            gui.boxes[2][2].setEnabled(a);
            
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }

    
    public void actionPerformed (ActionEvent event) {
       String command = event.getActionCommand();

       
       // assigns buttons methods/functionality by its name
       if (command.equals("Play Again")) {
           startPlaying();
       }
       if (command.equals("1")) {
           b1();
       }
       if (command.equals("2")) {
           b2();
       }
       if (command.equals("3")) {
           b3();
       }
       if (command.equals("4")) {
           b4();
       }
       if (command.equals("5")) {
           b5();
       }
       if (command.equals("6")) {
           b6();
       }
       if (command.equals("7")) {
           b7();
       }
       if (command.equals("8")) {
           b8();
       }
       if (command.equals("9")) {
           b9();
       }
    }

    void b1() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[0][0].setIcon(a);
                check[0][0] = 1;
            } else {
                gui.boxes[0][0].setIcon(b);
                check[0][0] = 2;
            }
            gui.boxes[0][0].setEnabled(false);
            winner();
            
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    void b2() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[0][1].setIcon(a);
                check[0][1] = 1;
            } else {
                gui.boxes[0][1].setIcon(b);
                check[0][1] = 2;
            }
            gui.boxes[0][1].setEnabled(false);
            winner();
        
        }catch(Exception e){
        System.out.println("There Was An Unknown Error!");
        }
    }
    void b3() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[0][2].setIcon(a);
                check[0][2] = 1;
            } else {
                gui.boxes[0][2].setIcon(b);
                check[0][2] = 2;
            }
            gui.boxes[0][2].setEnabled(false);
            winner();
        
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    void b4() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[1][0].setIcon(a);
                check[1][0] = 1;
            } else {
                gui.boxes[1][0].setIcon(b);
                check[1][0] = 2;
            }
            gui.boxes[1][0].setEnabled(false);
            winner();
            
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    void b5() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[1][1].setIcon(a);
                check[1][1] = 1;
            } else {
                gui.boxes[1][1].setIcon(b);
                check[1][1] = 2;
            }
            gui.boxes[1][1].setEnabled(false);
            winner();
            
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    void b6() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[1][2].setIcon(a);
                check[1][2] = 1;
            } else {
                gui.boxes[1][2].setIcon(b);
                check[1][2] = 2;
            }
            gui.boxes[1][2].setEnabled(false);
            winner();
        
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    void b7() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[2][0].setIcon(a);
                check[2][0] = 1;
            } else {
                gui.boxes[2][0].setIcon(b);
                check[2][0] = 2;
            }
            gui.boxes[2][0].setEnabled(false);
            winner();
        
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    void b8() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[2][1].setIcon(a);
                check[2][1] = 1;
            } else {
                gui.boxes[2][1].setIcon(b);
                check[2][1] = 2;
            }
            gui.boxes[2][1].setEnabled(false);
            winner();
        
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    void b9() {
        try{
            clicks = clicks + 1;
            if ((clicks%2)==1){
                gui.boxes[2][2].setIcon(a);
                check[2][2] = 1;
            } else {
                gui.boxes[2][2].setIcon(b);
                check[2][2] = 2;
            }
            gui.boxes[2][2].setEnabled(false);
            winner();
        
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }

    
    // processes the winner depending on the elements in the check array
    void winner() {
        try{
            /** Check rows for winner */

            for (int x=0; x<=2; x++){
                if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])) {
                    if (check[x][0]==1) {
                        JOptionPane.showMessageDialog(null, "X is the winner");
                        win = 1;
                        winX += 1; // increments score for x by 1
                        enableBoxes(false); // disables all the boxes
                    } else if (check[x][0]==2){
                        JOptionPane.showMessageDialog(null, "Y is the winner");
                        win = 1;
                        winY += 1; // increments score for y by 1
                        enableBoxes(false); // disables all the boxes
                    }
                }
            }

            /** Check columns for winner */
            for (int x=0; x<=2; x++){
                if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])) {
                    if (check[0][x]==1) {
                        JOptionPane.showMessageDialog(null, "X is the winner");
                        win = 1;
                        winX += 1; // increments score for x by 1
                        enableBoxes(false); // disables all the boxes
                    } else if (check[0][x]==2) {
                        JOptionPane.showMessageDialog(null, "Y is the winner");
                        win = 1;
                        winY += 1; // increments score for y by 1
                        enableBoxes(false); // disables all the boxes
                    }
                }
            }

            /** Check diagonals for winner */
            if (((check[0][0]==check[1][1])&&(check[0][0]==check[2][2]))||
                    ((check[2][0]==check[1][1])&&(check[1][1]==check[0][2]))){
                if (check[1][1]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                    winX += 1; // increments score for x by 1
                    enableBoxes(false); // disables all the boxes
                } else if (check[1][1]==2) {
                    JOptionPane.showMessageDialog(null, "Y is the winner");
                    win = 1;
                    winY += 1; // increments score for y by 1
                    enableBoxes(false); // disables all the boxes
                }

            }

            /** Checks if the game is a tie */
            if ((clicks==9) && (win==0)) {
                JOptionPane.showMessageDialog(null, "The game is a tie");
                winC += 1; // increments score for cat by 1
                enableBoxes(false); // disables all the boxes
            }


            // outputs the score for x and y and tie
            gui.blank1.setText("X Wins: " + Integer.toString(winX));
            gui.blank2.setText("Y Wins: " + Integer.toString(winY));
            gui.blank3.setText("Cat Wins: " + Integer.toString(winC));
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }

    // reset/play button method
    void startPlaying() {
        try{
            enableBoxes(true); // enables all the boxes
            clicks = 0; // initializes clicks var to default, i.e. 0
            win = 0; // initializes win var to default, i.e. 0


            // sets the every value in the 2d array back to 0
            for (int row=0; row<=2; row++){
               for (int col=0; col<=2; col++){
                   check[row][col]=0;
                   gui.boxes[row][col].setIcon(back); // sets the icon for all buttons to cardback
               }
           }
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }

    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}

