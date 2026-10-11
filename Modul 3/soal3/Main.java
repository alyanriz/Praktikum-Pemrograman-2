package soal3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> arr = new ArrayList<>();
        HashMap<String, Mahasiswa> mapMhs = new HashMap<>();

        int pilihan = -1;
        while (pilihan != 0) {
            Mahasiswa.menu();
            System.out.print("Pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambah(sc, arr, mapMhs);
                    break;
                case 2:
                    hapus(sc, arr, mapMhs);
                    break;
                case 3:
                    cari(sc, mapMhs);
                    break;
                case 4:
                    tampilkan(arr);
                    break;
                case 0:
                    arr.clear();
                    mapMhs.clear();
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
            }
        }
        sc.close();
    }

    private static void tambah(Scanner sc, ArrayList<Mahasiswa> arr, HashMap<String, Mahasiswa> map) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = sc.nextLine();

        if (map.containsKey(nim)) {
            System.out.println("NIM harus unik.");
            return;
        }

        Mahasiswa mhs = new Mahasiswa(nama, nim);
        arr.add(mhs);
        map.put(nim, mhs);
        System.out.println("Mahasiswa " + nama + " ditambahkan.");
    }

    private static void hapus(Scanner sc, ArrayList<Mahasiswa> arr, HashMap<String, Mahasiswa> map) {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nim = sc.nextLine();

        Mahasiswa mhsDihapus = map.remove(nim);
        if (mhsDihapus != null) {
           arr.remove(mhsDihapus);
           System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    private static void cari(Scanner sc, HashMap<String, Mahasiswa> map) {
        System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
        String nim = sc.nextLine();

        Mahasiswa mhs = map.get(nim);
        if (mhs != null) System.out.println("Nama Mahasiswa: " + mhs.getNama() + ", NIM: " + mhs.getNim());
        else System.out.println("Mahasiswa tidak ditemukan.");
    }

    private static void tampilkan(ArrayList<Mahasiswa> arr) {
        if (arr.isEmpty()) System.out.println("Daftar kosong.");

        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : arr) {
            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
        }
    }
}
