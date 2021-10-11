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
public class Soal2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        String nilai_koding = "";
        String nilai_interview = "";
        System.out.print("Masukkan score koding : ");
        int n = in.nextInt();    
        
    if (n > 80) {
        nilai_koding = "LOLOS";
        nilai_interview = "A";
    }else if (n >= 60 & n <= 80) {
        nilai_koding = "DIPERTIMBANGKAN";
        nilai_interview = "B";
    }else if (n < 60) {
        nilai_interview = "GAGAL";
    }

    if (nilai_koding == "LOLOS" || nilai_koding == "DIPERTIMBANGKAN" &&
       (nilai_interview == "A" || nilai_interview == "B")) {
        System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
    }else {
        System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
    }
  }
}
