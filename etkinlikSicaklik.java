import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Sıcaklık değerini giriniz: ");
        x = scanner.nextInt();

        if(x <= 5)
            System.out.println("Kayak");
        else if(x > 5 && x <= 15)
            System.out.println("Sinema");
        else if (x > 15 && x <= 25)
            System.out.println("Piknik");
        else if(x > 25)
            System.out.println("Yüzme");
        else
            System.out.println("Değer aralığı dısında girdiniz.");
    }
}
