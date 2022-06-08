import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int mat, fzk, kmya, turk, tarih, mzk;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Dersi Notu: ");
        mat = input.nextInt();

        System.out.print("Fizik Dersi Notu: ");
        fzk = input.nextInt();

        System.out.print("Kimya Dersi Notu: ");
        kmya = input.nextInt();

        System.out.print("Turkce Dersi Notu: ");
        turk = input.nextInt();

        System.out.print("Tarih Dersi Notu: ");
        tarih = input.nextInt();

        System.out.print("Muzik Dersi Notu: ");
        mzk = input.nextInt();

        int toplam = mat + fzk + kmya + turk + tarih + mzk;
        double sonuc = toplam / 6;

        String gecme;
        gecme = (sonuc > 60) ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.print(gecme);
    }
}
