## Laporan Praktikum #6 - Inheritance

## Kompetensi

1.    Memahami konsep dasar inheritance atau pewarisan.

2.    Mampu membuat suatu subclass dari suatu superclass tertentu.

3.    Mampu mengimplementasikan konsep single dan multilevel inheritance.

4.    Mampu membuat objek dari suatusubclass dan melakukan pengaksesan terhadap atribut dan method baik yang dimiliki sendiri atau turunan dari superclass nya.

## Ringkasan Materi

Inheritance atau pewarisan sifat merupakan suatu cara untuk menurunkan suatu class yang lebih umum menjadi suatu class yang lebih spesifik. Inheritance adalah salah satu ciri utama suatu bahasa program yang berorientasi pada objek. Inti dari pewarisan adalah sifat reusable dari konsep object oriented. Setiap subclass akan “mewarisi” sifat dari superclass selama bersifat protected ataupun public.

Dalam inheritance terdapat dua istilah yang sering digunakan. Kelas yang menurunkan disebut kelas dasar (base class/super class), sedangkan kelas yang diturunkan disebut kelas turunan (derived class/sub class/child class) . Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-­‐nya. Kata kunci extends tersebut memberitahu kompiler Java bahwa kita ingin melakukan perluasan class. Berikut adalah contoh deklarasi inheritance.

Single inheritance adalah Suatu class yang hanya mempunyai satu parent class. Multilevel inheritance adalah Suatu subclass bisa menjadi superclass bagi class yang lain. 

## Percobaan

### Percobaan 1
1. Buatlah	sebuah	class	parent/superclass	dengan	nama	ClassA.java2
![contoh screenshot](img/classA.PNG) 
2. Buatlah	sebuah	class	anak/subclass	dengan	nama ClassB.java
![contoh screenshot](img/classB.PNG)
3. Buatlah	class	Percobaan1.java	untuk	menjalankan	program	diatas!
![contoh screenshot](img/Main1.PNG)
4. Jalankan	program	diatas,	kemudian	amati	apa	yang	terjadi!


    Link kode program : 

    - [ClassA](../../src/6_Inheritance/ClassA1841720026Ntsy.java)

    - [ClassB](../../src/6_Inheritance/ClassB1841720026Ntsy.java)

    Class Main, 
    - [Pecobaan1](../../src/6_Inheritance/Main1_1841720026Ntsy.java)


### Pertanyaan Percobaan 1

1.Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

    Jawaban : 
    Terjadi error karena tidak menggunakan extends, untuk perbaikanya kita menggunakan extends supaya classA dan B saling berelasi

2.Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

    Jawaban : 
    Karena ClassB tidak mempunyai variabel yang ada pada ClassA, maka dari itu memerlukan fungsi extends supaya bisa berhungan dengan variabel yang ada pada ClassA.


### Percobaan 2
1. Buatlah	sebuah	class	parent/superclass	dengan	nama	ClassA.java
![contoh screenshot](img/classA2.PNG) 
2. Buatlah	sebuah	class	anak/subclass	dengan	nama	ClassB.java
![contoh screenshot](img/classB2.PNG) 
3. Buatlah	class	Percobaan2.java	untuk	menjalankan	program	diatas!4. Jalankan	program	diatas,	kemudian	amati	apa	yang	terjadi!
![contoh screenshot](img/Main1b.PNG) 

    Link kode program : 

    - [ClassA](../../src/6_Inheritance/ClassA2_1841720026Ntsy.java)

    - [ClassB](../../src/6_Inheritance/ClassB2_1841720026Ntsy.java)

## Pertanyaan Percobaan 2

1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

    Jawaban : 
    Terjadi error karena tidak menggunakan extends, untuk perbaikanya kita menggunakan extends supaya classA dan B saling berelasi

2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

    Jawaban :
    - Jika atribut tersebut menggunakan private maka kita menambahkan getter untuk dipanggil pada ClassB

### Percobaan 3

1. Buatlah	sebuah	class	parent/superclass	dengan	nama	Bangun.java
![contoh screenshot](img/tabung.PNG)
2. Buatlah	sebuah	class	anak/subclass	dengan
![contoh screenshot](img/bangun.PNG)	nama	Tabung.java3. Buatlah	class	Percobaan3.java	untuk	menjalankan	program	diatas!
![contoh screenshot](img/main2.PNG)
4. Jalankan	program	diatas!


    Link kode program   :

    - [tabung](../../src/6_Inheritance/Tabung_1841720026Ntsy.java)


    - [Bangun](../../src/6_Inheritance/Bangun_1841720026Ntsy.java)


   - [Percobaan3](../../src/6_Inheritance/Main2_1841720026Ntsy.java)


## Pertanyaan Percobaan 3


1. Jelaskan	fungsi	 “super”	pada	potongan	program	berikut	di	class	Tabung!

    Jawaban :
    Karena super menuju pada member dari super class, dan untuk memanggil variabel phi dan r pada class Bangun
    
2. Jelaskan	fungsi	“super”	dan	“this”	pada	potongan	program	berikut	di	class	Tabung!

    Jawaban :
    Super pada potongan berikut berfungsi untuk memanggil variabel phi dan r pada class Bangun/ Class yang lainnya, Sedangkan this pada potongan berikut berfungsi untuk memanggil variabel t pada Class Tabung/ pada Class itu sendiri.

3. Jelaskan	mengapa	pada	class	Tabung	tidak	dideklarasikan	atribut	“phi”	dan	“r”	tetapi	class	
tersebut	dapat	mengakses	atribut	tersebut!

    Jawaban :
    Karena tabung merupakan child dari parent yaitu bangun,yang dimana pada class bangun terdapat atribut phi dan r,jadi tidak perlu menambahkan atribut lagi.



### Percobaan 4

1. Buatlah	tiga	file	dengan	nama	ClassA.java	,	ClassB.java	,	dan	ClassC.java,	seperti	pada	kode	program	dibawah	ini!
    - ClassA.java
    ![contoh screenshot](img/classA4.PNG)

    - ClassB.java
    ![contoh screenshot](img/classB4.PNG)

    - ClassC.java 
    ![contoh screenshot](img/classC4.PNG)
2. Buatlah	class	Percobaan4.java	untuk	menjalankan	program	diatas!

    ![contoh screenshot](img/main4.PNG)

3. Jalankan	program	kemudian	amati	apa	yang	terjadi!

    Link kode program   :

    - [classA4](../../src/6_Inheritance/ClassA4_1841720026Ntsy.java)

    - [classB4](../../src/6_Inheritance/ClassB4_1841720026Ntsy.java)

    - [classC4](../../src/6_Inheritance/ClassC4_1841720026Ntsy.java)

    - [Main4](../../src/6_Inheritance/Main4_1841720026Ntsy.java)


### Pertanyaan Percobaan 4

1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!

    - superclass: ClassA dan ClassB
    - subclass : ClassC
    - alasan : pertama ClassB
merupakan subclass dari ClassA, sehingga dalam hal ini ClassA adalah superclass dan ClassB adalah subclass.

2. Ubahlah isi konstruktor default ClassC seperti berikut:
Tambahkan	kata	super()	di	baris	Pertaman	dalam	konstruktor	defaultnya.	Coba	jalankan	
kembali	class	Percobaan4	dan	terlihat	tidak	ada	perbedaan	dari	hasil	outputnya!

3. Ketika	mengubah	posisi	super()	dibaris	kedua	dalam	kontruktor	defaultnya	dan	terlihat	ada	
error.	Kemudian	kembalikan	super()	kebaris	pertama	seperti	sebelumnya,	maka	errornya	
akan	hilang.
Perhatikan	hasil	keluaran	ketika	class	Percobaan4	dijalankan.	Kenapa	bisa	tampil	output	
seperti	berikut	pada	saat	instansiasi	objek	test	dari	class	ClassC

Apakah	fungsi	super()	pada	potongan	program	dibawah	ini	di	ClassC!

Jawaban :

2.	Tidak mengalami perubahan.
3.	Karena konstruktor tidak dapat diwariskan kepada subclass maka ditambahkan kata kunci super() dan dilakukan pada konstruktor subclass dibaris paling atas. Dan urutan proses jalannya konstruktor saat objek test dibuat itu dimulai dari superclass, kemudian ke subclass bawahnya dan seterusnya
4.	Digunakan untuk memanggil konstruktor



### Percobaan 5

1. Buatlah	class	Karyawan
    ![contoh screenshot](img/karyawan.PNG)	
2. Buatlah	class	Manager	
    ![contoh screenshot](img/manager.PNG)
3. Buatlah	class	Staff	
    ![contoh screenshot](img/staff.PNG)
4. Buatlah	class	inheritance1
    ![contoh screenshot](img/main5.PNG)
5. Jalankan	program,	maka	tampilanya	adalah	sebagai	berikut:

    Link kode program   :

    - [Karyawan](../../src/6_Inheritance/Karyawan_1841720026Ntsy.java)

    - [Manager](../../src/6_Inheritance/Manager_1841720026Ntsy.java)

    - [Staff](../../src/6_Inheritance/Staff_1841720026Ntsy.java)

    - [Main5](../../src/6_Inheritance/Main5_1841720026Ntsy.java)


### Pertanyaan Percobaan 5

1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!


2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?

3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!

4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!

5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!

    Jawaban :

    1.	Super class : class Karyawan
Sub class : class Manager dan class Staff
    2.	Extends
    3.	Atribut yang dimiliki class Manager : tunjangan
    Atribut yang diwarisi dari class Karyawan : gaji
    4.	Karena gaji terdapat pada super class maka menggunakan kata kunci super.
    5.	Termasuk dalam single inheritance, karena hanya memiliki satu parent class



 ### Percobaan 6

1. Perhatikan	digra	class	dibawah	ini
2. Berdasarkan	program	yang	sudah	anda	buat	pada	percobaan	1	sebelumnya	tambahkan	dua	
class	yaitu	class	StaffTetap	dan	class	StaffHarian.	Kode	Programnya	adalah	sebagai	berikut
    - Class	StaffTetap.java
        ![contoh screenshot](img/tetap.PNG)	
        - [StaffTetap](../../src/6_Inheritance/StaffTetap_1841720026Ntsy.java)
    - Class	StaffHarian.java
        ![contoh screenshot](img/harian.PNG)
        - [StaffHarian](../../src/6_Inheritance/Staffharian_1841720026Ntsy.java)	
3. Setelah	membuat	dua	class	diatas	kemudian	edit	class	inheritance1.java	menjadi	sebagai	
berikut:
4. Jalankan	program	maka	tampilanny	adalah	sebagai	berikut:
![contoh screenshot](img/main6.PNG)

### Pertanyaan Percobaan 6
1.Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?

- Single Inheritance : 
Karyawan,Manager,dan Staff

- Staff
Staff,dan
StaffTetap

- Multilevel Inheritance :
Karyawan,
Staff,dan
StaffHarian

- Karyawan,
staff,dan
StaffTetap

2.Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!

3.Apakah fungsi potongan program berikut pada class StaffHarian

4.Apakah fungsi potongan program berikut pada class StaffHarian

5.Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap


Jawaban :
2.	Atribut yang dimiliki StaffTetap : golongan dan asuransi
Atribut yang dimiliki StaffHarian : jmlJamKerja
Atribut yang diwarisi dari class Staff : lembur dan potongan
3.	Untuk memanggil atribut yang diwarisi dari class staff dan karyawan
4.	Memanggil method tampilDataStaff() di superclass(Staff)
5.	Karena pada atribut tersebut sudah diwariskan dari SuperClassnya.



## Tugas

1. Buatlah sebuah program dengan konsep pewarisan seperti pada class diagram berikut ini. Kemudian buatlah instansiasi objek untuk menampilkan data pada class Mac, Windows dan Pc!.

![contoh screenshot](img/komputer.PNG)


- [Komputer](../../src/6_Inheritance/Komputer_1841720026Ntsy.java)

![contoh screenshot](img/laptop.PNG)

- [Laptop](../../src/6_Inheritance/Laptop_1841720026Ntsy.java)

![contoh screenshot](img/pc.PNG)

- [PC](../../src/6_Inheritance/PC_1841720026Ntsy.java)

![contoh screenshot](img/mac.PNG)
- [Mac](../../src/6_Inheritance/Mac_1841720026Ntsy.java)


![contoh screenshot](img/windows.PNG)
- [Windows](../../src/6_Inheritance/Windows_1841720026Ntsy.java)

- Class Main, ![contoh screenshot](img/tugas.PNG)

- [Tugas](../../src/6_Inheritance/MainTugas_1841720026Ntsy.java)
