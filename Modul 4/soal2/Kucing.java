package soal2;
import soal1.HewanPeliharaan;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String r, String n, String w) {
        super(n, r);
        this.warnaBulu = w;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.warnaBulu);
    }
}
