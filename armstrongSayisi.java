public class Armstrong {
    public static void main(String[] args) {

        for (int k = 1; k < 1000; k++) {
            int sayac = 0, sonuc = 0; 
            int temp = k, mod;
          
            while (temp != 0) {
                temp /= 10;
                sayac++;
            }
            temp = k;
            while (temp != 0) {
                mod = temp % 10;
                int init = 1;
                for (int i = 1; i <= sayac; i++) {
                    init *= mod;
                }
                sonuc += init;
                temp /= 10;
            }

            if (sonuc == k) {
                System.out.println(k + " is an Armstrong Number.");
            }
        }
    }
  }
