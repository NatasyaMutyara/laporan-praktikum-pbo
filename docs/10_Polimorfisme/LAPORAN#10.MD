# Laporan Praktikum #10 - POLIMORFISME

## Kompetensi
Setelah melakukan percobaan pada jobsheet ini, diharapkan mahasiswa
mampu:

a.   Memahami konsep dan bentuk dasar polimorfisme
b.   Memahami konsep virtual method invication
c.   Menerapkan polimorfisme pada pembuatan heterogeneous collection
d.   Menerapkan polimorfisme pada parameter/argument method
e.   Menerapkan object casting untuk meng-ubah bentuk objek

## Ringkasan Materi


## Percobaan

### Percobaan 1
1. Buat class Employee
![contoh screenshot](img/1.jpg)
[Source code](../../src/10_Polimorfisme/Employee1841720026NTSY.java) 
2. Buat interface Payable
![contoh screenshot](img/2.jpg)
[Source code](../../src/10_Polimorfisme/InterfacePayable1841720026NTSY.java) 
3. Buat class InternshipEmployee, subclass dari Employee
![contoh screenshot](img/3.jpg)
[Source code](../../src/10_Polimorfisme/InternshipEmployee1841720026NTSY.java) 
4. Buat class PermanentEmployee, subclass dari Employee dan implements ke Payable
![contoh screenshot](img/4.jpg)
[Source code](../../src/10_Polimorfisme/PermanentEmployee1841720026NTSY.java) 
5. Buat class ElectricityBill yang implements ke interface Payable
![contoh screenshot](img/5.jpg)
[Source code](../../src/10_Polimorfisme/ElectricityBill1841720026NTSY.java) 
6. Buat class Tester1
![contoh screenshot](img/6.jpg)
[Source code](../../src/10_Polimorfisme/Tester11841720026NTSY.java) 

### Pertanyaan
1.	Class apa sajakah yang merupakan turunan dari class Employee?
2.	Class apa sajakah yang implements ke interface Payable?
3.	Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class InternshipEmploye) ?
4.	Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill) ?
5.	Coba tambahkan sintaks:
p = iEmp;
e = eBill;
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error?
6.	Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!
Jawaban :
1.	InternshipEmployee, PermanentEmployee
2.	PermanentEmployee, ElectricityBill
3.	karena objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class InternshipEmploye) adalah subclass dari class Employee.
4.	karena objek pEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill) implementas ke class Payable
5.	karena objek iEmp (merupakan objek dari class InternshipEmployee) tidak implements ke class Payable
6.	Ketika ada suatu objek yang dideklarasikan dari super class, maka objek tersebut bisa diinstansiasi sebagai objek dari sub class. Ketika ada objek yang dideklarasikan dari suatu interface, maka ia bisa digunakan untuk mereferensi ke objek dari class-class yang implements ke interface tersebut

### Percobaaan 2
1. Pada percobaan ini masih akan digunakan class-class dan interface
yang digunakan pada percobaan sebelumnya.
2. Buat class baru dengan nama Tester2.
3. Jalankan class Tester2, dan akan didapatkan hasil sebagai berikut:
![contoh screenshot](img/7.jpg)
[Source code](../../src/10_Polimorfisme/Tester21841720026NTSY.java) 

### Pertanyaan
1.	Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?
2.	Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak?
3.	Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual?
### Jawaban
1.	e merupakan alias dari pEmp, sehingga meskipun menggunakan pemanggilan salah satu atau keduanya dengan nama alias yang berbeda, namun tetap objek tersebuk dari subclass yang sama, sehingga menghasilkan output yang sama
2.	karena method e.getEmployee() terdapat di class PermanentEmployee namun cara pemanggilannya berbeda, tidak menggunakan nama sebenarnya, maka dari itu disebut sebagai pemanggilan method virtual invocation
3.	Virtual Method Invocation adalah metode kelas yang dideklarasikan dengan memungkinkan override oleh metode dengan tandatangan kelas turunan yang sama. Disebut virtual karena merupakan penamaan alias atau bukan nama yang sebenarnya untuk menyimpan objek dari subclass

### Percobaan 3
1. Pada percobaan ke-3 ini, masih akan digunakan class-class dan
interface pada percobaan sebelumnya.
2. Buat class baru Tester3.
![contoh screenshot](img/8.jpg)
[Source code](../../src/10_Polimorfisme/Tester31841720026NTSY.java) 

### Pertanyaan
1.	Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ?
2.	Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ?
3.	Perhatikan baris ke-10, mengapa terjadi error?
### Jawaban
1.	karena objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) merupakan subclass dari class yang sama, yaitu class Employee
2.	karena objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) implements ke class interface yang sama, yaitu class Payable
3.	karena objek eBill bukan subclass dari class Employee

### Percobaan 4
1. Percobaan 4 ini juga masih menggunakan class-class dan interface
yang digunakan pada percobaan sebelumnya.
4. Buat class baru dengan nama Owner. Owner bisa melakukan
pembayaran baik kepada pegawai permanen maupun rekening listrik
melalui method pay(). Selain itu juga bisa menampilkan info pegawai
permanen maupun pegawai magang melalui method
showMyEmployee().
2. Buat class baru Tester4.
![contoh screenshot](img/9.jpg)
[Source code](../../src/10_Polimorfisme/Tester41841720026NTSY.java) 

### Pertanyaan
1.	Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable? Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee?
2.	Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?
3.	Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp);
 
Mengapa terjadi error?
4.	Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ?
5.	Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill ?
### Jawaban
1.	karena class ElectricityBill dan class PermanentEmployee implements ke class Payable jadi pemanggilan tersebut bisa dilakukan.
2.	agar class yang mengimplements ke class Payable dapat mengakses method pay()
3.	karena objek iEmp merupakan objek dari class InternshipEmployee. Class tersebut tidak mengimplements class Payable
4.	untuk mengecek apakah objek p merupakan hasil instansiasi dari class ElectricityBill
5.	untuk mengubah tipe objek tersebut

## Kesimpulan

## Tugas

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.
Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

*(Natasya Mutyara)*