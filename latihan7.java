
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan7 {
    public static void main(String[] args) throws IOException{
        String nama;
        int umur;
        //Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);   
        //Membuat objek bufferedreader
        BufferedReader br = new BufferedReader(isr);
        //Mengisi variabel nama dengan BufferedReader
        System.out.println("Inputkan nama Anda : ");
        nama = br .readLine();
        System.out.println("Inputkan umur Anda : ");
        umur = Integer.parseInt(br.readLine());
        //Tampilkan output isi variabel nama
        System.out.println("Nama Anda adalah " + nama);
        System.out.println("umur " + umur);
    }
    
}
