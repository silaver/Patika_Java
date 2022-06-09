import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz;
        int counter = 5, top = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Matematik dersi notunu giriniz");
        mat = input.nextInt();
        if(mat>100 || mat <0)
            counter--;
        else
            top = top+mat;
        
        System.out.println("Fizik dersi notunu giriniz");
        fiz = input.nextInt();
        if(fiz>100 || fiz <0)
            counter--;
        else
            top=top+fiz;
        
        System.out.println("Turkce dersi notunu giriniz");
        tur = input.nextInt();
        if(tur>100 || tur <0)
            counter--;
        else
            top=top+tur;
        
        System.out.println("Kimya dersi notunu giriniz");
        kim = input.nextInt();
        if(kim>100 || kim <0)
            counter--;
        else
            top=top+kim;
        
        System.out.println("Muzik dersi notunu giriniz");
        muz = input.nextInt();
        if(muz>100 || muz <0)
            counter--;
        else
            top = top+muz;

        double ort;
        ort = top/counter;
        
        if(ort >= 55){
            System.out.print("Ortalamaniz: " + ort);
            System.out.println("Sinifi gectiniz...");
        }
        else{
            System.out.print("Ortalamaniz: " + ort);
            System.out.println("Sinifta kaldiniz...");
        }
    }
}
