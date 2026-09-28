import java.util.Scanner;
import java.util.Locale;

public class PRAK105_2510817120007_NAYLA_RIZKIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Masukkan jari-jari: ");
        double jariJari = sc.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = sc.nextDouble();

        final double phi = 3.14;
        double volume = hitungVolume(phi, jariJari, tinggi);

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jariJari, tinggi, volume);

        sc.close();
    }

    static double hitungVolume(double phi, double r, double t) {
        return phi * r * r * t;
    }
}
