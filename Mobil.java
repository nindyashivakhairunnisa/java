
//Latihan void method
public class Mobil {
    String warna;
    int tahunproduksi;
    int nomor_mesin;
    int nomor_rangka;
    public static void main(String[] args) {
        Mobil mobilNiaga = new Mobil();
        //panggilan method void
        mobilNiaga.isi();
        mobilNiaga.tampil();
    }
    //Mengisi variabel instance
    void isi(){
        warna = "merah";
        tahunproduksi = 2008;
        nomor_mesin = 91124;
        nomor_rangka = 1234;
    }
//Menampilkan isi variabel
void tampil(){
    System.out.println("Warna : " + warna);
    System.out.println("Tahun Produksi : " + tahunproduksi);
    System.out.println("Nomor mesin : " + nomor_mesin);
    System.out.println("Nomor Rangka : " + nomor_rangka);
}
}


