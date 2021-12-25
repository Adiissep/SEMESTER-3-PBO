package Sesi11;
/**
 * Nama     : Adi Sepriyadi
 * Kelas    : TI20E
 * NIM      : 20200040093
 * @author ADVANG4C
 * Exception
 */
public class arrayindexoutofboundsexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String mahasiswa[]= new String[3];
            mahasiswa[0]="Denki";
            mahasiswa[1]="Ren";
            mahasiswa[2]="Endah";
            System.out.println(mahasiswa[1]);
            System.out.println(mahasiswa[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Data array yang dikeluarkan tidak ada!");
        }
    }
    
}
