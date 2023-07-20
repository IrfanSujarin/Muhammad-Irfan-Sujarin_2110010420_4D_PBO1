# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penjualan kain menggunakan java sebagai UAS atau tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1 atau PBO 1

## Deskripsi

Aplikasi ini membantu di bagian pertokoan kain untuk mencatat data penjualan kain, disana diberikan info nama toko, jalan, dan juga informasi kain yang tersedia beserta harganya permeter. penjual dengan mudah memasukkan data pembelinya dengan aplikasi ini, disana ada inputan urutan pelanggan, nama pelanggan, pemilihan kain dengan kode, jumlah kain yang dibeli, serta memberikan output berupa struk untuk para customernya.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kain`, `KainDetail`, dan `KainBeraksi` adalah contoh dari class.

```bash
public class Kain {
    ...
}

public class KainDetail extends Kain {
    ...
}

public class KainaBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kn[0] = new KainDetail(pembeli, namaPembeli, jenis, tanggal, total, jumlahMeter );` adalah contoh pembuatan object.

```bash
kn[0] = new KainDetail(pembeli, namaPembeli, jenis, tanggal, total, jumlahMeter );
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `pembeli`, `namaPembeli`, `jenis`, `tanggal`, `total` dan `jumlahMeter` adalah contoh atribut.

```bash
    String pembeli;
    String namaPembeli;
    String jenis;
    String tanggal;
    int total;
    int jumlahMeter;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kain` dan `KainDetail`.

```bash
public Kain(String pembeli, String namaPembeli, String jenis, String tanggal, int total, int jumlahMeter) {
        this.pembeli = pembeli;
        this.namaPembeli = namaPembeli;
        this.jenis = jenis;
        this.total = total;
        this.jumlahMeter = jumlahMeter;
        this.tanggal = tanggal;    
    }

public KainDetail(String pembeli, String namaPembeli, String jenis, String tanggal, int total, int jumlahMeter) {
        super(pembeli, namaPembeli, jenis, tanggal, total, jumlahMeter);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setPembeli`, `setNamaPembeli`, `setJenis`, `setTanggal`, `seTotal` dan `setJumlahMeter` adalah contoh method mutator.

```bash
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
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getPembeli`, `getNamaPembeli`, `getJenis`, `getTanggal`, `getTotal`, dan `getJumlahMeter` adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `pembeli`, `namaPembeli`, `jenis`, `tanggal`, `total` dan `jumlahMeter` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String pembeli;
    private String namaPembeli;
    private String jenis;
    private String tanggal;
    private int total;
    private int jumlahMeter;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KainDetail` mewarisi `Kain` dengan sintaks `extends`.

```bash
public class KainDetail extends Kain {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Kain` merupakan overloading method `displayInfo` dan `displayInfo` di `KainDetail` merupakan override dari method `displayInfo` di `Kain`.

```bash
public String displayInfo(String alamat){
        return displayInfo() + "\nAlamat : "+alamat;
    }

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
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan  seleksi `switch` dalam method `getJenis`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data.

```bash
boolean running = true;
while (running){
jawab = scanner.nextLine();
if(jawab.equalsIgnoreCase("ya")){
running = false;
}

```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Mahasiswa:");
System.out.println(mahasiswa.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KainDetail[] kn = new KainDetail[2];` adalah contoh penggunaan array.

```bash
KainDetail[] kn = new KainDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error di class `KainBeraksi`.

```bash
try {
} catch(StringIndexOutOfBoundsException e){
  System.out.println("Kesalahan Kode Kain! : "+e.getMessage()); 
} catch(Exception e){
  System.out.println("PAKAI ANGKA SUDAH DIPERINGATKAN!! "+e.getMessage());  
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Irfan Sujarin
NPM: 2110010420
