import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanici adinizi girin:");
        userName = inp.nextLine();

        System.out.println("Sifreniz:");
        password = inp.nextLine();

        if(userName.equals("kraker") && password.equals("12345")){
            System.out.println("Basarili");
        }
        else{
            System.out.println("Sifre yanlis");
            System.out.println("Sifrenizi sifirlamak ister misiniz? Evetse 1, Hayirsa 2 yazabilirsiniz");

            int ans = inp.nextInt();
            inp.nextLine();

            switch(ans){
                case 1:
                    System.out.println("Yeni sifrenizi giriniz:");
                    newPassword = inp.nextLine();
                    if(newPassword.equals("12345")){
                        System.out.println("Sifre eski sifre ile ayni olamaz.");
                    }
                    else{
                        System.out.println("Sifreniz basariyla sifirlandi");
                    }
                    break;

                case 2:
                    System.out.println("Uygulamadan cikiliyor.....");
                    break;
                default:
                    System.out.println("Secim yapiniz");

            }
        }
    }
}
