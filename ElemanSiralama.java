import java.util.Scanner;
import java.util.Arrays;

public class ElemanSiralama {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Dizinin boyutu n :");
        int n = s.nextInt();
        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");

        for (int i = 0; i < n; i++){
            System.out.println((i+1) + ". eleman :");
            int sayi = s.nextInt();
            dizi[i] = sayi;
        }

        Arrays.sort(dizi);

        for (int d: dizi)
            System.out.print(d + " ");
    }
}
