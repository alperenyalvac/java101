import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a, b, c, cevre, alan;
        
        System.out.println("Üçgenin kenarlarını girin: ");
        a = inp.nextDouble();
        b = inp.nextDouble();
        c = inp.nextDouble();
        cevre = a + b + c;
        double u = cevre/2;
        
        double aKare = u * (u - a) * (u - b) * (u - c);
        alan = Math.sqrt(aKare);
        
        System.out.println("Üçgenin Alanı: " + alan);
        
    }

}
