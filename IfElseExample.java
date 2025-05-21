

    import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah angka
        System.out.print("Masukkan sebuah angka: ");
        int number = scanner.nextInt();

        // Mengecek apakah angka positif, negatif, atau nol
        if (number > 0) {
            System.out.println(number + " adalah angka positif.");
        } else if (number < 0) {
            System.out.println(number + " adalah angka negatif.");
        } else {
            System.out.println("Angka yang dimasukkan adalah nol.");
        }

        // Menutup scanner
        scanner.close();
    }
}

    

