import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int max = 0, min = 0;

        System.out.print("Kac adet sayi gireceksiniz : ");
        n = input.nextInt();
        int a = n;
        int i = 1;


        while (n > 0) {

            System.out.print(i + "." + "Sayinizi giriniz : ");
            int num = input.nextInt();

            if (n == a) {
                max = num;
                min = num;

            } else {
                if (num > max) {
                    max = num;
                } else if (num < min) {
                    min = num;
                }

            }
            i++;
            n--;
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);


    }
}
