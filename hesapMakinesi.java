package Hesaplamalar;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1,number2,select;

        Scanner input = new Scanner(System.in);
      
        System.out.println("Ilk Sayiyi Giriniz :");
        number1 = input.nextInt();

        System.out.println("Ikinci Sayiyi Giriniz :");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Hangi Islemi Yapmak Istersiniz ? :");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuc : "+(number1+number2));
                break;
            case 2:
                System.out.println("Sonuc : "+(number1-number2));
                break;
            case 3:
                System.out.println("Sonuc : "+(number1*number2));
                break;
            case 4:
                if (number2!=0)
                    System.out.println("Sonuc : "+(number1/number2));
                else 
                    System.out.println("Sayi 0'a Bolunemez");
                break;
            default:
                System.out.println("Hatali Secim Yaptiniz,Lutfen Tekrar Deneyiniz");

        }

      }

    }
