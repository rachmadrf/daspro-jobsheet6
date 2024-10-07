import java.util.Scanner;
public class TugasLatihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, bil3, terbesar;

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = input.nextInt();
        
        terbesar = bil1;  // Asumsikan bilangan pertama adalah yang terbesar
        
        // Membandingkan dengan bilangan kedua
        if (bil2 > terbesar) {
            terbesar = bil2;
        }
        
        // Membandingkan dengan bilangan ketiga
        if (bil3 > terbesar) {
            terbesar = bil3;
        }
        
        // Output bilangan terbesar
        System.out.println("Bilangan terbesar: " + terbesar);
    }
}