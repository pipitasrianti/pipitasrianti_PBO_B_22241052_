package com.tutorial;

class Mahasiswa {
    //Data Member
    String nama;
    String nim;
    String prodi;

    // konstruktor
    Mahasiswa (String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

//method tanpa return dan tanpa parameter
void show(){
    System.out.println("Nama : " + this.nama);
    System.out.println("Nim : " + this.nim);
    System.out.println("Prodi : " + this.prodi);
}
// method tanpa dengan parameter
void setNama(String nama, String nim, String
 prodi) {
    this.nama = nama;
    this.nim = nim;
    this.prodi = prodi;
}

// method tanpa parameter dengan return
String getNama(){
    return this.nama;
}

String getNIM(){
    return this.nim;

}
// method dengan parameter dengan return
String sayHi(String pesan) {
    return pesan + " aku " + this.nama + " Mahasiswa PTI ";
}

}

public class Main {

    public static void main(String[] args) {
        // membuat objek baru atau instansiasi
        Mahasiswa mhs1 =new Mahasiswa("Pipit",
        "22241052", "PTI");
    




  // memanggil method
  mhs1.show();
  mhs1.setNama("Asrianti", "22241051", "kimia");
  mhs1.show();

  System.out.println(mhs1.getNama());
  System.out.println(mhs1.getNIM());

  String pesan = mhs1.sayHi("Hallo");
  System.out.println(pesan);
    }  

}