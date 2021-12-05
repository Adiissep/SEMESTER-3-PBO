package Sesi9;
/**
 * Nama     : Adi Sepriyadi
 * Kelas    : TI20E
 * NIM      : 20200040093
 * @author ADVANG4C
 * Overriding
 * Polimorfisme dinamis
 */
public class Lombalari1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lari1 lari = new Lari1("Lomba Lari");   
        kecepatan1 kec = new kecepatan1(6.22 , "Half Marathon");
        Waktu_tempuh1 waktu = new Waktu_tempuh1(1, 50, "Half Marathon");    
        Peserta peserta = new Peserta("", "Adi");
        
        lari.infolari();
        peserta.infolari();
        kec.infolari();
        waktu.infolari();
    }
}

class Lari1 {
  protected String tipe_lari;
  public Lari1 (String tipe_lari){
      this.tipe_lari = tipe_lari;
  }
  public void infolari(){
      System.out.println("Berlari menuju kemenangan [" +tipe_lari+"]");
  }
}

class kecepatan1 extends Lari{
    protected double pace;
    public kecepatan1(double pace, String tipe_lari){
        super(tipe_lari);
        this.pace = pace;
    }
    @Override
    public void infolari(){
        System.out.println("Kategori Lari : "+super.tipe_lari);
        System.out.println("Kecepatan Pace : "+this.pace);
    }
}

class Waktu_tempuh1 extends Lari{
  protected int jam, menit;
  public Waktu_tempuh1 (int jam, int menit, String tipe_lari){
      super(tipe_lari);
      this.jam = jam;
      this.menit = menit; 
  }
  @Override
  public void infolari(){
      System.out.println("Waktu tempuh lari : "+this.jam+" Jam "+this.menit+" Menit");    
  }
}

class Peserta extends Lari{
    protected String peserta;
    public Peserta(String tipe_lari, String peserta) {
        super(tipe_lari);
        this.peserta = peserta;
    }
    @Override
    public void infolari(){
        System.out.println("Nama Peserta : "+this.peserta);
    }   
}
