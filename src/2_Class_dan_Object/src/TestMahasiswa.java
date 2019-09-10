/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author Natasya Mutyara
 */
public class TestMahasiswa {
public static void main (String args[]){
    Mahasiswa mhs1 = new Mahasiswa();
    Mahasiswa mhs2 = new Mahasiswa();
    Mahasiswa mhs3 = new Mahasiswa();
    
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinola No1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        mhs2.nim = 102;
        mhs2.nama = "Natasya";
        mhs2.alamat = "Jl Kertanegara";
        mhs2.kelas = "2D";
        mhs2.tampilBiodata();
        mhs3.nim = 103;
        mhs3.nama = "Mutyara";
        mhs3.alamat = "Jl Singosari";
        mhs3.kelas = "2D";
        mhs3.tampilBiodata();
}
}
