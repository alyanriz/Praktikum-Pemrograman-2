package soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pilih jenis hewan yang ingin diinputkan:\n" +
                "1 = Kucing\n" +
                "2 = Anjing\n" +
                "Masukkan pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Hewan Peliharaan: ");
        String nama = sc.nextLine();
        System.out.print("Ras: ");
        String ras = sc.nextLine();
        System.out.print("Warna Bulu: ");
        String warna = sc.nextLine();

        if (pilihan == 1) {
            Kucing kucing = new Kucing(nama, ras, warna);
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            System.out.print("Kemampuan: ");
            String[] kemampuan = sc.nextLine().split(",");
            Anjing anjing = new Anjing(nama, ras, warna, kemampuan);
            anjing.displayDetailAnjing();
        } else {
            System.out.println("Pilihan tidak valid.");
            System.exit(0);
        }

        sc.close();
    }
}
