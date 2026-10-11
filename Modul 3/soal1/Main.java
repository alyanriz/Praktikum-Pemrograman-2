package soal1;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Dadu> kumpulanDadu = new LinkedList<>();

        int jumlahDadu = sc.nextInt();

        int totalNilai = 0;

        for (int i = 0; i < jumlahDadu; i++) {
            kumpulanDadu.add(new Dadu());
        }

        for (int i = 0; i < kumpulanDadu.size(); i++) {
            int nilai = kumpulanDadu.get(i).getNilaiDadu();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilai);
            totalNilai += nilai;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        sc.close();
    }
}