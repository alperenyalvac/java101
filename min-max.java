import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int adet = sc.nextInt();
        int i = 1, n, enB = 0, enK = 0;
        while (i <= adet){
        System.out.println(i + ". sayıyı giriniz: ");
        n = sc.nextInt();
        if (n < enK) {
          enK = n;
        } else {
          enB = n;
        }
        i++;
        }
      System.out.println("En büyük sayı: " + enB);
      System.out.println("En küçük sayı: " + enK);
    }
}
