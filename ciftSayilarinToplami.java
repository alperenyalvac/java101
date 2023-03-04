import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, toplam = 0;
        do {
            System.out.println("Sayı girin: ");
            a = sc.nextInt();
            if (a % 4 == 0){
                System.out.println("Sayı eklendi: " + a);
                toplam += a;
            }
        } while (a % 2 == 0);
        System.out.println(toplam);
        }
}
