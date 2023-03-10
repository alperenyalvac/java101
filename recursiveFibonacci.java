import java.util.Scanner;

public class Main {
    static int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eleman sayısını girin: ");
        int n = sc.nextInt();
        System.out.println(n + " haneli Fibonacci Serisi: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
