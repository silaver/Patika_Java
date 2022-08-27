import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number;
        int reverseNumber = 0;
        int lastNumber;
        while (temp != 0){
            lastNumber = temp%10; //son rakami al
            reverseNumber = (reverseNumber * 10) + lastNumber;
            /*
                0 * 10 + 7 = 7
                7 *  10 + 4 = 74
                74 * 10 + 2 = 742
                10la carpma islemi burda aslinda etkisiz eleman olan 0 i koyuyor.
             */
            temp /= 10; //diger basamaga gec

        }
        System.out.println("Yeni Sayi => " + reverseNumber);
        return true;
    }

    public static void main(String[] args) {
        isPalindrom(247);
    }
}
