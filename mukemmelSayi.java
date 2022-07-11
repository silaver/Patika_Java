import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        if (mukemmelSayi(sayi)) {
            System.out.println(sayi + " sayısı bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir mükemmel sayı değildir.");
        }
    }

    public static boolean mukemmelSayi(int sayi) {
        int toplam = 0;
        boolean sonuc = false;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            sonuc = true;
        }
        return sonuc;
    }
}
