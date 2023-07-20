
package programkain;

//inheritence
public class KainDetail extends Kain {
    
    //overriding
    public KainDetail(String pembeli, String namaPembeli, String jenis, String tanggal, int total, int jumlahMeter) {
        super(pembeli, namaPembeli, jenis, tanggal, total, jumlahMeter);
    }

    public String  getPilihKain(){
        String kodeKain = getJenis().substring(0, 3);
        //seleksi switch
        switch (kodeKain) {
            case "btk":
                return "Batik x1      50.000";
            case "ssr":
                return "Sasirangan x1 80.000";
            case "skt":
                return "Songket x1   150.000";
            default:
                return "tidak ada, tolong input ulang!";
        }
    }
    
     //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                    "\nKAIN YANG DIPILIH : "+getPilihKain()+
                    "\nJUMLAH METER KAIN :                   "+getJumlahMeter()+
                    "\n                   ______________________x"+
                    "\nTOTAL HARGA       :           RP "+displayInfo1()+
                    "\n"+
                    "\n-----------------------------------------"+
                    "\n       TERIMA KASIH TELAH BERBELANJA     "+
                    "\n               DI TOKO GWEHJ             "+
                    "\n========================================="+
                    "\n                   Tanggal : "+getTanggal()+ " Juli 2023"+
                    "\n"+
                    "\n";
    }
}
