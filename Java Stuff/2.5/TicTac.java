
/**
 * ICS4U0 Computer Science, Grade 12
 * @fileame TicTac.java
 * @author Ajinkya
 * @date October 12, 2020
 * @version 1.0
 * @Description: GUI for tic-tac-toe game
 */

import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {
    TicTacEvent tictac = new TicTacEvent(this);

    JPanel row1 = new JPanel();
    JButton[][] boxes = new JButton[3][3];
    JButton play = new JButton("Play Again");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JTextField blank3 = new JTextField();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("cardback.jpg"); // https://i.pinimg.com/originals/06/a0/29/06a029e695bdd2fd89e700df831e64a2.jpg


    public TicTac() {
        super ("Tic Tac Toe");
        setSize (550,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;


        GridLayout layout1 = new GridLayout(5, 3, 10, 10);
        row1.setLayout(layout1);


        for (int x=0; x<=2; x++){
            for (int y=0; y<=2; y++){
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname); // sets name for all boxes to n+=1(1, 2, 3, 4,...)
                boxes[x][y].setIcon(back); // sets the icon for all the boxes to back
                row1.add(boxes[x][y]); // adds all the boxes into the 5 by 3 grid
            }
        }

	blank1.setEditable(false);
	blank2.setEditable(false);
	blank3.setEditable(false);
	
        // add 3 elements into the 4th row
        row1.add(blank1);
        row1.add(play);
        row1.add(blank2);

        // add textField for cat wins to 5th row
        row1.add(blank3);
        add(row1);

        // setting actionlistener for the play button
        play.addActionListener(tictac);


        for (int x=0; x<=2; x++){
            for (int y=0; y<=2; y++){
                boxes[x][y].addActionListener(tictac); // add actionlisterner for every box
            }
        }


        // set background to black
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }

    public static void main(String[] arguments){
        TicTac frame = new TicTac();
    }
}