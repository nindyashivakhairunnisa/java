
//Latihan method non void
public class Mobilku {
    String warna1;
    int tahun_produksi;
    int nomorMesin;
    int nomor_Rangka;
    //Method mengisi variabel instance
    void isi (String warna1, int tahun_produksi, int nomor_Mesin, int nomor_Rangka)
    {
        this.warna1 = warna1;
        this.tahun_produksi = tahun_produksi;
        this.nomorMesin = nomor_Mesin;
        this.nomor_Rangka = nomor_Rangka;
    }
    //Method menampilkan isi variabel
    String ambil_warna(){
        return warna1;
    }
    int ambil_tahun_produksi (){
        return tahun_produksi;
    }
    int ambil_nomorMesin (){
        return nomorMesin;
    }
    int ambil_nomorRangka (){
        return nomor_Rangka;
    }
    public static void main(String[] args) {
     Mobilku mobilNiaga = new Mobilku();
     //Proses pemanggilan method void
     mobilNiaga.isi("Putih", 2018, 23456, 89567);
    System.out.println("Warna : " + mobilNiaga.ambil_warna());
    System.out.println("Tahun Produksi : " + mobilNiaga.ambil_tahun_produksi());
    System.out.println("Nomor Mesin : " + mobilNiaga.ambil_nomorMesin());
    System.out.println("Nomor Rangka : " + mobilNiaga.ambil_nomorRangka());
    }
}
     

    
    


    

