import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = sc.nextInt();
        int toplam, x = 0, y = 1;
        
        for (int i = 1; i < 9; i++) {
            System.out.println(x);
            toplam = x + y;
            x = y;
            y = toplam;
        }
        
    }
}
