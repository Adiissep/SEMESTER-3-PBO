package sesi3_pbo;
/**
 *
 * @author AD7
 * NIM : 20200040093
 * NAMA : ADI SEPRIYADI
 * KELAS : TI20E
 * 
 */
public class Soal5 {
  public static void main(String[] args) {
    double umur = 2;
    int tinggi = 71;
    int tarif = 0;

    if (umur < 1) {
      System.out.println("Dilarang masuk");
    }
    
    if (umur <= 3 & umur >= 1) {
      tarif = 30000;
      if (umur <= 3 & umur >= 2 & tinggi > 70) {
        tarif += 10000;
      }
    }

    if (umur <= 7 & umur >= 4) {
      tarif = 40000;
      if (tinggi > 120) {
        tarif += 15000;
      }
    }

    if (umur <= 10 & umur >= 8) {
      tarif = 50000;
      if (tinggi > 150) {
        tarif += 20000;
      }
    }

    if (umur >= 10) {
      tarif = 80000;
    }

    System.out.println("Harga Masuk : Rp." + tarif);

  }
}
