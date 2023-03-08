import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows does the board have:");
        int row= input.nextInt();
        System.out.print("How many columns does the board have:");
        int col = input.nextInt();
        MineSweepers mine = new MineSweepers(row,col);
        mine.run();
    }
