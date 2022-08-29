import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayi giriniz: ");
        sayi = scan.nextInt();
        bes(sayi);
    }
    static void bes(int sayi){
        int temp = sayi;
        int sayac = 0;
        if (temp > 1){
            while(temp > 0){
                System.out.print(temp + " , ");
                temp -=5;
                sayac++;
            }
        }
        for (int i = 1; i <= sayac+1; i++){
            System.out.print(temp + " , ");
            temp += 5;
        }
    }
}
