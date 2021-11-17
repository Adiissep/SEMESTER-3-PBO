package java_uts_semester3;

/**
 * @author AD7
 * NIM   : 20200040093
 * NAMA  : ADI SEPRIYADI
 * KELAS : TI20E
 */
public class Mobil {
String merk,tipe;
boolean nyala = false;
String status;
int porseneling;
int kecepatan;

Mobil(String merk, String tipe_mobil){
    this.merk=merk;
    tipe=tipe_mobil;
   
}
public void tambahKecepatan(int kecepatan){
    if (kecepatan == 0){
        System.out.println("Mobil sedang berhenti");
    }else if(kecepatan > 1 && kecepatan <=50 ){
        System.out.println("Mobil sedang lambat");
    }else if(kecepatan >51 && kecepatan <=70){
        System.out.println("Mobil sedang sedang");
    }else {
        System.out.println("Mobil sedang cepat");
    }
}
   
public void kurangKecepatan(int kecepatan){
    if (kecepatan == 0){
        status = "Mobil sedang berhenti";
    }else if(kecepatan > 1 && kecepatan >=50 ){
        status = "Mobil sedang lambat";
    }else if(kecepatan >51 && kecepatan <=70){
        status = "Mobil sedang sedang";
    }else {
        status = "Mobil sedang cepat";
    }
}
public int getKecepatan(){
    return kecepatan;
}
void infoKecepatan(){
    System.out.println(gettipe()+getmerk());
    System.out.println("Kecepatan Mobil :"+getStatus());
}
public String getStatus(){
    return status;
}
public String getmerk(){
    return merk;
}
public String gettipe(){
    return tipe;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota", "Avanza");
        System.out.println(mobilku.getStatus());
        mobilku.infoKecepatan();
        
        mobilku.tambahKecepatan(50);
        System.out.println(mobilku.getStatus());
        mobilku.infoKecepatan();
        
        /*mobilku.kurangKecepatan(100);
        System.out.println(mobilku.getStatus());
        mobilku.infoKecepatan();*/
    }
    
}
