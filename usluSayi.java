import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,r;

        Scanner input = new Scanner (System.in);
        System.out.print("Taban sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("üs sayısını giriniz: ");
        r = input.nextInt();

        int toplam = 1;
        for (int i = 1; i <= r; i++){
           toplam = toplam * n ;

        }
        System.out.println(n + "^" + r + ": " + toplam);
    }
}
