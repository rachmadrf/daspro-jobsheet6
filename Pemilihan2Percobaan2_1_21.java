import java.util.Scanner;

public class Pemilihan2Percobaan2_1_21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        int pilihan_menu, harga, total_bayar = 0, diskonQris = 1000;
        String member, metode_pembayaran;
        double diskon;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        pilihan_menu = input21.nextInt();
        input21.nextLine();
        System.out.print("Apakah punya member (y/n): ");
        member = input21.nextLine();
        
        //metode pembayaran QRIS/Non-QRIS
        System.out.print("Masukkan metode pembayaran (QRIS/Non-QRIS): ");
        metode_pembayaran = input21.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon member\t\t\t= 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl \t\t\t\t= " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea \t\t\t\t= " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling \t\t\t\t= " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            //menghitung total bayar (setelah diskon member)
            total_bayar = (int) (harga - (harga * diskon));
            System.out.println("Total harga setelah diskon member \t= " + total_bayar);

        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl \t\t\t\t= " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea \t\t\t\t= " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling \t\t\t\t= " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            //menghitung total bayar (jika bukan member)
            total_bayar = (harga);
            System.out.println("Total harga \t\t\t\t= " + harga);
        } else {
            System.out.println("Member tidak valid");
        } 
        
        if (metode_pembayaran.equalsIgnoreCase("y")) {
            System.out.println("Diskon Rp.1000 dengan QRIS");
            System.out.println("Total bayar \t\t\t\t= " + (total_bayar - diskonQris));
        } else if (metode_pembayaran.equalsIgnoreCase("n")) {
            System.out.println("Total bayar \t\t\t\t= " + total_bayar);
        } else {
            System.out.println("Metode pembayaran tidak valid");
            return;
        }
        System.out.println("--------------------------------------");
    }
}