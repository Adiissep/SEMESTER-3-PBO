package Sesi1;
import javax.swing.JOptionPane;
/**
 * @author ADVANG4C
 * Nama     : Adi Sepriyadi
 * Kelas    : TI20E
 * NIM      : 20200040093
 */
public class Txtbox {
    public static void main(String[]args){
    String Input = JOptionPane.showInputDialog("Anda sedang belajar apa?");
    String Pesan = ("Belajar "+Input+" sangat mudah");
    JOptionPane.showMessageDialog(null,Pesan);
    }    
}
