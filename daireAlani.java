import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14, daireDilimi;

        Scanner input= new Scanner(System.in);
      
        System.out.println("Yaricapi Giriniz : ");
        r = input.nextInt();
        System.out.println("Merkez Aci Olcusunu Giriniz : ");
        a = input.nextInt();

        daireDilimi = (pi * (r*r) * a) / 360;
      
        System.out.println("Daire Diliminin Alani : " + daireDilimi);

    }
}
