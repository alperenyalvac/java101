import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ebob = 0, ekok = 0, i = 1;
        System.out.println("İlk sayıyı giriniz: ");
        int n1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int n2 = sc.nextInt();

        while (i <= n1 && i <= n2) {
          if (n1 % i == 0 && n2 % i == 0) {
            ebob = i;
          }
          i++;
        }
      ekok = (n1 * n2) / ebob;

      System.out.println("EBOB: " + ebob);
      System.out.println("EKOK: " + ekok);
    }
}
