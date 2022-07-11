import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int sayi2 = scanner.nextInt();

        System.out.println(ebob(sayi1, sayi2));
        System.out.println(ekok(sayi1, sayi2));
    }

    public static int ebob (int sayi1, int sayi2) {
        int ebob, kucuksayi;
        kucuksayi = Math.min(sayi1, sayi2);

        while (true) {
            if (sayi1 % kucuksayi == 0 && sayi2 % kucuksayi == 0) {
                ebob = kucuksayi;
                break;
            }
            if (kucuksayi < 0) {
                kucuksayi++;
            } else {
                kucuksayi--;
            }
        }
        return ebob;
    }

    public static int ekok (int sayi1, int sayi2) {
        int ekok;
        ekok = (sayi1 * sayi2) / ebob(sayi1, sayi2);
        return ekok;
    }
}
