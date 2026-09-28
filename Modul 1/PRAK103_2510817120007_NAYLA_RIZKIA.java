import java.util.Scanner;

public class PRAK103_2510817120007_NAYLA_RIZKIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int awal = sc.nextInt();

        int i = 0;
        do {
            if (awal % 2 != 0) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(awal);
                i++;
            }
            awal++;
        } while (i < n);

        sc.close();
    }
}
