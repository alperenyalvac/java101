import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Sayıyı girin: ");
        int a = sc.nextInt();
        
        while (a != 0){
            toplam += a % 10;
            a /= 10;
        }
        System.out.println("Toplam: " + toplam);
        }    
}
