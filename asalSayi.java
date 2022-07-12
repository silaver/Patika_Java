public class main {
    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 100; sayi++) {
            int counter=0;
            for (int j = 2; j <= sayi; j++) {

                if(sayi%j==0){
                    counter ++;
                }
            }
            if(counter == 1 ){
                System.out.print(sayi + " ");
            }
        }
    }
}
