package operator;

/**
 *
 * @author AD7
 * Nama : Adi Sepriyadi
 * NIM  : 20200040093
 * 
 */
public class Operator {
    public static void main(String[] args) {
    double number=50;
    System.out.println("Nilai Awal variabel number :"+number);
    number+=50; 
    System.out.println("Setelah ditambah 50,maka hasilnya :"+number);
    number-=10;
    System.out.println("Setelah dikurangi 10,maka hasilnya :"+number);
    number*=5;
    System.out.println("Setelah dikalikan 5,maka hasilnya :"+number);
    number/=2;
    System.out.println("Setelah dibagi 2,maka hasilnya :"+number);
    number%=2;
    System.out.println("Setelah dimodulus 2,maka hasilnya :"+number);
    }   
}
