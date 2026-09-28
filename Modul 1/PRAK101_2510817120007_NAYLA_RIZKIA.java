import java.util.Scanner;
import java.util.Locale;

public class PRAK101_2510817120007_NAYLA_RIZKIA {
    static class ValidasiInput {
        public static void cek(int tanggal, int bulan, int tahun) {
            if (bulan < 1 || bulan > 12) {
                System.out.println("Bulan invalid.");
                System.exit(0);
            }

            int batas = 31;

            switch (bulan) {
                case 4: case 6: case 9: case 11:
                    batas = 30;
                    break;
                case 2:
                    if (tahun % 400 == 0 || (tahun % 100 != 0 && tahun % 4 == 0)) {
                        batas = 29;
                    } else {
                        batas = 28;
                    }
                    break;
            }
            if (tanggal < 1 || tanggal > batas) {
                System.out.println("Tanggal invalid.");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = sc.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = sc.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = sc.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = sc.nextInt();

        ValidasiInput.cek(tanggalLahir, bulanLahir, tahunLahir);

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = sc.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = sc.nextDouble();

        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
                "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir +
                " pada Tanggal " + tanggalLahir + " " + bulan[bulanLahir-1] + " " + tahunLahir +
                "\nTinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");

        sc.close();
    }
}
