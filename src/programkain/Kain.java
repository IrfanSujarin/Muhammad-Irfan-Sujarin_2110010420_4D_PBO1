
package programkain;

public class Kain {
    private String pembeli;
    private String namaPembeli;
    private String jenis;
    private String tanggal;
    private int total;
    private int jumlahMeter;


    // Constructor
    public Kain(String pembeli, String namaPembeli, String jenis, String tanggal, int total, int jumlahMeter) {
        this.pembeli = pembeli;
        this.namaPembeli = namaPembeli;
        this.jenis = jenis;
        this.total = total;
        this.jumlahMeter = jumlahMeter;
        this.tanggal = tanggal;    
    }

    // Setter
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }
    
    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    public void setJumlahMeter(int jumlahMeter) {
        this.jumlahMeter = jumlahMeter;
    }
    

    // Getter
    public String getPembeli() {
        return pembeli;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public int getTotal() {
        return total;
    }
    public int getJumlahMeter() {
        return jumlahMeter;
    }
    
    
    
    public String displayInfo(){
        return "\n========================================="+
               "\n           TOKO GWEHJ NIH BOZZ           "+
                "\n"+
               "\nPELANGGAN KE   : " +getPembeli()+
               "\nNAMA PELANGGAN : " +getNamaPembeli()+
               "\n-----------------------------------------";
    }
    
    public String displayInfo1(){
        return ""+getTotal();
    }
    
    // Polymorphism (overriding)
    public String displayInfo(String alamat){
        return displayInfo() + "\nAlamat : "+alamat;
    }
}