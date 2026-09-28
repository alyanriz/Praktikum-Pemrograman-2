import java.util.Scanner;

public class PRAK104_2510817120007_NAYLA_RIZKIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String gbk1 = sc.nextLine();
        char[] abu = gbk1.replace(" ", "").toCharArray();

        System.out.print("Tangan Bagas: ");
        String gbk2 = sc.nextLine();
        char[] bagas = gbk2.replace(" ", "").toCharArray();

        int skorAbu = 0;
        int skorBagas = 0;

        for (int i = 0; i < 3; i++) {
            if ((abu[i] == 'G' && bagas[i] == 'K') || (abu[i] == 'B' && bagas[i] == 'G') || (abu[i] == 'K' && bagas[i] == 'B')) {
                skorAbu++;
            } else if ((bagas[i] == 'G' && abu[i] == 'K') || (bagas[i] == 'B' && abu[i] == 'G') || (bagas[i] == 'K' && abu[i] == 'B')) {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        sc.close();
    }
}
