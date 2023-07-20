
package programkain;

import java.util.Scanner;

public class KainBeraksi {
         
    public static void main(String[] args) {
        int Batik = 50000;
        int Sasirangan = 80000;
        int Songket = 150000;
        String jawab;
          
          //objek
          //Kain data = new kain ("1","Irfan","batik","20");
        
          //System.out.println(data.displayInfo());
          //System.out.println(data.displayInfo("Bati-Bati"));
          
        boolean running = true;
     
        //error handling
        try{
                
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            Scanner input = new Scanner(System.in);

            //perualangan while  
            while (running){

            //array
            KainDetail[] kn = new KainDetail[2];
            
            System.out.println("========================================="); 
            System.out.println("            TOKO KAIN GWEHJ              ");
            System.out.println(" MENYEDIAKAN KAIN TRADISIONAL INDONESIA  ");
            System.out.println("JL.IN.AJA.DULU km29,9 Bati-Bati wkwkwkwk ");
            System.out.println("=========================================");           
            System.out.println("1. KAIN BATIK         :  Rp 50000,-");
            System.out.println("2. KAIN SASIRANGAN    :  Rp 80000,-");
            System.out.println("3. KAIN SONGKET       :  Rp 150000,-");
            System.out.println("=========================================");
            System.out.println("");
            System.out.println("MASUKKAN DATA CUSTOMER ");
            System.out.println("-----------------------");
            System.out.println("Pelanggan Ke : ");
            String pembeli = scanner.nextLine();
            System.out.println("");
            System.out.println("Nama Customer: ");
            String namaPembeli = scanner.nextLine();
            System.out.println("");
            System.out.println("Pilih Kain Sesuai Kode : ");
            System.out.println("Batik.............(btk)");
            System.out.println("Sasirangan........(ssr)");
            System.out.println("Songket...........(skt)");
            String jenis = scanner.nextLine();
            System.out.println("Jumlah Meter Kain Yang Di Beli (angka) : ");
            int jumlahMeter = input.nextInt();
            System.out.println("");
            System.out.println("Masukkan Tanggal : ");
            String tanggal = scanner.nextLine();
            System.out.println("");
            System.out.println("Cetak Struk?");
            System.out.print("YA/TIDAK (Untuk Data Baru): ");
            
            jawab = scanner.nextLine();
            if(jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            
            int kain = 0;
            if ("btk".equals(jenis)){
                kain = jumlahMeter * Batik;
            } else if ("ssr".equals(jenis)){
                    kain = jumlahMeter * Sasirangan;
            } else if ("skt".equals(jenis)){
                    kain = jumlahMeter * Songket;
            }    
            
            int total = kain;
            
            //objek
            kn[0] = new KainDetail(pembeli, namaPembeli, jenis, tanggal, total, jumlahMeter );
            System.out.println(kn[0].displayInfo());
            }
        } catch(StringIndexOutOfBoundsException e){
          System.out.println("Kesalahan Kode Kain! : "+e.getMessage()); 
        } catch(Exception e){
          System.out.println("PAKAI ANGKA SUDAH DIPERINGATKAN!! "+e.getMessage());  
        }
    
    }
}
