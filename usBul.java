import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, power;
        System.out.print("Taban değeri giriniz: ");
        base = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        power = scan.nextInt();

        System.out.println("Sonuç : " + usBul(base, power));
    }
    static int usBul(int base, int power){
        if (power == 0)
            return 1;
        return base * usBul(base, power-1);

    }
}
