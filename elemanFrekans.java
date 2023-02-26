import java.util.Scanner;
import java.util.Arrays;

public class elemanFrekans {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Dizinin boyutu n: ");
        int n = s.nextInt();
        int[] dizi = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Eleman giriniz: ");
            int eleman = s.nextInt();
            dizi[i] = eleman;
        }

        int sayac = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(dizi[i] == dizi[j]){
                    if(j < i)
                        break;
                    sayac++;
                }
            }
            if(sayac > 0){
                System.out.println(dizi[i]+" sayisi "+ sayac + " kere yazilmistir.");

                sayac = 0;
            }
        }

    }
}
