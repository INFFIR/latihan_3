
/**
 * Program sederhana untuk menghitung debit air per menit berdasarkan volume air dan waktu aliran.
 */
import java.util.Scanner;

public class Main {
    /**
     * Metode utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan volume air (dalam liter)
        System.out.print("Masukkan volume air (liter): ");
        double volumeAir = input.nextDouble();

        // Meminta pengguna untuk memasukkan waktu (dalam menit)
        System.out.print("Masukkan waktu (menit): ");
        double waktu = input.nextDouble();

        // Menghitung debit air (liter per menit)
        double debitAirPerMenit = volumeAir / waktu;

        // Menampilkan hasil debit air
        System.out.println("Debit air per menit adalah: " + debitAirPerMenit + " liter per menit");
    }
}
