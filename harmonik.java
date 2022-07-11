import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        double sonuc = 0.0;

        for (double i = 1; i <= a; i++){
            sonuc += (1/i);
        }
        System.out.println("Harmonik Deger :" + sonuc);
    }
}
