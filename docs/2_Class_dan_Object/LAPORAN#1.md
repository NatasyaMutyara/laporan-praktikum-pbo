# Laporan Praktikum #2- Class dan Objek

## Kompetensi

  Mahasiswa dapat memahami deskripsi dari class dan object
- Mahasiswa memahami implementasi dari class
- Mahasiswa dapat memahami implementasi dari attribute
- Mahasiswa dapat memahami implementasi dari method
- Mahasiswa dapat memahami implementasi dari proses instansiasi
- Mahasiswa dapat memahami implementasi dari try-catch
- Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML

## Ringkasan Materi

- class adalah tempat kita meletakkan objek di dalam class biasanya berisi atribut yaitu untuk mendeklarasikan data.
- method adalah kode program yang dapat dipanggil kembali method ada 2 macam yaitu method dengan tipe data yang berarti method harus memiliki return atau nilai kembalian dan method void yang tidak memiliki nilai kembalian.

- cara instansiasi objek : NamaClass namaObject = new NamaClass();

- Try catch atau biasa disebut dengan exception untuk menangani error di java 


## Percobaan

### Percobaan 1 : Membuat Class Diagram
Studi Kasus 1

Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap
karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa
juga bisa menampilkan data diri pribadi dan melihat gajinya.
1. Gambarkan desain class diagram dari studi kasus 1!

    ![praktikum1](img/praktikum1.JPG)

2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!,
  Jawaban : 

    Class terdiri dari 2 yaitu Class Karyawan dan Class tampil data

3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing
class dari studi kasus 1!
  
    Jawaban :
    - idKaryawan : int
    - namaKaryawan : String
    - jenisKelamin : String 
    - jabatan : String
    - gaji : int

4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi
kasus 1!

    Jawaban :

     - Method : tampilData1841720026Ntsy


### Percobaan 2: Membuat dan mengakses anggota suatu class

1. Bukalah text editor atau IDE, misalnya Notepad ++ / netbeans.
2. Ketikkan kode program berikut ini:

    ![p2](img/p2.JPG)
3. Simpan dengan nama file Mahasiswa.java.
4. Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance
dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggotaanggota dari class Mahasiswa dengan membuka file baru kemudian ketikkan kode
program berikut:
5. Simpan file dengan TestMahasiswa.java
Contoh link kode program : [Mahasiswa](../../src/2_Class_dan_Object/Mahasiswa.java)

    ![p3](img/p3.JPG)
6. Jalankan class TestMahasiswa
    ![hasilTest](img/hasilTest.JPG)
7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!

    Jawaban :
    Pendeklarasian atribut ada pada :
    - public int nim;
    - public String nama;
    - public String alamat;
    - public String kelas;

8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
    
    Jawaban : 

      bagian pendeklarasian method adalah 

      public void tampilBiodata(){
          System.out.println("Nim     : "+nim);
          System.out.println("Nama    : "+nama);
          System.out.println("Alamat  : "+alamat);
          System.out.println("Kelas   : "+kelas);
      }

9. Berapa banyak objek yang di instansiasi pada program diatas!

    Jawaban :  
     Objek yang di intansiasi ada 1 yaitu 

     Mahasiswa mhs1 = new Mahasiswa();

10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?

    Jawaban : 

    Yang dilakukan pada syntax tersebut adalah mengisi nim dari mahasiswa yang dialiaskan menjadi objek dengan nama mhs1 dengan isian 101.



11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?

    Jawaban :

    Yang dilakukan pada syntax tersebut adalah menampilkan isi dari objeck mhs1 yang telah tertulis diatasnya dengan nama method tampilBiodata.



12. Instansiasi 2 objek lagi pada program diatas!

    Jawaban : 

    ![p4](img/p4.JPG)


Contoh link kode program : [TestMahasiswa](../../src/2_Class_dan_Object/TestMahasiswa.java)


### Percobaan 3: Menulis method yang memiliki argument/parameter dan memiliki return
Langkah kerja:
1. Bukalah text editor atau IDE, misalnya Notepad ++ / netbeans.
2. Ketikkan kode program berikut ini:

    ![barang](img/barang.JPG)
3. Simpan dengan nama file Barang.java
    
    Contoh link kode program : Contoh link kode program : [Barang](../../src/2_Class_dan_Object/Barang.java)
4. Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance
dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggotaanggota dari class Barang dengan membuka file baru kemudian ketikkan kode program
berikut:
    ![TestBarang](img/TestBarang.JPG)


5. Simpan dengan nama file TestBarang.java

    Contoh link kode program : Contoh link kode program : [TestMBarang](../../src/2_Class_dan_Object/TestBarang.java)

6. Jalankan program tersebut!
    ![main](img/main.JPG)

7. Apakah fungsi argumen dalam suatu method?

    Jawaban : 
      
      Fungsi sebuah argument pada method adalah untuk menampilkan hasil penjumlahan dari objek yang dialiaskan dengan brg1. Maka dari itu argument tidak boleh kosong

8. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method
harus memiliki return!

    Jawaban : 

      Kata kunci return digunakan saat ada data yang harus dikembalikan. Data yang harus dikembalikan adalah data yang biasanya melakukan pengoprasian matematika.

## Tugas

1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana
data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama
member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa
menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class
diagram pada studi kasus diatas!
Penjelasan:

-  Harga yang harus dibayar diperoleh dari lama sewa x harga.
![tugas1](img/tugas1.JPG)

- Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.
![tugas1main](img/tugas1main.JPG)

2. Buatlah program dari class diagram yang sudah anda buat di no 1!
Contoh link kode program : Contoh link kode program : [Tugas 1](../../src/2_Class_dan_Object/Tugas1_1841720026ntsy.java)

    [Tugas 1 Main](../../src/2_Class_dan_Object/Tugas1main_1841720026ntsy.java)

3. Buatlah program sesuai dengan class diagram berikut ini:

    ![tugas 3](img/tugas3.JPG)
    Contoh link kode program : Contoh link kode program : [Tugas 3](../../src/2_Class_dan_Object/Tugas3_1841720026ntsy.java)

    ![tugas 3 main](img/tugas3main.JPG)
    Contoh link kode program : Contoh link kode program : [Tugas 3 main](../../src/2_Class_dan_Object/Tugas3main_1841720026ntsy.java)

4. Buatlah program sesuai dengan class diagram berikut ini:
Deskripsi / Penjelasan :
- Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam %
- Method hitungHargaJual() digunakan untuk menghitung harga jual dengan
perhitungan berikut ini:
harga jual = harga dasar – (diskon x harga dasar)

  ![tugas 4](img/tugas4.JPG)

  Contoh link kode program : Contoh link kode program : [Tugas 4](../../src/2_Class_dan_Object/Tugas4_1841720026ntsy.java)
  
  ![tugas 4 main](img/tugas4main.JPG)

  Contoh link kode program : Contoh link kode program : [Tugas 4 main](../../src/2_Class_dan_Object/Tugas4main_1841720026ntsy.java)

## Kesimpulan
  Dari materi diatas kita dedapat memahami deskripsi class dalam Objek serta cara pengimplementasian class. setelah itu juga dapat memahami cara pengimplementasian dari attribute, method. terdapat juga cara instansiasi danimplementasi dari  trycatch. serta dapat juga memahami proses permodelan diagram.


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***Natasya Mutyara***
