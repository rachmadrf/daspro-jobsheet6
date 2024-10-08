
import java.util.Scanner;

public class TugasLatihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();
        
        if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku > 2) {
            diskon = 10 + 2; // Diskon 10% + 2% jika jumlah buku > 2
        } else if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10; // Diskon 10% jika jumlah buku <= 2
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
            diskon = 7 + 2; // Diskon 7% + 2% jika novel > 3
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku <= 3) {
            diskon = 7 + 1; // Diskon 7% + 1% jika novel <= 3
        } else if (!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
            diskon = 5; // Diskon 5% untuk buku selain kamus/novel jika jumlah buku > 3
        }

        System.out.println("Diskon yang didapatkan: " + diskon + "%");
    }
}