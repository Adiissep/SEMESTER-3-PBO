package Sesi9;
/**
 * Nama     : Adi Sepriyadi
 * Kelas    : TI20E
 * NIM      : 20200040093
 * @author ADVANG4C
 * Overloading
 * Polimorfisme statis
 */
public class Lombalari2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tipe_lari peserta1 = new tipe_lari(5);
        tipe_lari peserta2 = new tipe_lari("42KM");
        tipe_lari peserta3 = new tipe_lari(3);
        
        System.out.println("Peserta ke 1 dengan kategori lari "+peserta1.gettipe());
        System.out.println("Peserta ke 2 dengan kategori lari "+peserta2.gettipe());
        System.out.println("Peserta ke 3 dengan kategori lari "+peserta3.gettipe());
    }   
}

class tipe_lari {
    String tipe;
    public tipe_lari(String tipe){
        if(tipe.equalsIgnoreCase("42 KM")||tipe.equalsIgnoreCase("42km")){
           this.tipe = "Full Marathon 42 KM";
        }else if (tipe.equalsIgnoreCase("21 km")||tipe.equalsIgnoreCase("21km")){
           this.tipe = "Half Marathon 21 KM"; 
        }else if (tipe.equalsIgnoreCase("10 km")||tipe.equalsIgnoreCase("10km")){
           this.tipe = "10 KM"; 
        }else if (tipe.equalsIgnoreCase("5 km")||tipe.equalsIgnoreCase("5km")){
           this.tipe = "5 KM"; 
        }else {
            this.tipe = "Tidak Tersedia!";
        } 
    }
    public tipe_lari(int tipe){
        if(tipe==42){
           this.tipe = "Full Marathon 42 KM";
        }else if (tipe==21){
           this.tipe = "Half Marathon 21 KM"; 
        }else if (tipe==10){
           this.tipe = "10 KM"; 
        }else if (tipe==5){
           this.tipe = "5 KM"; 
        }else {
            this.tipe = "Tidak Tersedia!";
        }        
    }
    public String gettipe(){
        return tipe;
    }
}

