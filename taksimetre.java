import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("İlerlenen mesafeyi giriniz: ");
        int mesafe = inp.nextInt();
        double km = 2.20, tutar;
        
        boolean sart = mesafe > 4;
        tutar = sart ? (mesafe*km) + 10 : 20;
        
        System.out.println("Tutar: " + tutar);
    }
}
