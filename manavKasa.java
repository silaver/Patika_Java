import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double aKilo, armutFiyat = 2.14;
        double eKilo, elmaFiyat = 3.67;
        double dKilo, domatesFiyat = 1.11;
        double mKilo, muzFiyat = 0.95;
        double pKilo, patlicanFiyat = 5.00;
        double toplamTutar;

        Scanner scan = new Scanner(System.in);
      
        System.out.print("Armut Kaç Kilo? : ");
        aKilo = scan.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        eKilo = scan.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        dKilo = scan.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        mKilo = scan.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        pKilo = scan.nextDouble();

        toplamTutar = (armutFiyat * aKilo) + (elmaFiyat * eKilo) + (domatesFiyat * dKilo) + (muzFiyat * mKilo) + (patlicanFiyat * pKilo);

        System.out.print("Toplam Tutar : " + toplamTutar + " TL");
    }
}
