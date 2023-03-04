import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı girin: ");
        int a = sc.nextInt();
        
        for (int i = 1, j = 1; i <= a && j <= a; i *= 4, j *= 5){
            System.out.println(i + " " + j);
        }
        }
}
