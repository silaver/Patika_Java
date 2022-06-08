public class Main {

    public static void main(String[] args) {
        double kilo, boy, indeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.print(indeks);
    }
}
