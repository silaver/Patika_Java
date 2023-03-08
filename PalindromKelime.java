import java.util.Scanner;

public class PalindromKelime {
    public static void main(String[] args) {
        while (true) {
            String reverese = "";
            System.out.print("kelime girin : ");
            Scanner inp = new Scanner(System.in);
            String word = inp.nextLine();
            for (int i = word.length() - 1; i >= 0; i--) {
                reverese += word.charAt(i);
            }
            System.out.print("sonuç : ");
            if (word.equals(reverese)) {
                System.out.println("palindrom  ");
            } else {
                System.out.println("palindrom degil ");
            }
            
        }
    }
}
