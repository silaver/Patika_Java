import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner s = new Scanner(System.in);
        boolean check = true;
        int şans = 5;

        while (check){

            if (şans == 0 ) {

                check = false;
                System.out.println("hakkınız kalmadı");
                break;
            }
            System.out.print("tahmin giriniz(0 ve 100 arasında) : ");
            int sayi = s.nextInt();

                if ((sayi >= 0 && sayi <= 100)) {
                    if (sayi == rnd.nextInt(101)) {
                        System.out.println("tebrikler sayıyı dogru tahmin ettiniz. kalan hakkınız : " + şans);
                    } else {
                        şans--;
                        System.out.println("yanlış cevap ! kalan hakkınız : " + şans);

                    }
                }
                else {
                    System.out.println("girdiğiniz sayı 0 ile 100 arasında olmalı");
                }


        }
    }
}
