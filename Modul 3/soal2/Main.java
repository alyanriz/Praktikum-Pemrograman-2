package soal2;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Negara> ll = new LinkedList<>();
        HashMap<Integer, String> bulan = new HashMap<>();

        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String nama = sc.nextLine();
            String jenis = sc.nextLine();
            String pemimpin = sc.nextLine();

            int tanggal = 0, bulanMerdeka = 0, tahun = 0;
            if (!jenis.equalsIgnoreCase("monarki")) {
                tanggal = sc.nextInt();
                bulanMerdeka = sc.nextInt();
                tahun = sc.nextInt();
                sc.nextLine();
            }
            ll.add(new Negara(nama, jenis, pemimpin, tanggal, bulanMerdeka, tahun));
        }

        for (Negara detailNegara : ll) {
            if (!detailNegara.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                System.out.printf("Negara %s mempunyai %s bernama %s\n", detailNegara.getNamaNegara(), Negara.kapitalisasi(detailNegara.getJenisKepemimpinan()), detailNegara.getNamaPemimpin());
                System.out.printf("Deklarasi Kemerdekaan pada Tanggal %d %s %d\n", detailNegara.getTanggalMerdeka(), bulan.get(detailNegara.getBulanMerdeka()), detailNegara.getTahunMerdeka());
            } else {
                System.out.printf("Negara %s mempunyai Raja bernama %s\n", detailNegara.getNamaNegara(), detailNegara.getNamaPemimpin());
            }
            System.out.println();
        }

        sc.close();
    }
}
