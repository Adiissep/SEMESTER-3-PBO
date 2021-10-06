package perhitungan;

/**
 *
 * @author AD7
 * Nama : Adi Sepriyadi
 * NIM  : 20200040093
 * 
 */
public class Perhitungan {
    public static void main(String[] args) {
        int a = 100;
        int b = 70;
        int hasil1;
        hasil1 = a & b;
        System.out.println(hasil1);
        
        int c = 528;
        int d = 70;
        int hasil2;
        hasil2 = a | b;
        System.out.println(hasil2);
        
        int e = 256;
        int f = 3;
        int hasil3 = e >> f;
        System.out.println(hasil3);
        
        int g = 128;
        int h = 5;
        int hasil4;
        hasil4 = g << h;
        System.out.println(hasil4);
        
        int i = 600;
        int j = 4;
        int hasil5;
        hasil5 = i >> j;
        System.out.println(hasil5);
        
        int k = 423;
        int l = 2;
        int hasil6;
        hasil6 = k << l;
        System.out.println(hasil6);    
    }
}
