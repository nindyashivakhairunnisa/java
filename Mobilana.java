
//Latihan Method Statik
public class Mobilana {
    //Variabel static
    static String warna = "Hitam";
    static int tahun_produksi = 2020;
    //method static
    static void ubah(){
        warna = "Abu-Abu";
}
static void tampil(){
    System.out.println(warna);
    System.out.println(tahun_produksi);
}
public static void main(String[] args) {
    //Pemanggilan method static
    Mobilana.ubah();
    Mobilana.tampil();
}
}


