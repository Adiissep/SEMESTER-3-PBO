package semester3_sesi4_pbo;
import java.util.Scanner;
/**
 *
 * @author AD7
 * NIM   : 20200040093
 * NAMA  : ADI SEPRIYADI
 * KELAS : TI20E
 * 
 */
public class Palindrome {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String kata;
    String reversedkata;
    
    System.out.print("Masukan kata : ");
    kata = scan.nextLine();
    reversedkata = reverse(kata);

    if (kata.toLowerCase().equals(reversedkata.toLowerCase())) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Bukan Palindrome");
    }
  }

  public static String reverse(String stringObj) {
    String reverseStringObj = "";
    for (int i = stringObj.length() - 1; i >= 0; i--) {
      reverseStringObj += stringObj.substring(i, i + 1);
    }
    return reverseStringObj;
  }
}