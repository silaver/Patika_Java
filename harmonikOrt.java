public class Main {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Ortalama: " + sum / numbers.length);

        sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += (1.0 / numbers[i]);
        }

        System.out.println("Harmonik ortalama: " + numbers.length / sum);
    }
}
