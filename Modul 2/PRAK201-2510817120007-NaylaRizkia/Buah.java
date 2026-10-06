package praktikum2.soal1;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlahBeli;
    private double total;
    private double diskon;

    Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
        this.total = harga * (jumlahBeli / berat);
    }

    public double getDiskon() {
        double total = 0;
        double diskon = 0;

        for (int i = 0; i < (int) jumlahBeli / 4; i++) {
            total = harga * (4 / berat);
            diskon += total * 0.02;

        }
        return diskon;
    }

    public void info() {
        this.diskon = getDiskon();
        System.out.printf("Nama Buah: %s\n" +
                "Berat: %.1f\n" +
                "Harga: %.1f\n" +
                "Jumlah Beli: %.1fkg\n" +
                "Harga Sebelum Diskon: Rp%.2f\n" +
                "Total Diskon: Rp%.2f\n" +
                "Harga Setelah Diskon: Rp%.2f\n\n",
                this.nama, this.berat, this.harga, this.jumlahBeli, this.total, this.diskon, (this.total - this.diskon));
    }
}
