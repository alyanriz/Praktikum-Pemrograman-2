package praktikum2.soal2;

public class Kopi {
    public String namaKopi;
    public String ukuran;
    public double harga;
    public String pembeli;

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    public String getPajak() {
        return String.format("%.1f", harga * 0.11);
    }

    public void info() {
        System.out.printf("Nama Kopi: %s\n" +
                "Ukuran: %s\n" +
                "Harga: Rp. %.1f\n",
                namaKopi, ukuran, harga);
    }
}
