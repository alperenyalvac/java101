import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayı: ");
        int s1 = sc.nextInt();
        System.out.println("İkinci sayı: ");
        int s2 = sc.nextInt();
        
        System.out.println("1-Toplama/n2-Çıkarma/n3-Çarpma/n4-Bölme");
        System.out.println("Yapacağınız işlemi seçin: ");
        int islem = sc.nextInt();
        sc.close();
        
        switch (islem){
            case 1:
                System.out.println("Toplam: " + (s1+s2));
                break;
            case 2:
                System.out.println("Fark: " + (s1 - s2));
                break;
            case 3:
                System.out.println("Çarpım: " + (s1 * s2));
                break;
            case 4:
                if (s2 != 0) {
                    System.out.println("Bölüm: " + (s1 / s2));        
                } else {
                    System.out.println("Bölen sayı 0 olamaz");
                }
                break;
            default:
                System.out.println("1 ile 4 arasında sayı giriniz");
        }
        
    }

}
