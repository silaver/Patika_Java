import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("Sayi giriniz: ");
        sayi = scan.nextInt();
        asalMi(sayi);
    }
    static void asalMi(int sayi){
        int sayac = 0;
        for (int i = 1; i < sayi; i++){
            if (sayi % i == 0)
                sayac++;
        }
        if (sayac == 1)
            System.out.println("Asal Sayidir");
        else
            System.out.println("Asal Sayi Degildir");
    }
}
