import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı girin");
        int b = sc.nextInt();
        int fakt1 = 1, fakt2 = 1, fakt3 = 1, komb = 0;
        if(a>b){
        for (int i = a; i >= 1; i--){
            fakt1 *= i;
        }
        for (int j = b; j >= 1; j--){
            fakt2 *= j;
        }
        for (int k = (a-b); k >= 1; k--){
            fakt3 *= k;
        }
        komb = fakt1 / (fakt2 * fakt3);
        }
        System.out.println("Kombinasyon: " + komb);
        }
}
