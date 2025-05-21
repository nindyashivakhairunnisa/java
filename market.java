
import java.util.Scanner;

public class market {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int id;


        System.out.println("pilih barang: ");
        System.out.println("1.Gula ");
        System.out.println("2.kopi ");
        System.out.println("3.roti sobek ");
        System.out.println("4.minyak ");
        System.out.println("5.beras ");
        id = Input.nextInt();

        if(id == 1){
            System.out.println("Gula 5k");
        } else if (id == 2){
            System.out.println(".(kopi 3k)");
        }else if (id == 3){
            System.out.println(".(roti Sobek 10k)");
        }else if (id == 4){
            System.out.println("minyak 20k");
        }else if (id == 5){
            System.out.println(".(beras 120.000)");
       }
    };
}