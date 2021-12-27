package Sesi12;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author ADVANG4C
 */
public class MyFromKalkulator extends JFrame{
    JPanel buttonPanel = new JPanel(new GridLayout(3, 0));
    JTextField txt = new JTextField("");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("0");
    JButton tambah = new JButton("+");
    JButton kurang = new JButton("-");
    JButton kali = new JButton("*");
    JButton bagi = new JButton("/");
    JButton samadengan = new JButton("=");
    JButton persen = new JButton("%");
    JButton Mod = new JButton("Mod");
    JButton Exit = new JButton("Exit");
    
    MyFromKalkulator(){
        super("Belajar GUI");
        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
        setMinimumSize(new Dimension (400, 200));
        setLocationRelativeTo(null);
        buttonPanel.add(txt);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(b10);
        buttonPanel.add(tambah);
        buttonPanel.add(kurang);
        buttonPanel.add(bagi);
        buttonPanel.add(samadengan);
        buttonPanel.add(persen);
        buttonPanel.add(Mod);
        buttonPanel.add(Exit);
        buttonPanel.add(kali);
        mainPanel.add(txt, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        MyFromKalkulator form = new MyFromKalkulator();
        
    }
    
}
