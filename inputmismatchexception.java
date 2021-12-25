package Sesi11;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Nama     : Adi Sepriyadi
 * Kelas    : TI20E
 * NIM      : 20200040093
 * @author ADVANG4C
 * Exception
 */
public class inputmismatchexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       boolean lanjutin=true;
       
        do {            
            try {
                System.out.println("Masukan 1 huruf/bilangan :");
                char string = in.next(".").charAt(0);
                //char huruf = in.next(".").charAt(0);
                
                System.out.println("Huruf yang dimasukan adalah :"+string);
                lanjutin=false;
            } catch (InputMismatchException ex) {
                System.err.println("Coba kembali ! (Input valid : 1 bilangan/huruf diperlukan.)");
                in.nextLine();
            }
            
        } while (lanjutin);
    }
    
}
