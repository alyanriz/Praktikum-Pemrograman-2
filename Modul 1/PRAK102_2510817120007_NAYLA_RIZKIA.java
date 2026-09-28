import java.util.Scanner;

public class PRAK102_2510817120007_NAYLA_RIZKIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();

        int i = 0;
        while (i < 11) {
            if (i > 0) {
                System.out.print(", ");
            }

            if (angka % 5 == 0) {
                System.out.print((angka / 5) - 1);
            } else {
                System.out.print(angka);
            }

            i++;
            angka++;
        }
        sc.close();
    }
}
