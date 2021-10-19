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
public class ClosestPalindrome {
  public static void main(String[] args) {
    int angka;
    int closestPalindrome;
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Angka :  ");
    angka = input.nextInt();
    if (angka <10){
        angka = 10;
    }
    
    if (angka <=10) {
      closestPalindrome = 11;
    }
    closestPalindrome = findClosestPalindrome(angka);
    System.out.println("Palindrome terdekat adalah : " + closestPalindrome);
    
  }

  
  public static int findClosestPalindrome(int number) {
    int closestPalindrome = 0;

    while (!isPalindrome(number)) {
      number++;
    }
    return number;
  }

  public static boolean isPalindrome(int number) {
    int reversedNumber = reverseNumber(number);
    return reversedNumber == number;
  }

  public static int reverseNumber(int number) {
    int reversedNumber = 0;

    while (number != 0) {
      int remainNumber = number % 10;
      reversedNumber = reversedNumber * 10 + remainNumber;
      number = number / 10;
    }
    return reversedNumber;
  }
  
  
/*public static boolean isPalindrome(int n) {
    if (n < 0)
        return false;

    int div = 1;
    // find the divisor
    while (n / div >= 10)
        div *= 10;

    // any number less than 10 is a palindrome
    while (n != 0) {
        int leading = n / div;
        int trailing = n % 10;
        if (leading != trailing)
            return false;

        // % with div gets rid of leading digit
        // dividing result by 10 gets rid of trailing digit
        n = (n % div) / 10;

        // got rid of 2 numbers, update div accordingly
        div /= 100;
    }
    return true;
}*/
  
}