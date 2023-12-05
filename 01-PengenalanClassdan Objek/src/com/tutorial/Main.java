package com.tutorial;

class Lingkaran:
   init.(self, jarijari):
        self.jari_jari = jari_jari

    def hitung_luas(self):
        luas = math.pi * (self.jari_jari ** 2)
        return luas

    def hitung_keliling(self):
        keliling = 2 * math.pi * self.jari_jari
        return keliling

 main():
   Input jari-jari dari pengguna
    jari_jari_input = float(input("Masukkan jari-jari lingkaran: "))

    # Membuat objek Lingkaran
    lingkaran_saya = Lingkaran(jari_jari_input)

    # Memanggil method untuk menghitung luas dan keliling
    luas = lingkaran_saya.hitung_luas()
    keliling = lingkaran_saya.hitung_keliling()

    # Tampilkan hasil
    print(f"Luas lingkaran: {luas:.2f}")
    print(f"Keliling lingkaran: {keliling:.2f}")

if __name__ == "__main__":
    main()
      }

}
