import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Ucret Tutarini Giriniz: ");
        tutar = input.nextDouble();

        kdvOran = (tutar < 1000 && tutar > 0) ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDVsiz Tutar: " + tutar);
        System.out.println("KDV Orani: " + kdvOran);
        System.out.println("KDV Tutari: " + kdvTutar);
        System.out.println("KDVli Tutari: " + kdvliTutar);

    }
}
