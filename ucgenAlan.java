import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kenar1, kenar2, kenar3, u, alan;

        System.out.print("1. Kenarı giriniz: ");
        kenar1 = scan.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        kenar2 = scan.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        kenar3 = scan.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alanı = " + alan);
    }
}