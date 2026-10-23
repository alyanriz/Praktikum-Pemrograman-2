package soal2;
import soal1.HewanPeliharaan;
import java.util.Scanner;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(n, r);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.warnaBulu);
        System.out.print("Memiliki kemampuan: ");
        for (String s : this.kemampuan) {
            System.out.print(s + " ");
        }
    }
}
