import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, toplam = 0, sayac = 0;
         System.out.println("Sayı giriniz: ");
         k = sc.nextInt();
         
         for (int i = 0; i <= k; i++){
             if ((i % 3 == 0) && (i % 4 == 0)){
                 sayac += 1;
                 toplam += i;
                 //sayac++;
             }
         }
         if (sayac > 0){
             double ort = toplam / sayac;
             System.out.println("Sayıların ortalaması: " + ort);
         } else {
             System.out.println("Sayı bulunamadı");
         }
        }
}
