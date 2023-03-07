import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int satir = n; satir >= 1; satir--){
            for (int bosluk = 1; bosluk <= n - satir; bosluk++){
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= satir * 2 - 1; yildiz++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
