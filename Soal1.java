package sesi3_pbo;
import java.util.Scanner;
/**
 *
 * @author AD7
 * NIM : 20200040093
 * NAMA : ADI SEPRIYADI
 * KELAS : TI20E
 * 
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Masukan Nama :");
        String nama = scan.next();
        System.out.println("Umur :");
        int umur = scan.nextInt();
        System.out.println("Tempat Tinggal :");
        Scanner scan1=new Scanner(System.in);
        String tt = scan1.nextLine();
        System.out.println("Uang Tabungan :");
        int ut = scan.nextInt();
        
        if (umur>=18 && umur<=24) {
            if (tt.equalsIgnoreCase("California")|| tt.equalsIgnoreCase("Detroit") || tt.equalsIgnoreCase("Boston")
                && ut < 1000) {
                String pangkat="Capo";
                System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat "+pangkat);
            } else {
                System.out.println(nama+" tidak mencurigakan"); 
            }   
            }
        else if (umur>=25 && umur<=40){
            if (tt.equalsIgnoreCase("New Jersey")|| tt.equalsIgnoreCase("Manhattan") || tt.equalsIgnoreCase("Nevada")
                & (ut >=1000 && ut <=2000)) {
                String pangkat="Underboss";
                System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat "+pangkat);
            } else {
                System.out.println(nama+" tidak mencurigakan"); 
            }
            }  
        else if (umur>40){
            if (tt.equalsIgnoreCase("Nevada")|| tt.equalsIgnoreCase("New York")|| tt.equalsIgnoreCase("Havana")
                && ut > 10000) {
                String pangkat="Don";
                System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat "+pangkat);
            } else {
                System.out.println(nama+" tidak mencurigakan"); 
            }  
            }
        else{
              System.out.println("Kesalahan !");
            }
    }
    
}
