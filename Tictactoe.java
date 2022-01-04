package Sesi13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Nama     : Adi Sepriyadi
 * Kelas    : TI20E
 * NIM      : 20200040093
 * @author ADVANG4C
 * Exception
 */
public class Tictactoe implements ActionListener{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlejpanel = new JPanel();
    JPanel buttonpanel = new JPanel();
    JLabel txtfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    
    Tictactoe(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        txtfield.setBackground(new Color(25, 25, 25));
        txtfield.setForeground(new Color(25, 255, 0));
        txtfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        txtfield.setHorizontalAlignment(JLabel.CENTER);
        txtfield.setText("Tic-Tac-Toe");
        txtfield.setOpaque(true);
        
        titlejpanel.setLayout(new BorderLayout());
        titlejpanel.setBounds(0, 0, 800, 100);
        
        buttonpanel.setLayout(new GridLayout(3,3));
        buttonpanel.setBackground(new Color (150, 150, 150));
        
        for (int i = 0; i<9; i++){
            buttons[i]= new JButton();
            buttonpanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        
        titlejpanel.add(txtfield);
        frame.add(titlejpanel, BorderLayout.NORTH);
        frame.add(buttonpanel);
        
        firstTurn();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tictactoe ttt = new Tictactoe();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        for (int i = 0; i < 9; i++) {
            if (ae.getSource()==buttons[i]){
                if (player1_turn){
                    if (buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        txtfield.setText("O Turn");
                        check();
                    }
                }else{
                    if (buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("O");
                        player1_turn=true;
                        txtfield.setText("X Turn");
                        check();
                    }
                }
            }
        }
    }
    public void firstTurn(){
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        if (random.nextInt(2)==0){
            player1_turn=true;
            txtfield.setText("X turn");
        }else{
            player1_turn=false;
            txtfield.setText("0 turn");
        }
    }
    public void check(){
        //check xwin condision
        if ((buttons[0].getText()=="X") && 
            (buttons[1].getText()=="X") && 
            (buttons[2].getText()=="X")) {
            xWins(0, 1, 2);
        } 
        if ((buttons[3].getText()=="X") && 
            (buttons[4].getText()=="X") && 
            (buttons[5].getText()=="X")) {
            xWins(3, 4, 5);
        } 
        if ((buttons[6].getText()=="X") && 
            (buttons[7].getText()=="X") && 
            (buttons[8].getText()=="X")) {
            xWins(6, 7, 8);
        } 
        if ((buttons[0].getText()=="X") && 
            (buttons[3].getText()=="X") && 
            (buttons[6].getText()=="X")) {
            xWins(0, 3, 6);
        }
        if ((buttons[1].getText()=="X") && 
            (buttons[4].getText()=="X") && 
            (buttons[7].getText()=="X")) {
            xWins(1, 4, 7);
        } 
        if ((buttons[2].getText()=="X") && 
            (buttons[5].getText()=="X") && 
            (buttons[8].getText()=="X")) {
            xWins(2, 5, 8);
        }
        if ((buttons[0].getText()=="X") && 
            (buttons[4].getText()=="X") && 
            (buttons[8].getText()=="X")) {
            xWins(0, 4, 8);
        } 
        if ((buttons[2].getText()=="X") && 
            (buttons[4].getText()=="X") && 
            (buttons[6].getText()=="X")) {
            xWins(2, 4, 6);
        } 
        
        //check owin condision
        if ((buttons[0].getText()=="O") && 
            (buttons[1].getText()=="O") && 
            (buttons[2].getText()=="O")) {
            oWins(0, 1, 2);
        } 
        if ((buttons[3].getText()=="O") && 
            (buttons[4].getText()=="O") && 
            (buttons[5].getText()=="O")) {
            oWins(3, 4, 5);
        } 
        if ((buttons[6].getText()=="O") && 
            (buttons[7].getText()=="O") && 
            (buttons[8].getText()=="O")) {
            oWins(6, 7, 8);
        } 
        if ((buttons[0].getText()=="O") && 
            (buttons[3].getText()=="O") && 
            (buttons[6].getText()=="O")) {
            oWins(0, 3, 6);
        }
        if ((buttons[1].getText()=="O") && 
            (buttons[4].getText()=="O") && 
            (buttons[7].getText()=="O")) {
            oWins(1, 4, 7);
        } 
        if ((buttons[2].getText()=="O") && 
            (buttons[5].getText()=="O") && 
            (buttons[8].getText()=="O")) {
            oWins(2, 5, 8);
        }
        if ((buttons[0].getText()=="O") && 
            (buttons[4].getText()=="O") && 
            (buttons[8].getText()=="O")) {
            oWins(0, 4, 8);
        } 
        if ((buttons[2].getText()=="O") && 
            (buttons[4].getText()=="O") && 
            (buttons[6].getText()=="O")) {
            oWins(2, 4, 6);
        } 
        
        
    }
    public void xWins(int a, int b,int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        txtfield.setText("X Wins");
    }
    public void oWins(int a, int b,int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        txtfield.setText("O Wins");
    }

    
}
