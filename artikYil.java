import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        boolean artikYil = false;
        int yil;

        Scanner sc = new Scanner(System.in);
        System.out.print("Yil Giriniz:");
        yil = sc.nextInt();

        if (yil % 4 == 0) {
                if (yil % 100 == 0) {
                        if (yil % 400 == 0){
                            artikYil = true;
                        }else{
                            artikYil = false;
                        }
                }else {
                    artikYil = true;
                }
        } else{
            artikYil = false;
        }
      
        if (artikYil){
            System.out.println(yil + " yılı bir artık yıldır !");
        }else{
            System.out.println(yil + " yılı bir artık yıldır değildir !");
        }
    }
}
