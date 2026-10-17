package soal1;
import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String n, String r) {
        this.nama = n;
        this.ras = r;
    }

    public void display() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        this.nama = sc.nextLine();
        System.out.print("Ras: ");
        this.ras = sc.nextLine();

        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}
