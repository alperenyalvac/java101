import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Boyunuzu giriniz: ");
        double boy = inp.nextDouble();
        System.out.println("Kilonuzu girin: ");
        double kilo = inp.nextDouble();
        
        double index = kilo / (boy*boy);
    }

}
