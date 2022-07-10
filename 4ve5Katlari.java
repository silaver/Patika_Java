import java.util.Scanner;

public class DortveBesKatlari {
    public static void main(String[] args) {

        int sayi; 

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi girin : ");
        sayi = input.nextInt();

        int dordunkati = 0;
        for (int i = 1; i <= sayi; i *= 4){
            System.out.println("4 ^ " + dordunkati + " : " + i);
            dordunkati++;
        }

        System.out.println("***************");

        int besinkati = 0;
        for (int i = 1; i <= sayi; i *= 5){
            System.out.println("5 ^ " + besinkati + " : " + i);
            besinkati++;
        }

        input.close();
    }
}
