import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double toplam = 0;
        System.out.print("Sayıyı girin: ");
        int a = sc.nextInt();
        
        for ( double i = 1; i <= a; i++){
            
            toplam += 1.0/i;
            System.out.println(toplam + " + ");
        }
        System.out.println("Harmonik Toplam: " + toplam);
        }    
}
