import java.util.Scanner;

public class TamBolunme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam, bolenSayi = 0;

        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                bolenSayi++;
                toplam = toplam + i;
            }
        }

        if (bolenSayi != 0) {
            System.out.println("Toplam: " + toplam);
            System.out.println("Ortalama: " + (toplam / (double) bolenSayi));
        } else {
            System.out.println("Hiç sayı bulunamamıştır.");
        }
    }
}
