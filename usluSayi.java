import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sonuc = 1;
        System.out.print("Taban sayıyı girin: ");
        int a = sc.nextInt();
        System.out.print("Üs sayıyı girin: ");
        int b = sc.nextInt();
        
        for (int i = 1; i <= b; i++){
            sonuc = sonuc * a;
        }
        System.out.println(sonuc);
        }    
}
